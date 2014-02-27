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
package de.hybris.platform.ycommercewebservices.oauth2;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.user.UserService;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;


/**
 * Checks if the authenticated principal exists and set's it as a current user.<br>
 * If the authentication principal is not defined in hybris, the filter checks if the client authority isn't granted,
 * which might be the case during client credential flow.
 * 
 * @author hansa
 * 
 */
public class HybrisOauth2UserFilter implements Filter
{
	private static final Logger LOG = Logger.getLogger(HybrisOauth2UserFilter.class);

	@Resource(name = "userService")
	private UserService userService;


	@Override
	public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
			throws IOException, ServletException
	{
		final Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		try
		{
			final UserModel userModel = userService.getUserForUID((String) auth.getPrincipal());
			userService.setCurrentUser(userModel);
			chain.doFilter(request, response);
		}
		catch (final UnknownIdentifierException e)
		{
			boolean isClient = false;
			for (final GrantedAuthority grantedAuthority : auth.getAuthorities())
			{
				if (grantedAuthority.getAuthority().equals("ROLE_CLIENT"))
				{
					if (LOG.isDebugEnabled())
					{
						LOG.debug("Request by ROLE_CLIENT, client_id = " + auth.getPrincipal());
					}
					isClient = true;
				}
			}

			if (isClient)
			{
				chain.doFilter(request, response);
			}
			else
			{
				LOG.error("Unable to find authenticated user " + auth.getPrincipal()
						+ " in userService. If this is a client_id, it is OK!");
			}
		}

	}

	@Override
	public void destroy()
	{
		// YTODO Auto-generated method stub
	}

	@Override
	public void init(final FilterConfig arg0) throws ServletException
	{
		// YTODO Auto-generated method stub

	}

}
