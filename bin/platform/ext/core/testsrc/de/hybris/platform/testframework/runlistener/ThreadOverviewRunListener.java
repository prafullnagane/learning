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

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;


/**
 * Gets the thread count before and after a test class. If the thread count rises, the new threads are written to the
 * log.
 */
public class ThreadOverviewRunListener extends RunListener
{
	private static final Logger LOG = Logger.getLogger(ThreadOverviewRunListener.class.getName());
	private final ThreadMXBean threads = ManagementFactory.getThreadMXBean();
	private long[] threadIDsAtStart;
	private int threadCountStart;

	@Override
	public void testRunStarted(final Description description) throws Exception
	{
		threadIDsAtStart = threads.getAllThreadIds();
		threadCountStart = threadIDsAtStart.length;
		LOG.info("### Thread count before start: " + threadCountStart);
		threads.resetPeakThreadCount();
	}

	@Override
	public void testRunFinished(final Result result) throws Exception
	{
		final long[] threadIDsAtEnd = threads.getAllThreadIds();
		final int threadCountEnd = threadIDsAtEnd.length;
		final int peakThreadCount = threads.getPeakThreadCount() - threadCountStart;

		if (threadCountEnd > threadCountStart) //ugly, but works :)
		{
			final Set startTreadIDs = new HashSet(threadCountStart);
			for (int i = 0; i < threadCountStart; i++)
			{
				startTreadIDs.add(Long.valueOf(threadIDsAtStart[i]));
			}
			for (int j = 0; j < threadCountEnd; j++)
			{
				if (!startTreadIDs.contains(Long.valueOf(threadIDsAtEnd[j])))
				{
					final ThreadInfo threadinfo = threads.getThreadInfo(threadIDsAtEnd[j]);
					LOG.warn("Thread remains: " + threadinfo);
				}
			}
		}
		LOG.info("### Current thread count after finish: " + threadCountEnd);
		LOG.info("### Peak thread count is: " + peakThreadCount);
	}
}
