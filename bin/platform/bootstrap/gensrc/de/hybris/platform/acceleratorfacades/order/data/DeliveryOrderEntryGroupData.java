/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Dec 13, 2013 6:34:50 PM
 * ----------------------------------------------------------------
 *
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
package de.hybris.platform.acceleratorfacades.order.data;

import de.hybris.platform.acceleratorfacades.order.data.OrderEntryGroupData;
import de.hybris.platform.commercefacades.user.data.AddressData;

public class DeliveryOrderEntryGroupData extends OrderEntryGroupData 
{

	/** <i>Generated property</i> for <code>DeliveryOrderEntryGroupData.deliveryAddress</code> property defined at extension <code>acceleratorfacades</code>. */
	private AddressData deliveryAddress;
		
	public DeliveryOrderEntryGroupData()
	{
		// default constructor
	}
	
		
	public void setDeliveryAddress(final AddressData deliveryAddress)
	{
		this.deliveryAddress = deliveryAddress;
	}
	
		
	public AddressData getDeliveryAddress() 
	{
		return deliveryAddress;
	}
		
	
}