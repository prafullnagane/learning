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

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.commerceservices.externaltax.CalculateExternalTaxesStrategy;
import de.hybris.platform.commerceservices.externaltax.DecideExternalTaxesStrategy;
import de.hybris.platform.commerceservices.externaltax.RecalculateExternalTaxesStrategy;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.externaltax.ApplyExternalTaxesStrategy;
import de.hybris.platform.externaltax.ExternalTaxDocument;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.i18n.I18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.util.TaxValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;


@IntegrationTest
public class DefaultExternalTaxesServiceIntegrationTest extends ServicelayerTest
{
	@Resource
	private DefaultExternalTaxesService defaultExternalTaxesService;

	@Resource
	private ModelService modelService;

	@Resource
	private CommonI18NService commonI18NService;

	@Before
	public void setUp() throws Exception
	{
		createCoreData();
	}

	@Test
	public void saveOrderShouldSetCalculatedToTrue(){
		CartModel cart = modelService.create(CartModel.class);
		cart.setCode("saveOrderShouldSetCalculatedToTrue");
		cart.setCalculated(Boolean.FALSE);
		cart.setDate(new Date());
		cart.setCurrency(commonI18NService.getCurrency("USD"));

		CustomerModel customer = new CustomerModel();
		customer.setUid("uid");
		cart.setUser(customer);


		modelService.save(cart);
		Assert.assertEquals(Boolean.FALSE, cart.getCalculated());

		defaultExternalTaxesService.saveOrder(cart);
		Assert.assertEquals(Boolean.TRUE, cart.getCalculated());
	}

}
