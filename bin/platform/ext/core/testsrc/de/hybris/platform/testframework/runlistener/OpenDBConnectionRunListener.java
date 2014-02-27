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

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;


/**
 *
 */
public class OpenDBConnectionRunListener extends RunListener
{
	private static final Logger LOG = Logger.getLogger(OpenDBConnectionRunListener.class.getName());

	@Override
	public void testFinished(final Description description) throws Exception
	{
		LOG.info("Currently still open DB connection: " + Registry.getCurrentTenant().getDataSource().getNumInUse());
	}
}
