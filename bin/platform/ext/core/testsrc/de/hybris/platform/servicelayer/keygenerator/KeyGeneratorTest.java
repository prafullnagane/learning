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
package de.hybris.platform.servicelayer.keygenerator;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.PK;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.numberseries.NumberSeriesManager;
import de.hybris.platform.servicelayer.ServicelayerTransactionalBaseTest;
import de.hybris.platform.servicelayer.keygenerator.impl.PKGenerator;
import de.hybris.platform.servicelayer.keygenerator.impl.PersistentKeyGenerator;
import de.hybris.platform.servicelayer.keygenerator.impl.SystemTimeGenerator;
import de.hybris.platform.test.TestThreadsHolder;
import de.hybris.platform.util.Config;

import java.util.Collections;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class KeyGeneratorTest extends ServicelayerTransactionalBaseTest
{
	private static final Logger log = Logger.getLogger(KeyGeneratorTest.class.getName());

	@Resource
	private PersistentKeyGenerator orderCodeGenerator;
	@Resource
	private SystemTimeGenerator systemTimeGenerator;
	private PKGenerator pkGenerator;

	@Before
	public void setUp()
	{
		pkGenerator = new PKGenerator();
	}

	// PLA-12605
	@Test
	public void testConcurrentInit()
	{
		// cannot test on hsqldb since it every now and then runs into
		// weird db locks that are never freed :( 
		if (!Config.isHSQLDBUsed())
		{
			testConcurrentInit(20, 30);
		}
	}

	private void testConcurrentInit(final int threads, final int durationSeconds)
	{
		final long maxMillis = System.currentTimeMillis() + (durationSeconds * 1000);
		int round = 0;
		log.info("starting concurrent test for PersistentKeyGenerator.init() - will take at least " + durationSeconds
				+ " seconds...");
		do
		{
			final String key = "concurrentKey-" + round++;
			PersistentKeyGenerator gen = null;
			try
			{
				gen = createKeyGenerator(key);
				initConcurrently(threads, gen);
			}
			finally
			{
				removeSeries(key);
			}

		}
		while (System.currentTimeMillis() < maxMillis);
	}

	private void removeSeries(final String key)
	{
		if (key != null)
		{
			try
			{
				NumberSeriesManager.getInstance().removeNumberSeries(key);
			}
			catch (final JaloInvalidParameterException e)
			{
				// ignore
			}
		}
	}

	private PersistentKeyGenerator createKeyGenerator(final String key)
	{
		final PersistentKeyGenerator generator = new PersistentKeyGenerator();
		generator.setKey(key);
		generator.setNumeric(true);
		generator.setDigits(3);
		generator.setStart("001");
		return generator;
	}

	private void initConcurrently(final int threads, final PersistentKeyGenerator generator)
	{
		final Runnable logic = new Runnable()
		{
			@Override
			public void run()
			{
				generator.generate();
			}
		};
		final TestThreadsHolder runners = new TestThreadsHolder(threads, logic, true);

		runners.startAll();

		assertTrue("Threads locked", runners.waitAndDestroy(30));
		assertEquals("Empty error set expected", Collections.EMPTY_MAP, runners.getErrors());
		assertNotNull("Could not generate next key", generator.generate());
	}

	@Test
	public void testPKGenerator()
	{
		try
		{
			pkGenerator.generate();
			fail("UnsupportedOperationException expected");
		}
		catch (final UnsupportedOperationException e) // NOPMD
		{
			//OK
		}

		final PK pk = (PK) pkGenerator.generateFor(Integer.valueOf(1));
		assertNotNull(pk);
		assertEquals(Integer.valueOf(1), Integer.valueOf(pk.getTypeCode()));

		try
		{
			pkGenerator.reset();
			fail("UnsupportedOperationException expected");
		}
		catch (final UnsupportedOperationException e) // NOPMD
		{
			//OK
		}
	}

	@Test
	public void testOrderCodeGenerator()
	{
		resetOrderSeries();

		String number = (String) orderCodeGenerator.generate();
		assertNotNull(number);
		assertEquals("00000000", number);

		number = (String) orderCodeGenerator.generate();
		assertNotNull(number);
		assertEquals("00000001", number);

		resetOrderSeries();

		number = (String) orderCodeGenerator.generate();
		assertNotNull(number);
		assertEquals("00000000", number);

		try
		{
			orderCodeGenerator.generateFor(new Object());
			fail("UnsupportedOperationException expected");
		}
		catch (final UnsupportedOperationException e) // NOPMD
		{
			//OK
		}
	}

	protected void resetOrderSeries()
	{
		try
		{
			orderCodeGenerator.reset();
		}
		catch (final JaloInvalidParameterException e)
		{
			// fine
		}
	}

	@Test
	public void testSystemTimeGenerator()
	{
		try
		{
			systemTimeGenerator.reset();
			fail("UnsupportedOperationException expected");
		}
		catch (final Exception e)
		{
			// OK
		}

		final Long time = (Long) systemTimeGenerator.generate();
		assertNotNull(time);

		try
		{
			systemTimeGenerator.generateFor(new Object());
			fail("UnsupportedOperationException expected");
		}
		catch (final Exception e)
		{
			// OK
		}
	}


}
