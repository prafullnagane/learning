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

import de.hybris.platform.core.Log4JUtils;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;


/**
 * Test class runner for support of {@link RunListeners} annotation.
 * 
 * @since 3.0-u3
 */
public class HybrisJUnit4ClassRunner extends BlockJUnit4ClassRunner
{
	static
	{
		Log4JUtils.startup();
	}
	/** Used logger instance. */
	private static final Logger LOG = Logger.getLogger(HybrisJUnit4ClassRunner.class);
	/** List of registered listeners determined from annotations of test class. */
	private final Map<Class<? extends RunListener>, RunListener> listeners;
	/** Object holding tests results */
	private final Result result = new Result();

	private Filter nonAnnotationFilter = null;

	/**
	 * Creates new instance and determines all listeners to register.
	 * 
	 * @param clazz
	 *           test class
	 * @throws InitializationError
	 *            error while initialization
	 */
	public HybrisJUnit4ClassRunner(final Class<?> clazz) throws InitializationError
	{
		super(clazz);
		this.listeners = determineListeners();
	}

	@Override
	public void filter(final Filter filter) throws NoTestsRemainException
	{
		// need to keep a reference to the standard filter since ...
		if (!(filter instanceof DefaultAnnotationFilter))
		{
			this.nonAnnotationFilter = filter;
		}
		// ... super.filter internally replaces the filter by DefaultAnnotationFilter
		// but we still depend on the information in the default one!
		super.filter(filter);
	}

	@Override
	public void run(final RunNotifier notifier)
	{
		// Filtering tests -> must pass current filter to preserve method level filtering
		final Filter filter = new DefaultAnnotationFilter(this.nonAnnotationFilter);
		try
		{
			this.filter(filter);
		}
		catch (final NoTestsRemainException e)
		{
			//notthing to test - all tests are skipped because of DefaultAnnotationFilter
			return;

		}

		// wrap the notifier to call all listeners afters in chain mode
		final ChainingRunNotifierWrapper wrappedNotifier = new ChainingRunNotifierWrapper(notifier);

		// register listeners
		for (final RunListener listener : listeners.values())
		{
			wrappedNotifier.addListener(listener);
			if (LOG.isDebugEnabled())
			{
				LOG.debug("Registered " + listener.getClass().getName() + " as run listener");
			}
		}

		try
		{
			// as testRunStarted was already called on delegates we must call it for wrapped ones
			wrappedNotifier.fireTestRunStarted(getDescription());

			super.run(wrappedNotifier);
		}
		finally
		{
			// as testRunFinished will be called on delegates we must call it for wrapped ones only
			wrappedNotifier.fireTestRunFinished(result);

			// remove listeners to not get called for finished test run (in wrong order)
			wrappedNotifier.removeAllListeners();
		}

	}

	/**
	 * Determines all listeners configured for test method.
	 * 
	 * @throws InitializationError
	 *            error while instantiation of the listeners
	 */
	private Map<Class<? extends RunListener>, RunListener> determineListeners() throws InitializationError
	{
		final Map<Class<? extends RunListener>, RunListener> resultingListeners = new LinkedHashMap<Class<? extends RunListener>, RunListener>();

		final RunListener resultListener = this.result.createListener();
		resultingListeners.put(RunListener.class, resultListener);

		Class curClass = getTestClass().getJavaClass();
		while (curClass != null)
		{
			final RunListeners listenerAnno = (RunListeners) curClass.getAnnotation(RunListeners.class);
			if (listenerAnno != null)
			{
				for (final Class<? extends RunListener> listener : listenerAnno.value())
				{
					try
					{
						resultingListeners.put(listener, listener.newInstance());
					}
					catch (final InstantiationException e)
					{
						throw new InitializationError(Collections.singletonList((Throwable) e));
					}
					catch (final IllegalAccessException e)
					{
						throw new InitializationError(Collections.singletonList((Throwable) e));
					}
				}
			}
			curClass = curClass.getSuperclass();
		}
		return resultingListeners;
	}

	/**
	 * Overridden for adding the annotations of the test methods as well as for classes to the description object.
	 * Annotations at methods will be placed before the classes one, the determination will find the method ones first.
	 */
	@Override
	protected Description describeChild(final FrameworkMethod method)
	{
		final Collection<Annotation> annos = new ArrayList<Annotation>();
		annos.addAll(Arrays.asList(method.getAnnotations()));
		annos.addAll(Arrays.asList(getTestClass().getAnnotations()));
		return Description.createTestDescription(getTestClass().getJavaClass(), testName(method),
				annos.toArray(new Annotation[annos.size()]));
	}

}
