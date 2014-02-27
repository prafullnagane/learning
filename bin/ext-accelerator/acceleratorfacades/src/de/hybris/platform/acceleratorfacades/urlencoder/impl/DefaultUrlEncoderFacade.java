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
package de.hybris.platform.acceleratorfacades.urlencoder.impl;

import de.hybris.platform.acceleratorfacades.urlencoder.UrlEncoderFacade;
import de.hybris.platform.acceleratorfacades.urlencoder.attributes.UrlEncodingAttributeManager;
import de.hybris.platform.acceleratorfacades.urlencoder.data.UrlEncoderData;
import de.hybris.platform.acceleratorfacades.urlencoder.data.UrlEncoderPatternData;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.cms2.servicelayer.services.CMSSiteService;
import de.hybris.platform.servicelayer.session.SessionService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;


/**
 * Facade implementation for UrlEncoding attributes
 */
public class DefaultUrlEncoderFacade implements UrlEncoderFacade
{
	private static final Logger LOG = Logger.getLogger(DefaultUrlEncoderFacade.class.getName());
	private CMSSiteService cmsSiteService;
	private SessionService sessionService;
	private Map<String, UrlEncodingAttributeManager> urlEncodingAttributeManagerMap;

	@Override
	public List<UrlEncoderData> variablesForUrlEncoding()
	{
		if (getSessionService().getAttribute("urlEncodingData") == null)
		{
			final CMSSiteModel cmsSiteModel = getCmsSiteService().getCurrentSite();
			final Collection<String> urlEncodingAttributes = cmsSiteModel.getUrlEncodingAttributes();
			final List<UrlEncoderData> urlEncoderDataList = new ArrayList<UrlEncoderData>();

			for (final String attribute : urlEncodingAttributes)
			{
				final UrlEncodingAttributeManager attributeManager = urlEncodingAttributeManagerMap.get(attribute);
				if (attributeManager != null)
				{
					final UrlEncoderData urlEncoderData = new UrlEncoderData();
					urlEncoderData.setAttributeName(attribute);
					urlEncoderData.setCurrentValue(attributeManager.getCurrentValue());
					urlEncoderData.setDefaultValue(attributeManager.getDefaultValue());
					urlEncoderDataList.add(urlEncoderData);
				}
			}
			getSessionService().setAttribute("urlEncodingData", urlEncoderDataList);
		}

		return getSessionService().getAttribute("urlEncodingData");
	}

	@Override
	public void updateUrlEncodingData()
	{
		for (final UrlEncoderData urlEncoderData : variablesForUrlEncoding())
		{
			final UrlEncodingAttributeManager attributeManager = urlEncodingAttributeManagerMap.get(urlEncoderData
					.getAttributeName());
			if (attributeManager != null)
			{
				attributeManager.updateAndSyncForAttrChange(urlEncoderData.getCurrentValue());
			}
		}
	}

	@Override
	public boolean isValid(final String attributeName, final String value)
	{
		final UrlEncodingAttributeManager attributeManager = urlEncodingAttributeManagerMap.get(attributeName);
		if (attributeManager != null)
		{
			return attributeManager.isValid(value);
		}
		return false;
	}

	@Override
	public UrlEncoderPatternData patternForUrlEncoding(final String url, final String contextPath, final boolean newSession)
	{
		final List<UrlEncoderData> urlEncodingAttributes = variablesForUrlEncoding();
		final UrlEncoderPatternData patternData = new UrlEncoderPatternData();
		int indexOfContextPath = -1;
		String[] splitUrl = StringUtils.split(url, "/");
		for (int i = 0; i < splitUrl.length; i++)
		{
			if (splitUrl[i].equals(StringUtils.remove(contextPath, "/")))
			{
				indexOfContextPath = i;
				int innerCounter = indexOfContextPath + 1;
				for (final UrlEncoderData urlEncoderData : urlEncodingAttributes)
				{
					boolean applicationDriven = false;
					if ((innerCounter) < splitUrl.length)
					{
						String tempValue = splitUrl[innerCounter];
						if (!isValid(urlEncoderData.getAttributeName(), tempValue))
						{
							tempValue = urlEncoderData.getDefaultValue();
							if (LOG.isDebugEnabled())
							{
								LOG.debug("Encoding attributes are absent. Injecting default value :  [" + tempValue + "]");
							}
						}
						final UrlEncodingAttributeManager attributeManager = urlEncodingAttributeManagerMap.get(urlEncoderData
								.getAttributeName());
						//Check if its driven by user and if so redirect
						if(!newSession && !StringUtils.equalsIgnoreCase(urlEncoderData.getCurrentValue(),attributeManager.getCurrentValue()))
						{
							urlEncoderData.setCurrentValue(attributeManager.getCurrentValue());
							patternData.setRedirectRequired(true);
							applicationDriven = true;
						}
						else if (!StringUtils.equalsIgnoreCase(tempValue, urlEncoderData.getCurrentValue()))
						{
							splitUrl = (String[]) ArrayUtils.remove(splitUrl, innerCounter);
							innerCounter--;
							if (LOG.isDebugEnabled())
							{
								LOG.debug(" The " + urlEncoderData.getAttributeName() + " has changed. Injecting the new value :  ["
										+ tempValue + "]");
							}
						}
						if(!applicationDriven)
						{
							urlEncoderData.setCurrentValue(tempValue);
						}
						innerCounter++;
					}
					else
					{
						break;
					}
				}
			}
		}
		patternData.setPattern(extractEncodingPattern(urlEncodingAttributes));

		return patternData;
	}

	protected String extractEncodingPattern(final List<UrlEncoderData> urlEncodingAttributes)
	{
		String pattern = null;
		for (final UrlEncoderData urlEncoderData : urlEncodingAttributes)
		{
			pattern = StringUtils.isBlank(pattern) ? urlEncoderData.getCurrentValue() : pattern + "/"
					+ urlEncoderData.getCurrentValue();
		}
		if (LOG.isDebugEnabled())
		{
			LOG.debug(" Encoding pattern after processing :  [" + pattern + "]");
		}
		return pattern;
	}


	@Override
	public void removeSessionAttributeForUrlEncoding()
	{
		getSessionService().removeAttribute("urlEncodingData");
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

	protected SessionService getSessionService()
	{
		return sessionService;
	}

	@Required
	public void setSessionService(final SessionService sessionService)
	{
		this.sessionService = sessionService;
	}

	protected Map<String, UrlEncodingAttributeManager> getUrlEncodingAttributeManagerMap()
	{
		return urlEncodingAttributeManagerMap;
	}

	@Required
	public void setUrlEncodingAttributeManagerMap(final Map<String, UrlEncodingAttributeManager> urlEncodingAttributeManagerMap)
	{
		this.urlEncodingAttributeManagerMap = urlEncodingAttributeManagerMap;
	}
}
