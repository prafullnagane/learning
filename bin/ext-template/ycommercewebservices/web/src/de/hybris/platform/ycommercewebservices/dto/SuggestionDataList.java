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

import de.hybris.platform.commercefacades.product.data.SuggestionData;

import java.util.ArrayList;
import java.util.List;


/**
 * Suggestion data list wrapper.
 * 
 */
public class SuggestionDataList
{
	private final List<SuggestionData> suggestions = new ArrayList<SuggestionData>();

	public List<SuggestionData> getSuggestions()
	{
		return suggestions;
	}

	public void addSuggestions(final SuggestionData suggestion)
	{
		suggestions.add(suggestion);
	}
}
