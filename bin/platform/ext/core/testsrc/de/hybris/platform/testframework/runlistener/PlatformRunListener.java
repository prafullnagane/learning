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
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemNotInitializedException;
import de.hybris.platform.util.Utilities;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;


/**
 * <code>RunListener<code> assuring the test platform is available while test execution. Has to be called at first before other listeners will access the platform.
 * @since 3.0-u3
 */
public class PlatformRunListener extends RunListener
{
	/** Used logger instance */
	private static final Logger log = Logger.getLogger(PlatformRunListener.class.getName());

	/** Reference to current session. */
	protected JaloSession jaloSession;

	@Override
	public void testRunStarted(final Description description) throws Exception
	{
		Registry.activateStandaloneMode();
		Utilities.setJUnitTenant();

		if (log.isDebugEnabled())
		{
			log.debug("Setting Cluster and Tenant");
		}
		final JaloConnection con = JaloConnection.getInstance();
		final boolean sysIni = con.isSystemInitialized();
		if (!sysIni)
		{
			final Exception e = new JaloSystemNotInitializedException(null, "Test system is not initialized", -1);
			final StackTraceElement[] trimmedStack = new StackTraceElement[Math.min(e.getStackTrace().length, 3)];
			System.arraycopy(e.getStackTrace(), 0, trimmedStack, 0, trimmedStack.length);
			e.setStackTrace(trimmedStack);
			e.printStackTrace();
			throw e;
		}

	}

	@Override
	public void testStarted(final Description description) throws Exception
	{
		jaloSession = JaloConnection.getInstance().createAnonymousCustomerSession();
	}

	@Override
	public void testFinished(final Description description) throws Exception
	{
		if (jaloSession != null)
		{
			jaloSession.close();
		}
	}
}
