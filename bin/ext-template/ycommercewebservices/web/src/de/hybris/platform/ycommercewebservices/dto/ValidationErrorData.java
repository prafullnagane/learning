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
package de.hybris.platform.ycommercewebservices.dto;

import java.util.Collection;


/**
 * @author krzysztof.kwiatosz
 * 
 */
public class ValidationErrorData extends ErrorData
{
	private Collection<String> validationErrors;


	/**
	 * @param validationErrors
	 *           the validationErrors to set
	 */
	public void setValidationErrors(final Collection<String> validationErrors)
	{
		this.validationErrors = validationErrors;
	}


	/**
	 * @return the validationErrors
	 */
	public Collection<String> getValidationErrors()
	{
		return validationErrors;
	}
}
