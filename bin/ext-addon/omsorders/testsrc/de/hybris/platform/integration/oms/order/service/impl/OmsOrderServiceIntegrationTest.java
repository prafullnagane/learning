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


import com.hybris.oms.api.order.OrderFacade;
import de.hybris.bootstrap.annotations.ManualTest;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.payment.model.PaymentTransactionModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.model.ModelService;
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
public class OmsOrderServiceIntegrationTest extends ServicelayerTransactionalTest
{
	@Resource
	private DefaultOmsOrderService omsOrderService;

	@Resource
	private FlexibleSearchService flexibleSearchService;

	@Resource
	private ModelService modelService;

	@Resource
	private BaseSiteService baseSiteService;

	@Resource
	private OrderFacade orderRestClient;


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

		final BaseSiteModel site = baseSiteService.getBaseSiteForUID("testSite");
		Assert.assertNotNull("no baseSite with uid 'testSite", site);
		site.setChannel(SiteChannel.B2C);
		baseSiteService.setCurrentBaseSite(site, false);
	}

	@Test
	public void testCreateOrder()
	{
		final String orderCode = "testOrderCode";
		final OrderModel orderModel = getOrderForCode(orderCode);
		// set the subsriptionId
		final PaymentTransactionModel transaction = modelService.create(PaymentTransactionModel.class);
		transaction.setCode(String.valueOf(System.currentTimeMillis()));
		transaction.setOrder(orderModel);
		transaction.setRequestId("http://localhost/paymentAuthUrl");
		orderModel.setPaymentTransactions(Collections.singletonList(transaction));
		orderModel.setCode(String.valueOf(System.currentTimeMillis()));

		// if this method does not throw an exception the order should have been created in OMS
		omsOrderService.createOmsOrder(orderModel);
		Assert.assertNotNull(orderModel.getOrderExportTime());
		Assert.assertNotNull(String.format("Order %s not found in oms", orderModel.getCode()),
				orderRestClient.getOrderByOrderId(orderModel.getCode()));
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
