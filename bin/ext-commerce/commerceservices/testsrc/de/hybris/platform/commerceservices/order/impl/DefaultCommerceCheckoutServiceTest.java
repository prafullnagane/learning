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
package de.hybris.platform.commerceservices.order.impl;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.delivery.DeliveryService;
import de.hybris.platform.commerceservices.externaltax.ExternalTaxesService;
import de.hybris.platform.commerceservices.order.CommerceCartService;
import de.hybris.platform.commerceservices.strategies.impl.DefaultGenerateMerchantTransactionCodeStrategy;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.order.CalculationService;
import de.hybris.platform.order.InvalidCartException;
import de.hybris.platform.order.OrderService;
import de.hybris.platform.order.exceptions.CalculationException;
import de.hybris.platform.payment.PaymentService;
import de.hybris.platform.payment.dto.TransactionStatus;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;
import de.hybris.platform.payment.model.PaymentTransactionModel;
import de.hybris.platform.promotions.PromotionsService;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.i18n.I18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


/**
 * JUnit test suite for {@link DefaultCommerceCheckoutService}
 */
@UnitTest
public class DefaultCommerceCheckoutServiceTest
{
	public static final String TEST_PSP = "TestPSP";
	public static final String TEST_SUBSCRIPTION_ID = "TestSubscriptionID";
	public static final String TEST_CURRENCY_ISO = "TestCurrencyIso";
	public static final String TEST_CUSTOMER_UID = "TestCustomerUID";
	private DefaultCommerceCheckoutService commerceCheckoutService;
	private CartModel cartModel;
	private OrderModel orderModel;
	private AddressModel deliveryAddress;
	private CustomerModel customerModel;
	private DeliveryModeModel deliveryModeModel;
	private CreditCardPaymentInfoModel paymentInfoModel;
	private CurrencyModel currencyModel;
	private Currency currency;
	private PaymentTransactionEntryModel transactionEntryModel;
	private PaymentTransactionModel paymentTransactionModel;
	private AbstractOrderEntryModel orderEntryModel1;
	private AbstractOrderEntryModel orderEntryModel2;
	private final List<AbstractOrderEntryModel> cartEntries = new ArrayList<AbstractOrderEntryModel>();
	private BaseSiteModel siteModel;
	private BaseStoreModel storeModel;
	private final List<AddressModel> addressBook = new ArrayList<AddressModel>();
	private LanguageModel languageModel;

	@Mock
	private ModelService modelService;
	@Mock
	private CommerceCartService commerceCartService;
	@Mock
	private DeliveryService deliveryService;
	@Mock
	private I18NService i18nService;
	@Mock
	private CommonI18NService commonI18NService;
	@Mock
	private PaymentService paymentService;
	@Mock
	private OrderService orderService;
	@Mock
	private BaseSiteService siteService;
	@Mock
	private BaseStoreService baseStoreService;
	@Mock
	private PromotionsService promotionsService;
	@Mock
	private ConfigurationService configurationService;
	@Mock
	private CalculationService calculationService;
	@Mock
	private ExternalTaxesService externalTaxesService;
	@Mock
	private Configuration configuration;

	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);

		commerceCheckoutService = new DefaultCommerceCheckoutService();
		commerceCheckoutService.setModelService(modelService);
		commerceCheckoutService.setCommerceCartService(commerceCartService);
		commerceCheckoutService.setDeliveryService(deliveryService);
		commerceCheckoutService.setI18nService(i18nService);
		commerceCheckoutService.setPaymentService(paymentService);
		commerceCheckoutService.setOrderService(orderService);
		commerceCheckoutService.setBaseSiteService(siteService);
		commerceCheckoutService.setBaseStoreService(baseStoreService);
		commerceCheckoutService.setPromotionsService(promotionsService);
		commerceCheckoutService.setCalculationService(calculationService);
		commerceCheckoutService.setExternalTaxesService(externalTaxesService);
		commerceCheckoutService.setCommonI18NService(commonI18NService);
		commerceCheckoutService.setGenerateMerchantTransactionCodeStrategy(new DefaultGenerateMerchantTransactionCodeStrategy());

		cartModel = mock(CartModel.class);
		orderModel = mock(OrderModel.class);
		deliveryAddress = mock(AddressModel.class);
		customerModel = mock(CustomerModel.class);
		deliveryModeModel = mock(DeliveryModeModel.class);
		paymentInfoModel = mock(CreditCardPaymentInfoModel.class);
		currencyModel = mock(CurrencyModel.class);
		currency = Currency.getInstance("USD");
		transactionEntryModel = mock(PaymentTransactionEntryModel.class);
		paymentTransactionModel = mock(PaymentTransactionModel.class);
		orderEntryModel1 = mock(OrderEntryModel.class);
		orderEntryModel2 = mock(OrderEntryModel.class);
		siteModel = mock(BaseSiteModel.class);
		storeModel = mock(BaseStoreModel.class);
		languageModel = mock(LanguageModel.class);

		given(cartModel.getUser()).willReturn(customerModel);
		given(customerModel.getAddresses()).willReturn(addressBook);
		given(deliveryAddress.getShippingAddress()).willReturn(Boolean.FALSE);
		given(cartModel.getCurrency()).willReturn(currencyModel);
		given(currencyModel.getIsocode()).willReturn(TEST_CURRENCY_ISO);
		given(i18nService.getBestMatchingJavaCurrency(TEST_CURRENCY_ISO)).willReturn(currency);
		given(customerModel.getUid()).willReturn(TEST_CUSTOMER_UID);
		given(cartModel.getTotalPrice()).willReturn(Double.valueOf(99.99d));
		given(
				paymentService.authorize(anyString(), any(BigDecimal.class), any(Currency.class), any(AddressModel.class),
						anyString(), anyString(), anyString())).willReturn(transactionEntryModel);
		given(transactionEntryModel.getPaymentTransaction()).willReturn(paymentTransactionModel);
		given(orderEntryModel1.getEntryNumber()).willReturn(Integer.valueOf(0));
		given(orderEntryModel2.getEntryNumber()).willReturn(Integer.valueOf(1));
		given(siteService.getCurrentBaseSite()).willReturn(siteModel);
		given(baseStoreService.getCurrentBaseStore()).willReturn(storeModel);
		given(storeModel.getPaymentProvider()).willReturn(TEST_PSP);
		given(paymentInfoModel.getBillingAddress()).willReturn(deliveryAddress);
		given(orderModel.getPaymentInfo()).willReturn(paymentInfoModel);
		given(orderModel.getLanguage()).willReturn(languageModel);
		final Collection collection = new HashSet<AddressModel>();
		collection.add(deliveryAddress);
		given(deliveryService.getSupportedDeliveryAddressesForOrder(cartModel, true)).willReturn(
				new ArrayList<AddressModel>(collection));
		given(deliveryService.getSupportedDeliveryAddressesForOrder(cartModel, false)).willReturn(
				new ArrayList<AddressModel>(collection));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetDeliveryAddressNullAddress()
	{
		commerceCheckoutService.setDeliveryAddress(null, deliveryAddress);
	}

	@Test
	public void testSetDeliveryAddressNullCart()
	{
		commerceCheckoutService.setDeliveryAddress(cartModel, null);
	}

	@Test
	public void testSetDeliveryAddress()
	{
		given(cartModel.getDeliveryMode()).willReturn(null);
		addressBook.add(deliveryAddress);

		commerceCheckoutService.setDeliveryAddress(cartModel, deliveryAddress);

		verify(cartModel, times(1)).setDeliveryAddress(deliveryAddress);
		verify(modelService, times(1)).save(cartModel);
		verify(cartModel, times(1)).getDeliveryMode();
	}

	@Test
	public void testSetDeliveryAddressAndFlagAsDeliveryAddress()
	{
		given(cartModel.getDeliveryMode()).willReturn(null);
		addressBook.add(deliveryAddress);

		commerceCheckoutService.setDeliveryAddress(cartModel, deliveryAddress, true);

		verify(cartModel, times(1)).setDeliveryAddress(deliveryAddress);
		verify(deliveryAddress, times(1)).setShippingAddress(Boolean.TRUE);
		verify(modelService, times(1)).save(cartModel);
		verify(modelService, times(1)).save(deliveryAddress);
		verify(cartModel, times(1)).getDeliveryMode();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetDeliveryModeNullCart()
	{
		commerceCheckoutService.setDeliveryMode(null, deliveryModeModel);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetDeliveryModeNullDeliveryMode()
	{
		commerceCheckoutService.setDeliveryMode(cartModel, null);
	}

	@Test
	public void testSetDeliveryMode()
	{
		commerceCheckoutService.setDeliveryMode(cartModel, deliveryModeModel);

		verify(cartModel, times(1)).setDeliveryMode(deliveryModeModel);
		verify(modelService, times(1)).save(cartModel);
		verify(commerceCartService, times(1)).calculateCart(cartModel);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testValidateDeliveryModeNullCart()
	{
		commerceCheckoutService.validateDeliveryMode(null);
	}

	@Test
	public void testValidateDeliveryModeInvalid()
	{
		given(cartModel.getDeliveryMode()).willReturn(deliveryModeModel);
		given(deliveryService.getSupportedDeliveryModesForOrder(cartModel)).willReturn(Collections.<DeliveryModeModel> emptyList());

		commerceCheckoutService.validateDeliveryMode(cartModel);

		verify(cartModel, times(1)).setDeliveryMode(null);
		verify(modelService, times(1)).save(cartModel);
		verify(commerceCartService, times(2)).calculateCart(cartModel);

	}

	@Test
	public void testValidateDeliveryModeValid()
	{
		given(cartModel.getDeliveryMode()).willReturn(deliveryModeModel);
		given(deliveryService.getSupportedDeliveryModesForOrder(cartModel))
				.willReturn(Collections.singletonList(deliveryModeModel));

		commerceCheckoutService.validateDeliveryMode(cartModel);

		verify(cartModel, times(1)).setDeliveryMode(null);
		verify(modelService, times(1)).save(cartModel);
		verify(commerceCartService, times(2)).calculateCart(cartModel);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetPaymentInfoNullCart()
	{
		commerceCheckoutService.setPaymentInfo(null, paymentInfoModel);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetPaymentInfoNullPaymentInfo()
	{
		commerceCheckoutService.setPaymentInfo(cartModel, null);
	}

	@Test
	public void testSetPaymentInfo()
	{
		commerceCheckoutService.setPaymentInfo(cartModel, paymentInfoModel);

		verify(cartModel, times(1)).setPaymentInfo(paymentInfoModel);
		verify(modelService, times(1)).save(cartModel);
		verify(modelService, times(1)).refresh(cartModel);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAuthorizePaymentNullCart()
	{
		commerceCheckoutService.authorizePayment(null, "123", TEST_PSP);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAuthorizePaymentNullPaymentInfo()
	{
		given(cartModel.getPaymentInfo()).willReturn(null);

		commerceCheckoutService.authorizePayment(cartModel, "123", TEST_PSP);
	}

	@Test
	public void testAuthorizePaymentNoSubscriptionId()
	{
		given(cartModel.getPaymentInfo()).willReturn(paymentInfoModel);
		given(paymentInfoModel.getSubscriptionId()).willReturn(null);
		given(cartModel.getCalculated()).willReturn(Boolean.TRUE);

		final PaymentTransactionEntryModel result = commerceCheckoutService.authorizePayment(cartModel, "123", TEST_PSP);

		Assert.assertNull(result);
	}

	@Test
	public void testAuthorizePaymentRejected()
	{
		given(cartModel.getPaymentInfo()).willReturn(paymentInfoModel);
		given(paymentInfoModel.getSubscriptionId()).willReturn(TEST_SUBSCRIPTION_ID);
		given(cartModel.getDeliveryAddress()).willReturn(deliveryAddress);
		given(transactionEntryModel.getTransactionStatus()).willReturn(TransactionStatus.REJECTED.name());
		given(cartModel.getCalculated()).willReturn(Boolean.TRUE);

		final PaymentTransactionEntryModel result = commerceCheckoutService.authorizePayment(cartModel, "123", TEST_PSP);

		Assert.assertNotNull(result);
		Assert.assertEquals(result.getTransactionStatus(), TransactionStatus.REJECTED.name());
		verify(paymentTransactionModel, times(0)).setOrder(cartModel);
		verify(modelService, times(0)).saveAll(cartModel, paymentTransactionModel);
	}

	@Test
	public void testAuthorizePaymentAccepted()
	{
		given(cartModel.getPaymentInfo()).willReturn(paymentInfoModel);
		given(paymentInfoModel.getSubscriptionId()).willReturn(TEST_SUBSCRIPTION_ID);
		given(cartModel.getDeliveryAddress()).willReturn(deliveryAddress);
		given(transactionEntryModel.getTransactionStatus()).willReturn(TransactionStatus.ACCEPTED.name());
		given(cartModel.getCalculated()).willReturn(Boolean.TRUE);

		final PaymentTransactionEntryModel result = commerceCheckoutService.authorizePayment(cartModel, "123", TEST_PSP);

		Assert.assertNotNull(result);
		Assert.assertEquals(result.getTransactionStatus(), TransactionStatus.ACCEPTED.name());
		verify(paymentTransactionModel, times(1)).setOrder(cartModel);
		verify(modelService, times(1)).saveAll(cartModel, paymentTransactionModel);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPlaceOrderNullCart() throws InvalidCartException
	{
		commerceCheckoutService.placeOrder(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPlaceOrderNotCalculated() throws InvalidCartException
	{
		given(cartModel.getCalculated()).willReturn(Boolean.FALSE);

		commerceCheckoutService.placeOrder(cartModel);
	}

	@Test
	public void testPlaceOrder() throws InvalidCartException, CalculationException
	{
		given(cartModel.getCalculated()).willReturn(Boolean.TRUE);
		cartEntries.add(orderEntryModel1);
		cartEntries.add(orderEntryModel2);
		given(cartModel.getEntries()).willReturn(cartEntries);
		given(orderService.createOrderFromCart(cartModel)).willReturn(orderModel);
		given(cartModel.getPaymentInfo()).willReturn(paymentInfoModel);

		final OrderModel result = commerceCheckoutService.placeOrder(cartModel);

		Assert.assertNotNull(result);
		verify(orderModel, times(1)).setSite(siteModel);
		verify(orderModel, times(1)).setStore(storeModel);
		verify(promotionsService, times(1)).transferPromotionsToOrder(cartModel, orderModel, false);
		verify(calculationService, times(1)).calculateTotals(orderModel, false);
		verify(orderService, times(1)).submitOrder(orderModel);
	}

	@Test
	public void testPaymentProvider()
	{
		final String psp = commerceCheckoutService.getPaymentProvider();

		Assert.assertEquals(psp, TEST_PSP);
	}
}
