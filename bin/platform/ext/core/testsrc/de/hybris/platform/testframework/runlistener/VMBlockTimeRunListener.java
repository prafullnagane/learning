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

import de.hybris.platform.test.VMBlockTimeRecorder;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;


/**
 * Keeps track of JVM block times.
 * 
 * @see VMBlockTimeRecorder
 */
public class VMBlockTimeRunListener extends RunListener
{
	private static final Logger LOG = Logger.getLogger(VMBlockTimeRunListener.class.getName());

	private static final long maxAllowedBlockTime = 20 * 1000;

	@Override
	public void testRunStarted(final Description description) throws Exception
	{
		VMBlockTimeRecorder.ensureRunning();
	}

	@Override
	public void testStarted(final Description description) throws Exception
	{
		VMBlockTimeRecorder.reset();
	}

	@Override
	public void testFinished(final Description description) throws Exception
	{
		final long blockTimeMillis = VMBlockTimeRecorder.getMaxBlockTimeMillis();

		if (blockTimeMillis > maxAllowedBlockTime)
		{
			LOG.error("Max allowed JVM blocking time of " + (maxAllowedBlockTime / 1000) + " seconds exceeded by "
					+ ((blockTimeMillis - maxAllowedBlockTime) / 1000) + " seconds in test " + description.getDisplayName() + " !");
		}
	}

}
