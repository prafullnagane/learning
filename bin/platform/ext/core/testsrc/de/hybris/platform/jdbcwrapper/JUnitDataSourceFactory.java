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
package de.hybris.platform.jdbcwrapper;

import de.hybris.platform.core.Constants;
import de.hybris.platform.core.DataSourceImplFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.pool.impl.GenericObjectPool.Config;


/**
 * @author hr
 */
public class JUnitDataSourceFactory extends DataSourceImplFactory
{

	@Override
	public JDBCConnectionPool createConnectionPool(final HybrisDataSource dataSource, final Config poolConfig)
	{
		final JUnitConnectionStatus connectionStatus = new JUnitConnectionStatus();
		final JUnitJDBCConnectionFactory factory = new JUnitJDBCConnectionFactory(dataSource, connectionStatus);

		JDBCConnectionPool pool;
		if (dataSource.getTenant().getConfig()
				.getBoolean(Constants.TENANT_RESTART_ON_CONNECTION_LOST, Constants.DEFAULT_TENANT_RESTART_ON_CONNECTION_LOST))
		{
			pool = new JUnitConnectionErrorCheckingJDBCConnectionPool(factory, poolConfig, connectionStatus);
		}
		else
		{
			pool = new JUnitJDBCConnectionPool(factory, poolConfig);
		}

		pool.setDumpStackOnConnectionError(dataSource.getTenant().getConfig()
				.getBoolean(DBConstants.POOL_DUMP_STACK_ON_CONNECTION_ERROR, DBConstants.DEFAULT_POOL_DUMP_STACK_ON_CONNECTION_ERROR));
		return pool;
	}

	@Override
	public Connection wrapConnection(final HybrisDataSource wrappedDataSource, final Connection rawConnection)
	{
		return new JUnitConnectionImpl(wrappedDataSource, rawConnection);
	}

	@Override
	public PreparedStatement wrapPreparedStatement(final Connection wrappedConnection, final PreparedStatement rawStatement,
			final String query)
	{
		return new JUnitPreparedStatementImpl((ConnectionImpl) wrappedConnection, rawStatement, query);
	}
}
