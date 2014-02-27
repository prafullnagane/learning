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

import de.hybris.platform.commercefacades.storesession.data.LanguageData;

import java.util.Collection;


/**
 * Language data list wrapper.
 */
public class LanguageDataList
{
	private Collection<LanguageData> languages = null;


	public LanguageDataList()
	{
		super();
	}

	public LanguageDataList(final Collection<LanguageData> languages)
	{
		super();
		this.languages = languages;
	}

	public Collection<LanguageData> getLanguages()
	{
		return languages;
	}

	public void setReviews(final Collection<LanguageData> languages)
	{
		this.languages = languages;
	}

}
