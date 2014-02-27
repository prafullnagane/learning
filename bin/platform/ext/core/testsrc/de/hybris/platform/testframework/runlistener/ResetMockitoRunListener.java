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

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;
import org.mockito.internal.progress.ThreadSafeMockingProgress;


/**
 * Kills ongoing Mockito stubbing and frees recorded invocations before and after each test class.
 */
public class ResetMockitoRunListener extends RunListener
{
	@Override
	public void testRunStarted(final Description description) throws Exception
	{
		resetMockito();
	}

	@Override
	public void testRunFinished(final Result result) throws Exception
	{
		resetMockito();
	}

	public static void resetMockito()
	{
		new ThreadSafeMockingProgress().reset();
	}
}
