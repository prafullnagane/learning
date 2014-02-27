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
package de.hybris.platform.servicelayer.time.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.time.TimeService;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;


@IntegrationTest
public class DefaultTimeServiceTest extends ServicelayerBaseTest
{
	final long offset = 60 * 1000;

	@Resource
	private TimeService timeService;

	//	Some notes on testing time offset on bamboo:
	//	In that environment the JVM may block *any time* for *seconds if not
	// minutes* which is why we must pretend that between each instruction may
	// be a time-relevant delay. 
	// In consequence the following code is not safe:
	//    Date futureDate = new Date( System.currentTimeMillis() + 100 );
	//    timeService.setCurrentTime( futureDate );
	//    assertEquals( 100, timeService.getTimeOffset() );
	// Simply because between assembling the 100-offset Date and making
	// the time service store the offset may be some delay so that the actual
	// offset might be 100, 90, 50 or at worst -200 !
	//
	// So what to do:
	// 1. choose big offsets
	// 2. compare with <= & >=
	// 3. accept that the test may still fail from time to time !!!

	@Test
	public void testSetCurrentTime()
	{
		assertEquals(0, timeService.getTimeOffset());

		final Date futureTime = new Date(System.currentTimeMillis() + offset);
		timeService.setCurrentTime(futureTime);
		assertTrue(timeService.getTimeOffset() != 0);
		// since we're setting the offset indirectly via Date it may not be exactly 60 seconds!
		assertTrue(offset >= timeService.getTimeOffset());
		assertTrue(offset / 2 < timeService.getTimeOffset());

		// since we're setting the offset indirectly via Date it may not be exactly 60 seconds!
		long now = System.currentTimeMillis();
		final long diff = timeService.getCurrentTime().getTime() - now;
		assertTrue(diff != 0);
		assertTrue(offset >= diff);
		assertTrue(offset / 2 < diff);

		final Date nowTime = new Date(System.currentTimeMillis());
		timeService.setCurrentTime(nowTime);
		// since we're setting the offset indirectly via Date it may not be exactly 0 seconds!
		assertTrue(0 <= timeService.getTimeOffset());
		now = System.currentTimeMillis();
		assertTrue(0 <= timeService.getCurrentTime().getTime() - now);

		timeService.setCurrentTime(null);
		assertEquals(0, timeService.getTimeOffset());
		assertTrue(0 <= timeService.getCurrentTime().getTime() - System.currentTimeMillis());

		final Date pastTime = new Date(System.currentTimeMillis() - offset);
		timeService.setCurrentTime(pastTime);
		// since we're setting the offset indirectly via Date it may not be exactly 0 seconds!
		assertTrue(0 > timeService.getTimeOffset()); // definitely below 0
		assertTrue((-1 * offset) / 2 > timeService.getTimeOffset()); // should be also below offset/2
		assertTrue((-2 * offset) < timeService.getTimeOffset()); // should be above  2 * offset

		// since we're setting the offset indirectly via Date it may not be exactly 0 seconds!
		final long diff2 = timeService.getCurrentTime().getTime() - System.currentTimeMillis();
		assertTrue(0 > diff2); // definitely below 0
		assertTrue((-1 * offset) / 2 > diff2); // should also be below offest / 2
		assertTrue((-2 * offset) < diff2); // should also be above 2 * offset
	}

	@Test
	public void testSetTimeOffset()
	{
		timeService.setTimeOffset(offset);
		assertEquals(offset, timeService.getTimeOffset());
		// since we're setting the offset indirectly via Date it may not be exactly 60 seconds!
		long now = System.currentTimeMillis();
		final long diff = timeService.getCurrentTime().getTime() - now;
		assertTrue(diff != 0);
		assertTrue(offset >= diff);
		assertTrue(offset / 2 < diff);

		timeService.setTimeOffset(0);
		assertEquals(0, timeService.getTimeOffset());
		now = System.currentTimeMillis();
		assertTrue(0 <= timeService.getCurrentTime().getTime() - now);

		timeService.setTimeOffset(-1 * offset);
		assertEquals(-1 * offset, timeService.getTimeOffset());
		// since we're setting the offset indirectly via Date it may not be exactly 0 seconds!
		now = System.currentTimeMillis();
		final long diff2 = timeService.getCurrentTime().getTime() - now;
		assertTrue(0 > diff2); // definitely below 0
		assertTrue((-1 * offset) / 2 > diff2); // should also be below offest / 2
		assertTrue((-2 * offset) < diff2); // should also be above 2 * offset
	}

	@Test
	public void testSetCurrentTimeSystem()
	{
		timeService.setTimeOffset(12345);
		assertEquals(12345, timeService.getTimeOffset());

		timeService.resetTimeOffset();
		assertEquals(0, timeService.getTimeOffset());
		assertTrue(System.currentTimeMillis() >= timeService.getCurrentTime().getTime());
	}

}
