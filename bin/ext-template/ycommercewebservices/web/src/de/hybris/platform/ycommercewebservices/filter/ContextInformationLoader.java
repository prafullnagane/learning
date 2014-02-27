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
package de.hybris.platform.ycommercewebservices.filter;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.basecommerce.strategies.ActivateBaseSiteInSessionStrategy;
import de.hybris.platform.site.BaseSiteService;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;


/**
 * Default context information loader
 */
public class ContextInformationLoader
{
	private static final Logger LOG = Logger.getLogger(ContextInformationLoader.class);
	private static final Object lock = new Object();

	private static ContextInformationLoader instance = null;

	public static ContextInformationLoader getInstance()
	{
		synchronized (lock)
		{
			if (instance == null)
			{
				instance = new ContextInformationLoader();
			}
		}
		return instance;
	}

	public BaseSiteModel getCurrentBaseSite(final HttpServletRequest httpRequest)
	{

		return getBaseSiteService(httpRequest).getCurrentBaseSite();
	}

	public BaseSiteModel getBaseSiteForId(final HttpServletRequest httpRequest, final String id)
	{

		return getBaseSiteService(httpRequest).getBaseSiteForUID(id);
	}


	public void setCurrentBaseSite(final HttpServletRequest httpRequest, final BaseSiteModel baseSiteModel)
	{
		if (baseSiteModel != null)
		{
			LOG.debug("setCurrentSite : " + baseSiteModel);
			try
			{
				final BaseSiteService baseSiteService = getBaseSiteService(httpRequest);
				baseSiteService.setCurrentBaseSite(baseSiteModel, false);
				getActivateBaseSiteInSessionStrategy(httpRequest).activate(baseSiteModel);
				LOG.debug("Base site " + baseSiteModel + " activated.");
			}
			catch (final Exception e)
			{
				LOG.error("Could not set current base site to " + baseSiteModel, e);
			}
		}
	}


	protected BaseSiteService getBaseSiteService(final HttpServletRequest httpRequest)
	{
		return FilterSpringUtil.getSpringBean(httpRequest, "baseSiteService", BaseSiteService.class);
	}


	protected ActivateBaseSiteInSessionStrategy<BaseSiteModel> getActivateBaseSiteInSessionStrategy(
			final HttpServletRequest httpRequest)
	{
		return FilterSpringUtil.getSpringBean(httpRequest, "baseCommerceActivateBaseSiteInSessionStrategy",
				ActivateBaseSiteInSessionStrategy.class);
	}

}
