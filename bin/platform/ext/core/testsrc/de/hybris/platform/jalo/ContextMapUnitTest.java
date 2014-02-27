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
package de.hybris.platform.jalo;

import de.hybris.bootstrap.annotations.PerformanceTest;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Test checking if the ContextMap fulfills contract of thread safety.
 */
@PerformanceTest
public class ContextMapUnitTest
{

	private final ContextMap<String, String> parentMap = new ContextMap<String, String>();

	private final Map<String, String> givenAttributes = new HashMap<String, String>((int) (10 / 0.75f) + 1);

	@Before
	public void prepare()
	{


		parentMap.put("P1", "foo one");
		parentMap.put("P2", "foo two");



		givenAttributes.put("C1", "bar one");
		givenAttributes.put("C2", "bar two");

	}



	@Test
	public void testEmptyAsGlobal()
	{
		Assert.assertTrue(new ContextMap<String, String>(null).isEmpty());
	}

	@Test
	public void testEmptyAsLocal()
	{

		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		Assert.assertFalse(ctxMap.isEmpty());

		ctxMap.putAll(givenAttributes);

		Assert.assertFalse(ctxMap.isEmpty());

		ctxMap.remove("C1");
		ctxMap.remove("C2");
		ctxMap.remove("P1");
		ctxMap.remove("P2");
		Assert.assertTrue(ctxMap.isEmpty());
	}

	@Test
	public void testClearAsGlobal()
	{

		final Map<String, String> empty = new ContextMap<String, String>(null);
		Assert.assertTrue(empty.isEmpty());
		empty.clear();
		Assert.assertTrue(empty.isEmpty());
	}

	/**
	 * assures no modification calls on parent map
	 */
	@Test
	public void testClearAsLocal()
	{
		final ContextMap<String, String> parentMapSpy = Mockito.spy(parentMap);

		Mockito.doThrow(new RuntimeException()).when(parentMapSpy).clear();
		Mockito.doThrow(new RuntimeException()).when(parentMapSpy).put(Mockito.anyString(), Mockito.anyString());
		Mockito.doThrow(new RuntimeException()).when(parentMapSpy).remove(Mockito.anyString());

		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMapSpy);

		Assert.assertFalse(parentMapSpy.isEmpty());
		Assert.assertFalse(ctxMap.isEmpty());

		ctxMap.putAll(givenAttributes);


		Assert.assertFalse(ctxMap.isEmpty());

		ctxMap.clear();
		Assert.assertTrue(ctxMap.isEmpty());
		Assert.assertFalse(parentMapSpy.isEmpty());

		Mockito.verify(parentMapSpy, Mockito.times(1)).keySet();
	}


	@Test
	public void testPutAllAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		ctxMap.putAll(givenAttributes);

		Assert.assertEquals(4, ctxMap.size());

		Assert.assertTrue(ctxMap.containsKey("P1"));
		Assert.assertTrue(ctxMap.containsKey("P2"));
		Assert.assertTrue(ctxMap.containsKey("C1"));
		Assert.assertTrue(ctxMap.containsKey("C2"));
	}

	@Test
	public void testPutAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		ctxMap.put("L1", "loo one");

		Assert.assertEquals(3, ctxMap.size());

		Assert.assertTrue(ctxMap.containsKey("P1"));
		Assert.assertTrue(ctxMap.containsKey("P2"));
		Assert.assertTrue(ctxMap.containsKey("L1"));
	}

	@Test
	public void testPutNullValueAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		ctxMap.put("L1", null);

		Assert.assertEquals(3, ctxMap.size());

		Assert.assertTrue(ctxMap.containsKey("L1"));
	}

	@Test
	public void testRemoveAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		Assert.assertEquals(null, ctxMap.remove("L1"));

		Assert.assertEquals(2, ctxMap.size());

		Assert.assertTrue(ctxMap.containsKey("P1"));
		Assert.assertTrue(ctxMap.containsKey("P2"));

		ctxMap.putAll(givenAttributes);

		Assert.assertEquals("bar one", ctxMap.remove("C1"));

		Assert.assertTrue(ctxMap.containsKey("P1"));
		Assert.assertTrue(ctxMap.containsKey("P2"));
		Assert.assertFalse(ctxMap.containsKey("C1"));
		Assert.assertTrue(ctxMap.containsKey("C2"));

	}


	@Test
	public void testRemoveAsGlobal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(100);

		ctxMap.putAll(givenAttributes);

		Assert.assertEquals("bar one", ctxMap.remove("C1"));
		Assert.assertEquals(null, ctxMap.remove("C1"));
	}

	@Test
	public void testRemoveRemovedAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		ctxMap.putAll(givenAttributes);

		Assert.assertEquals("bar one", ctxMap.remove("C1"));

		Assert.assertEquals(null, ctxMap.remove("C1"));
	}


	@Test
	public void testRemoveAfterCleanAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		ctxMap.putAll(givenAttributes);

		ctxMap.clear();

		Assert.assertEquals(null, ctxMap.remove("C1"));

	}

	@Test
	public void testContainsAfterCleanAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		ctxMap.putAll(givenAttributes);

		ctxMap.clear();

		Assert.assertEquals(false, ctxMap.containsKey("C1"));

	}

	@Test
	public void testContainsAfterCleanFromParentAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		ctxMap.putAll(givenAttributes);

		ctxMap.clear();

		Assert.assertEquals(false, ctxMap.containsKey("P1"));

	}

	@Test
	public void testRemoveFromParentAfterCleanAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		ctxMap.putAll(givenAttributes);

		ctxMap.clear();

		Assert.assertEquals(null, ctxMap.get("P1"));

		Assert.assertEquals(null, ctxMap.remove("P1"));
	}


	@Test
	public void testRemoveRemovedFromParentAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		ctxMap.putAll(givenAttributes);

		Assert.assertEquals("foo one", ctxMap.remove("P1"));

		Assert.assertEquals(null, ctxMap.get("P1"));

		Assert.assertEquals(null, ctxMap.remove("P1"));
	}

	@Test
	public void testContainsValueAsGlobal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(null, 100);

		ctxMap.putAll(givenAttributes);

		Assert.assertEquals(true, ctxMap.containsValue("bar one"));
		Assert.assertEquals(false, ctxMap.containsValue("bar zillion"));
	}

	@Test
	public void testContainsValueAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		ctxMap.putAll(givenAttributes);

		Assert.assertEquals(true, ctxMap.containsValue("bar one"));
		Assert.assertEquals(false, ctxMap.containsValue("bar zillion"));
		Assert.assertEquals(true, ctxMap.containsValue("foo one"));
		Assert.assertEquals(false, ctxMap.containsValue("foo zillion"));
	}

	@Test
	public void testContainsNullValueAsLocal()
	{
		final Map<String, String> ctxMap = new ContextMap<String, String>(parentMap);

		ctxMap.put("C1", null);

		Assert.assertEquals(true, ctxMap.containsValue(null));
		ctxMap.clear();
		Assert.assertEquals(false, ctxMap.containsValue(null));

	}


}
