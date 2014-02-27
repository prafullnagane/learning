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
package de.hybris.platform.ycommercewebservices.validator;

import org.springframework.validation.Errors;


public class JapaneseAddressValidator extends AbstractAddressValidator
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public void validate(final Object target, final Errors errors)
	{
		rejectIfEmptyOrTooLong(errors, FIRSTNAME, FIRSTNAME_ERROR_MSG, MAX_FIELD_LENGTH);
		rejectIfEmptyOrTooLong(errors, LASTNAME, LASTNAME_ERROR_MSG, MAX_FIELD_LENGTH);
		rejectIfEmptyOrTooLong(errors, LINE1, LINE1_ERROR_MSG, MAX_FIELD_LENGTH);
		rejectIfEmptyOrTooLong(errors, LINE2, LINE2_ERROR_MSG, MAX_FIELD_LENGTH);
		rejectIfEmptyOrTooLong(errors, TOWN, TOWN_ERROR_MSG, MAX_FIELD_LENGTH);
		rejectIfEmptyOrTooLong(errors, REGION, REGION_ERROR_MSG, MAX_FIELD_LENGTH);
		rejectIfEmptyOrTooLong(errors, POSTALCODE, POSTALCODE_ERROR_MSG, MAX_POSTCODE_LENGTH);
	}

}
