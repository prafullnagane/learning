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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.list.UnmodifiableList;
import org.apache.commons.collections.set.UnmodifiableSet;


/**
 * Collection of static assert methods not provided by the JUnit framework. Use it equivalent to the JUnit
 * {@link org.junit.Assert} class by a static import.
 */
public class Assert
{
	/**
	 * Asserts that actual collection contains only given objects.
	 * @param actual collection which has to contain only given objects
	 * @param objects objects that has to be existent in given collection and no other one
	 */
	public static void assertCollectionElements(final Collection actual, final Object... objects)
	{
		assertCollection(null, Arrays.asList(objects), actual);
	}

	/**
	 * Asserts that actual contains only obj.
	 * @deprecated see {@link #assertCollectionElements(Collection, Object...)}
	 */
	@Deprecated
	public static void assertCollectionElements(final Object obj, final Collection actual)
	{
		assertCollectionElements(actual, obj);
	}

	/**
	 * Asserts that actual contains only objA and objB
	 * @deprecated see {@link #assertCollectionElements(Collection, Object...)}
	 */
	@Deprecated
	public static void assertCollectionElements(final Object objA, final Object objB, final Collection actual)
	{
		assertCollectionElements(actual, objA, objB);
	}

	/**
	 * Asserts that actual contains only objA, objB and objC.
	 * @deprecated see {@link #assertCollectionElements(Collection, Object...)}
	 */
	@Deprecated
	public static void assertCollectionElements(final Object objA, final Object objB, final Object objC, final Collection actual)
	{
		assertCollectionElements(actual, objA, objB, objC);
	}

	/**
	 * Asserts that actual contains only objA, objB, objC and objD.
	 * @deprecated see {@link #assertCollectionElements(Collection, Object...)}
	 */
	@Deprecated
	public static void assertCollectionElements(final Object objA, final Object objB, final Object objC, final Object objD,
			final Collection actual)
	{
		assertCollectionElements(actual, objA, objB, objC, objD);
	}

	/**
	 * Asserts that expected and actual collection contain the same elements and have the same size.
	 * @param expected collection used as reference collection for the actual one
	 * @param actual collection which has to have exactly the same elements as the expected one
	 */
	public static void assertCollection(final Collection expected, final Collection actual)
	{
		assertCollection(null, expected, actual);
	}

	/**
	 * Asserts that expected value belongs to a given numerical range .
	 * @param lowerLimit lower limit of the expected range
	 * @param upperLimit upper limit of the expected range
	 * @param actual actual value
	 */
	public static <T extends Comparable> void assertValueInRange(final T lowerLimit, final T upperLimit, final T actual)
	{
		assertValueInRange("", lowerLimit, upperLimit, actual);
	}

	/**
	 * Asserts that expected value belongs to a given numerical range .
	 * @param message Failure message
	 * @param lowerLimit lower limit of the expected range
	 * @param upperLimit upper limit of the expected range
	 * @param actual actual value
	 */
	public static <T extends Comparable> void assertValueInRange(final String message, final T lowerLimit, final T upperLimit,
			final T actual)
	{
		if (lowerLimit.compareTo(actual) > 0 || upperLimit.compareTo(actual) < 0)
		{
			fail(message + " expected in range (<" + lowerLimit + ">,<" + upperLimit + "> ) but was:<" + actual + ">");
		}
	}

	//Price was expected to be in the price range from <"+lowerLimit+"> to <"+upperLimit+">, but it was <"+actualValue+">", actualValue <= upperLimit);

	/**
	 * Asserts that expected and actual collection contain the same elements and have the same size.
	 * @param expected collection used as reference collection for the actual one
	 * @param actual collection which has to have exactly the same elements as the expected one
	 * @param message to show if assertion fires
	 */
	public static void assertCollection(final String message, final Collection expected, final Collection actual)
	{
		if (expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected))
		{
			return;
		}
		String formatted = "";
		if (message != null)
		{
			formatted = message + " ";
		}
		String expectedString = String.valueOf(expected);
		String actualString = String.valueOf(actual);
		if (expectedString.equals(actualString))
		{
			expectedString = expectedString + " (" + getCollectionAndElementClassNames(expected) + ")";
			actualString = actualString + " (" + getCollectionAndElementClassNames(actual) + ")";
		}
		fail(formatted + "expected:<" + expectedString + "> but was:<" + actualString + ">");
	}

	/**
	 * Gets a message enumerating all elements of the given collection.
	 * @param coll collection the elements are needed as one message
	 * @return message enumerating all elements of given collection
	 */
	private static String getCollectionAndElementClassNames(final Collection coll)
	{
		final StringBuilder buffer = new StringBuilder();
		buffer.append(coll.getClass().getName());
		buffer.append(" containing ");
		for (final Iterator iter = coll.iterator(); iter.hasNext();)
		{
			final Object nextObject = iter.next();
			buffer.append(nextObject == null ? "null" : nextObject.getClass().getName());
			if (iter.hasNext())
			{
				buffer.append(", ");
			}
		}
		return buffer.toString();
	}

	/**
	 * Gets the single element of the collection, or fail.
	 * @param <T> type of the element
	 * @param c collection from which the single element is needed
	 * @return the single element contained in given collection
	 */
	protected <T extends Object> T singleElement(final Collection<T> c)
	{
		assertEquals("found " + c, 1, c.size());
		return c.iterator().next();
	}

	/**
	 * Gets an immutable empty set.
	 * @return an immutable empty set
	 */
	public static final Set set()
	{
		return Collections.EMPTY_SET;
	}

	/**
	 * Returns an immutable set containing the given argument.
	 * @param o element
	 * @return immutable set containing the given argument
	 */
	public static final Set set(final Object o)
	{
		return Collections.singleton(o);
	}

	/**
	 * * Returns an immutable set containing the two given arguments.
	 * @param o1 first element
	 * @param o2 second element
	 * @return immutable set containing the two given arguments
	 */
	public static final Set set(final Object o1, final Object o2)
	{
		return UnmodifiableSet.decorate(new HashSet(Arrays.asList(new Object[]
		{ o1, o2 })));
	}

	/**
	 * Returns an immutable set containing the three given arguments.
	 * @param o1 first element
	 * @param o2 second element
	 * @param o3 third element
	 * @return immutable set containing the three given arguments
	 */
	public static final Set set(final Object o1, final Object o2, final Object o3)
	{
		return UnmodifiableSet.decorate(new HashSet(Arrays.asList(new Object[]
		{ o1, o2, o3 })));
	}

	/**
	 * Returns an immutable set containing the four given arguments.
	 * @param o1 first element
	 * @param o2 second element
	 * @param o3 third element
	 * @param o4 fourth element
	 * @return immutable set containing the four given arguments
	 */
	public static final Set set(final Object o1, final Object o2, final Object o3, final Object o4)
	{
		return UnmodifiableSet.decorate(new LinkedHashSet(Arrays.asList(new Object[]
		{ o1, o2, o3, o4 })));
	}

	/**
	 * Converts the given collection to a list.
	 * @param <T> type of collection elements
	 * @param c collection to convert
	 * @return list of elements of given collection
	 */
	public static final <T extends Object> List<T> toList(final Collection<T> c)
	{
		return new ArrayList(c);
	}

	/**
	 * Reverses the order of the given list.
	 * @param <T> type of list elements
	 * @param source list to reverse
	 * @return reversed list
	 * @deprecated see {@link Collections#reverse(List)}
	 */
	@Deprecated
	public static final <T extends Object> List<T> reverse(final List<T> source)
	{
		Collections.reverse(source);
		return source;
	}

	/**
	 * Returns an immutable empty list.
	 * @return immutable empty list
	 */
	public static final List list()
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * Returns an immutable list containing the given argument. *
	 * @param o element
	 * @return immutable list containing the given argument
	 */
	public static final List list(final Object o)
	{
		return Collections.singletonList(o);
	}

	/**
	 * Returns a list containing the two given arguments. *
	 * @param o1 first element
	 * @param o2 second element
	 * @return immutable list containing the two given arguments
	 */
	public static final List list(final Object o1, final Object o2)
	{
		return UnmodifiableList.decorate(Arrays.asList(new Object[]
		{ o1, o2 }));
	}

	/**
	 * Returns a list containing the three given arguments.
	 * @param o1 first element
	 * @param o2 second element
	 * @param o3 third element
	 * @return immutable list containing the three given arguments
	 */
	public static final List list(final Object o1, final Object o2, final Object o3)
	{
		return UnmodifiableList.decorate(Arrays.asList(new Object[]
		{ o1, o2, o3 }));
	}

	/**
	 * Returns an immutable list containing the four given arguments.
	 * @param o1 first element
	 * @param o2 second element
	 * @param o3 third element
	 * @param o4 fourth element
	 * @return immutable list containing the four given arguments
	 */
	public static final List list(final Object o1, final Object o2, final Object o3, final Object o4)
	{
		return UnmodifiableList.decorate(Arrays.asList(new Object[]
		{ o1, o2, o3, o4 }));
	}

	/**
	 * Asserts that two objects are not equal. Throws an <tt>AssertionFailedError</tt> if they are equal.
	 */
	public static void assertNotEquals(final Object expected, final Object actual)
	{
		assertNotEquals(null, expected, actual);
	}

	/**
	 * Asserts that two objects are not equal. Throws an <tt>AssertionFailedError</tt> if they are equal.
	 */
	public static void assertNotEquals(final String message, final Object expected, final Object actual)
	{
		if ((expected == null && actual == null) || (expected != null && expected.equals(actual)))
		{
			failNotEquals(message, expected);
		}
	}

	private static void failNotEquals(final String message, final Object expected)
	{
		String formatted = "";
		if (message != null)
		{
			formatted = message + " ";
		}

		fail(formatted + "expected not equals to: <" + expected + ">");
	}
}
