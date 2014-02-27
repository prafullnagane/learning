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
package de.hybris.platform.acceleratorfacades.urlencoder.attributes;


import java.util.Collection;

/**
 * Interface for UrlEncodingAttributeManagers. The concrete implementation is injected into {@link de.hybris.platform.acceleratorfacades.urlencoder.impl.DefaultUrlEncoderFacade}
 * as a map. The kep of the map should exactly match the name of the urlEncodingAttribute configured in the CMSSiteModel.
 *
 */
public interface UrlEncodingAttributeManager
{
	/**
	 * Get all the possible/available values for a particular attribute.
	 *
	 * @return List of
	 */
	Collection<String> getAllAvailableValues();

	/**
	 * Checks if the given value is present in it's list of available values.
	 *
	 * @param value
	 * @return  boolean value
	 */
	boolean isValid(String value);

	/**
	 * Update the store/site for the given value.
	 *
	 * @param value
	 */
	void updateAndSyncForAttrChange(String value);

	/**
	 * Returns the default value for the attribute
	 *
	 * @return - defaultvalue for the attribute
	 */
	String getDefaultValue();

	/**
	 * Returns the current value for the attribute
	 *
	 * @return - current value
	 */
	String getCurrentValue();

}
