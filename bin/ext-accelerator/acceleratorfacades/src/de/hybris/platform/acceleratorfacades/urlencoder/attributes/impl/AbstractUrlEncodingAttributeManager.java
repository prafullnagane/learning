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
package de.hybris.platform.acceleratorfacades.urlencoder.attributes.impl;


import de.hybris.platform.acceleratorfacades.urlencoder.attributes.UrlEncodingAttributeManager;
import de.hybris.platform.cms2.servicelayer.services.CMSSiteService;
import de.hybris.platform.commercefacades.storesession.StoreSessionFacade;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.servicelayer.session.SessionService;
import org.springframework.beans.factory.annotation.Required;

/**
 * Abstract implementation of {@link  UrlEncodingAttributeManager}.
 */
public abstract class AbstractUrlEncodingAttributeManager implements UrlEncodingAttributeManager
{
	private StoreSessionFacade storeSessionFacade;
	private SessionService sessionService;
	private CMSSiteService cmsSiteService;
	private UserFacade userFacade;

	@Override
	public boolean isValid(final String value)
	{
		return getAllAvailableValues().contains(value);
	}

	protected StoreSessionFacade getStoreSessionFacade()
	{
		return storeSessionFacade;
	}

	@Required
	public void setStoreSessionFacade(final StoreSessionFacade storeSessionFacade)
	{
		this.storeSessionFacade = storeSessionFacade;
	}

	protected SessionService getSessionService()
	{
		return sessionService;
	}

	@Required
	public void setSessionService(final SessionService sessionService)
	{
		this.sessionService = sessionService;
	}

	protected CMSSiteService getCmsSiteService()
	{
		return cmsSiteService;
	}

	@Required
	public void setCmsSiteService(final CMSSiteService cmsSiteService)
	{
		this.cmsSiteService = cmsSiteService;
	}

	protected UserFacade getUserFacade()
	{
		return userFacade;
	}

	@Required
	public void setUserFacade(final UserFacade userFacade)
	{
		this.userFacade = userFacade;
	}

}
