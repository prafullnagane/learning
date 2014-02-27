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

import de.hybris.platform.commerceservices.i18n.CommerceCommonI18NService;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.order.CalculationService;
import de.hybris.platform.order.CartService;
import de.hybris.platform.order.exceptions.CalculationException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;
import de.hybris.platform.ycommercewebservices.constants.YcommercewebservicesConstants;
import de.hybris.platform.ycommercewebservices.exceptions.RecalculationException;
import de.hybris.platform.ycommercewebservices.exceptions.UnsupportedCurrencyException;
import de.hybris.platform.ycommercewebservices.exceptions.UnsupportedLanguageException;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.filter.OncePerRequestFilter;


/**
 * Filter sets session context basing on request parameters:<br>
 * <ul>
 * <li><b>lang</b> - set current {@link LanguageModel}</li>
 * <li><b>curr</b> - set current {@link CurrencyModel}</li>
 * </ul>
 * 
 * @author KKW
 * 
 */
public class SessionAttributesFilter extends OncePerRequestFilter
{

	private final static Logger LOG = Logger.getLogger(SessionAttributesFilter.class);

	@Override
	protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response,
			final FilterChain filterChain) throws ServletException, IOException
	{

		setLanguage(request);

		setCurrency(request);

		filterChain.doFilter(request, response);
	}


	protected void setLanguage(final HttpServletRequest request) throws UnsupportedLanguageException
	{
		final String languageString = request.getParameter(YcommercewebservicesConstants.HTTP_REQUEST_PARAM_LANGUAGE);
		LanguageModel languageToSet = null;

		final CommerceCommonI18NService commerceCommonI18NService = getCommerceCommonI18NService(request);
		final CommonI18NService commonI18NService = getCommonI18NService(request);

		if (!StringUtils.isBlank(languageString))
		{
			try
			{
				languageToSet = commonI18NService.getLanguage(languageString);
			}
			catch (final UnknownIdentifierException e)
			{
				throw new UnsupportedLanguageException("Language  " + languageString + " is not supported");
			}
		}

		if (languageToSet == null)
		{
			languageToSet = commerceCommonI18NService.getDefaultLanguage();
		}

		final BaseStoreModel currentBaseStore = getBaseStoreService(request).getCurrentBaseStore();

		if (currentBaseStore != null)
		{
			final Collection<LanguageModel> storeLanguages = getStoresLanguages(currentBaseStore);

			if (storeLanguages.isEmpty())
			{
				throw new UnsupportedLanguageException("Current base store supports no languages!");
			}

			if (!storeLanguages.contains(languageToSet))
			{
				throw new UnsupportedLanguageException(languageToSet);
			}
		}


		if (languageToSet != null && !languageToSet.equals(commerceCommonI18NService.getCurrentLanguage()))
		{
			commerceCommonI18NService.setCurrentLanguage(languageToSet);

			if (LOG.isDebugEnabled())
			{
				LOG.debug(languageToSet + " set as current language");
			}
		}
	}


	protected Collection<LanguageModel> getStoresLanguages(final BaseStoreModel currentBaseStore)
	{
		if (currentBaseStore == null)
		{
			throw new IllegalStateException("No current base store was set!");
		}
		return currentBaseStore.getLanguages() == null ? Collections.<LanguageModel> emptySet() : currentBaseStore.getLanguages();
	}


	protected void setCurrency(final HttpServletRequest request) throws UnsupportedCurrencyException, RecalculationException
	{
		final String currencyString = request.getParameter(YcommercewebservicesConstants.HTTP_REQUEST_PARAM_CURRENCY);
		CurrencyModel currencyToSet = null;

		final CommerceCommonI18NService commerceCommonI18NService = getCommerceCommonI18NService(request);
		final CommonI18NService commonI18NService = getCommonI18NService(request);

		if (!StringUtils.isBlank(currencyString))
		{
			try
			{
				currencyToSet = commonI18NService.getCurrency(currencyString);
			}
			catch (final UnknownIdentifierException e)
			{
				throw new UnsupportedCurrencyException("Currency " + currencyString + " is not supported");
			}
		}

		if (currencyToSet == null)
		{
			currencyToSet = commerceCommonI18NService.getDefaultCurrency();
		}

		final BaseStoreModel currentBaseStore = getBaseStoreService(request).getCurrentBaseStore();

		if (currentBaseStore != null)
		{
			final List<CurrencyModel> storeCurrencies = commerceCommonI18NService.getAllCurrencies();

			if (storeCurrencies.isEmpty())
			{
				throw new UnsupportedCurrencyException("Current base store supports no currencies!");
			}

			if (!storeCurrencies.contains(currencyToSet))
			{
				throw new UnsupportedCurrencyException(currencyToSet);
			}
		}

		if (currencyToSet != null && !currencyToSet.equals(commerceCommonI18NService.getCurrentCurrency()))
		{
			commerceCommonI18NService.setCurrentCurrency(currencyToSet);
			recalculateCart(request, currencyString);
			if (LOG.isDebugEnabled())
			{
				LOG.debug(currencyToSet + " set as current currency");
			}
		}
	}

	/**
	 * Recalculates cart when currency has changed
	 */
	protected void recalculateCart(final HttpServletRequest request, final String currencyString) throws RecalculationException
	{
		final CartModel cart = getCartService(request).getSessionCart();
		if (cart != null)
		{
			try
			{
				getCalculationService(request).recalculate(cart);
			}
			catch (final CalculationException e)
			{
				throw new RecalculationException(e, currencyString);
			}
		}
	}

	protected CartService getCartService(final HttpServletRequest httpRequest)
	{
		return FilterSpringUtil.getSpringBean(httpRequest, "cartService", CartService.class);
	}

	protected CalculationService getCalculationService(final HttpServletRequest httpRequest)
	{
		return FilterSpringUtil.getSpringBean(httpRequest, "calculationService", CalculationService.class);
	}

	protected CommerceCommonI18NService getCommerceCommonI18NService(final HttpServletRequest httpRequest)
	{
		return FilterSpringUtil.getSpringBean(httpRequest, "commerceCommonI18NService", CommerceCommonI18NService.class);
	}

	protected CommonI18NService getCommonI18NService(final HttpServletRequest httpRequest)
	{
		return FilterSpringUtil.getSpringBean(httpRequest, "commonI18NService", CommonI18NService.class);
	}

	protected BaseStoreService getBaseStoreService(final HttpServletRequest httpRequest)
	{
		return FilterSpringUtil.getSpringBean(httpRequest, "baseStoreService", BaseStoreService.class);
	}
}
