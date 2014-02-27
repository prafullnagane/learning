/**
 * 
 */
package de.hybris.platform.ycommercewebservices.validator;

import de.hybris.platform.commercefacades.user.data.AddressData;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.Assert;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


/**
 * Implementation of {@link org.springframework.validation.Validator} that validate instances of {@link AddressData}.
 */
public abstract class AbstractAddressValidator implements Validator
{
	public static final String TITLE = "titleCode";
	public static final String FIRSTNAME = "firstName";
	public static final String LASTNAME = "lastName";
	public static final String LINE1 = "line1";
	public static final String LINE2 = "line2";
	public static final String POSTALCODE = "postalCode";
	public static final String TOWN = "town";
	public static final String REGION = "region.isocode";
	public static final String COUNTRY_ISO = "country.isocode";

	public static final String TITLE_ERROR_MSG = "address.title.invalid";
	public static final String FIRSTNAME_ERROR_MSG = "address.firstName.invalid";
	public static final String LASTNAME_ERROR_MSG = "address.lastName.invalid";
	public static final String LINE1_ERROR_MSG = "address.line1.invalid";
	public static final String LINE2_ERROR_MSG = "address.line2.invalid";
	public static final String TOWN_ERROR_MSG = "address.townCity.invalid";
	public static final String POSTALCODE_ERROR_MSG = "address.postalcode.invalid";
	public static final String REGION_ERROR_MSG = "address.region.invalid";
	public static final String COUNTRY_ISO_ERROR_MSG = "address.country.invalid";

	public static final int MAX_FIELD_LENGTH = 255;
	public static final int MAX_POSTCODE_LENGTH = 10;
	public static final int MAX_ISOCODE_LENGTH = 2;

	@Override
	public boolean supports(final Class<?> clazz)
	{
		return AddressValidator.class.equals(clazz);

	}

	public static void rejectIfEmptyOrTooLong(final Errors errors, final String field, final String errorCode, final int maxLenght)
	{

		Assert.notNull(errors, "Errors object must not be null");
		final Object value = errors.getFieldValue(field);
		if (value == null || StringUtils.length(value.toString()) > maxLenght)
		{
			errors.rejectValue(field, errorCode);
		}
	}

}
