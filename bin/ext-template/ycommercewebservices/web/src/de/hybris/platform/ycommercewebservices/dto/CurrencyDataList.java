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

import de.hybris.platform.commercefacades.storesession.data.CurrencyData;

import java.util.Collection;


/**
 * Currency data list wrapper.
 */
public class CurrencyDataList
{
	private Collection<CurrencyData> currencies = null;

	public CurrencyDataList()
	{
		super();
	}

	public CurrencyDataList(final Collection<CurrencyData> currencies)
	{
		super();
		this.currencies = currencies;
	}

	public Collection<CurrencyData> getCurrencies()
	{
		return currencies;
	}

	public void setCurrencies(final Collection<CurrencyData> currencies)
	{
		this.currencies = currencies;
	}

}
