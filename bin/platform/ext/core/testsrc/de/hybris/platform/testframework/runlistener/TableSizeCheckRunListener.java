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

import de.hybris.platform.core.ItemDeployment;
import de.hybris.platform.core.Registry;
import de.hybris.platform.persistence.property.DBPersistenceManager;
import de.hybris.platform.testframework.HybrisJUnit4Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;
import org.springframework.jdbc.core.JdbcTemplate;


public class TableSizeCheckRunListener extends RunListener
{
	private static final Logger LOG = Logger.getLogger(TableSizeCheckRunListener.class);
	private static final List<String> excludedTableNames = Arrays.asList("numberseries", "props", "aclentries");

	private Map<ItemDeployment, Integer> deploymentsMethod;
	private Map<ItemDeployment, Integer> deploymentsClass;
	private Description classDescription;

	private boolean isTableAllowed(final String table)
	{
		for (final String excludedTableName : excludedTableNames)
		{
			if (table.endsWith(excludedTableName))
			{
				return false;
			}
		}
		return true;
	}

	@Override
	public void testStarted(final Description description) throws Exception
	{
		if (!HybrisJUnit4Test.intenseChecksActivated())
		{
			return;
		}

		final JdbcTemplate template = new JdbcTemplate(Registry.getCurrentTenant().getDataSource());
		deploymentsMethod = new LinkedHashMap<ItemDeployment, Integer>();

		final Set<ItemDeployment> allDeployments = ((DBPersistenceManager) Registry.getPersistenceManager()).getAllDeployments();
		for (final ItemDeployment depl : allDeployments)
		{
			final String table = depl.getDatabaseTableName();
			if (table != null && isTableAllowed(table))
			{
				final Integer oldSize = template.queryForObject("SELECT count(*) FROM " + table, Integer.class);
				deploymentsMethod.put(depl, oldSize);
			}
		}
	}

	@Override
	public void testFinished(final Description description) throws Exception
	{
		if (!HybrisJUnit4Test.intenseChecksActivated())
		{
			return;
		}

		final JdbcTemplate template = new JdbcTemplate(Registry.getCurrentTenant().getDataSource());
		for (final Entry<ItemDeployment, Integer> entry : deploymentsMethod.entrySet())
		{
			final String table = entry.getKey().getDatabaseTableName();
			final Integer newSize = template.queryForObject("SELECT count(*) FROM " + table, Integer.class);
			if (!newSize.equals(entry.getValue()))
			{
				LOG.error("Table size of table " + table + " has changed from " + entry.getValue() + " to " + newSize
						+ " within test case " + description.getDisplayName() + "\n");
			}
		}
	}

	@Override
	public void testRunStarted(final Description description) throws Exception
	{
		if (!HybrisJUnit4Test.intenseChecksActivated())
		{
			return;
		}

		classDescription = description;

		final JdbcTemplate template = new JdbcTemplate(Registry.getCurrentTenant().getDataSource());
		deploymentsClass = new LinkedHashMap<ItemDeployment, Integer>();

		final Set<ItemDeployment> allDeployments = ((DBPersistenceManager) Registry.getPersistenceManager()).getAllDeployments();
		for (final ItemDeployment depl : allDeployments)
		{
			final String table = depl.getDatabaseTableName();
			if (table != null && isTableAllowed(table))
			{
				final Integer oldSize = template.queryForObject("SELECT count(*) FROM " + table, Integer.class);
				deploymentsClass.put(depl, oldSize);
			}
		}
	}

	@Override
	public void testRunFinished(final Result result) throws Exception
	{
		if (!HybrisJUnit4Test.intenseChecksActivated())
		{
			return;
		}

		final JdbcTemplate template = new JdbcTemplate(Registry.getCurrentTenant().getDataSource());
		for (final Entry<ItemDeployment, Integer> entry : deploymentsClass.entrySet())
		{
			final String table = entry.getKey().getDatabaseTableName();
			final Integer newSize = template.queryForObject("SELECT count(*) FROM " + table, Integer.class);
			if (!newSize.equals(entry.getValue()))
			{
				LOG.error("Table size of table " + table + " has changed from " + entry.getValue() + " to " + newSize
						+ " within test class " + classDescription.getClassName() + "\n");
				break;
			}
		}
	}
}
