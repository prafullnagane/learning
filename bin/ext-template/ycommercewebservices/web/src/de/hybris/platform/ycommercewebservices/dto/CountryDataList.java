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

import de.hybris.platform.commercefacades.user.data.CountryData;

import java.util.List;


/**
 * Country data list wrapper.
 */
public class CountryDataList
{
	private List<CountryData> countries = null;

	public CountryDataList()
	{
		super();
	}

	public CountryDataList(final List<CountryData> countries)
	{
		super();
		this.countries = countries;
	}

	public List<CountryData> getCountries()
	{
		return countries;
	}

	public void setCountries(final List<CountryData> countries)
	{
		this.countries = countries;
	}

}
