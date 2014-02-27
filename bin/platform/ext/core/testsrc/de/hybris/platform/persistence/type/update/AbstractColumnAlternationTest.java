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
package de.hybris.platform.persistence.type.update;

import de.hybris.platform.core.PK;
import de.hybris.platform.core.Registry;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.persistence.type.AttributeDescriptorRemote;
import de.hybris.platform.persistence.type.update.misc.UpdateDataUtil;
import de.hybris.platform.persistence.type.update.misc.UpdateDataUtil.ColumnDefinition;
import de.hybris.platform.persistence.type.update.misc.UpdateModelException;
import de.hybris.platform.persistence.type.update.strategy.ChangeColumnStrategy;
import de.hybris.platform.testframework.HybrisJUnit4TransactionalTest;
import de.hybris.platform.util.Config;
import de.hybris.platform.util.Utilities;
import de.hybris.platform.util.jdbc.DBColumn;
import de.hybris.platform.util.jdbc.DBTable;
import de.hybris.platform.util.jdbc.SchemaAnalyzer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Ignore;



@Ignore
public abstract class AbstractColumnAlternationTest extends HybrisJUnit4TransactionalTest
{
	private static final Logger LOG = Logger.getLogger(AbstractColumnAlternationTest.class.getName());
	private static Format DATE_TIME_FORMATTER = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static Format TIME_FORMATTER = new SimpleDateFormat("HH:mm:ss");

	protected static final String TABLE_NAME_SMALL = "t1";
	protected static String tableName = TABLE_NAME_SMALL;
	protected static Set<String> tempTablesNames = new HashSet<String>(100);
	protected final static String TABLE_COLUMN_NAME_SMALL = "c1";

	protected final static String dropQueryTemplate = "drop table %s";
	protected final static String createQueryTemplateMySql = "create table %s ( %s %s)  ENGINE = innodb ROW_FORMAT = DEFAULT";
	protected final static String createQueryTemplateHsql = "create table %s ( %s %s)";
	protected final static String insertQueryTemplate = "insert into  %s ( %s ) values ( %s )";

	protected class ColumnDefinitionImpl implements ColumnDefinition
	{
		private Integer decimal = null;

		private Integer length = null;

		private String type = null;

		public ColumnDefinitionImpl(final String ptype)
		{
			this.type = ptype;
		}

		public ColumnDefinitionImpl(final String ptype, final int length)
		{
			this.type = ptype;
			this.length = Integer.valueOf(length);
		}

		public ColumnDefinitionImpl(final String ptype, final int length, final int decimal)
		{
			this.type = ptype;
			this.length = Integer.valueOf(length);
			this.decimal = Integer.valueOf(decimal);
		}

		@Override
		public Integer getDecimal()
		{
			return decimal;
		}

		@Override
		public Integer getLength()
		{
			return length;
		}

		@Override
		public String getTypeCode()
		{
			return type;
		}
	}

	protected String buildType(final ColumnDefinition e)
	{
		final StringBuilder buld = new StringBuilder();

		if (e.getTypeCode() != null)
		{
			buld.append(e.getTypeCode());
		}
		if (e.getLength() != null)
		{
			buld.append("(" + e.getLength());
			if (e.getDecimal() != null)
			{
				buld.append("," + e.getDecimal());
			}
			buld.append(")");
		}
		return buld.toString();
	}

	protected void setTableNameSubfix(final String subfix)
	{
		tableName = TABLE_NAME_SMALL + subfix;
		LOG.info("setting temp table name  <<" + TABLE_COLUMN_NAME_SMALL + ">>");
		tempTablesNames.add(tableName);
	}

	static protected String getCatalog(final Connection con) throws SQLException
	{
		if (Config.isSQLServerUsed())
		{
			return tableName;
		}
		else
		{
			return (con.getCatalog() != null ? con.getCatalog() + "." : "") + tableName;
		}
	}

	protected void dropTestTable(final Connection con, final Statement stmt)
	{
		try
		{
			LOG.info("purging table by <<" + String.format(dropQueryTemplate, getCatalog(con)) + ">>");
			stmt.execute(String.format(dropQueryTemplate, getCatalog(con)));
		}
		catch (final SQLException e)
		{
			LOG.info("table not exists so ignore it ...");
		}
	}

	//@Before
	protected void createAndFillStucture(final ColumnDefinition initType, final Object... initData) throws SQLException
	{

		synchronized (this)
		{
			try
			{
				this.wait(1000);
			}
			catch (final InterruptedException e)
			{
				throw new IllegalStateException(e);
			}
		}

		Connection con = null;
		Statement stms = null;
		try
		{
			con = jaloSession.getTenant().getDataSource().getConnection();
			LOG.info("Connected to ... " + getCatalog(con) + " [" + Config.getDatabase() + "]");
			stms = con.createStatement();

			dropTestTable(con, stms);

			String queryTemplate = null;
			if (Config.isMySQLUsed())
			{
				queryTemplate = createQueryTemplateMySql;
			}
			else if (Config.isHSQLDBUsed())
			{
				queryTemplate = createQueryTemplateHsql;
			}
			else if (Config.isSQLServerUsed())
			{
				queryTemplate = createQueryTemplateHsql;
			}
			else
			{
				LOG.info(" database type not supported " + Config.getDatabase());
				return;
			}

			LOG.info("creating  table as <<"
					+ String.format(queryTemplate, getCatalog(con), TABLE_COLUMN_NAME_SMALL, buildType(initType)) + ">>");
			stms.execute(String.format(queryTemplate, getCatalog(con), TABLE_COLUMN_NAME_SMALL, buildType(initType)));

			//fill with data 
			//insert into trunk.t1 (c1 ) values ('sssss');
			for (final Object o : initData)
			{
				final String query = String.format(insertQueryTemplate, getCatalog(con), TABLE_COLUMN_NAME_SMALL,
						wrapValueForPlainSQL(o, initType.getTypeCode()));
				if (LOG.isDebugEnabled())
				{
					LOG.debug("initializing data as  <<" + query + ">>");
				}
				LOG.info("------------->" + query);
				stms.execute(query);
			}
		}
		finally
		{
			Utilities.tryToCloseJDBC(con, stms, null);
		}
	}

	@After
	public void clearingStucture() throws SQLException
	{
		if (UpdateDataUtil.isDatabaseSupported())
		{
			Connection con = null;
			Statement stms = null;
			try
			{
				con = jaloSession.getTenant().getDataSource().getConnection();
				//con.setAutoCommit(true);
				LOG.info("Connected to ... " + getCatalog(con) + " [" + Config.getDatabase() + "]");
				//con.getMetaData().getS
				stms = con.createStatement();

				dropTestTable(con, stms);
			}
			catch (final SQLException e)
			{
				LOG.info(" exception during clearing data after test [" + e.getMessage() + "]");
				if ((e.getMessage() != null
				//mysql code 1051
				//mssql 3701
				//hhsql -22
				//oracle 911 
						&& e.getMessage().startsWith("Table not found"))
						|| (e.getErrorCode() == 1051 //
								|| e.getErrorCode() == 3701 //
								|| e.getErrorCode() == -22 //
						|| e.getErrorCode() == 911))
				{
					LOG.info("ignoring " + e.getMessage());
				}
				else
				{
					throw e;
				}

			}
			finally
			{
				Utilities.tryToCloseJDBC(con, stms, null);
			}
		}
	}

	protected void checkTypeChange(final ColumnDefinition sourceType, final ColumnDefinition targetType, final Object... initdata)
			throws SQLException, UpdateModelException
	{
		checkTypeChange(sourceType, targetType, targetType, initdata);
	}

	protected void checkTypeChange(final ColumnDefinition sourceType, final ColumnDefinition targetType,
			final ColumnDefinition expectedAnyway, //if alter fails we mighht expect previous  
			final Object... initdata) throws SQLException, UpdateModelException
	{

		if (UpdateDataUtil.isDatabaseSupported())
		{
			createAndFillStucture(sourceType, initdata);
			final Connection conn = jaloSession.getTenant().getDataSource().getConnection();

			final Collection<DBTable> tables = SchemaAnalyzer.readTableMetaData(conn.getCatalog(), conn.getMetaData(),
					Arrays.asList(new String[]
					{ TABLE_NAME_SMALL })).getAllTables();

			for (final DBTable dbTable : tables)
			{
				for (final DBColumn col : dbTable.getColumns())
				{
					final ModelChangedEvent testModelChange = new ModelChangedEvent()
					{
						@Override
						public String getTargetType()
						{
							return buildType(targetType);//"varchar(200)";
						}

						@Override
						public String getSourceType()
						{
							return buildType(sourceType);//"varchar(100)";
						}

						@Override
						public DBColumn getCurrentColumnModel()
						{
							return col;
						}

						@Override
						public AttributeDescriptorRemote getAttributeDescriptor()
						{
							return null;
						}
					};
					((ChangeColumnStrategy) Registry.getApplicationContext().getBean("trivialAlterStrategy")).doChangeColumn(
							testModelChange.getTargetType(), testModelChange.getCurrentColumnModel(),
							testModelChange.getAttributeDescriptor());
				}
			}


			//verify the type 
			final Collection<DBTable> tablesVerify = SchemaAnalyzer.readTableMetaData(conn.getCatalog(), conn.getMetaData(),
					Arrays.asList(new String[]
					{ TABLE_NAME_SMALL })).getAllTables();
			for (final DBTable dbTable : tablesVerify)
			{
				for (final DBColumn col : dbTable.getColumns())
				{
					//Assert.assertTrue("expected :" + targetType + " but got :" + col.getSQLTypeDefinition(), targetType
					//		.compareToIgnoreCase(col.getSQLTypeDefinition()) == 0);
					LOG.info(" is  type (" + col.getDataType() + ") : " + col.getSQLTypeDefinition() + " expected :"
							+ expectedAnyway.getTypeCode());
					LOG.info(" is  size : " + col.getColumnSize() + " expected :" + expectedAnyway.getLength());
					LOG.info(" is  size : " + col.getDecimalDigits() + " expected :" + expectedAnyway.getDecimal());
					Assert.assertTrue(col.getSQLTypeDefinition().toLowerCase().startsWith(expectedAnyway.getTypeCode().toLowerCase()));
					if (expectedAnyway.getLength() != null)
					{
						Assert.assertTrue(col.getColumnSize() == expectedAnyway.getLength().intValue());
					}
					if (expectedAnyway.getDecimal() != null)
					{
						Assert.assertTrue(col.getDecimalDigits() == expectedAnyway.getDecimal().intValue());
					}
				}
			}
		}
	}

	protected boolean isDBSupported()
	{
		return Config.isMySQLUsed() || Config.isHSQLDBUsed();
	}


	@AfterClass
	static public void clearMassTemporaryTables() throws SQLException
	{
		Connection con = null;
		Statement stms = null;
		LOG.info("Puring temporary tables ...." + tempTablesNames.size());
		String tableName = null;
		try
		{
			con = JaloSession.getCurrentSession().getTenant().getDataSource().getConnection();
			stms = con.createStatement();
			for (final String tempTable : tempTablesNames)
			{
				try
				{
					if (Config.isSQLServerUsed())
					{
						tableName = tempTable;
					}
					else
					{
						tableName = (con.getCatalog() != null ? con.getCatalog() + "." : "") + tempTable;
					}
					LOG.info("purging temporary as <<" + String.format(dropQueryTemplate, tableName) + ">>");
					stms.execute(String.format(dropQueryTemplate, tableName));
				}
				catch (final SQLException e)
				{
					LOG.info("table not exists so ignore it ...");
				}
			}
		}
		finally
		{
			Utilities.tryToCloseJDBC(con, stms, null);
		}
	}


	private String wrapValueForPlainSQL(final Object s, final String expectedType)
	{
		if (s instanceof String)
		{
			if (Config.isHSQLDBUsed()
					&& ("BINARY".compareToIgnoreCase(expectedType) == 0 || "VARBINARY".compareToIgnoreCase(expectedType) == 0))
			{
				return "RAWTOHEX('" + (String) s + "')";
			}
			else
			{
				return "'" + (String) s + "'";
			}

		}
		if (s instanceof Integer)
		{
			return Integer.toString(((Integer) s).intValue());
		}
		if (s instanceof Boolean)
		{
			return Boolean.toString(((Boolean) s).booleanValue());
		}
		if (s instanceof Float)
		{
			return Float.toString(((Float) s).floatValue());
		}
		if (s instanceof Double)
		{
			return Double.toString(((Double) s).doubleValue());
		}
		if (s instanceof Character)
		{
			return Character.toString(((Character) s).charValue());
		}
		if (s instanceof Short)
		{
			return Short.toString(((Short) s).shortValue());
		}
		if (s instanceof Byte)
		{
			return Byte.toString(((Byte) s).byteValue());
		}
		if (s instanceof Date)
		{
			if ("TIME".compareToIgnoreCase(expectedType) == 0)
			{
				return "'" + TIME_FORMATTER.format(s) + "'";
			}
			if ("TIMESTAMP".compareToIgnoreCase(expectedType) == 0)
			{
				return "'" + DATE_TIME_FORMATTER.format(s) + "'";
			}
			if ("DATE".compareToIgnoreCase(expectedType) == 0)
			{
				return "'" + DATE_TIME_FORMATTER.format(s) + "'";
			}
			if ("SMALLDATETIME".compareToIgnoreCase(expectedType) == 0)
			{
				return "'" + DATE_TIME_FORMATTER.format(s) + "'";
			}
		}
		if (s instanceof PK)
		{
			return ((PK) s).getLongValueAsString();
		}
		else
		{
			return s.toString();
		}
	}
}
