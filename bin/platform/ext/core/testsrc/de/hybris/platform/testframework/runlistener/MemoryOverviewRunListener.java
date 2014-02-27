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

import de.hybris.platform.testframework.HybrisJUnit4Test;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;


/**
 * Before and after a Test the {@link MemoryUsage} is collected and after the test class has run the init, used and
 * comitted value are printed to the log. (not the max value) - also the difference before and after the test of there 3
 * values is given out.
 */
public class MemoryOverviewRunListener extends RunListener
{
	private static final Logger LOG = Logger.getLogger(MemoryOverviewRunListener.class.getName());

	private final MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
	private MemoryUsage heapAtTestStart = null;
	private MemoryUsage nonHeapAtTestStart = null;
	private String currentTestClass;

	@Override
	public void testRunStarted(final Description description) throws Exception
	{
		if (!HybrisJUnit4Test.intenseChecksActivated())
		{
			return;
		}
		currentTestClass = description.getDisplayName();
		heapAtTestStart = memoryBean.getHeapMemoryUsage();
		nonHeapAtTestStart = memoryBean.getNonHeapMemoryUsage();
	}

	@Override
	public void testRunFinished(final Result result) throws Exception
	{
		if (!HybrisJUnit4Test.intenseChecksActivated())
		{
			return;
		}

		final MemoryUsage heapAtTestEnd = memoryBean.getHeapMemoryUsage();
		final MemoryUsage nonHeapAtTestEnd = memoryBean.getNonHeapMemoryUsage();

		final long initHeapDiffInK = (heapAtTestEnd.getInit() - heapAtTestStart.getInit()) / 1024;
		final long usedHeapDiffInK = (heapAtTestEnd.getUsed() - heapAtTestStart.getUsed()) / 1024;
		final long comittedHeapDiffInK = (heapAtTestEnd.getCommitted() - heapAtTestStart.getCommitted()) / 1024;

		final long initNonHeapDiffInK = (nonHeapAtTestEnd.getInit() - nonHeapAtTestStart.getInit()) / 1024;
		final long usedNonHeapDiffInK = (nonHeapAtTestEnd.getUsed() - nonHeapAtTestStart.getUsed()) / 1024;
		final long comittedNonHeapDiffInK = (nonHeapAtTestEnd.getCommitted() - nonHeapAtTestStart.getCommitted()) / 1024;

		LOG.info("+---------------------------- Memory usage after test " + currentTestClass);
		LOG.info("+     heap: init=" + (heapAtTestEnd.getInit() / 1024) + "K (" + initHeapDiffInK + "K)\t  " + //
				"used=" + (heapAtTestEnd.getUsed() / 1024) + "K (" + usedHeapDiffInK + "K)\t  " + //
				"comitted=" + (heapAtTestEnd.getCommitted() / 1024) + "K (" + comittedHeapDiffInK + "K)");

		LOG.info("+ non-heap: init=" + (nonHeapAtTestEnd.getInit() / 1024) + "K (" + initNonHeapDiffInK + "K)\t  " + //
				"used=" + (nonHeapAtTestEnd.getUsed() / 1024) + "K (" + usedNonHeapDiffInK + "K)\t  " + //
				"comitted=" + (nonHeapAtTestEnd.getCommitted() / 1024) + "K (" + comittedNonHeapDiffInK + "K)");
		LOG.info("+ ObjectPendingFinalizationCount: " + memoryBean.getObjectPendingFinalizationCount());
		for (final MemoryPoolMXBean mpbean : ManagementFactory.getMemoryPoolMXBeans())
		{
			LOG.info("+       " + mpbean.getName() + "(" + mpbean.getType() + "): " + mpbean.getCollectionUsage());
		}
		LOG.info("+--------------------------------------------------------------------------------------------------");
	}
}
