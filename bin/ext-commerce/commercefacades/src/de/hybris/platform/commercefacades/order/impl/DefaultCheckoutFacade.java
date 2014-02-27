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
package de.hybris.platform.commercefacades.order.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.*;
import de.hybris.platform.commercefacades.order.CartFacade;
import de.hybris.platform.commercefacades.order.CheckoutFacade;
import de.hybris.platform.commercefacades.order.data.CCPaymentInfoData;
import de.hybris.platform.commercefacades.order.data.CardTypeData;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commercefacades.order.data.DeliveryModeData;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.order.data.ZoneDeliveryModeData;
import de.hybris.platform.commercefacades.product.PriceDataFactory;
import de.hybris.platform.commercefacades.product.data.PriceDataType;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commerceservices.customer.CustomerAccountService;
import de.hybris.platform.commerceservices.delivery.DeliveryService;
import de.hybris.platform.commerceservices.order.CommerceCardTypeService;
import de.hybris.platform.commerceservices.order.CommerceCheckoutService;
import de.hybris.platform.commerceservices.strategies.CheckoutCustomerStrategy;
import de.hybris.platform.commerceservices.util.AbstractComparator;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.enums.CreditCardType;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.deliveryzone.model.ZoneDeliveryModeModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.order.CartService;
import de.hybris.platform.order.InvalidCartException;
import de.hybris.platform.payment.dto.BillingInfo;
import de.hybris.platform.payment.dto.CardInfo;
import de.hybris.platform.payment.dto.CardType;
import de.hybris.platform.payment.dto.TransactionStatus;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.util.PriceValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.Assert;

public class DefaultCheckoutFacade implements CheckoutFacade
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(DefaultCheckoutFacade.class);
	private CartFacade cartFacade;
	private CartService cartService;
	private DeliveryService deliveryService;
	private UserService userService;
	private PriceDataFactory priceDataFactory;
	private CommerceCheckoutService commerceCheckoutService;
	private EnumerationService enumerationService;
	private CommerceCardTypeService commerceCardTypeService;
	private CustomerAccountService customerAccountService;
	private ModelService modelService;
	private CommonI18NService commonI18NService;
	private CheckoutCustomerStrategy checkoutCustomerStrategy;
	private Populator<AddressData, AddressModel> addressReversePopulator;
	private Converter<CreditCardPaymentInfoModel, CCPaymentInfoData> creditCardPaymentInfoConverter;
	private Converter<DeliveryModeModel, DeliveryModeData> deliveryModeConverter;
	private Converter<ZoneDeliveryModeModel, ZoneDeliveryModeData> zoneDeliveryModeConverter;
	private Converter<OrderModel, OrderData> orderConverter;
	private Converter<AddressModel, AddressData> addressConverter;
	private Converter<CardType, CardTypeData> cardTypeConverter;
	private Converter<CountryModel, CountryData> countryConverter;

	@Override
	public boolean hasCheckoutCart()
	{
		return getCartFacade().hasSessionCart();
	}

	@Override
	public CartData getCheckoutCart()
	{
		final CartData cartData = getCartFacade().getSessionCart();
		if (cartData != null)
		{
			cartData.setDeliveryAddress(getDeliveryAddress());
			cartData.setDeliveryMode(getDeliveryMode());
			cartData.setPaymentInfo(getPaymentDetails());
		}

		return cartData;
	}

	protected CartModel getCart()
	{
		if (hasCheckoutCart())
		{
			return getCartService().getSessionCart();
		}

		return null;
	}

	@Override
	public List<AddressData> getSupportedDeliveryAddresses(final boolean visibleAddressesOnly)
	{
		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			final List<AddressModel> addresses = getDeliveryService().getSupportedDeliveryAddressesForOrder(cartModel,
					visibleAddressesOnly);
			return Converters.convertAll(addresses, getAddressConverter());
		}
		return Collections.emptyList();
	}

	@Override
	public AddressData getDeliveryAddressForCode(final String code)
	{
		Assert.notNull(code, "Parameter code cannot be null.");

		for (final AddressData address : getSupportedDeliveryAddresses(false))
		{
			if (code.equals(address.getId()))
			{
				return address;
			}
		}
		return null;
	}

	protected AddressModel getDeliveryAddressModelForCode(final String code)
	{
		Assert.notNull(code, "Parameter code cannot be null.");

		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			final List<AddressModel> addresses = getDeliveryService().getSupportedDeliveryAddressesForOrder(cartModel, false);
			if (addresses != null)
			{
				for (final AddressModel address : addresses)
				{
					if (code.equals(address.getPk().toString()))
					{
						return address;
					}
				}
			}
		}
		return null;
	}

	protected AddressModel createDeliveryAddressModel(final AddressData addressData, final CartModel cartModel)
	{
		final AddressModel addressModel = getModelService().create(AddressModel.class);
		getAddressReversePopulator().populate(addressData, addressModel);
		addressModel.setOwner(cartModel);

		return addressModel;
	}

	protected AddressData getDeliveryAddress()
	{
		final CartModel cart = getCart();
		if (cart != null)
		{
			final AddressModel deliveryAddress = cart.getDeliveryAddress();
			if (deliveryAddress != null)
			{
				// Ensure that the delivery address is in the set of supported addresses
				final AddressModel supportedAddress = getDeliveryAddressModelForCode(deliveryAddress.getPk().toString());
				if (supportedAddress != null)
				{
					return getAddressConverter().convert(supportedAddress);
				}
			}
		}

		return null;
	}

	@Override
	public boolean setDeliveryAddress(final AddressData addressData)
	{
		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			AddressModel addressModel = null;
			if (addressData != null)
			{
				if (addressData.getId() != null)
				{
					addressModel = getDeliveryAddressModelForCode(addressData.getId());
				}
				else
				{
					addressModel = createDeliveryAddressModel(addressData, cartModel);
				}
			}
			return getCommerceCheckoutService().setDeliveryAddress(cartModel, addressModel);
		}
		return false;
	}

	@Override
	public List<? extends DeliveryModeData> getSupportedDeliveryModes()
	{
		final List<DeliveryModeData> result = new ArrayList<DeliveryModeData>();
		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			final Collection<DeliveryModeModel> supportedDeliveryModes = getDeliveryService().getSupportedDeliveryModeListForOrder(
					cartModel);

			for (final DeliveryModeModel deliveryModeModel : supportedDeliveryModes)
			{
				result.add(convert(deliveryModeModel));
			}
		}

		return result;
	}


	@Override
	public boolean setDeliveryAddressIfAvailable()
	{
		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			if (cartModel.getDeliveryAddress() == null)
			{
				final UserModel currentUser = getCurrentUserForCheckout();
				if (cartModel.getUser().equals(currentUser))
				{
					final AddressModel currentUserDefaultShipmentAddress = currentUser.getDefaultShipmentAddress();
					if (currentUserDefaultShipmentAddress != null)
					{
						final AddressModel supportedDeliveryAddress = getDeliveryAddressModelForCode(currentUserDefaultShipmentAddress
								.getPk().toString());
						if (supportedDeliveryAddress != null)
						{
							return getCommerceCheckoutService().setDeliveryAddress(cartModel, supportedDeliveryAddress);
						}
					}
				}

				// Could not use default address, try any address
				final List<AddressModel> supportedDeliveryAddresses = getDeliveryService().getSupportedDeliveryAddressesForOrder(
						cartModel, true);
				if (supportedDeliveryAddresses != null && !supportedDeliveryAddresses.isEmpty())
				{
					return getCommerceCheckoutService().setDeliveryAddress(cartModel, supportedDeliveryAddresses.get(0));
				}
			}
		}

		return false;
	}

	@Override
	public boolean setDeliveryModeIfAvailable()
	{
		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			// validate delivery mode if already exists
			getCommerceCheckoutService().validateDeliveryMode(cartModel);

			if (cartModel.getDeliveryMode() == null)
			{
				final List<? extends DeliveryModeData> availableDeliveryModes = getSupportedDeliveryModes();
				if (!availableDeliveryModes.isEmpty())
				{
					return setDeliveryMode(availableDeliveryModes.get(0).getCode());
				}
			}
		}

		return false;
	}

	@Override
	public boolean setPaymentInfoIfAvailable()
	{
		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			if (cartModel.getPaymentInfo() == null)
			{
				final UserModel currentUser = getCurrentUserForCheckout();
				if (cartModel.getUser().equals(currentUser))
				{
					// Try the default payment info
					final PaymentInfoModel defaultPaymentInfo = ((CustomerModel) currentUser).getDefaultPaymentInfo();
					if (defaultPaymentInfo != null)
					{
						return getCommerceCheckoutService().setPaymentInfo(cartModel, defaultPaymentInfo);
					}

					// Fallback to the first available stored card
					final List<CreditCardPaymentInfoModel> creditCardPaymentInfos = getCustomerAccountService()
							.getCreditCardPaymentInfos((CustomerModel) currentUser, true);
					if (creditCardPaymentInfos != null && !creditCardPaymentInfos.isEmpty())
					{
						return getCommerceCheckoutService().setPaymentInfo(cartModel, creditCardPaymentInfos.get(0));
					}
				}
			}
		}

		return false;
	}

	protected DeliveryModeData getDeliveryMode()
	{
		final CartModel cart = getCart();
		if (cart != null)
		{
			final DeliveryModeModel deliveryModeModel = cart.getDeliveryMode();
			if (deliveryModeModel != null)
			{
				return convert(deliveryModeModel);
			}
		}

		return null;
	}

	@Override
	public boolean setDeliveryMode(final String deliveryModeCode)
	{
		validateParameterNotNullStandardMessage("deliveryModeCode", deliveryModeCode);

		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			if (isSupportedDeliveryMode(deliveryModeCode, cartModel))
			{
				final DeliveryModeModel deliveryModeModel = getDeliveryService().getDeliveryModeForCode(deliveryModeCode);
				if (deliveryModeModel != null)
				{
					return getCommerceCheckoutService().setDeliveryMode(cartModel, deliveryModeModel);
				}
			}
		}

		return false;
	}

	protected boolean isSupportedDeliveryMode(final String deliveryModeCode, final CartModel cartModel)
	{
		final Collection<DeliveryModeModel> supportedDeliveryModes = getDeliveryService().getSupportedDeliveryModeListForOrder(cartModel);
		for (final DeliveryModeModel supportedDeliveryMode : supportedDeliveryModes)
		{
			if (deliveryModeCode.equals(supportedDeliveryMode.getCode()))
			{
				return true;
			}
		}
		return false;
	}

	protected DeliveryModeData convert(final DeliveryModeModel deliveryModeModel)
	{
		if (deliveryModeModel instanceof ZoneDeliveryModeModel)
		{
			final ZoneDeliveryModeModel zoneDeliveryModeModel = (ZoneDeliveryModeModel) deliveryModeModel;
			final CartModel cartModel = getCart();
			if (cartModel != null)
			{
				final ZoneDeliveryModeData zoneDeliveryModeData = getZoneDeliveryModeConverter().convert(zoneDeliveryModeModel);
				final PriceValue deliveryCost = getDeliveryService().getDeliveryCostForDeliveryModeAndAbstractOrder(
						deliveryModeModel, cartModel);
				if (deliveryCost != null)
				{
					zoneDeliveryModeData.setDeliveryCost(getPriceDataFactory().create(PriceDataType.BUY,
							BigDecimal.valueOf(deliveryCost.getValue()), deliveryCost.getCurrencyIso()));
				}
				return zoneDeliveryModeData;
			}
		}
		else
		{
			return getDeliveryModeConverter().convert(deliveryModeModel);
		}

		return null;
	}

	@Override
	public List<CountryData> getDeliveryCountries()
	{
		final List<CountryData> countries = Converters.convertAll(getDeliveryService().getDeliveryCountriesForOrder(null),
				getCountryConverter());
		Collections.sort(countries, CountryComparator.INSTANCE);
		return countries;
	}

	@Override
	public List<CountryData> getBillingCountries()
	{
		final List<CountryData> countries = Converters.convertAll(getCommonI18NService().getAllCountries(), getCountryConverter());
		Collections.sort(countries, CountryComparator.INSTANCE);
		return countries;
	}

	protected static class CountryComparator extends AbstractComparator<CountryData>
	{
		public static final CountryComparator INSTANCE = new CountryComparator();

		@Override
		protected int compareInstances(final CountryData country1, final CountryData country2)
		{
			int result = (country1.getName() != null && country2.getName() != null) ? country1.getName().compareToIgnoreCase(
					country2.getName()) : BEFORE;
			if (EQUAL == result)
			{
				result = country1.getIsocode().compareToIgnoreCase(country2.getIsocode());
			}
			return result;
		}
	}

	@Override
	public boolean containsTaxValues()
	{
		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			if (cartModel.getTotalTaxValues() != null && !cartModel.getTotalTaxValues().isEmpty())
			{
				return true;
			}
			else
			{
				for (final Iterator<AbstractOrderEntryModel> orderEntryModelIterator = cartModel.getEntries().iterator(); orderEntryModelIterator
						.hasNext();)
				{
					final AbstractOrderEntryModel entryModel = orderEntryModelIterator.next();
					if (entryModel.getTaxValues() != null && !entryModel.getTaxValues().isEmpty())
					{
						return true;
					}

				}
			}
		}
		return false;
	}

	@Override
	@Deprecated
	public CountryData getCountryForIsocode(final String countryIso)
	{
		final CountryModel countryModel = getDeliveryService().getCountryForCode(countryIso);
		if (countryModel != null)
		{
			return getCountryConverter().convert(countryModel);
		}

		return null;
	}

	protected CCPaymentInfoData getPaymentDetails()
	{
		final CartModel cart = getCart();
		if (cart != null)
		{
			final PaymentInfoModel paymentInfo = cart.getPaymentInfo();
			if (paymentInfo instanceof CreditCardPaymentInfoModel)
			{
				return getCreditCardPaymentInfoConverter().convert((CreditCardPaymentInfoModel) paymentInfo);
			}
		}

		return null;
	}

	@Override
	public boolean setPaymentDetails(final String paymentInfoId)
	{
		validateParameterNotNullStandardMessage("paymentInfoId", paymentInfoId);

		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			final UserModel currentUser = getCurrentUserForCheckout();
			if (cartModel.getUser().equals(currentUser))
			{
				if (StringUtils.isNotBlank(paymentInfoId))
				{
					final CreditCardPaymentInfoModel ccPaymentInfoModel = getCustomerAccountService().getCreditCardPaymentInfoForCode(
							(CustomerModel) currentUser, paymentInfoId);
					if (ccPaymentInfoModel != null)
					{
						return getCommerceCheckoutService().setPaymentInfo(cartModel, ccPaymentInfoModel);
					}
				}
			}
		}

		return false;
	}

	@Override
	public List<CardTypeData> getSupportedCardTypes()
	{
		final Collection<CardType> cardTypes = getCommerceCardTypeService().getCardTypes();
		return Converters.convertAll(cardTypes, getCardTypeConverter());
	}

	@Override
	public CCPaymentInfoData createPaymentSubscription(final CCPaymentInfoData paymentInfoData)
	{
		validateParameterNotNullStandardMessage("paymentInfoData", paymentInfoData);
		final AddressData billingAddressData = paymentInfoData.getBillingAddress();
		validateParameterNotNullStandardMessage("billingAddress", billingAddressData);

		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			final UserModel currentUser = getCurrentUserForCheckout();
			if (cartModel.getUser().equals(currentUser))
			{
				final CardInfo cardInfo = new CardInfo();
				cardInfo.setCardHolderFullName(paymentInfoData.getAccountHolderName());
				cardInfo.setCardNumber(paymentInfoData.getCardNumber());
				final CardType cardType = getCommerceCardTypeService().getCardTypeForCode(paymentInfoData.getCardType());
				final CreditCardType creditCardType = (cardType == null ? null : cardType.getCode());
				cardInfo.setCardType(creditCardType);
				cardInfo.setExpirationMonth(Integer.valueOf(paymentInfoData.getExpiryMonth()));
				cardInfo.setExpirationYear(Integer.valueOf(paymentInfoData.getExpiryYear()));
				cardInfo.setIssueNumber(paymentInfoData.getIssueNumber());

				final BillingInfo billingInfo = new BillingInfo();
				billingInfo.setCity(billingAddressData.getTown());
				if (billingAddressData.getCountry() != null)
				{
					billingInfo.setCountry(billingAddressData.getCountry().getIsocode());
				}
				billingInfo.setFirstName(billingAddressData.getFirstName());
				billingInfo.setLastName(billingAddressData.getLastName());
				billingInfo.setEmail(billingAddressData.getEmail());
				billingInfo.setPhoneNumber(billingAddressData.getPhone());
				billingInfo.setPostalCode(billingAddressData.getPostalCode());
				billingInfo.setStreet1(billingAddressData.getLine1());
				billingInfo.setStreet2(billingAddressData.getLine2());

				final CustomerModel customerModel = getCurrentUserForCheckout();

				final CreditCardPaymentInfoModel ccPaymentInfoModel = getCustomerAccountService().createPaymentSubscription(
						customerModel, cardInfo, billingInfo, billingAddressData.getTitleCode(), getPaymentProvider(),
						paymentInfoData.isSaved());
				if (ccPaymentInfoModel != null)
				{
					return getCreditCardPaymentInfoConverter().convert(ccPaymentInfoModel);
				}
			}
		}

		return null;
	}

	@Override
	public boolean authorizePayment(final String securityCode)
	{
		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			final UserModel currentUser = getCurrentUserForCheckout();
			if (cartModel.getUser().equals(currentUser))
			{
				final CreditCardPaymentInfoModel creditCardPaymentInfoModel = (CreditCardPaymentInfoModel) cartModel.getPaymentInfo();
				if (creditCardPaymentInfoModel != null && StringUtils.isNotBlank(creditCardPaymentInfoModel.getSubscriptionId()))
				{
					final PaymentTransactionEntryModel paymentTransactionEntryModel = getCommerceCheckoutService().authorizePayment(
							cartModel, securityCode, getPaymentProvider());

					return paymentTransactionEntryModel != null
							&& (TransactionStatus.ACCEPTED.name().equals(paymentTransactionEntryModel.getTransactionStatus()) || TransactionStatus.REVIEW
									.name().equals(paymentTransactionEntryModel.getTransactionStatus()));
				}
			}
		}

		return false;
	}

	@Override
	public OrderData placeOrder() throws InvalidCartException
	{
		final CartModel cartModel = getCart();
		if (cartModel != null)
		{
			final UserModel currentUser = getCurrentUserForCheckout();
			if (cartModel.getUser().equals(currentUser) || getCheckoutCustomerStrategy().isAnonymousCheckout())
			{
				beforePlaceOrder(cartModel);

				final OrderModel orderModel = placeOrder(cartModel);

				afterPlaceOrder(cartModel, orderModel);

				// Convert the order to an order data
				if (orderModel != null)
				{
					return getOrderConverter().convert(orderModel);
				}
			}
		}

		return null;
	}

	protected void beforePlaceOrder(final CartModel cartModel)
	{
		// Do nothing, extension point
	}

	protected OrderModel placeOrder(final CartModel cartModel) throws InvalidCartException
	{
		return getCommerceCheckoutService().placeOrder(cartModel);
	}

	protected void afterPlaceOrder(final CartModel cartModel, final OrderModel orderModel)
	{
		if (orderModel != null)
		{
			// Remove cart
			getCartService().removeSessionCart();
			getModelService().refresh(orderModel);
			//clean previous card because it can be restored after next login
			getCartFacade().cleanSavedCart();
		}
	}

	@Override
	public boolean removeDeliveryAddress()
	{
		final CartModel cartModel = getCart();

		if (cartModel != null)
		{
			return getCommerceCheckoutService().setDeliveryAddress(cartModel, null);
		}

		return false;
	}

	@Override
	public boolean removeDeliveryMode()
	{
		final CartModel cartModel = getCart();

		if (cartModel != null)
		{
			return getCommerceCheckoutService().removeDeliveryMode(cartModel);
		}

		return false;
	}


	@Override
	public AddressData getAddressDataForId(final String addressId, final boolean visibleAddressesOnly)
	{
		validateParameterNotNullStandardMessage("addressId", addressId);

		AddressData addressData = null;
		final List<? extends AddressData> deliveryAddresses = getSupportedDeliveryAddresses(visibleAddressesOnly);
		for (final AddressData deliveryAddress : deliveryAddresses)
		{
			if (deliveryAddress.getId().equals(addressId))
			{
				addressData = deliveryAddress;
				break;
			}
		}
		return addressData;
	}


	protected String getPaymentProvider()
	{
		return getCommerceCheckoutService().getPaymentProvider();
	}

	protected CartFacade getCartFacade()
	{
		return cartFacade;
	}

	protected CustomerModel getCurrentUserForCheckout()
	{
		return getCheckoutCustomerStrategy().getCurrentUserForCheckout();
	}

	@Required
	public void setCartFacade(final CartFacade cartFacade)
	{
		this.cartFacade = cartFacade;
	}

	protected <T extends CartService> T getCartService()
	{
		return (T) cartService;
	}

	@Required
	public void setCartService(final CartService cartService)
	{
		this.cartService = cartService;
	}

	protected Converter<AddressModel, AddressData> getAddressConverter()
	{
		return addressConverter;
	}

	@Required
	public void setAddressConverter(final Converter<AddressModel, AddressData> addressConverter)
	{
		this.addressConverter = addressConverter;
	}

	protected Populator<AddressData, AddressModel> getAddressReversePopulator()
	{
		return addressReversePopulator;
	}

	@Required
	public void setAddressReversePopulator(final Populator<AddressData, AddressModel> addressReversePopulator)
	{
		this.addressReversePopulator = addressReversePopulator;
	}

	protected DeliveryService getDeliveryService()
	{
		return deliveryService;
	}

	@Required
	public void setDeliveryService(final DeliveryService deliveryService)
	{
		this.deliveryService = deliveryService;
	}

	protected UserService getUserService()
	{
		return userService;
	}

	@Required
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	protected PriceDataFactory getPriceDataFactory()
	{
		return priceDataFactory;
	}

	@Required
	public void setPriceDataFactory(final PriceDataFactory priceDataFactory)
	{
		this.priceDataFactory = priceDataFactory;
	}

	protected CommerceCheckoutService getCommerceCheckoutService()
	{
		return commerceCheckoutService;
	}

	@Required
	public void setCommerceCheckoutService(final CommerceCheckoutService commerceCheckoutService)
	{
		this.commerceCheckoutService = commerceCheckoutService;
	}

	protected EnumerationService getEnumerationService()
	{
		return enumerationService;
	}

	@Required
	public void setEnumerationService(final EnumerationService enumerationService)
	{
		this.enumerationService = enumerationService;
	}

	public CommerceCardTypeService getCommerceCardTypeService()
	{
		return commerceCardTypeService;
	}

	@Required
	public void setCommerceCardTypeService(final CommerceCardTypeService commerceCardTypeService)
	{
		this.commerceCardTypeService = commerceCardTypeService;
	}

	protected CustomerAccountService getCustomerAccountService()
	{
		return customerAccountService;
	}

	@Required
	public void setCustomerAccountService(final CustomerAccountService customerAccountService)
	{
		this.customerAccountService = customerAccountService;
	}

	protected Converter<CreditCardPaymentInfoModel, CCPaymentInfoData> getCreditCardPaymentInfoConverter()
	{
		return creditCardPaymentInfoConverter;
	}

	@Required
	public void setCreditCardPaymentInfoConverter(
			final Converter<CreditCardPaymentInfoModel, CCPaymentInfoData> creditCardPaymentInfoConverter)
	{
		this.creditCardPaymentInfoConverter = creditCardPaymentInfoConverter;
	}

	protected Converter<DeliveryModeModel, DeliveryModeData> getDeliveryModeConverter()
	{
		return deliveryModeConverter;
	}

	@Required
	public void setDeliveryModeConverter(final Converter<DeliveryModeModel, DeliveryModeData> deliveryModeConverter)
	{
		this.deliveryModeConverter = deliveryModeConverter;
	}

	protected Converter<ZoneDeliveryModeModel, ZoneDeliveryModeData> getZoneDeliveryModeConverter()
	{
		return zoneDeliveryModeConverter;
	}

	@Required
	public void setZoneDeliveryModeConverter(final Converter<ZoneDeliveryModeModel, ZoneDeliveryModeData> zoneDeliveryModeConverter)
	{
		this.zoneDeliveryModeConverter = zoneDeliveryModeConverter;
	}

	protected Converter<OrderModel, OrderData> getOrderConverter()
	{
		return orderConverter;
	}

	public void setOrderConverter(final Converter<OrderModel, OrderData> orderConverter)
	{
		this.orderConverter = orderConverter;
	}

	protected ModelService getModelService()
	{
		return modelService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	public CommonI18NService getCommonI18NService()
	{
		return commonI18NService;
	}

	@Required
	public void setCommonI18NService(final CommonI18NService commonI18NService)
	{
		this.commonI18NService = commonI18NService;
	}

	protected Converter<CardType, CardTypeData> getCardTypeConverter()
	{
		return cardTypeConverter;
	}

	@Required
	public void setCardTypeConverter(final Converter<CardType, CardTypeData> cardTypeConverter)
	{
		this.cardTypeConverter = cardTypeConverter;
	}

	public CheckoutCustomerStrategy getCheckoutCustomerStrategy()
	{
		return checkoutCustomerStrategy;
	}

	@Required
	public void setCheckoutCustomerStrategy(final CheckoutCustomerStrategy checkoutCustomerStrategy)
	{
		this.checkoutCustomerStrategy = checkoutCustomerStrategy;
	}

	protected Converter<CountryModel, CountryData> getCountryConverter()
	{
		return countryConverter;
	}

	@Required
	public void setCountryConverter(final Converter<CountryModel, CountryData> countryConverter)
	{
		this.countryConverter = countryConverter;
	}
}
