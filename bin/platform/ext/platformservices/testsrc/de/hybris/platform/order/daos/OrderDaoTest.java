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
package de.hybris.platform.order.daos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.order.payment.DebitPaymentInfoModel;
import de.hybris.platform.core.model.order.payment.PaymentModeModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.order.OrderService;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.type.TypeService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.testframework.Assert;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class OrderDaoTest extends ServicelayerTransactionalTest
{
	@Resource
	private CartService cartService;

	@Resource
	private OrderService orderService;

	@Resource
	private OrderDao orderDao;

	@Resource
	private ProductService productService;

	@Resource
	private UserService userService;
	@Resource
	private ModelService modelService;
	@Resource
	private TypeService typeService;

	private CartModel cart;
	private OrderModel order;
	private ProductModel product;
	private DebitPaymentInfoModel paymentInfo;
	private AddressModel deliveryAddress;

	private CurrencyModel myCurrency;
	private DeliveryModeModel deliveryMode;

	private PaymentModeModel paymentMode;



	@Before
	public void setUp() throws Exception
	{
		createCoreData();
		createDefaultCatalog();

		product = productService.getProduct("testProduct0");
		cart = cartService.getSessionCart();
		final UserModel user = userService.getCurrentUser();

		deliveryAddress = modelService.create(AddressModel.class);
		deliveryAddress.setOwner(user);
		deliveryAddress.setFirstname("Juergen");
		deliveryAddress.setLastname("Albertsen");
		deliveryAddress.setTown("Muenchen");

		paymentInfo = modelService.create(DebitPaymentInfoModel.class);
		paymentInfo.setOwner(cart);
		paymentInfo.setBank("MeineBank");
		paymentInfo.setUser(user);
		paymentInfo.setAccountNumber("34434");
		paymentInfo.setBankIDNumber("1111112");
		paymentInfo.setBaOwner("Ich");

		myCurrency = modelService.create(CurrencyModel.class);
		myCurrency.setActive(Boolean.TRUE);
		myCurrency.setIsocode("MCURR");
		myCurrency.setName("mYCurrency");
		myCurrency.setSymbol("mc");
		myCurrency.setConversion(Double.valueOf(1.3));
		modelService.save(myCurrency);

		deliveryMode = modelService.create(DeliveryModeModel.class);
		deliveryMode.setActive(Boolean.TRUE);
		deliveryMode.setCode("myTestDeliveryMode");
		deliveryMode.setName("my delivery mode");
		modelService.save(deliveryMode);

		paymentMode = modelService.create(PaymentModeModel.class);
		paymentMode.setActive(Boolean.TRUE);
		paymentMode.setCode("myTestPaymentMode");
		paymentMode.setName("my payment mode");
		paymentMode.setPaymentInfoType(typeService.getComposedTypeForCode(DebitPaymentInfoModel._TYPECODE));
		modelService.save(paymentMode);
	}

	/**
	 * Tests {@link OrderDao#findOrdersByCurrency(CurrencyModel)}
	 */
	@Test
	public void testFindOrdersByCurrency() throws Exception
	{

		//corner cases
		boolean success = false;
		try
		{
			orderDao.findOrdersByCurrency(null);
			fail("IllegalArgumentException expected for null currency");
		}
		catch (final IllegalArgumentException e)
		{
			success = true;
		}
		assertTrue("IllegalArgumentException expected for null currency", success);

		success = false;
		try
		{
			orderDao.findOrdersByCurrency(new CurrencyModel());
			fail("IllegalStateException expected for invalid currency");
		}
		catch (final IllegalStateException e)
		{
			success = true;
		}
		assertTrue("IllegalStateException expected for invalid currency", success);

		List<AbstractOrderModel> currencyAbstractOrders = orderDao.findOrdersByCurrency(myCurrency);
		assertTrue("There should be no orders with myCorrency", currencyAbstractOrders.isEmpty());

		cartService.addToCart(cart, product, 2, null);
		cart.setCurrency(myCurrency);
		modelService.save(cart);

		currencyAbstractOrders = orderDao.findOrdersByCurrency(myCurrency);
		Assert.assertCollectionElements(currencyAbstractOrders, cart);

		order = orderService.placeOrder(cart, deliveryAddress, null, paymentInfo);

		currencyAbstractOrders = orderDao.findOrdersByCurrency(myCurrency);
		assertTrue("found orders collection should contain order", currencyAbstractOrders.contains(order));

	}

	/**
	 * Tests {@link OrderDao#findOrdersByDelivereMode(de.hybris.platform.core.model.order.delivery.DeliveryModeModel)}
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindOrdersByDeliveryMode() throws Exception
	{
		orderDao.findOrdersByDelivereMode(null);
	}

	/**
	 * Tests {@link OrderDao#findOrdersByDelivereMode(de.hybris.platform.core.model.order.delivery.DeliveryModeModel)}
	 */
	@Test
	public void testFindOrdersByDeliveryModeFound() throws Exception
	{
		cartService.addToCart(cart, product, 2, null);
		cart.setDeliveryMode(deliveryMode);
		order = orderService.placeOrder(cart, deliveryAddress, null, paymentInfo);
		assertEquals("Orders delivery mode is not as expected", deliveryMode, order.getDeliveryMode());
		final Collection<AbstractOrderModel> fetchedOrders = orderDao.findOrdersByDelivereMode(deliveryMode);
		Assert.assertCollectionElements(fetchedOrders, order);
	}

	/**
	 * Tests {@link OrderDao#findOrdersByDelivereMode(de.hybris.platform.core.model.order.delivery.DeliveryModeModel)}
	 */
	@Test
	public void testFindOrdersByDeliveryModeNotFound() throws Exception
	{
		cartService.addToCart(cart, product, 2, null);
		order = orderService.placeOrder(cart, deliveryAddress, null, paymentInfo);
		assertNull("Orders delivery mode is not as expected", order.getDeliveryMode());
		final Collection<AbstractOrderModel> fetchedOrders = orderDao.findOrdersByDelivereMode(deliveryMode);
		assertTrue("Fetched collection is expected to be empty", fetchedOrders.isEmpty());
	}

	/**
	 * Tests {@link OrderDao#findOrdersByPaymentMode(de.hybris.platform.core.model.order.payment.PaymentModeModel)}
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindOrdersByPaymentMode() throws Exception
	{
		orderDao.findOrdersByPaymentMode(null);
	}

	/**
	 * Tests {@link OrderDao#findOrdersByPaymentMode(de.hybris.platform.core.model.order.payment.PaymentModeModel)}
	 */
	@Test
	public void testFindOrdersByPaymentModeFound() throws Exception
	{
		cartService.addToCart(cart, product, 2, null);
		cart.setPaymentMode(paymentMode);
		order = orderService.placeOrder(cart, deliveryAddress, null, paymentInfo);
		assertEquals("Orders payment mode is not as expected", paymentMode, order.getPaymentMode());
		final Collection<AbstractOrderModel> fetchedOrders = orderDao.findOrdersByPaymentMode(paymentMode);
		Assert.assertCollectionElements(fetchedOrders, order);
	}

	/**
	 * Tests {@link OrderDao#findOrdersByPaymentMode(de.hybris.platform.core.model.order.payment.PaymentModeModel)}
	 */
	@Test
	public void testFindOrdersByPaymentModeNotFound() throws Exception
	{
		cartService.addToCart(cart, product, 2, null);
		order = orderService.placeOrder(cart, deliveryAddress, null, paymentInfo);
		assertNull("Orders payment mode is not as expected", order.getPaymentMode());
		final Collection<AbstractOrderModel> fetchedOrders = orderDao.findOrdersByPaymentMode(paymentMode);
		assertTrue("Fetched collection is expected to be empty", fetchedOrders.isEmpty());
	}
}
