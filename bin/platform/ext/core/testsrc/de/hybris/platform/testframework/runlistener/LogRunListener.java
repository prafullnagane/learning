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

import de.hybris.platform.util.Utilities;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;


/**
 * Logs start and end of each test run.
 * 
 * @since 3.0-u3
 * 
 */
public class LogRunListener extends RunListener
{
	/** Used logger instance. */
	private static final Logger LOG = Logger.getLogger(LogRunListener.class.getName());
	/** Current test method time. */
	private long testStartTime;

	private String currentTestClass;


	@Override
	public void testRunStarted(final Description description) throws Exception
	{
		if (LOG.isInfoEnabled())
		{
			LOG.info("Starting test class " + description.getDisplayName());
			currentTestClass = description.getDisplayName();
		}
	}

	@Override
	public void testStarted(final Description description) throws Exception
	{
		if (LOG.isInfoEnabled())
		{
			LOG.info("Starting test method " + description.getDisplayName());
		}
		testStartTime = System.currentTimeMillis();
	}

	@Override
	public void testFailure(final Failure failure) throws Exception
	{
		LOG.error("Test method " + failure.getTestHeader() + " failed!!", failure.getException());
	}

	@Override
	public void testFinished(final Description description) throws Exception
	{
		final long timePassed = System.currentTimeMillis() - testStartTime;
		if (LOG.isInfoEnabled())
		{
			LOG.info("Finished test method " + description.getDisplayName() + " in " + (timePassed / 1000) + " seconds");
		}
	}

	@Override
	public void testRunFinished(final Result result) throws Exception
	{
		if (LOG.isInfoEnabled())
		{
			LOG.info("Finished (" + (result.wasSuccessful() ? "successful" : "failed") + ") test class " + currentTestClass);

			LOG.info("  Total run time: " + Utilities.formatTime(result.getRunTime()));
			LOG.info("  Total tests count: " + result.getRunCount());
			LOG.info("  Failed tests count: " + result.getFailureCount());
			LOG.info("  Ignored tests count: " + result.getIgnoreCount());

		}
	}


}
