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
package de.hybris.platform.cronjob.jalo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import de.hybris.platform.core.AbstractTenant;
import de.hybris.platform.core.Constants;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.Tenant;
import de.hybris.platform.jdbcwrapper.JDBCConnectionPool;
import de.hybris.platform.jdbcwrapper.JUnitJDBCConnectionPool;
import de.hybris.platform.testframework.HybrisJUnit4Test;
import de.hybris.platform.testframework.TestUtils;
import de.hybris.platform.util.Config;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


/**
 * 
 * 
 * 
 */
@Ignore
public class DatabaseReconnectWithoutRestartTest extends HybrisJUnit4Test //NOPMD
{
	private static final Logger LOG = Logger.getLogger(DatabaseReconnectWithoutRestartTest.class);

	private Tenant tenantBefore;

	@Before
	public void prepare()
	{
		tenantBefore = Registry.getCurrentTenantNoFallback();
		Registry.setCurrentTenant(Registry.getTenantByID("foo"));

		final boolean lostConnectionRestartsTenantInternals = Config.getBoolean(Constants.TENANT_RESTART_ON_CONNECTION_LOST, true);
		if (lostConnectionRestartsTenantInternals)
		{
			LOG.warn("!!!! Test can not continue since tenant.restart.on.connection.error is set to <<true>> for tenant <"
					+ Registry.getCurrentTenantNoFallback() + ">!!!!");
		}
		Assume.assumeTrue(!lostConnectionRestartsTenantInternals);
	}

	@After
	public void unprepare()
	{
		Registry.unsetCurrentTenant();
		if (tenantBefore != null)
		{
			Registry.setCurrentTenant(tenantBefore);
		}
	}


	@Test
	public void testReconnectDuringCronjobWithoutRestart() throws Exception
	{

		final JDBCConnectionPool pool = Registry.getCurrentTenantNoFallback().getDataSource().getConnectionPool();
		assertTrue("expected JUnitJDBCConnectionPool but got ," + pool, pool instanceof JUnitJDBCConnectionPool);

		final JUnitJDBCConnectionPool junitConnectionPool = (JUnitJDBCConnectionPool) pool;
		final AbstractTenant tenant = (AbstractTenant) Registry.getCurrentTenant();
		TestUtils.disableFileAnalyzer("Setting all connection to fail on purpose ....");
		try
		{
			testSetAllConnectionFail(junitConnectionPool, tenant);
		}
		finally
		{

			TestUtils.enableFileAnalyzer();
		}
	}

	/**
	 * 
	 */
	private void testSetAllConnectionFail(final JUnitJDBCConnectionPool pool, final AbstractTenant tenant) throws SQLException
	{
		try
		{
			final Connection connectionBefore = tenant.getDataSource().getConnection();
			assertEquals(1, pool.getNumActive());//a bit naive
			pool.setAllConnectionsFail(true);
			connectionBefore.close();
			assertEquals(0, pool.getNumActive());

			assertFalse(tenant.cannotConnect());
			assertFalse(tenant.connectionHasBeenBroken());

			try
			{
				Registry.getCurrentTenant().getDataSource().getConnection();
				fail();
			}
			catch (final Exception e)
			{
				//OK
			}

			assertFalse(tenant.cannotConnect());
			assertFalse(tenant.connectionHasBeenBroken());
			assertEquals(0, pool.getNumActive());

			pool.setAllConnectionsFail(false);
			final Connection connectionAfter = tenant.getDataSource().getConnection();

			assertFalse(connectionBefore.equals(connectionAfter));
			connectionAfter.close();
		}
		finally
		{
			pool.resetTestMode();
		}
	}
}
