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

import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.jalo.JaloConnectException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.util.HybrisInitFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;


/**
 * Right now this is basically a copy of the WebServicesInitFilter. It is up for discussion if the SiteFilter can and
 * should be integrated into this filter and maybe use a header like X-Site to determine the CMSSite.
 */

public class MetaDataFilter extends HybrisInitFilter
{
	private static final Logger log = Logger.getLogger(MetaDataFilter.class.getName());

	@Override
	public boolean doPreRequest(final HttpServletRequest request, final HttpServletResponse response) throws ServletException
	{
		try
		{
			//first, make a JaloSession available
			final JaloSession session = getJaloSession(request, response, true);
			final String languagesString = request.getHeader("Accept-Language");

			setLanguage(request, session, languagesString);
			notifyExtensions(request, response, true);

			log.debug("Can access i18nService: " + Registry.getApplicationContext().containsBean("i18nService"));

			return true;
		}

		catch (final JaloConnectException e)
		{
			throw new ServletException("error getting session ", e);
		}
	}

	/**
	 * Converts to java currency based on ISO 4217 currency code. If currency is null or not in the ISO 4217 code list,
	 * default currency will be selected.
	 */
	protected void setCurrency(final JaloSession session, String currencyCode)
	{
		log.warn("XXX Set currency in jaloSession or context?: " + currencyCode);

		if (currencyCode == null)
		{
			currencyCode = "";
		}

		Currency currency = null;

		try
		{
			currency = Currency.getInstance(currencyCode);
		}
		catch (final IllegalArgumentException e)
		{
			currency = Currency.getInstance(Locale.getDefault());
			log.warn("Using Currency of default locale: " + currency.getCurrencyCode());
		}

		log.debug("Java Currency " + currency);
	}


	/**
	 * Sets language from "Accept-Language" header as active JaloSession language
	 * 
	 * @param languagesString
	 */
	protected void setLanguage(final HttpServletRequest request, final JaloSession session, final String languagesString)
	{
		if (languagesString != null && !languagesString.isEmpty())
		{
			final List<Lang> languages = getLanguages(languagesString);
			final SessionContext context = session.getSessionContext();
			final List<LanguageModel> activeLanguages = getCommonI18NService(request).getAllLanguages();
			outer: for (final Lang lang : languages)
			{
				for (final LanguageModel language : activeLanguages)
				{
					if (language.getIsocode().equals(lang.getIsoCode()))
					{
						log.debug("language from Accept-Language header: " + lang.getIsoCode());
						context.setLanguage((Language) getModelService(request).getSource(language));
						break outer;
					}
				}
			}
		}
	}

	protected List<Lang> getLanguages(final String languagesString)
	{
		if (languagesString.contains(","))
		{
			return getSortedLanguages(languagesString.split(","));
		}
		else
		{
			final List<Lang> languages = new ArrayList<Lang>();
			languages.add(getLanguage(languagesString));
			return languages;
		}
	}

	protected Lang getLanguage(final String languagesString)
	{
		final String languageString = languagesString.trim();
		if (languageString.contains(";q="))
		{
			final String[] lang = languageString.split(";q=");
			try
			{
				return new Lang(lang[0], Double.parseDouble(lang[1]));
			}
			catch (final NumberFormatException e)
			{
				return new Lang(lang[0]);
			}
		}
		else
		{
			return new Lang(languageString);
		}
	}

	protected List<Lang> getSortedLanguages(final String[] languagesString)
	{
		final List<Lang> languages = new ArrayList<Lang>();
		for (final String languageString : languagesString)
		{
			languages.add(getLanguage(languageString));
		}
		Collections.sort(languages);
		return languages;
	}

	public static class Lang implements Comparable<Lang>
	{
		private final String isoCode;
		private final double weight;

		public Lang(final String isoCode, final double weight)
		{
			this.isoCode = isoCode;
			this.weight = weight;
		}

		public Lang(final String isoCode)
		{
			this.isoCode = isoCode;
			this.weight = 1.0;
		}

		public String getIsoCode()
		{
			return isoCode;
		}

		public double getWeight()
		{
			return weight;
		}

		@Override
		public int compareTo(final Lang o)
		{
			return (int) (o.getWeight() * 10) - (int) (this.weight * 10);
		}
	}

	protected CommonI18NService getCommonI18NService(final HttpServletRequest httpRequest)
	{
		return FilterSpringUtil.getSpringBean(httpRequest, "commonI18NService", CommonI18NService.class);
	}

	protected ModelService getModelService(final HttpServletRequest httpRequest)
	{
		return FilterSpringUtil.getSpringBean(httpRequest, "modelService", ModelService.class);
	}
}
