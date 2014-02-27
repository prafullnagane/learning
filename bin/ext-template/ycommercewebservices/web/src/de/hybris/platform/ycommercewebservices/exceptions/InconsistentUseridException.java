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
package de.hybris.platform.ycommercewebservices.exceptions;

import de.hybris.platform.ycommercewebservices.controller.CustomersController;


/**
 * Exception for user id inconsistency. See {@link CustomersController}.
 */
public class InconsistentUseridException extends Exception
{

	public InconsistentUseridException()
	{
		super();
	}

	/**
	 * @param arg0
	 */
	public InconsistentUseridException(final String arg0)
	{
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public InconsistentUseridException(final Throwable arg0)
	{
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public InconsistentUseridException(final String arg0, final Throwable arg1)
	{
		super(arg0, arg1);
	}

}
