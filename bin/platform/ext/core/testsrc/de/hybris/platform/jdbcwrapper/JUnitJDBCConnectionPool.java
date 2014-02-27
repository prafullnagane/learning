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

import java.sql.Connection;

import org.apache.commons.pool.impl.GenericObjectPool.Config;


/**
 * For testing error handling when
 * <ul>
 * <li>all connections fail</li>
 * <li>single connections fail</li>
 * <li>the pool reports connection errors in general</li>
 * </ul>
 * 
 * @author hr, ag
 */
public class JUnitJDBCConnectionPool extends JDBCConnectionPool
{
	private final JUnitJDBCConnectionFactory factory;

	public JUnitJDBCConnectionPool(final JUnitJDBCConnectionFactory factory, final Config cfg)
	{
		super(factory, cfg);
		this.factory = factory;
	}

	/**
	 * Allows manually marking a connection to fail validation upon next {@link #returnConnection(Connection)}.
	 * 
	 * @param con
	 */
	public void addFailingConnection(final Connection con)
	{
		factory.addFailingConnection(con);
	}

	/**
	 * Removes a connection from failing set.
	 * 
	 * @param con
	 * @see #addFailingConnection(Connection)
	 */
	public void removeFailingConnection(final Connection con)
	{
		factory.removeFailingConnection(con);
	}

	/**
	 * Allows to manually cause all connections to fail upon validate.
	 * 
	 * @param allFail
	 */
	public void setAllConnectionsFail(final boolean allFail)
	{
		factory.setAllConnectionsFail(allFail);
	}

	public void resetTestMode()
	{
		factory.setAllConnectionsFail(false);
		factory.removeAllFailingConnections();
	}
}
