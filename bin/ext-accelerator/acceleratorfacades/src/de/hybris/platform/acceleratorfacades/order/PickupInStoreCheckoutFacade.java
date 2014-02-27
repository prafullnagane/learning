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
package de.hybris.platform.acceleratorfacades.order;

import de.hybris.platform.commercefacades.order.CheckoutFacade;
import de.hybris.platform.commercefacades.order.data.CartModificationData;
import de.hybris.platform.commercefacades.storelocator.data.PointOfServiceData;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;

import java.util.List;


public interface PickupInStoreCheckoutFacade extends CheckoutFacade
{
	List<PointOfServiceData> getConsolidatedPickupOptions();

	List<CartModificationData> consolidateCheckoutCart(String pickupPointOfServiceName) throws CommerceCartModificationException;
}
