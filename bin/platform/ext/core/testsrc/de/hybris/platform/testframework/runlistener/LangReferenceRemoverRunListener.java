/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package de.hybris.platform.testframework.runlistener;

import de.hybris.platform.core.Registry;
import de.hybris.platform.jalo.JaloConnection;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.persistence.property.JDBCValueMappings;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;


/**
 * This runner removes physically via JDBC a orphaned props and localized props for a lang which has been removed via
 * rollback
 */
public class LangReferenceRemoverRunListener extends RunListener
{
	private static final String YDEPLOYMENTS_TABLE = "ydeployments";
	private static final Logger LOG = Logger.getLogger(LangReferenceRemoverRunListener.class.getName());
	private final Set<String> lpTableNames = new LinkedHashSet<String>();
	private final Set<String> propertiesTableNames = new LinkedHashSet<String>();
	private String languageDeploymenTable;
	private boolean systemInitialized = false;

	@Override
	public void testStarted(final Description description) throws Exception
	{
		final JaloConnection con = JaloConnection.getInstance();
		systemInitialized = con.isSystemInitialized();
		if (systemInitialized)
		{
			final JdbcTemplate propsTableDeplQuery = new JdbcTemplate(Registry.getCurrentTenant().getDataSource());
			propsTableDeplQuery.query("SELECT DISTINCT(propstablename) FROM " + getTablePrefix() + YDEPLOYMENTS_TABLE
					+ " WHERE propstablename is not null", new Object[] {}, new RowCallbackHandler()
			{
				@Override
				public void processRow(final ResultSet singleRow) throws SQLException
				{
					propertiesTableNames.add(getTablePrefix() + singleRow.getString(1));
				}
			});

			final JdbcTemplate langTableDeplQuery = new JdbcTemplate(Registry.getCurrentTenant().getDataSource());
			langTableDeplQuery.query("SELECT DISTINCT(tablename) FROM " + getTablePrefix() + YDEPLOYMENTS_TABLE
					+ " WHERE tablename is not null", new Object[] {}, new RowCallbackHandler()
			{
				@Override
				public void processRow(final ResultSet singleRow) throws SQLException
				{
					lpTableNames.add(getTablePrefix() + singleRow.getString(1) + JDBCValueMappings.LOC_TABLE_POSTFIX);
				}
			});
			languageDeploymenTable = ((ComposedType) TypeManager.getInstance().getType("Language")).getTable();
		}
	}

	private String getTablePrefix()
	{
		return Registry.getCurrentTenant().getConfig().getParameter("db.tableprefix");
	}

	@Override
	public void testFinished(final Description description) throws Exception
	{
		if (systemInitialized)
		{
			//drop LP references 
			dropOrphanedRows(description, lpTableNames);
			//drop props references 
			dropOrphanedRows(description, propertiesTableNames);
		}
	}

	private void dropOrphanedRows(final Description description, final Set<String> tableNames)
	{
		for (final String singleTableName : tableNames)
		{
			try
			{
				final JdbcTemplate query = new JdbcTemplate(Registry.getCurrentTenant().getDataSource());
				final int numOfRemovedLPEntries = query.update(//
						"DELETE from " + singleTableName + " " + //
								"WHERE " + //
								"LANGPK IS NOT NULL AND " + //
								"LANGPK <> 0 AND " + //
								"LANGPK NOT IN (SELECT PK FROM " + languageDeploymenTable + ")"//
						);
				if (numOfRemovedLPEntries > 0)
				{
					if (LOG.isDebugEnabled())
					{
						LOG.debug("Removed " + numOfRemovedLPEntries + " of orphaned rows in " + singleTableName + " after test "
								+ description.getDisplayName());
					}
				}
			}
			catch (final DataAccessException dae)
			{
				//most likely LP table is not existing
				//LOG.info("Table " + singleTableName + " for check language references is not existing ," + dae.getMessage());
				if (LOG.isDebugEnabled())
				{
					LOG.debug(dae);
				}
			}
		}
	}
}
