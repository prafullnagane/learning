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

import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;


/**
 * This run listener displays after each finished run of a testclass how many classes where loaded/unloaded during run
 * of this testclass.
 */
public class ClassLoaderOverviewRunListener extends RunListener
{
	private static final Logger LOG = Logger.getLogger(ClassLoaderOverviewRunListener.class.getName());
	private final ClassLoadingMXBean clMXbean = ManagementFactory.getClassLoadingMXBean();

	private int loadedClassCount = 0;
	private long totalLoadedClassCount = 0;
	private long unloadedClassCount = 0;

	@Override
	public void testRunStarted(final Description description) throws Exception
	{
		loadedClassCount = clMXbean.getLoadedClassCount();
		totalLoadedClassCount = clMXbean.getTotalLoadedClassCount();
		unloadedClassCount = clMXbean.getUnloadedClassCount();
	}

	@Override
	public void testRunFinished(final Result result) throws Exception
	{
		LOG.info("Loaded class count: " + clMXbean.getLoadedClassCount() + " diff: "
				+ (clMXbean.getLoadedClassCount() - loadedClassCount));
		LOG.info("Total loaded class count: " + clMXbean.getTotalLoadedClassCount() + " diff: "
				+ (clMXbean.getTotalLoadedClassCount() - totalLoadedClassCount));
		LOG.info("Unloaded class count: " + clMXbean.getUnloadedClassCount() + " diff: "
				+ (clMXbean.getUnloadedClassCount() - unloadedClassCount));

	}
}
