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
package de.hybris.platform.commercefacades.order;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.impex.jalo.ImpExException;
import de.hybris.platform.order.CartService;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.BaseStoreModel;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class DefaultCartFacadeIntegrationTest extends ServicelayerTransactionalTest
{
	private static final String TEST_BASESITE_UID = "testSite";
	private static final String TEST_BASESTORE_UID = "testStore";

	@Resource
	private CartFacade cartFacade;
	@Resource
	private CartService cartService;
	@Resource
	private ModelService modelService;
	@Resource
	private CommonI18NService commonI18NService;
	@Resource
	private BaseSiteService baseSiteService;

	private CurrencyModel currency;


	@Before
	public void setUp() throws ImpExException
	{
		importCsv("/commerceservices/test/testCommerceCart.csv", "utf-8");
		currency = commonI18NService.getCurrency("EUR");

		final CustomerModel user = modelService.create(CustomerModel.class);
		user.setUid("user");
		modelService.save(user);
		final CartModel cartModel = modelService.create(CartModel.class);
		final BaseStoreModel baseStore = modelService.create(BaseStoreModel.class);
		baseStore.setExternalTaxEnabled(Boolean.FALSE);
		baseStore.setUid(TEST_BASESTORE_UID);
		cartModel.setStore(baseStore);
		cartModel.setCurrency(currency);
		cartModel.setDate(new Date());
		cartModel.setNet(Boolean.TRUE);
		cartModel.setUser(user);
		modelService.save(cartModel);
		cartService.setSessionCart(cartModel);

		baseSiteService.setCurrentBaseSite(baseSiteService.getBaseSiteForUID(TEST_BASESITE_UID), false);
	}

	@Test
	public void testGetSessionCart()
	{
		final CartData cart = cartFacade.getSessionCart();
		Assert.assertNotNull(cart);
	}

	@Test
	public void testGetSessionCartNull()
	{
		cartService.removeSessionCart();
		commonI18NService.setCurrentCurrency(currency);
		final CartData cart = cartFacade.getSessionCart();
		Assert.assertNotNull(cart);
	}

	@Test
	public void testHasSessionCartTrue()
	{
		final boolean hasCart = cartFacade.hasSessionCart();
		Assert.assertTrue(hasCart);
	}

	@Test
	public void testHasSessionCartFalse()
	{
		cartService.removeSessionCart();
		final boolean hasCart = cartFacade.hasSessionCart();
		Assert.assertTrue(!hasCart);
	}

	@Test
	public void testGetMiniCart()
	{
		final CartData cart = cartFacade.getMiniCart();
		Assert.assertNotNull(cart);
	}

	@Test
	public void testGetMiniCartEmpty()
	{
		cartService.removeSessionCart();
		commonI18NService.setCurrentCurrency(currency);
		final CartData cart = cartFacade.getMiniCart();
		Assert.assertNotNull(cart);
	}

	@Test
	public void testAddToCart() throws CommerceCartModificationException
	{
		cartFacade.addToCart("HW1210-3423", 1);
		final CartModel cart = cartService.getSessionCart();
		Assert.assertEquals("HW1210-3423", cart.getEntries().iterator().next().getProduct().getCode());
	}

	@Test
	public void testAddToCartLowerStock() throws CommerceCartModificationException
	{
		final long actualAdded = cartFacade.addToCart("HW1210-3423", 12).getQuantityAdded();
		final CartModel cart = cartService.getSessionCart();
		Assert.assertEquals(10, actualAdded);
		Assert.assertEquals("HW1210-3423", cart.getEntries().iterator().next().getProduct().getCode());
	}
}
