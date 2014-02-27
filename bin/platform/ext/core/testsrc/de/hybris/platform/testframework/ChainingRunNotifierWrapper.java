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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.iterators.ReverseListIterator;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.BlockJUnit4ClassRunner;


/**
 * Wraps a {@link RunNotifier} to extend the listener concept to act like a chain in meaning of having revert order on
 * test finalizing. For this the listener added will not be passed to the wrapped instance to avoid calling them twice,
 * so the wrapped instance holds only the instances assigned before wrapping. As the {@link BlockJUnit4ClassRunner} is
 * used differently in environments there is no chance to intercept the {@link RunNotifier} creation, so this wrapper
 * can be used first at entry of {@link BlockJUnit4ClassRunner#run(RunNotifier)} method. Unfortunately the firing of
 * events for a complete test run are done outside. With that this events will not be delegatet to the wrapper instance
 * in general as they will be called separately outside of run method.
 */
public class ChainingRunNotifierWrapper extends RunNotifier
{
	/** Listener chain additonal to the wrapped one. The set will be disjunct to the wrapped ones. */
	private final List<RunListener> fListeners = Collections.synchronizedList(new ArrayList<RunListener>());

	/** Wrapped notifier. */
	private final RunNotifier delegate;

	/**
	 * Creates a new notifier using passed notifier as delegate.
	 */
	public ChainingRunNotifierWrapper(final RunNotifier delegate)
	{
		super();
		this.delegate = delegate;
	}

	/**
	 * Adds the listener as first listener to this notifier, not to wrapped one.
	 */
	@Override
	public void addFirstListener(final RunListener listener)
	{
		fListeners.add(fListeners.size(), listener);
	}

	/**
	 * Adds the listener to this notifier, will not be added to wrapped one.
	 */
	@Override
	public void addListener(final RunListener listener)
	{
		fListeners.add(0, listener);
	}

	/**
	 * Removes the listener from wrapped notifier and this notifier.
	 */
	@Override
	public void removeListener(final RunListener listener)
	{
		delegate.removeListener(listener);
		fListeners.remove(listener);
	}

	/**
	 * Calls {@link RunListener#testRunStarted(Description)} for all listeners in normal order. No call to wrapper will
	 * be done as listeners of wrapper will be called outside of run method of ClassRunner.
	 */
	@Override
	public void fireTestRunStarted(final Description description)
	{
		new SafeNotifier()
		{
			@Override
			protected void notifyListener(final RunListener each) throws Exception //NOPMD
			{
				each.testRunStarted(description);
			}
		}.run();
	}

	/**
	 * Calls {@link RunListener#testRunFinished(Result)} for all listeners in reverse order. No call to wrapper will be
	 * done as listeners of wrapper will are called already outside of run method of ClassRunner.
	 */
	@Override
	public void fireTestRunFinished(final Result result)
	{
		new ReverseSafeNotifier()
		{
			@Override
			protected void notifyListener(final RunListener each) throws Exception //NOPMD
			{
				each.testRunFinished(result);
			}
		}.run();
	}

	/**
	 * Delegates to wrapper first, then calls {@link RunListener#testStarted(Description)} for all listeners in normal
	 * order.
	 */
	@Override
	public void fireTestStarted(final Description description) throws StoppedByUserException
	{
		delegate.fireTestStarted(description);
		new SafeNotifier()
		{
			@Override
			protected void notifyListener(final RunListener each) throws Exception //NOPMD
			{
				each.testStarted(description);
			}
		}.run();
	}

	/**
	 * Delegates to wrapper first, then calls {@link RunListener#testFailure(Failure)} for all listeners in reverse
	 * order.
	 */
	@Override
	public void fireTestFailure(final Failure failure)
	{
		delegate.fireTestFailure(failure);
		new ReverseSafeNotifier()
		{
			@Override
			protected void notifyListener(final RunListener each) throws Exception //NOPMD
			{
				each.testFailure(failure);
			}
		}.run();
	}

	/**
	 * Delegates to wrapper first, then calls {@link RunListener#testAssumptionFailure(Failure)} for all listeners in
	 * normal order.
	 */
	@Override
	public void fireTestAssumptionFailed(final Failure failure)
	{
		delegate.fireTestAssumptionFailed(failure);
		new SafeNotifier()
		{
			@Override
			protected void notifyListener(final RunListener each) throws Exception //NOPMD
			{
				each.testAssumptionFailure(failure);
			}
		}.run();
	}

	/**
	 * Delegates to wrapper first, then calls {@link RunListener#testIgnored(Description)} for all listeners in normal
	 * order.
	 */
	@Override
	public void fireTestIgnored(final Description description)
	{
		delegate.fireTestIgnored(description);
		new SafeNotifier()
		{
			@Override
			protected void notifyListener(final RunListener each) throws Exception //NOPMD
			{
				each.testIgnored(description);
			}
		}.run();
	}

	/**
	 * Calls {@link RunListener#testFinished(Description)} for all listeners in reversed order, afterwards it calls
	 * wrapper implementation.
	 */
	@Override
	public void fireTestFinished(final Description description)
	{
		new ReverseSafeNotifier()
		{
			@Override
			protected void notifyListener(final RunListener each) throws Exception //NOPMD
			{
				each.testFinished(description);
			}
		}.run();
		delegate.fireTestFinished(description);
	}

	/**
	 * Simply delegates to wrapped runner.
	 */
	@Override
	public void pleaseStop()
	{
		delegate.pleaseStop();
	}

	/**
	 * Removes all listeners for this runner.
	 */
	public void removeAllListeners()
	{
		fListeners.clear();
	}

	/**
	 * Copied from {@link RunNotifier} as it is private.
	 */
	private abstract class SafeNotifier //NOPMD
	{
		public void run()
		{
			synchronized (fListeners)
			{
				for (final Iterator<RunListener> all = fListeners.iterator(); all.hasNext();)
				{
					try
					{
						notifyListener(all.next());
					}
					catch (final Exception e)
					{
						all.remove(); // Remove the offending listener first to avoid an infinite loop
						fireTestFailure(new Failure(Description.TEST_MECHANISM, e));
					}
				}
			}
		}

		abstract protected void notifyListener(RunListener each) throws Exception; //NOPMD
	}

	/**
	 * Same as {@link SafeNotifier} but with reversed order of iterating over listeners.
	 */
	private abstract class ReverseSafeNotifier //NOPMD
	{
		public void run()
		{
			synchronized (fListeners)
			{
				for (final ReverseListIterator all = new ReverseListIterator(fListeners); all.hasNext();)
				{
					try
					{
						notifyListener((RunListener) all.next());
					}
					catch (final Exception e)
					{
						all.remove(); // Remove the offending listener first to avoid an infinite loop
						fireTestFailure(new Failure(Description.TEST_MECHANISM, e));
					}
				}
			}
		}

		abstract protected void notifyListener(RunListener each) throws Exception; //NOPMD
	}

}
