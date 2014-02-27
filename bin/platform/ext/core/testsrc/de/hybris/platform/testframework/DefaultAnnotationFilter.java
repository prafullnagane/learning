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

import de.hybris.bootstrap.annotations.DemoTest;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.bootstrap.annotations.ManualTest;
import de.hybris.bootstrap.annotations.PerformanceTest;
import de.hybris.bootstrap.annotations.UnitTest;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.manipulation.Filter;


/**
 * Filter is a tool which allow to exclude some test from the suite. The reason of creating such tool is to increase
 * developers productivity by selecting which test should be run. The idea is to annotate all long-running tests with
 * proper annotation (e.g. @PerformanceTest) and exclude them from execution during the development. If we remove these
 * monsters from basic unit/integration tests we can try to run all tests before commit (all unit tests). It is very
 * important to bring that possibility to mere developers again, because it is the foundation of test-driven
 * development.
 * 
 * <h3>Configuration</h3> You can configure filter setting these properties:
 * <ul>
 * <li>hybris.junit4.annotations.included - list of comma separated annotations; tests with these annotations will be
 * included in the test
 * <li>hybris.junit4.annotations.excluded - list of comma separated annotations; tests with these annotations will be
 * excluded from the test
 * <li>hybris.junit4.annotations.defaultIncluded - true or false; if true - all tests will be run except those with
 * annotations from excluded list; if false - only tests with annotations from included list will be run (except those
 * with annotations from excluded list); default value is true;
 * </ul>
 * You must remember that excluded list has the priority over other settings. Therefore if at least one annotation of
 * the test is on the excluded list test will be skipped.
 * 
 * <h3>Examples</h3>
 * <p>
 * <b>Run only PerformanceTest and IntegrationTest</b> <br/>
 * hybris.junit4.annotations.included=PerformanceTest,IntegrationTest <br/>
 * hybris.junit4.annotations.excluded= <br/>
 * hybris.junit4.annotations.defaultIncluded=false <br/>
 * 
 * <p>
 * <b>Run all tests without PerformanceTest</b> <br/>
 * hybris.junit4.annotations.included= <br/>
 * hybris.junit4.annotations.excluded=PerformanceTest <br/>
 * hybris.junit4.annotations.defaultIncluded=true <br/>
 * 
 * <p>
 * <b>Run all tests</b> <br/>
 * hybris.junit4.annotations.included= <br/>
 * hybris.junit4.annotations.excluded=<br/>
 * hybris.junit4.annotations.defaultIncluded=true <br/>
 */
public class DefaultAnnotationFilter extends Filter
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(DefaultAnnotationFilter.class);

	/**
	 * All supported annotations.
	 */
	private static Class[] annotations = new Class[]
	{ PerformanceTest.class, DemoTest.class, IntegrationTest.class, ManualTest.class, UnitTest.class };

	private final Collection<Class> included;
	private final Collection<Class> excluded;
	private final boolean defaultIncluded;
	private final Filter existingFilter;

	public DefaultAnnotationFilter(final Filter existingFilter)
	{
		this.existingFilter = existingFilter;
		final String property = System.getProperty("hybris.junit4.annotations.defaultIncluded");
		this.defaultIncluded = (property != null && (property.charAt(0) == '0' || property.toLowerCase().startsWith("false"))) ? false
				: true;
		this.included = parseString(System.getProperty("hybris.junit4.annotations.included"));
		this.excluded = parseString(System.getProperty("hybris.junit4.annotations.excluded"));
	}

	public DefaultAnnotationFilter(final String includedList, final String excludedList, final boolean defaultAllowed)
	{
		this.existingFilter = null;
		this.defaultIncluded = defaultAllowed;
		this.included = parseString(includedList);
		this.excluded = parseString(excludedList);
	}


	/**
	 * 
	 */
	private boolean isDefaultIncluded()
	{
		return this.defaultIncluded;
	}

	/**
	 * 
	 */
	public Collection<Class> getExcludedAnnotations()
	{
		return this.excluded;
	}

	/**
	 * 
	 */
	public Collection<Class> getIncludedAnnotations()
	{
		return this.included;
	}


	private static Collection<Class> parseString(final String listStr)
	{
		final Collection<Class> list = new ArrayList<Class>();
		if (listStr != null)
		{
			final String[] classes = listStr.split(",");
			for (final String classStr : classes)
			{
				for (final Class annotation : annotations)
				{
					if (annotation.getSimpleName().equals(classStr))
					{
						list.add(annotation);
					}
				}
			}
		}
		return list;

	}

	private boolean filter(final Annotation[] annotations, final boolean defaultIncluded)
	{
		for (final Class clazz : getExcludedAnnotations())
		{
			for (final Annotation annotation : annotations)
			{
				if (annotation.annotationType().equals(clazz))
				{
					return false;
				}
			}
		}
		boolean allow = defaultIncluded;
		if (!allow)
		{
			for (final Class clazz : getIncludedAnnotations())
			{
				for (final Annotation annotation : annotations)
				{
					if (annotation.annotationType().equals(clazz))
					{
						allow = true;
						break;
					}
				}

			}
		}
		return allow;

	}

	private boolean filter(final Collection<Annotation> annotations, final boolean defaultIncluded)
	{
		return filter(annotations.toArray(new Annotation[] {}), defaultIncluded);
	}

	@Override
	public boolean shouldRun(final Description description)
	{
		// a) delegate filter already rejects test
		if (existingFilter != null && !existingFilter.shouldRun(description))
		{
			return false;
		}
		// b) description exists -> filter by annotation
		else if (description != null)
		{
			return filter(description.getAnnotations(), isDefaultIncluded());
		}
		// c) default
		else
		{
			return isDefaultIncluded();
		}
	}

	@Override
	public String describe()
	{
		final StringBuilder sb = new StringBuilder();
		sb.append("DefaultAnnotationFilter(included=");
		sb.append(getIncludedAnnotations());
		sb.append(", excluded=");
		sb.append(getExcludedAnnotations());
		sb.append(", defaultIncluded=");
		sb.append(isDefaultIncluded());
		if (existingFilter != null)
		{
			sb.append(", delagateFilter=").append(existingFilter.describe());
		}
		sb.append(")");


		return sb.toString();
	}
}
