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
package de.hybris.platform.commerceservices.externaltax.impl;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Collections;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@UnitTest
public class DefaultRecalculateExternaTaxesStrategyTest
{
	private DefaultRecalculateExternalTaxesStrategy recalculateExternalTaxesStrategy;

	private CartModel cart;
	private ModelService modelService;

	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
		cart = new CartModel();
		final AddressModel address = mock(AddressModel.class);
		given(address.getStreetname()).willReturn("Test Street");
		final DeliveryModeModel deliveryMode = mock(DeliveryModeModel.class);
		final List<AbstractOrderEntryModel> entries = Collections.emptyList();
		cart.setEntries(entries);
		cart.setDeliveryAddress(address);
		cart.setDeliveryMode(deliveryMode);
		modelService = Mockito.mock(ModelService.class);
		given(modelService.getModelType(cart)).willReturn("Cart");
		recalculateExternalTaxesStrategy = new DefaultRecalculateExternalTaxesStrategy();
		recalculateExternalTaxesStrategy.setModelService(modelService);
	}

	@Test
	public void testShouldNotRecalculate()
	{
		recalculateExternalTaxesStrategy.recalculate(cart);
		Assert.assertEquals(false, recalculateExternalTaxesStrategy.recalculate(cart));
	}

	@Test
	public void testShouldRecalculateEmptyHash()
	{
		Assert.assertEquals(true, recalculateExternalTaxesStrategy.recalculate(cart));
	}

	@Test
	public void testShouldRecalculateAttributeChanged()
	{
		recalculateExternalTaxesStrategy.recalculate(cart);
		final AddressModel newAddress = mock(AddressModel.class);
		given(newAddress.getLine1()).willReturn("Test Street 1");
		cart.setDeliveryAddress(newAddress);
		Assert.assertEquals(true, recalculateExternalTaxesStrategy.recalculate(cart));
	}
}
