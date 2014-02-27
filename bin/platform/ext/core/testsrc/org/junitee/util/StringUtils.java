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
package org.junitee.util;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;


/**
 * 
 * @version $Revision: 1.1.1.1 $
 * @since 1.5
 */
public class StringUtils
{

	private static final String[] DEFAULT_TRACE_FILTERS = new String[]
	{ "junit.framework.TestCase", "junit.framework.TestResult", "junit.framework.TestSuite",
			"junit.framework.Assert.", // don't filter AssertionFailure
			"junit.swingui.TestRunner", "junit.awtui.TestRunner", "junit.textui.TestRunner", "java.lang.reflect.Method.invoke(",
			"org.apache.tools.ant." };

	private static final String[] DEFAULT_STOP_FILTERS = new String[]
	{ "junit.framework.TestCase.runTest", "junit.framework.TestSuite.runTest" };

	/**
	 * This method converts texts to be displayed on html-page. Following conversion are done "<" => "&lt;" , ">" =>
	 * "&gt;" and "&" => "&amp;", "\n" => "<br>
	 * "
	 */
	public static String htmlText(final String text)
	{
		final StringBuffer sb = new StringBuffer();
		char c;
		if (text == null)
		{
			return "";
		}
		for (int i = 0; i < text.length(); i++)
		{
			c = text.charAt(i);
			switch (c)
			{
				case '<':
					sb.append("&lt;");
					break;
				case '>':
					sb.append("&gt;");
					break;
				case '&':
					sb.append("&amp;");
					break;
				case '\"':
					sb.append("&quot;");
					break;
				case '\n':
					sb.append("<br>");
					break;
				default:
					sb.append(c);
			}
		}
		return sb.toString();
	}


	/**
	 * This method converts texts to be used in an xml document. Following conversion are done "<" => "&lt;" , ">" =>
	 * "&gt;" and "&" => "&amp;"
	 */
	public static String xmlText(final String text)
	{
		final StringBuffer sb = new StringBuffer();
		char c;
		if (text == null)
		{
			return "";
		}
		for (int i = 0; i < text.length(); i++)
		{
			c = text.charAt(i);
			switch (c)
			{
				case '<':
					sb.append("&lt;");
					break;
				case '>':
					sb.append("&gt;");
					break;
				case '&':
					sb.append("&amp;");
					break;
				case '\"':
					sb.append("&quot;");
					break;
				default:
					sb.append(c);
			}
		}
		return sb.toString();
	}


	/**
	 * Filter the given stack trace.
	 * 
	 * @param stack
	 */
	public static String filterStack(final String stack)
	{
		final StringWriter sw = new StringWriter();
		final PrintWriter pw = new PrintWriter(sw);
		final StringReader sr = new StringReader(stack);
		final BufferedReader br = new BufferedReader(sr);

		String line;
		try
		{
			while ((line = br.readLine()) != null)
			{
				if (stopLine(line))
				{
					pw.println(line);
					break;
				}
				if (!filterLine(line))
				{
					pw.println(line);
				}
			}
		}
		catch (final Exception IOException)
		{
			return stack; // return the stack unfiltered
		}
		return sw.toString();
	}


	private static boolean filterLine(final String line)
	{
		for (int i = 0; i < DEFAULT_TRACE_FILTERS.length; i++)
		{
			if (line.indexOf(DEFAULT_TRACE_FILTERS[i]) > 0)
			{
				return true;
			}
		}
		return false;
	}

	private static boolean stopLine(final String line)
	{
		for (int i = 0; i < DEFAULT_STOP_FILTERS.length; i++)
		{
			if (line.indexOf(DEFAULT_STOP_FILTERS[i]) > 0)
			{
				return true;
			}
		}
		return false;
	}

}
