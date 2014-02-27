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
package de.hybris.platform.testframework;


import static org.junit.Assert.assertNotNull;

import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.log4j.Logger;


/**
 *
 */
public class TestUtils
{
	private static final Logger logger = Logger.getLogger(TestUtils.class);

	private static final String ENABLE_FILEANALYZER = "### ENABLE FILEANALYZER ###";
	private static final String DISABLE_FILEANALYZER = "### DISABLE FILEANALYZER ###";
	private static final String MAX_LINES_STRING = "maxLines=";
	private static final int DEFAULT_MAX_LINES = 200;


	public static void enableFileAnalyzer()
	{
		logger.error(ENABLE_FILEANALYZER);
	}

	/**
	 * @deprecated use disableFileAnalyzer(String reason) instead
	 */
	@Deprecated
	public static void disableFileAnalyzer()
	{
		logger.error(DISABLE_FILEANALYZER + MAX_LINES_STRING + DEFAULT_MAX_LINES);
	}

	/**
	 * @deprecated use disableFileAnalyzer(String reason, int forMaxLines) instead
	 */
	@Deprecated
	public static void disableFileAnalyzer(final int forMaxLines)
	{
		logger.error(DISABLE_FILEANALYZER + MAX_LINES_STRING + forMaxLines);
	}

	/**
	 * @param reason
	 *           The reason why the fileanalyzer should be disabled for the next line, e.g. the exception that will be
	 *           thrown
	 */
	public static void disableFileAnalyzer(final String reason)
	{
		disableFileAnalyzer(reason, DEFAULT_MAX_LINES);
	}

	/**
	 * @param reason
	 *           The reason why the fileanalyzer should be disabled for the next lines, e.g. the exception that will be
	 *           thrown
	 * 
	 * @param forMaxLines
	 *           Amount of lines the fileanalyzer should skip
	 */
	public static void disableFileAnalyzer(final String reason, final int forMaxLines)
	{
		logger.error("### Reason for disabling the fileanalyzer : " + reason);
		logger.error(DISABLE_FILEANALYZER + MAX_LINES_STRING + forMaxLines);
	}

	public static boolean forceGC()
	{
		final AtomicBoolean finalizedFlag = new AtomicBoolean(false);

		Object dummy = new Object()
		{
			@Override
			protected void finalize() throws Throwable
			{
				finalizedFlag.set(true);
				super.finalize();
			}
		};
		assertNotNull(dummy); // this is just to please variable-must-be-read policy :)
		dummy = null; // free reference

		for (int i = 0; i < 20 && !finalizedFlag.get(); i++)
		{
			System.gc();
			System.runFinalization();
			Thread.yield();
		}
		final boolean result = finalizedFlag.get();

		return result; // if dummy object has been finalized we assume it worked
	}


	public static long dumpMemory()
	{
		forceGC();
		return (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024;
	}

}
