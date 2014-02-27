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
package de.hybris.platform.test;

import de.hybris.platform.testframework.runlistener.VMBlockTimeRunListener;


/**
 * @see VMBlockTimeRunListener
 */
public final class VMBlockTimeRecorder extends Thread
{
	private final long tickDelay;
	private volatile long lastTickMS = -1;
	private volatile long maxDelta = -1;

	private static volatile VMBlockTimeRecorder SINGLETON = new VMBlockTimeRecorder(1000);
	static
	{
		if (Boolean.TRUE.toString().equalsIgnoreCase(System.getenv("platform.blocktime.recorder")))
		{
			SINGLETON.start();
		}
	}

	public static void ensureRunning()
	{
		if (!SINGLETON.isAlive())
		{
			SINGLETON.start();
		}
	}

	public static void ensureNotRunning()
	{
		if (SINGLETON.isAlive())
		{
			SINGLETON.interrupt();
		}
	}

	public static long getMaxBlockTimeMillis()
	{
		final long max = SINGLETON.maxDelta;
		if (max > -1)
		{
			return max - SINGLETON.tickDelay;
		}
		else
		{
			return -1;
		}
	}

	public static void reset()
	{
		SINGLETON.resetStats();
	}

	private VMBlockTimeRecorder(final long tickDelay)
	{
		super("VMBlockTimeRecorder");
		setDaemon(true);
		this.tickDelay = tickDelay;
	}

	@Override
	public void run()
	{
		init();
		do
		{
			tick();
			sleep();
		}
		while (!isInterrupted());

		// cleanup
		resetStats();
	}

	private void resetStats()
	{
		this.lastTickMS = -1;
		this.maxDelta = -1;
	}

	private void init()
	{
		lastTickMS = System.currentTimeMillis();
	}

	private void tick()
	{
		final long tick = System.currentTimeMillis();
		if (lastTickMS > -1)
		{
			final long delta = tick - lastTickMS;
			maxDelta = Math.max(maxDelta, delta);
		}
		lastTickMS = tick;
	}

	private void sleep()
	{
		try
		{
			sleep(this.tickDelay);
		}
		catch (final InterruptedException e)
		{
			this.interrupt();
		}
	}
}
