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
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.ycommercewebservices.exceptions.InvalidResourceException;

import java.io.IOException;
import java.util.Set;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.filter.OncePerRequestFilter;


/**
 * Request filter that resolves base site uid from restful request mapping, i.e<br>
 * <i>/rest/v1/mysite/cart</i>, or <br>
 * <i>/rest/v1/mysite/customers/current</i><br>
 * would try to set base site with uid=mysite as a current site.<br>
 * 
 * One should define the path which is expected to be before the site resource in the project properties file
 * (<b>commercewebservices.rootcontext</b>).<br>
 * Default and fallback value equals to <i>/rest/v1/</i><br>
 * 
 * The method uses also a comma separated list of url special characters that are used to parse the site id resource.
 * You can reconfigure it in properties file (<b>commercewebservices.url.special.characters</b>). The default and
 * fallback value is equal to <i>"?,/</i>".
 * 
 * Filter will throw {@link ServletException} if it fails to find the site which is in the resource url.<br>
 * However, you can configure exceptions that doesnt require the site mapping in the resource path. You can configure
 * them in a spring bean called 'baseFilterResourceExceptions'.<br>
 * 
 * @author KKW
 * 
 */
public class BaseSiteFilter extends OncePerRequestFilter
{

	private static final Logger LOG = Logger.getLogger(BaseSiteFilter.class);



	@Override
	protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response,
			final FilterChain filterChain) throws ServletException, IOException
	{
		final ContextInformationLoader informationLoader = ContextInformationLoader.getInstance();
		processRequest(request, informationLoader);
		filterChain.doFilter(request, response);
	}

	protected void processRequest(final HttpServletRequest httpRequest, final ContextInformationLoader informationLoader)
			throws InvalidResourceException
	{

		final String requestMapping = getRequestMapping(httpRequest);
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Requested resource : " + requestMapping);
		}

		if (requestMapping == null || isNotBaseSiteResource(requestMapping, httpRequest))
		{
			return;
		}

		final String baseSiteUid = parseBaseSiteId(httpRequest, requestMapping);

		final BaseSiteModel requestedBaseSite = informationLoader.getBaseSiteForId(httpRequest, baseSiteUid);

		if (requestedBaseSite != null)
		{
			final BaseSiteModel currentBaseSite = informationLoader.getCurrentBaseSite(httpRequest);

			if (!requestedBaseSite.equals(currentBaseSite))
			{
				informationLoader.setCurrentBaseSite(httpRequest, requestedBaseSite);
			}
		}
		else
		{
			throw new InvalidResourceException(baseSiteUid);
		}
	}


	protected boolean isNotBaseSiteResource(final String requestMapping, final HttpServletRequest httpRequest)
	{
		final Set<String> mappingExceptions = getBaseFilterResourceExceptions(httpRequest);
		for (final String exception : mappingExceptions)
		{
			if (requestMapping.startsWith(exception))
			{
				return true;
			}
		}
		return false;
	}

	protected String parseBaseSiteId(final HttpServletRequest httpRequest, final String requestMapping)
	{
		String result = requestMapping;

		final String[] specialCharacters = getSpecialUrlCharacters(httpRequest);
		for (final String specialCharacter : specialCharacters)
		{
			final int specialCharacterIndex = result.indexOf(specialCharacter);
			if (specialCharacterIndex != -1)
			{
				result = result.substring(0, specialCharacterIndex);
			}
		}

		if (LOG.isDebugEnabled())
		{
			LOG.debug("Parsed base site uid: " + result);
		}
		return result;
	}


	protected String[] getSpecialUrlCharacters(final HttpServletRequest httpRequest)
	{
		final String configurationString = getConfigurationService(httpRequest).getConfiguration().getString(
				"commercewebservices.url.special.characters", "?,/");
		return configurationString.split(",");
	}

	protected String getRequestMapping(final HttpServletRequest httpRequest)
	{
		final String queryString = httpRequest.getRequestURL().toString();
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Processing request : " + queryString);
		}
		final String rootContext = getRootContext(httpRequest);
		final int rootContextIndex = queryString.indexOf(rootContext);
		if (rootContextIndex == -1)
		{
			return null;
		}
		String result = queryString.substring(rootContextIndex);
		result = result.replaceAll(rootContext, "");
		return result;
	}

	protected String getRootContext(final HttpServletRequest httpRequest)
	{
		return getConfigurationService(httpRequest).getConfiguration().getString("commercewebservices.rootcontext", "/rest/v1/");
	}

	protected ConfigurationService getConfigurationService(final HttpServletRequest httpRequest)
	{
		return FilterSpringUtil.getSpringBean(httpRequest, "configurationService", ConfigurationService.class);
	}

	protected Set<String> getBaseFilterResourceExceptions(final HttpServletRequest httpRequest)
	{
		return FilterSpringUtil.getSpringBean(httpRequest, "baseFilterResourceExceptions", Set.class);
	}
}
