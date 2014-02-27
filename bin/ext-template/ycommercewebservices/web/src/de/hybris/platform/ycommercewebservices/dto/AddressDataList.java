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

import de.hybris.platform.commercefacades.user.data.AddressData;

import java.util.List;


/**
 * Address data list wrapper.
 */
public class AddressDataList
{
	private List<AddressData> addresses = null;

	public AddressDataList(final List<AddressData> addresses)
	{
		super();
		this.addresses = addresses;
	}

	public List<AddressData> getAddresses()
	{
		return addresses;
	}

	public void setAddresses(final List<AddressData> addresses)
	{
		this.addresses = addresses;
	}

}
