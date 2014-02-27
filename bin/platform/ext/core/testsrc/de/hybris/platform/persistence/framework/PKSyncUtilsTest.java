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
package de.hybris.platform.persistence.framework;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.Constants;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.Registry;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.user.Title;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.jalo.user.UserManager;
import de.hybris.platform.testframework.HybrisJUnit4ClassRunner;
import de.hybris.platform.testframework.RunListeners;
import de.hybris.platform.testframework.runlistener.LogRunListener;
import de.hybris.platform.testframework.runlistener.PlatformRunListener;
import de.hybris.platform.util.collections.ConcurrentWeakHashMap;

import java.util.concurrent.atomic.AtomicBoolean;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;


/*
 * Attentions: we MUST have our own set of listeners because just extending HybrisJunit4Test
 * will BREAK this test ( testWeakReferenceWithItem() ) due to recording created item PKs 
 * which makes it impossible for GC to collect them !!!
 */
@IntegrationTest
@RunWith(HybrisJUnit4ClassRunner.class)
@RunListeners(
{ LogRunListener.class, PlatformRunListener.class })
public class PKSyncUtilsTest
{

	private static final Logger LOG = Logger.getLogger(PKSyncUtilsTest.class.getName());

	long pkAsLong = -1;

	@After
	public void tearDown()
	{
		if (pkAsLong != -1)
		{
			try
			{
				JaloSession.getCurrentSession().getItem(PK.fromLong(pkAsLong)).remove();
			}
			catch (final Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	protected void clearItemCaches()
	{
		Registry.getCurrentTenant().getCache().clear();
		Registry.getCurrentTenant().getPersistencePool().clearCache();
	}

	protected boolean forceGC()
	{
		return forceGC(5, 15);
	}

	protected boolean forceGC(final int minSeconds, final int maxSeconds)
	{
		final AtomicBoolean flag = new AtomicBoolean(false);

		Object dummy = new Object()
		{
			@Override
			protected void finalize() throws Throwable
			{
				flag.set(true);
				super.finalize();
			}
		};
		assertNotNull(dummy); // this is just to please variable-must-be-read policy :)
		dummy = null; // free reference

		long currentTime = System.currentTimeMillis();
		final long minTimeToWait = currentTime + (Math.max(minSeconds, 2) * 1000);
		final long maxTimeToWait = currentTime + (Math.max(maxSeconds, 5) * 1000);
		do
		{
			System.gc();
			System.runFinalization();
			Thread.yield();
			currentTime = System.currentTimeMillis();
		}
		while (currentTime < minTimeToWait || (!flag.get() && currentTime < maxTimeToWait));

		return flag.get(); // if dummy object has been finalized we assume it worked
	}

	@Test
	//PLA-9946
	public void testConcurrentWeakHashmap()
	{
		final ConcurrentWeakHashMap<PK, String> testMap = new ConcurrentWeakHashMap<PK, String>(10);

		PK pk = PK.createFixedPK(10, 12345l);
		final String value = "foo";

		testMap.putIfAbsent(pk, value);

		assertSame(value, testMap.get(pk));

		// clear ref to key
		pk = null;

		if (forceGC())
		{
			pk = PK.createFixedPK(10, 12345l);

			assertNull(testMap.get(pk));
		}
		else
		{
			LOG.warn("could not force GC - skipping testConcurrentWeakHashmap()");
		}
	}

	@Test
	//PLA-9946
	public void testWeakReferenceWithPK() throws ConsistencyCheckException, InterruptedException
	{
		final PKSyncUtils sync = new PKSyncUtils();

		PK pk = PK.createFixedPK(10, 5555l);

		final Object syncToken = sync.getSyncObject(pk);

		assertSame(syncToken, sync.getSyncObject(pk));

		pk = null;

		if (forceGC())
		{
			pk = PK.createFixedPK(10, 5555l);

			assertNotSame(syncToken, sync.getSyncObject(pk));
		}
		else
		{
			LOG.warn("could not force GC - skipping testWeakReferenceWithPK()");
		}
	}

	@Test
	//PLA-9946  -> PLA-9951
	public void testWeakReferenceWithExistingItem() throws ConsistencyCheckException, InterruptedException
	{
		final PKSyncUtils sync = new PKSyncUtils();

		UserGroup item = UserManager.getInstance().getUserGroupByGroupID(Constants.USER.ADMIN_USERGROUP);
		PK pk = item.getPK();
		final long longPK = pk.getLongValue();

		assertTrue(item.isCacheBound());

		final Object syncToken = sync.getSyncObject(pk);

		assertSame(syncToken, sync.getSyncObject(pk));

		item = null;
		pk = null;

		clearItemCaches();

		if (forceGC())
		{
			pk = PK.fromLong(longPK);

			assertNotSame(syncToken, sync.getSyncObject(pk));
		}
		else
		{
			LOG.warn("could not force GC - skipping testWeakReferenceWithExistingItem()");
		}
	}

	@Test
	public void testWeakReferenceWithItem() throws ConsistencyCheckException, InterruptedException
	{
		final PKSyncUtils sync = new PKSyncUtils();

		Title item = UserManager.getInstance().createTitle("foo");
		PK pk = item.getPK();
		pkAsLong = pk.getLongValue();

		assertTrue(item.isCacheBound());

		final Object syncToken = sync.getSyncObject(pk);

		assertSame(syncToken, sync.getSyncObject(pk));

		item = null;
		pk = null;

		clearItemCaches();

		if (forceGC(10, 30))
		{
			pk = PK.fromLong(pkAsLong);

			assertNotSame(syncToken, sync.getSyncObject(pk));
		}
		else
		{
			LOG.warn("could not force GC - skipping testWeakReferenceWithItem()");
		}
	}

	@Test
	public void checkConcurrentScenario1()
	{

		final PKSyncUtils sync = new PKSyncUtils();

		final PK sampleSynchronizedObject = PK.createFixedCounterPK(0, System.currentTimeMillis());

		final Object threadASync = sync.getSyncObject(sampleSynchronizedObject);

		final Object threadBSync = sync.getSyncObject(sampleSynchronizedObject);

		Assert.assertTrue("sync object should be the same instances", threadASync == threadBSync);

		sync.freeSyncObject(threadASync);

		final Object threadCSync = sync.getSyncObject(sampleSynchronizedObject);

		Assert.assertTrue("sync objects should be the same instances, since there is one sync creation left",
				threadBSync == threadCSync);

		//sync.freeSyncObject(threadBSync);

		//sync.freeSyncObject(threadCSync);

		//Assert.assertTrue("sync objects should not be the same instances, since there is no sync creation left", sync
		//		.getSyncObject(sampleSynchronizedObject) != threadCSync);

	}


}
