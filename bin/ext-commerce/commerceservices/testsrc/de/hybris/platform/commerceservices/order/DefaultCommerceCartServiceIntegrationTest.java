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
package de.hybris.platform.commerceservices.order;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commerceservices.impersonation.ImpersonationContext;
import de.hybris.platform.commerceservices.impersonation.ImpersonationService;
import de.hybris.platform.commerceservices.order.impl.DefaultCommerceCartService;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.europe1.model.PriceRowModel;
import de.hybris.platform.jalo.CoreBasicDataCreator;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.Cart;
import de.hybris.platform.jalo.order.CartEntry;
import de.hybris.platform.order.CartService;
import de.hybris.platform.order.exceptions.CalculationException;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.product.UnitService;
import de.hybris.platform.promotions.jalo.ProductPercentageDiscountPromotion;
import de.hybris.platform.promotions.jalo.PromotionOrderEntryAdjustAction;
import de.hybris.platform.promotions.jalo.PromotionResult;
import de.hybris.platform.promotions.jalo.PromotionsManager;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.internal.model.impl.DefaultModelService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.tx.Transaction;

import java.sql.Connection;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;


/**
 * Integration test suite for {@link DefaultCommerceCartService}
 */
@IntegrationTest
public class DefaultCommerceCartServiceIntegrationTest extends ServicelayerTest
{
	private static final Logger LOG = Logger.getLogger(DefaultCommerceCartServiceIntegrationTest.class);
	private static final String TEST_BASESITE_UID = "testSite";

	@Resource
	private CommerceCartService commerceCartService;

	@Resource
	private UserService userService;

	@Resource
	private ModelService modelService;

	@Resource
	private ProductService productService;

	@Resource
	private CatalogVersionService catalogVersionService;

	@Resource
	private CartService cartService;

	@Resource
	private SessionService sessionService;

	@Resource
	private UnitService unitService;

	@Resource
	private BaseSiteService baseSiteService;

	@Resource
	private ImpersonationService impersonationService;

	@Resource (name = "processengine.taskExecutionTransactionTemplate")
	private TransactionTemplate transactionTemplate;


	@Before
	public void setUp() throws Exception
	{
		// final Create data for tests
		LOG.info("Creating data for commerce cart ..");
		userService.setCurrentUser(userService.getAdminUser());
		final long startTime = System.currentTimeMillis();
		new CoreBasicDataCreator().createEssentialData(Collections.EMPTY_MAP, null);
		// importing test csv
		importCsv("/commerceservices/test/testCommerceCart.csv", "utf-8");

		baseSiteService.setCurrentBaseSite(baseSiteService.getBaseSiteForUID(TEST_BASESITE_UID), false);

		LOG.info("Finished data for commerce cart " + (System.currentTimeMillis() - startTime) + "ms");
	}

	@Test
	public void testAddToCart() throws CommerceCartModificationException
	{
		final CatalogVersionModel catalogVersionModel = catalogVersionService.getCatalogVersion("testCatalog", "Online");
		final ProductModel productModel = productService.getProductForCode(catalogVersionModel, "HW1210-3423");
		final UnitModel unitModel = unitService.getUnitForCode("pieces");
		final UserModel ahertz = userService.getUserForUID("ahertz");
		final Collection<CartModel> cartModels = ahertz.getCarts();

		Assert.assertEquals(1, cartModels.size());
		final CartModel ahertzCart = cartModels.iterator().next();

		// Add new entry
		commerceCartService.addToCart(ahertzCart, productModel, 3, unitModel, false);

		Assert.assertEquals(2, ahertzCart.getEntries().size());

		for (final AbstractOrderEntryModel cartEntryModel : ahertzCart.getEntries())
		{
			if (cartEntryModel.getQuantity().intValue() == 3)
			{
				Assert.assertEquals("HW1210-3423", cartEntryModel.getProduct().getCode());
				Assert.assertEquals(unitModel, cartEntryModel.getUnit());
			}
		}
	}

	@Test
	public void testAddToCartInsufficientStock() throws CommerceCartModificationException
	{
		final CatalogVersionModel catalogVersionModel = catalogVersionService.getCatalogVersion("testCatalog", "Online");
		final ProductModel productModel = productService.getProductForCode(catalogVersionModel, "HW1210-3423");
		final UnitModel unitModel = unitService.getUnitForCode("pieces");
		final UserModel ahertz = userService.getUserForUID("ahertz");
		final Collection<CartModel> cartModels = ahertz.getCarts();

		Assert.assertEquals(1, cartModels.size());
		final CartModel ahertzCart = cartModels.iterator().next();

		// Add new entry
		final CommerceCartModification result = commerceCartService.addToCart(ahertzCart, productModel, 12, unitModel, false);
		Assert.assertEquals(10L, result.getQuantityAdded());
	}

	@Test
	public void testAddToCartWhenNoCartPassed() throws CommerceCartModificationException
	{
		final CatalogVersionModel catalogVersionModel = catalogVersionService.getCatalogVersion("testCatalog", "Online");
		final ProductModel productModel = productService.getProductForCode(catalogVersionModel, "HW1210-3423");
		final UnitModel unitModel = unitService.getUnitForCode("pieces");
		final UserModel ahertz = userService.getUserForUID("ahertz");
		final Collection<CartModel> cartModels = ahertz.getCarts();

		Assert.assertEquals(1, cartModels.size());

		final CartModel ahertzCart = cartModels.iterator().next();
		cartService.setSessionCart(ahertzCart);
		// Add new entry

		commerceCartService.addToCart(ahertzCart, productModel, 3, unitModel, false);

		Assert.assertEquals(2, ahertzCart.getEntries().size());

		for (final AbstractOrderEntryModel cartEntryModel : ahertzCart.getEntries())
		{
			if (cartEntryModel.getQuantity().intValue() == 3)
			{
				Assert.assertEquals("HW1210-3423", cartEntryModel.getProduct().getCode());
				Assert.assertEquals(unitModel, cartEntryModel.getUnit());
			}
		}
	}

	@Test
	public void testAddToCartToTheSameEntry() throws CommerceCartModificationException
	{
		final CatalogVersionModel catalogVersionModel = catalogVersionService.getCatalogVersion("testCatalog", "Online");
		final ProductModel productModel = productService.getProductForCode(catalogVersionModel, "HW1210-3423");
		final UnitModel unitModel = unitService.getUnitForCode("pieces");
		final UserModel ahertz = userService.getUserForUID("ahertz");
		final Collection<CartModel> cartModels = ahertz.getCarts();

		Assert.assertEquals(1, cartModels.size());
		final CartModel ahertzCart = cartModels.iterator().next();

		// Add the same product - increase quantity
		commerceCartService.addToCart(ahertzCart, productModel, 3, unitModel, false);
		commerceCartService.addToCart(ahertzCart, productModel, 5, unitModel, false);

		Assert.assertEquals(2, ahertzCart.getEntries().size());

		for (final AbstractOrderEntryModel cartEntryModel : ahertzCart.getEntries())
		{
			if (cartEntryModel.getProduct().getCode().equals("HW1210-3423"))
			{
				Assert.assertEquals(8, cartEntryModel.getQuantity().longValue());
			}
		}
	}

	@Test
	public void testAddToCartForceNewEntry() throws CommerceCartModificationException
	{
		final CatalogVersionModel catalogVersionModel = catalogVersionService.getCatalogVersion("testCatalog", "Online");
		final ProductModel productModel = productService.getProductForCode(catalogVersionModel, "HW1210-3423");
		final UnitModel unitModel = unitService.getUnitForCode("pieces");
		final UserModel ahertz = userService.getUserForUID("ahertz");
		final Collection<CartModel> cartModels = ahertz.getCarts();

		Assert.assertEquals(1, cartModels.size());
		final CartModel ahertzCart = cartModels.iterator().next();

		// Add the same product but force new entry
		commerceCartService.addToCart(ahertzCart, productModel, 10, unitModel, true);

		Assert.assertEquals(2, ahertzCart.getEntries().size());

		for (final AbstractOrderEntryModel cartEntryModel : ahertzCart.getEntries())
		{
			if (cartEntryModel.getQuantity().intValue() == 9)
			{
				Assert.assertEquals("HW1210-3423", cartEntryModel.getProduct().getCode());
			}
		}
	}

	@Test
	public void testCalculateCart()
	{
		final UserModel promoted = userService.getUserForUID("promoted");
		final Collection<CartModel> cartModels = promoted.getCarts();

		Assert.assertEquals(1, cartModels.size());
		final CartModel promotedCart = cartModels.iterator().next();

		commerceCartService.calculateCart(promotedCart);
		Assert.assertEquals(Boolean.TRUE, promotedCart.getCalculated());
		Assert.assertEquals(Double.valueOf(163.95), promotedCart.getTotalPrice());
	}

	@Test
	public void testPreviewTime() throws CalculationException
	{
		final UserModel promoted = userService.getUserForUID("promoted");
		final Collection<CartModel> cartModels = promoted.getCarts();
		Assert.assertEquals(1, cartModels.size());
		final CartModel promotedCart = cartModels.iterator().next();
		sessionService.setAttribute("previewTime", new Date());
		commerceCartService.calculateCart(promotedCart);
		Assert.assertEquals(Boolean.TRUE, promotedCart.getCalculated());
		Assert.assertEquals(Double.valueOf(163.95), promotedCart.getTotalPrice());

		commerceCartService.recalculateCart(promotedCart);

		Assert.assertEquals(Boolean.TRUE, promotedCart.getCalculated());
		Assert.assertEquals(Double.valueOf(163.95), promotedCart.getTotalPrice());
		// set a date after promotion endDate
		final Calendar cal = Calendar.getInstance();
		cal.set(2401, 0, 1);
		sessionService.setAttribute(SessionContext.TIMEOFFSET, Long.valueOf(cal.getTimeInMillis() - new Date().getTime()));
		promotedCart.setCalculated(Boolean.FALSE);
		commerceCartService.calculateCart(promotedCart);
		Assert.assertEquals(Boolean.TRUE, promotedCart.getCalculated());
		Assert.assertEquals(Double.valueOf(827.95), promotedCart.getTotalPrice());

		commerceCartService.recalculateCart(promotedCart);

		Assert.assertEquals(Boolean.TRUE, promotedCart.getCalculated());
		Assert.assertEquals(Double.valueOf(827.95), promotedCart.getTotalPrice());
	}

	@Test
	public void testRecalculateCart() throws CalculationException
	{
		final UserModel promoted = userService.getUserForUID("promoted");
		final Collection<CartModel> cartModels = promoted.getCarts();

		Assert.assertEquals(1, cartModels.size());
		final CartModel promotedCart = cartModels.iterator().next();

		commerceCartService.calculateCart(promotedCart);
		Assert.assertEquals(Boolean.TRUE, promotedCart.getCalculated());
		Assert.assertEquals(Double.valueOf(163.95), promotedCart.getTotalPrice());

		final CatalogVersionModel catalogVersionModel = catalogVersionService.getCatalogVersion("testCatalog", "Online");
		final ProductModel productModel = productService.getProductForCode(catalogVersionModel, "HW1210-3423");

		final Collection<PriceRowModel> priceRowModels = productModel.getEurope1Prices();
		final PriceRowModel priceRowModel = priceRowModels.iterator().next();
		priceRowModel.setPrice(Double.valueOf(100.0));
		modelService.save(priceRowModel);

		commerceCartService.recalculateCart(promotedCart);
		Assert.assertEquals(Double.valueOf(196), promotedCart.getTotalPrice());
	}

	@Test
	public void testRemoveAllEntries()
	{
		final UserModel abrode = userService.getUserForUID("abrode");
		final Collection<CartModel> cartModels = abrode.getCarts();

		Assert.assertEquals(1, cartModels.size());
		final CartModel abrodeCart = cartModels.iterator().next();
		commerceCartService.removeAllEntries(abrodeCart);
		Assert.assertEquals(0, abrodeCart.getEntries().size());
	}

	@Test
	public void testUpdateQuantityForCartEntry() throws CommerceCartModificationException
	{
		final UserModel abrode = userService.getUserForUID("abrode");
		final Collection<CartModel> cartModels = abrode.getCarts();

		Assert.assertEquals(1, cartModels.size());

		final CartModel abrodeCart = cartModels.iterator().next();

		final CommerceCartModification result = commerceCartService.updateQuantityForCartEntry(abrodeCart, 2, 12);
		Assert.assertEquals(5L, result.getQuantityAdded());

		Assert.assertEquals(Double.valueOf(795.4), abrodeCart.getTotalPrice());
	}

	@Test
	public void shouldCreatePromotionActionForPromotionResult() throws Exception
	{
		final UserModel ahertz = userService.getUserForUID("ahertz");
		final Collection<CartModel> cartModels = ahertz.getCarts();
		Assert.assertEquals(1, cartModels.size());
		final CartModel cart = cartModels.iterator().next();

		transactionTemplate.execute(new TransactionCallback<Object>()
		{
			@Override
			public Object doInTransaction(final TransactionStatus status)
			{

				Transaction.current().enableDelayedStore(false);

				final ImpersonationContext context = new ImpersonationContext();
				context.setOrder(cart);
				impersonationService.executeInContext(context,
						new ImpersonationService.Executor<CartModel, ImpersonationService.Nothing>()
						{
							@Override
							public CartModel execute()
							{
								final SessionContext sessionContext = JaloSession.getCurrentSession().getSessionContext();
								final ProductPercentageDiscountPromotion productPercentageDiscountPromotion = PromotionsManager
										.getInstance().createProductPercentageDiscountPromotion(sessionContext,
												Collections.singletonMap(ProductPercentageDiscountPromotion.CODE, "test"));

								final PromotionResult result = PromotionsManager.getInstance().createPromotionResult(sessionContext,
										productPercentageDiscountPromotion, (Cart) modelService.toPersistenceLayer(cart), 1.0F);

								Assert.assertNotNull("PromotionResult", result);

								final PromotionOrderEntryAdjustAction action = PromotionsManager.getInstance()
										.createPromotionOrderEntryAdjustAction(sessionContext,
												(CartEntry) modelService.toPersistenceLayer(cart.getEntries().iterator().next()), 0, 0D);
								Assert.assertNotNull("PromotionOrderEntryAdjustAction", action);

								result.addAction(sessionContext, action);


								Assert.assertTrue("Should have found one action associated to PromotionResult", result.getActions()
										.size() == 1);

								return cart;
							}
						});

				return null;
			}
		});
	}
}
