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



import de.hybris.platform.core.Registry;
import de.hybris.platform.testframework.HybrisJUnit4Test;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;
import org.springframework.context.ApplicationContext;


public class ApplicationContextCheckRunListener extends RunListener
{
	private static final Logger LOG = Logger.getLogger(ApplicationContextCheckRunListener.class);

	private ApplicationContext oldContext;
	private Description classDescription;

	@Override
	public void testRunStarted(final Description description) throws Exception
	{
		if (!HybrisJUnit4Test.intenseChecksActivated())
		{
			return;
		}
		oldContext = Registry.getApplicationContext();
		classDescription = description;
		LOG.info("saved application context for " + description.getClassName());
	}

	@Override
	public void testRunFinished(final Result result) throws Exception
	{
		if (!HybrisJUnit4Test.intenseChecksActivated())
		{
			return;
		}

		final long executionTime = System.currentTimeMillis();

		final ApplicationContext newContext = Registry.getApplicationContext();

		// compare new with old
		for (final String bean : newContext.getBeanDefinitionNames())
		{
			try
			{
				// available in old context?
				if (!oldContext.containsBeanDefinition(bean))
				{
					LOG.error(classDescription.getClassName() + ": There is a new bean called '" + bean + "'");
				}

				// implementation changed?
				if (!oldContext.getBean(bean).getClass().equals(newContext.getBean(bean).getClass()))
				{
					LOG.error(classDescription.getClassName() + ": The implementation of '" + bean + "' has changed from '"
							+ oldContext.getBean(bean).getClass() + "' to '" + newContext.getBean(bean).getClass() + "'!");
				}
			}
			catch (final Exception e)
			{
				// nothing
			}
		}

		// compare old with new
		for (final String bean : oldContext.getBeanDefinitionNames())
		{
			try
			{
				// available in old context?
				if (!newContext.containsBeanDefinition(bean))
				{
					LOG.error(classDescription.getClassName() + ": Bean '" + bean + "' disappeared!");
				}

				// implementation changed?
				if (!oldContext.getBean(bean).getClass().equals(newContext.getBean(bean).getClass()))
				{
					LOG.error(classDescription.getClassName() + ": The implementation of '" + bean + "' has changed from '"
							+ oldContext.getBean(bean).getClass() + "' to '" + newContext.getBean(bean).getClass() + "'!");
				}
			}
			catch (final Exception e)
			{
				// nothing
			}
		}
		LOG.info("finished analyzing application context for " + classDescription.getClassName() + " in "
				+ (System.currentTimeMillis() - executionTime) + "ms!");
	}
}
