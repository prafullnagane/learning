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

import de.hybris.platform.commercefacades.user.data.AddressData;

import java.util.Map;

import org.springframework.validation.Errors;


/**
 * Implementation of {@link org.springframework.validation.Validator} that validate instances of {@link AddressData}.
 * 
 * The {@code AddressValidator} does not validate all fields itself, but delegates to other Validators
 * {@link #customAddressValidators}. {@code AddressValidator} uses the country.isocode field to select a suitable
 * validator for a specific country. If a matching validator cannot be found, {@link #defaultAddressValidator} is used.
 * 
 */
public class AddressValidator extends AbstractAddressValidator
{

	private AbstractAddressValidator defaultAddressValidator;
	private Map<String, AbstractAddressValidator> customAddressValidators;


	public AddressValidator(final AbstractAddressValidator defaultAddressValidator)
	{
		this.defaultAddressValidator = defaultAddressValidator;
	}

	@Override
	public void validate(final Object target, final Errors errors)
	{
		final AddressData addressData = (AddressData) target;

		rejectIfEmptyOrTooLong(errors, COUNTRY_ISO, COUNTRY_ISO_ERROR_MSG, MAX_ISOCODE_LENGTH);
		if (errors.hasErrors())
		{
			throw new CustomValidationException("Address validation error", errors);
		}

		AbstractAddressValidator addressValidator = customAddressValidators.get(addressData.getCountry().getIsocode());

		if (null == addressValidator)
		{
			addressValidator = defaultAddressValidator;
		}
		addressValidator.validate(target, errors);
	}

	public AbstractAddressValidator getDefaultAddressValidator()
	{
		return defaultAddressValidator;
	}

	public void setDefaultAddressValidator(final AddressValidator defaultAddressValidator)
	{
		this.defaultAddressValidator = defaultAddressValidator;
	}

	public Map<String, AbstractAddressValidator> getCustomAddressValidators()
	{
		return customAddressValidators;
	}

	public void setCustomAddressValidators(final Map<String, AbstractAddressValidator> customAddressValidators)
	{
		this.customAddressValidators = customAddressValidators;
	}



}
