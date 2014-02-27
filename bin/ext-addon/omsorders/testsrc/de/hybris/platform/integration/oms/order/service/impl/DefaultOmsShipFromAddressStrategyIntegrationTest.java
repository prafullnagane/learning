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
 */

package de.hybris.platform.integration.oms.order.service.impl;

import de.hybris.bootstrap.annotations.ManualTest;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.site.BaseSiteService;
import java.util.Collections;
import java.util.List;
import javax.annotation.Resource;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


@ManualTest
public class DefaultOmsShipFromAddressStrategyIntegrationTest extends ServicelayerTest
{
	@Resource
	private DefaultOmsShipFromAddressStrategy defaultOmsShipFromAddressStrategy;

	@Resource
	private FlexibleSearchService flexibleSearchService;

	@Resource
	private BaseSiteService baseSiteService;



	@BeforeClass
	public static void beforeClass() throws Exception
	{
		createCoreData();
		createDefaultCatalog();
		createDefaultUsers();
		importCsv("/ondemandcommon/test/testAcceleratorData.csv", "UTF-8");
		importCsv("/omsorders/test/testOrders.csv", "UTF-8");
	}

	@Before
	public void setUp() throws Exception
	{

		final BaseSiteModel testSite = baseSiteService.getBaseSiteForUID("testSite");
		Assert.assertNotNull("BaseSite 'testSite' was null", testSite);
		Assert.assertFalse("BaseStore does not have stores", testSite.getStores().isEmpty());
		Assert.assertFalse("BaseStore does not have PointOfService", testSite.getStores().get(0).getPointsOfService().isEmpty());
		Assert.assertNotNull("BaseStore does not have an address", testSite.getStores().get(0).getPointsOfService().get(0)
				.getAddress());
		testSite.setChannel(SiteChannel.B2C);
		baseSiteService.setCurrentBaseSite(testSite, false);
	}

	@Test
	public void testGetShipFromAddressForOrder()
	{
		final String orderCode = "testOrderCode";
		final OrderModel orderModel = getOrderForCode(orderCode);
		// update product codes
		orderModel.getEntries().get(0).getProduct().setCode("23210");
		orderModel.getEntries().get(1).getProduct().setCode("23191");

		// if this method does not throw an exception the order should have been created in OMS
		final AddressModel shipFromAddressForOrder = defaultOmsShipFromAddressStrategy.getShipFromAddressForOrder(orderModel);

		Assert.assertNotNull("shipFromAddress should have been found ", shipFromAddressForOrder);
	}

	protected OrderModel getOrderForCode(final String orderCode)
	{
		final DefaultGenericDao defaultGenericDao = new DefaultGenericDao(OrderModel._TYPECODE);
		defaultGenericDao.setFlexibleSearchService(flexibleSearchService);
		final List<OrderModel> orders = defaultGenericDao.find(Collections.singletonMap(OrderModel.CODE, orderCode));
		Assert.assertFalse(orders.isEmpty());
		final OrderModel orderModel = orders.get(0);
		Assert.assertNotNull("Order should have been loaded from database", orderModel);
		return orderModel;
	}
}
