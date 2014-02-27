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
package de.hybris.platform.cockpit.zk.mock;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;


/**
 * @author Jacek
 */
public class DummyServletContext implements ServletContext
{
	Map<String, Object> map = new HashMap<String, Object>();

	@Override
	public Object getAttribute(final String name)
	{
		return map.get(name);
	}

	@Override
	public Enumeration getAttributeNames()
	{
		return null;
	}

	@Override
	public ServletContext getContext(final String uripath)
	{
		return null;
	}

	public String getContextPath()
	{
		return null;
	}

	@Override
	public String getInitParameter(final String name)
	{
		return null;
	}

	@Override
	public Enumeration getInitParameterNames()
	{
		return null;
	}

	@Override
	public int getMajorVersion()
	{
		return 0;
	}

	@Override
	public String getMimeType(final String file)
	{
		return null;
	}

	@Override
	public int getMinorVersion()
	{
		return 0;
	}

	@Override
	public RequestDispatcher getNamedDispatcher(final String name)
	{
		return null;
	}

	@Override
	public String getRealPath(final String path)
	{
		return null;
	}

	@Override
	public RequestDispatcher getRequestDispatcher(final String path)
	{
		return null;
	}

	@Override
	public URL getResource(final String path) throws MalformedURLException
	{
		return null;
	}

	@Override
	public InputStream getResourceAsStream(final String path)
	{
		return null;
	}

	@Override
	public Set getResourcePaths(final String path)
	{
		return null;
	}

	@Override
	public String getServerInfo()
	{
		return null;
	}

	@Override
	public Servlet getServlet(final String name) throws ServletException
	{
		return null;
	}

	@Override
	public String getServletContextName()
	{
		return null;
	}

	@Override
	public Enumeration getServletNames()
	{
		return null;
	}

	@Override
	public Enumeration getServlets()
	{
		return null;
	}

	@Override
	public void log(final String msg)
	{//
	}

	@Override
	public void log(final Exception exception, final String msg)
	{//
	}

	@Override
	public void log(final String message, final Throwable throwable)
	{//
	}

	@Override
	public void removeAttribute(final String name)
	{//
	}

	@Override
	public void setAttribute(final String name, final Object object)
	{
		map.put(name, object);
	}

}
