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
package de.hybris.platform.core;

import de.hybris.platform.core.AbstractTenant.ShutDownMode;
import de.hybris.platform.jalo.CoreBasicDataCreator;
import de.hybris.platform.persistence.SystemEJB;
import de.hybris.platform.testframework.HybrisJUnit4Test;
import de.hybris.platform.testframework.TestUtils;
import de.hybris.platform.testframework.runlistener.ItemCreationListener;
import de.hybris.platform.util.Utilities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Ignore;


/**
 * Abstract for test initializing tenants on the fly
 */
@Ignore
abstract public class AbstractTenantInitializationTest extends HybrisJUnit4Test
{


	private static final Logger LOG = Logger.getLogger(AbstractTenantInitializationTest.class.getName());

	abstract protected Collection<String> getTenantIds();

	private final Map<String, ItemCreationListener> creationListeners = new HashMap<String, ItemCreationListener>();


	protected Tenant junit;

	@Before
	public void setUp() throws Exception
	{

		for (final String tenantId : getTenantIds())
		{
			Assume.assumeTrue(getSlaveTenant(tenantId) != null);//we got offline config

			LOG.info("Specific test tenant " + tenantId + " exists");

			junit = Registry.getCurrentTenant();
			ItemCreationListener listener;

			//			LOG.info("Before init ...." + UserManager.getInstance().getAnonymousCustomer());
			//			for (final JaloSession ses : JaloConnection.getInstance().getAllSessions())
			//			{
			//				LOG.info(ses);
			//			}

			Registry.setCurrentTenant(getSlaveTenant(tenantId));//activate tenant for getting master DS 
			initTenant(tenantId, listener = new ItemCreationListener());
			((AbstractTenant) getSlaveTenant(tenantId)).shutDown(ShutDownMode.INITIALIZATION);//

			//			LOG.info("After init ...." + UserManager.getInstance().getAnonymousCustomer());
			//			for (final JaloSession ses : JaloConnection.getInstance().getAllSessions())
			//			{
			//				LOG.info(ses);
			//			}

			creationListeners.put(tenantId, listener);
			Registry.setCurrentTenant(junit);
		}

	}

	@After
	public void tearDown() throws Exception
	{
		try
		{
			for (final String tenantId : getTenantIds())
			{
				final SlaveTenant slave = getSlaveTenant(tenantId);
				if (slave != null)
				{
					if (creationListeners.get(tenantId) != null)
					{
						Registry.setCurrentTenant(slave);
						creationListeners.get(tenantId).testFinished(null);
						Registry.setCurrentTenant(junit);
					}
				}

			}

		}
		finally
		{
			Registry.setCurrentTenant(junit);
		}
	}


	private void initialize(final Tenant t) throws Exception
	{
		Registry.setCurrentTenant(t);


		final Map props = new HashMap();
		props.put(Constants.Initialization.SYSTEM_NAME, "System-" + t.getTenantID());
		props.put(CoreBasicDataCreator.FORCE_CLEAN, "true");

		if (Utilities.isSystemInitialized(t.getDataSource()))
		{
			props.put(CoreBasicDataCreator.FORCE_CLEAN, "false");
			LOG.info("Updating system for " + t.getTenantID() + " ...");
		}
		else
		{
			LOG.info("Initializing system for " + t.getTenantID() + " ...");
		}
		SystemEJB.getInstance().setLocked(false);
		try
		{
			TestUtils.disableFileAnalyzer("During initialization/update - might occur some exceptions ... ");
			Initialization.initialize(props, null);
		}
		finally
		{
			TestUtils.enableFileAnalyzer();
		}
		LOG.info("done initializing/update system for " + t.getTenantID() + ".");
	}

	private SlaveTenant initTenant(final String id, final ItemCreationListener listener) throws Exception
	{
		final MasterTenant mt = Registry.getMasterTenant();
		Registry.setCurrentTenant(mt);
		final SlaveTenant ret = getSlaveTenant(id);
		Assert.assertNotNull(ret);
		Registry.setCurrentTenant(ret);

		initialize(ret);
		listener.testStarted(null);

		return ret;
	}


	protected SlaveTenant getSlaveTenant(final String id)
	{
		return Registry.getSlaveTenants().get(id);
	}

}
