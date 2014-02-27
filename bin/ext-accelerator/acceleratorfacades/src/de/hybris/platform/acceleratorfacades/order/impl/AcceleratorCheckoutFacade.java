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
package de.hybris.platform.acceleratorfacades.order.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.acceleratorfacades.order.PickupInStoreCheckoutFacade;
import de.hybris.platform.acceleratorservices.enums.UiExperienceLevel;
import de.hybris.platform.acceleratorservices.order.AcceleratorCheckoutService;
import de.hybris.platform.acceleratorservices.uiexperience.UiExperienceService;
import de.hybris.platform.commercefacades.order.data.CartModificationData;
import de.hybris.platform.commercefacades.order.impl.DefaultCheckoutFacade;
import de.hybris.platform.commercefacades.storelocator.data.PointOfServiceData;
import de.hybris.platform.commerceservices.enums.SalesApplication;
import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.storefinder.data.PointOfServiceDistanceData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.order.InvalidCartException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.storelocator.pos.PointOfServiceService;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;


/**
 */
public class AcceleratorCheckoutFacade extends DefaultCheckoutFacade implements PickupInStoreCheckoutFacade
{
	private UiExperienceService uiExperienceService;
	private AcceleratorCheckoutService acceleratorCheckoutService;
	private PointOfServiceService pointOfServiceService;
	private Converter<PointOfServiceDistanceData, PointOfServiceData> pointOfServiceDistanceConverter;
	private Converter<CommerceCartModification, CartModificationData> cartModificationConverter;

	protected UiExperienceService getUiExperienceService()
	{
		return uiExperienceService;
	}

	@Required
	public void setUiExperienceService(final UiExperienceService uiExperienceService)
	{
		this.uiExperienceService = uiExperienceService;
	}

	protected AcceleratorCheckoutService getAcceleratorCheckoutService()
	{
		return acceleratorCheckoutService;
	}

	@Required
	public void setAcceleratorCheckoutService(final AcceleratorCheckoutService acceleratorCheckoutService)
	{
		this.acceleratorCheckoutService = acceleratorCheckoutService;
	}

	protected PointOfServiceService getPointOfServiceService()
	{
		return pointOfServiceService;
	}

	@Required
	public void setPointOfServiceService(final PointOfServiceService pointOfServiceService)
	{
		this.pointOfServiceService = pointOfServiceService;
	}

	protected Converter<PointOfServiceDistanceData, PointOfServiceData> getPointOfServiceDistanceConverter()
	{
		return pointOfServiceDistanceConverter;
	}

	@Required
	public void setPointOfServiceDistanceConverter(
			final Converter<PointOfServiceDistanceData, PointOfServiceData> pointOfServiceDistanceConverter)
	{
		this.pointOfServiceDistanceConverter = pointOfServiceDistanceConverter;
	}

	protected Converter<CommerceCartModification, CartModificationData> getCartModificationConverter()
	{
		return cartModificationConverter;
	}

	@Required
	public void setCartModificationConverter(
			final Converter<CommerceCartModification, CartModificationData> cartModificationConverter)
	{
		this.cartModificationConverter = cartModificationConverter;
	}

	@Override
	protected OrderModel placeOrder(final CartModel cartModel) throws InvalidCartException
	{
		final UiExperienceLevel uiExperienceLevel = getUiExperienceService().getUiExperienceLevel();
		if (uiExperienceLevel != null && UiExperienceLevel.MOBILE.equals(uiExperienceLevel))
		{
			// Set application to WebMobile
			return getCommerceCheckoutService().placeOrder(cartModel, SalesApplication.WEBMOBILE);
		}

		// Default to WEB
		return getCommerceCheckoutService().placeOrder(cartModel, SalesApplication.WEB);
	}

	@Override
	public List<PointOfServiceData> getConsolidatedPickupOptions()
	{
		return Converters.convertAll(getAcceleratorCheckoutService().getConsolidatedPickupOptions(getCart()),
				getPointOfServiceDistanceConverter());
	}

	@Override
	public List<CartModificationData> consolidateCheckoutCart(final String pickupPointOfServiceName)
			throws CommerceCartModificationException
	{
		validateParameterNotNull(pickupPointOfServiceName, "pickupPointOfServiceName cannot be null");

		return Converters.convertAll(
				getAcceleratorCheckoutService().consolidateCheckoutCart(getCart(),
						getPointOfServiceService().getPointOfServiceForName(pickupPointOfServiceName)), getCartModificationConverter());
	}
}
