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
package de.hybris.platform.acceleratorfacades.urlencoder;

import de.hybris.platform.acceleratorfacades.urlencoder.data.UrlEncoderData;
import de.hybris.platform.acceleratorfacades.urlencoder.data.UrlEncoderPatternData;

import java.util.List;

/**
 *
 * This facade will be used by UrlEncoderFilter to process the URL for UrlEncoding.
 *
 */
public interface UrlEncoderFacade
{
	/**
	 * Gets the list of attributes and it's values that has to be encoded in the url.
	 * The list of attributes for each site will be configured in {@link de.hybris.platform.cms2.model.site.CMSSiteModel}
	 * and the data objects that holds the attributes and it's values will be set in SessionService attributes.
	 *
	 * @return List of {@link UrlEncoderData} objects that holds the encoding attribute's values.
	 */
	List<UrlEncoderData> variablesForUrlEncoding();

	/**
	 *  Updates the Store/Site based on the change in value of the urlEncodingAttributes.
	 *  Only specific encoding attributes are allowed to change the site.
	 */
	void updateUrlEncodingData();

	/**
	 * Checks if the given urlEncodingAttribute holds a valid value for injection into the URL.
	 *
	 * @param attributeName
	 * @param value
	 * @return boolean
	 */
	boolean isValid(String attributeName, String value);

	/**
	 * Gets the urlEncoding pattern that has to be injected into the URL.
	 * This pattern is calculated based on the input URL and encoding attributes configured for specific site.
	 *
	 *
	 * @param url
	 * @param contextPath
	 * @param newSession
	 * @return urlEncodingPattern
	 */
	UrlEncoderPatternData patternForUrlEncoding(String url, String contextPath, boolean newSession);

	/**
	 * Removes the session attributes from SessionService.
	 */
    void removeSessionAttributeForUrlEncoding();
}
