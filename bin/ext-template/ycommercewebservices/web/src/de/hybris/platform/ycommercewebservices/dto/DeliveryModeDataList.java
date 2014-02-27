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

import de.hybris.platform.commercefacades.order.data.DeliveryModeData;

import java.util.List;


/**
 * DeliveryMode data list wrapper.
 */
public class DeliveryModeDataList
{
	private List<DeliveryModeData> deliveryModes = null;

	public DeliveryModeDataList()
	{
		super();
	}

	public DeliveryModeDataList(final List<DeliveryModeData> deliveryModes)
	{
		super();
		this.deliveryModes = deliveryModes;
	}

	public List<DeliveryModeData> getDeliveryModes()
	{
		return deliveryModes;
	}

	public void setDeliveryModes(final List<DeliveryModeData> deliveryModes)
	{
		this.deliveryModes = deliveryModes;
	}

}
