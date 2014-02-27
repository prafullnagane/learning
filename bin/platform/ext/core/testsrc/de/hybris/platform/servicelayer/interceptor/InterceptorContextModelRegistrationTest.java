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
package de.hybris.platform.servicelayer.interceptor;

import static org.junit.Assert.assertFalse;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.interceptor.impl.DefaultInterceptorRegistry;
import de.hybris.platform.servicelayer.interceptor.impl.InterceptorMapping;
import de.hybris.platform.servicelayer.internal.model.impl.DefaultModelService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Tests <b>PLA-10368</b>.<br>
 * Test uses test implementation of {@link ModelService} :
 * <code>de.hybris.platform.servicelayer.interceptor.InterceptorTestModelService</code>.<br>
 * This <i>test service</i> knows only a simple {@link InterceptorRegistry}, which is registered only for the purpose of
 * this test. It maps only one test <code>PrepareInterceptor<code>s for the types under test.
 */
@IntegrationTest
public class InterceptorContextModelRegistrationTest extends ServicelayerBaseTest
{
	@Resource
	private CommonI18NService commonI18NService;

	@Resource
	private ModelService modelService;

	InterceptorMapping orderInterceptor, addressInterceptor;

	@Resource
	private UserService userService;

	@Before
	public void registerInterceptors() throws Exception
	{
		final DefaultInterceptorRegistry registry = (DefaultInterceptorRegistry) ((DefaultModelService) modelService)
				.getInterceptorRegistry();

		registry.registerInterceptor(orderInterceptor = createInterceptorMapping(new TestOrderPrepareInterceptor(), "Order"));
		registry.registerInterceptor(addressInterceptor = createInterceptorMapping(new TestAddressPrepareInterceptor(), "Address"));
	}

	@After
	public void unregisterInterceptors() throws Exception
	{
		final DefaultInterceptorRegistry registry = (DefaultInterceptorRegistry) ((DefaultModelService) modelService)
				.getInterceptorRegistry();

		if (orderInterceptor != null)
		{
			registry.unregisterInterceptor(orderInterceptor);
		}
		if (addressInterceptor != null)
		{
			registry.unregisterInterceptor(addressInterceptor);
		}
	}

	private static InterceptorMapping createInterceptorMapping(final Interceptor interceptor, final String typeCode)
	{
		final InterceptorMapping mapping = new InterceptorMapping();
		mapping.setTypeCode(typeCode);
		mapping.setInterceptor(interceptor);
		return mapping;
	}

	private static class TestOrderPrepareInterceptor implements PrepareInterceptor
	{
		@Override
		public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
		{
			if (model instanceof OrderModel)
			{
				final OrderModel order = (OrderModel) model;
				final AddressModel newAddress = ctx.getModelService().create(AddressModel.class);
				newAddress.setOwner(order);
				newAddress.setStreetname("new");
				newAddress.setFirstname("New");
				order.setPaymentAddress(newAddress);
				ctx.registerElement(newAddress, null);
			}
		}
	}

	private static class TestAddressPrepareInterceptor implements PrepareInterceptor
	{
		@Override
		public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
		{
			if (model instanceof AddressModel)
			{
				final AddressModel address = (AddressModel) model;
				final CountryModel country = ctx.getModelService().create(CountryModel.class);
				country.setActive(Boolean.FALSE);
				country.setIsocode("PL");
				country.setName("Poland");
				address.setCountry(country);
				ctx.registerElement(country, null);
			}
		}
	}

	/**
	 * In the test scenario an order is created.<br>
	 * Test interceptors mapping creates a new paymentAddress per each new model creation.<br>
	 * Moreover, each new address triggers new Country creation via prepare interceptor.<br>
	 * The test checks if every new model registered in the interceptor context is really persisted.
	 */
	@Test
	public void testPersistModelsRegisteredInPrepareInterceptor()
	{
		final OrderModel order = modelService.create(OrderModel.class);
		order.setCode("123");
		order.setDate(new Date());
		order.setNet(Boolean.FALSE);
		order.setCurrency(commonI18NService.getBaseCurrency());
		order.setUser(userService.getCurrentUser());
		modelService.saveAll();
		Assert.assertNotNull("Order should have payment address prepared", order.getPaymentAddress());
		assertFalse("Order's payment address should not be unsaved", modelService.isNew(order.getPaymentAddress()));

		Assert.assertNotNull("Order payment address should have country prepared", order.getPaymentAddress().getCountry());
		assertFalse("Payment address' country should not be unsaved", modelService.isNew(order.getPaymentAddress().getCountry()));
	}

}
