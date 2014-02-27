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
package de.hybris.platform.acceleratorservices.payment.cybersource.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.acceleratorservices.config.SiteConfigService;
import de.hybris.platform.acceleratorservices.model.payment.CCPaySubValidationModel;
import de.hybris.platform.acceleratorservices.payment.PaymentService;
import de.hybris.platform.acceleratorservices.payment.cybersource.constants.CyberSourceConstants;
import de.hybris.platform.acceleratorservices.payment.cybersource.constants.CyberSourceV7HopConstants;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.CreateSubscriptionRequest;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.CreateSubscriptionResult;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.CustomerBillToData;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.CustomerInfoData;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.CustomerShipToData;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.OrderInfoData;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.OrderPageAppearanceData;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.OrderPageConfirmationData;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.PaymentInfoData;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.SignatureData;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.SubscriptionInfoData;
import de.hybris.platform.acceleratorservices.payment.cybersource.data.SubscriptionSignatureData;
import de.hybris.platform.acceleratorservices.payment.cybersource.enums.CardTypeEnum;
import de.hybris.platform.acceleratorservices.payment.cybersource.enums.DecisionsEnum;
import de.hybris.platform.acceleratorservices.payment.cybersource.enums.SubscriptionFrequencyEnum;
import de.hybris.platform.acceleratorservices.payment.cybersource.enums.TransactionTypeEnum;
import de.hybris.platform.acceleratorservices.payment.cybersource.strategies.ErroCodeToFormFieldMappingStrategy;
import de.hybris.platform.acceleratorservices.payment.cybersource.strategies.PaymentFormActionUrlStrategy;
import de.hybris.platform.acceleratorservices.payment.cybersource.strategies.PaymentResponseInterpretationStrategy;
import de.hybris.platform.acceleratorservices.payment.cybersource.utils.DigestUtils;
import de.hybris.platform.acceleratorservices.payment.dao.CreditCardPaymentSubscriptionDao;
import de.hybris.platform.acceleratorservices.payment.data.PaymentData;
import de.hybris.platform.acceleratorservices.payment.data.PaymentErrorField;
import de.hybris.platform.acceleratorservices.payment.data.PaymentSubscriptionResultItem;
import de.hybris.platform.commerceservices.customer.CustomerEmailResolutionService;
import de.hybris.platform.commerceservices.order.CommerceCheckoutService;
import de.hybris.platform.core.enums.CreditCardType;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.payment.dto.TransactionStatus;
import de.hybris.platform.payment.dto.TransactionStatusDetails;
import de.hybris.platform.payment.enums.PaymentTransactionType;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;
import de.hybris.platform.payment.model.PaymentTransactionModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.user.UserService;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.Assert;


public class CyberSourceAcceleratorPaymentService implements PaymentService
{
	private static final Logger LOG = Logger.getLogger(CyberSourceAcceleratorPaymentService.class);
	private static final String VERSION = "7";
	private static final String REVIEW_DECISION_EVENT_NAME = "_ReviewDecision";
	private static final String DEFAULT_CLIENTREF_ID = "Default_Client_Ref";
	private static final String CARD_VERIFICATION_NUMBER = "card_cvNumber";

	private CartService cartService;
	private CommerceCheckoutService commerceCheckoutService;
	private CustomerEmailResolutionService customerEmailResolutionService;
	private FlexibleSearchService flexibleSearchService;
	private ModelService modelService;
	private UserService userService;
	private CreditCardPaymentSubscriptionDao creditCardPaymentSubscriptionDao;

	private SiteConfigService siteConfigService;
	private BusinessProcessService businessProcessService;

	private PaymentResponseInterpretationStrategy paymentResponseInterpretation;
	private PaymentResponseInterpretationStrategy hopPaymentResponseInterpretation;
	private PaymentFormActionUrlStrategy paymentFormActionUrlStrategy;

	private Converter<AddressModel, CustomerBillToData> customerBillToDataConverter;
	private Converter<CartModel, CustomerShipToData> customerShipToDataConverter;
	private Converter<CreateSubscriptionRequest, PaymentData> PaymentDataConverter;
	private Converter<CreditCardPaymentInfoModel, PaymentInfoData> paymentInfoDataConverter;
	private Converter<Map<String, String>, CreateSubscriptionResult> createSubscriptionResultConverter;
	private ErroCodeToFormFieldMappingStrategy erroCodeToFormFieldMappingStrategy;
	private CommonI18NService commonI18NService;

	/**
	 * Gets the CyberSource setup fee, currently populated by a config value.
	 * 
	 * @return the CyberSource setup fee amount
	 */
	protected BigDecimal getSetupFeeAmount()
	{
		final String configSetupFee = getSiteConfigProperty(CyberSourceConstants.HopProperties.HOP_SETUP_FEE);
		if (configSetupFee != null && !configSetupFee.isEmpty())
		{
			try
			{
				final DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance();
				formatter.setParseBigDecimal(true);
				return (BigDecimal) formatter.parse(configSetupFee);
			}
			catch (final Exception e)
			{
				LOG.debug("Error converting to BigDecimal of String value: " + configSetupFee, e);
			}
		}
		return null;
	}

	/**
	 * Gets the CyberSource merchant ID.
	 * 
	 * @return the CyberSource merchant ID
	 */
	protected String getMerchantId()
	{
		return getSiteConfigProperty(CyberSourceConstants.HopProperties.MERCHANT_ID);
	}

	/**
	 * Gets the CyberSource merchant's serial number that is used to encrypt and validate connections.
	 * 
	 * @return the serial number downloaded from the CyberSource Business Centre.
	 */
	protected String getSerialNumber()
	{
		return getSiteConfigProperty(CyberSourceConstants.HopProperties.SERIAL_NUMBER);
	}

	/**
	 * Gets the CyberSource merchant's shared secret that is used to encrypt and validate connections.
	 * 
	 * @return the shared secret downloaded from the CyberSource Business Centre.
	 */
	protected String getSharedSecret()
	{
		return getSiteConfigProperty(CyberSourceConstants.HopProperties.SHARED_SECRET);
	}

	protected boolean validateSignature(final String data, final String signature)
	{
		try
		{
			final String computedSignature = DigestUtils.getPublicDigest(data, getSharedSecret());
			return computedSignature.equals(signature);
		}
		catch (final Exception ex)
		{
			LOG.info("Failed to compute signature", ex);
		}
		return false;
	}

	/**
	 * This method is used to get the ISO currency code configured for the CyberSource Test Hosted Order Page configured
	 * in the Business Centre. This may be different to the currency being used for the live account.
	 * 
	 * @return a three character representing the currency ISO code.
	 */
	protected String getHostedOrderPageTestCurrency()
	{
		return getSiteConfigProperty(CyberSourceConstants.HopProperties.HOP_TEST_CURRENCY);
	}

	protected String getSiteConfigProperty(final String key)
	{
		return getSiteConfigService().getString(key, "");
	}

	@Override
	public PaymentData beginHopCreatePaymentSubscription(final String siteName, final String responseUrl,
			final String merchantCallbackUrl, final CustomerModel customer, final CreditCardPaymentInfoModel cardInfo,
			final AddressModel paymentAddress) throws IllegalArgumentException
	{
		final String requestUrl = getPaymentFormActionUrlStrategy().getHopRequestUrl();

		final CreateSubscriptionRequest request = getCreateSubscriptionRequestData(siteName, requestUrl, responseUrl,
				merchantCallbackUrl, customer, cardInfo, paymentAddress);

		PaymentData data = getPaymentDataConverter().convert(request);
		if (data == null)
		{
			data = new PaymentData();
			data.setParameters(new HashMap<String, String>());
		}

		return data;
	}

	@Override
	public PaymentData beginSopCreatePaymentSubscription(final String siteName, final String responseUrl,
			final String merchantCallbackUrl, final CustomerModel customer, final CreditCardPaymentInfoModel cardInfo,
			final AddressModel paymentAddress) throws IllegalArgumentException
	{
		final String requestUrl = getPaymentFormActionUrlStrategy().getSopRequestUrl(getClientRef());

		Assert.notNull(requestUrl, "The SopRequestUrl cannot be null");

		final CreateSubscriptionRequest request = getCreateSubscriptionRequestData(siteName, requestUrl, responseUrl,
				merchantCallbackUrl, customer, cardInfo, paymentAddress);

		PaymentData data = getPaymentDataConverter().convert(request);
		if (data == null)
		{
			data = new PaymentData();
			data.setParameters(new HashMap<String, String>());
		}

		return data;
	}

	@Override
	public PaymentSubscriptionResultItem completeHopCreatePaymentSubscription(final CustomerModel customerModel,
			final boolean saveInAccount, final Map<String, String> parameters) throws IllegalArgumentException
	{
		final Map<String, PaymentErrorField> errors = new HashMap<String, PaymentErrorField>();
		final CreateSubscriptionResult response = getHopPaymentResponseInterpretation().interpretResponse(parameters, null, errors);

		validateParameterNotNull(response, "CreateSubscriptionResult cannot be null");
		Assert.notNull(response.getDecision(), "Decision cannot be null");
		Assert.notNull(response.getAuthReplyData(), "AuthReplyData cannot be null");
		Assert.notNull(response.getCustomerInfoData(), "CustomerInfoData cannot be null");
		Assert.notNull(response.getOrderInfoData(), "OrderInfoData cannot be null");
		Assert.notNull(response.getPaymentInfoData(), "PaymentInfoData cannot be null");
		Assert.notNull(response.getSignatureData(), "SignatureData cannot be null");
		Assert.notNull(response.getSubscriptionInfoData(), "SubscriptionInfoData cannot be null");
		Assert.notNull(response.getSubscriptionSignatureData(), "SubscriptionSignatureData cannot be null");

		final PaymentSubscriptionResultItem paymentSubscriptionResult = new PaymentSubscriptionResultItem();
		paymentSubscriptionResult.setSuccess(DecisionsEnum.ACCEPT.name().equalsIgnoreCase(response.getDecision()));
		paymentSubscriptionResult.setDecision(String.valueOf(response.getDecision()));
		paymentSubscriptionResult.setResultCode(String.valueOf(response.getReasonCode()));

		if (DecisionsEnum.ACCEPT.name().equalsIgnoreCase(response.getDecision()))
		{
			// Validate signature
			if (validateSignature(response.getSubscriptionInfoData().getSubscriptionSignedValue(), response
					.getSubscriptionInfoData().getSubscriptionIDPublicSignature()))
			{
				savePaymentTransactionEntry(customerModel, response.getRequestId(), response.getOrderInfoData());
				final CreditCardPaymentInfoModel cardPaymentInfoModel = saveSubscription(customerModel,
						response.getCustomerInfoData(), response.getSubscriptionInfoData(), response.getPaymentInfoData(),
						saveInAccount);
				paymentSubscriptionResult.setStoredCard(cardPaymentInfoModel);

				// Check if the subscription has already been validated
				final CCPaySubValidationModel subscriptionValidation = getCreditCardPaymentSubscriptionDao()
						.findSubscriptionValidationBySubscription(cardPaymentInfoModel.getSubscriptionId());
				if (subscriptionValidation != null)
				{
					cardPaymentInfoModel.setSubscriptionValidated(true);
					getModelService().save(cardPaymentInfoModel);
					getModelService().remove(subscriptionValidation);
				}
			}
			else
			{
				LOG.error("Cannot create subscription. Subscription signature does not match.");
			}
		}
		else
		{
			LOG.error("Cannot create subscription. Decision: " + response.getDecision() + " - Reason Code: "
					+ response.getReasonCode());
			paymentSubscriptionResult.setErrors(errors);
		}
		return paymentSubscriptionResult;
	}

	@Override
	public PaymentSubscriptionResultItem completeSopCreatePaymentSubscription(final CustomerModel customerModel,
			final boolean saveInAccount, final Map<String, String> parameters) throws IllegalArgumentException
	{
		final PaymentSubscriptionResultItem paymentSubscriptionResult = new PaymentSubscriptionResultItem();
		final Map<String, PaymentErrorField> errors = new HashMap<String, PaymentErrorField>();

		final CreateSubscriptionResult response = getPaymentResponseInterpretation().interpretResponse(parameters, getClientRef(),
				errors);
		paymentSubscriptionResult.setErrors(errors);
		validateParameterNotNull(response, "CreateSubscriptionResult cannot be null");
		validateParameterNotNull(response.getDecision(), "Decision cannot be null");

		// check cvv2 number
		if (!DecisionsEnum.ERROR.name().equals(response.getDecision())
				&& !response.getAuthReplyData().getCvnDecision().booleanValue())
		{
			getOrCreatePaymentErrorField(errors, CARD_VERIFICATION_NUMBER).setInvalid(true);
			return paymentSubscriptionResult;
		}

		final Map<Integer, String> pspErrors = response.getErrors();
		if (pspErrors != null)
		{
			for (final Integer key : pspErrors.keySet())
			{
				final List<String> errorFields = getErroCodeToFormFieldMappingStrategy().getFieldForErrorCode(key);
				if (errorFields != null)
				{
					for (final String errorField : errorFields)
					{
						getOrCreatePaymentErrorField(errors, errorField).setInvalid(true);
					}
				}
			}

			if (!errors.isEmpty())
			{
				return paymentSubscriptionResult;
			}
		}

		paymentSubscriptionResult.setSuccess(DecisionsEnum.ACCEPT.name().equalsIgnoreCase(response.getDecision()));
		paymentSubscriptionResult.setDecision(String.valueOf(response.getDecision()));
		paymentSubscriptionResult.setResultCode(String.valueOf(response.getReasonCode()));

		if (DecisionsEnum.ACCEPT.name().equalsIgnoreCase(response.getDecision()))
		{
			// in case of ACCEPT we should have all these fields filled out
			Assert.notNull(response.getAuthReplyData(), "AuthReplyData cannot be null");
			Assert.notNull(response.getCustomerInfoData(), "CustomerInfoData cannot be null");
			Assert.notNull(response.getOrderInfoData(), "OrderInfoData cannot be null");
			Assert.notNull(response.getPaymentInfoData(), "PaymentInfoData cannot be null");
			Assert.notNull(response.getSignatureData(), "SignatureData cannot be null");
			Assert.notNull(response.getSubscriptionInfoData(), "SubscriptionInfoData cannot be null");
			Assert.notNull(response.getSubscriptionSignatureData(), "SubscriptionSignatureData cannot be null");

			// Validate signature
			if (validateSignature(response.getSubscriptionInfoData().getSubscriptionSignedValue(), response
					.getSubscriptionInfoData().getSubscriptionIDPublicSignature()))
			{
				savePaymentTransactionEntry(customerModel, response.getRequestId(), response.getOrderInfoData());
				final CreditCardPaymentInfoModel cardPaymentInfoModel = saveSubscription(customerModel,
						response.getCustomerInfoData(), response.getSubscriptionInfoData(), response.getPaymentInfoData(),
						saveInAccount);
				paymentSubscriptionResult.setStoredCard(cardPaymentInfoModel);

				// Check if the subscription has already been validated
				final CCPaySubValidationModel subscriptionValidation = getCreditCardPaymentSubscriptionDao()
						.findSubscriptionValidationBySubscription(cardPaymentInfoModel.getSubscriptionId());
				if (subscriptionValidation != null)
				{
					cardPaymentInfoModel.setSubscriptionValidated(true);
					getModelService().save(cardPaymentInfoModel);
					getModelService().remove(subscriptionValidation);
				}
			}
			else
			{
				LOG.error("Cannot create subscription. Subscription signature does not match.");
			}
		}
		else
		{
			LOG.error("Cannot create subscription. Decision: " + response.getDecision() + " - Reason Code: "
					+ response.getReasonCode());
		}
		return paymentSubscriptionResult;
	}

	protected PaymentErrorField getOrCreatePaymentErrorField(final Map<String, PaymentErrorField> errors, final String fieldName)
	{
		if (errors.containsKey(fieldName))
		{
			return errors.get(fieldName);
		}
		final PaymentErrorField result = new PaymentErrorField();
		result.setName(fieldName);
		errors.put(fieldName, result);
		return result;
	}

	protected String getClientRef()
	{
		if (getCartService().hasSessionCart())
		{
			return getCartService().getSessionCart().getGuid();
		}
		return DEFAULT_CLIENTREF_ID;
	}

	@Override
	public void handleCreateSubscriptionCallback(final Map<String, String> parameters)
	{
		parameters.put("VerifyTransactionSignature()", "true");
		final Map<String, PaymentErrorField> errors = new HashMap<String, PaymentErrorField>();
		final CreateSubscriptionResult response = getPaymentResponseInterpretation().interpretResponse(parameters, getClientRef(),
				errors);

		if (errors.isEmpty())
		{
			validateParameterNotNull(response, "CreateSubscriptionResult cannot be null");
			Assert.notNull(response.getDecision(), "Decision cannot be null");
			Assert.notNull(response.getAuthReplyData(), "AuthReplyData cannot be null");
			Assert.notNull(response.getCustomerInfoData(), "CustomerInfoData cannot be null");
			Assert.notNull(response.getOrderInfoData(), "OrderInfoData cannot be null");
			Assert.notNull(response.getPaymentInfoData(), "PaymentInfoData cannot be null");
			Assert.notNull(response.getSignatureData(), "SignatureData cannot be null");
			Assert.notNull(response.getSubscriptionInfoData(), "SubscriptionInfoData cannot be null");
			Assert.notNull(response.getSubscriptionSignatureData(), "SubscriptionSignatureData cannot be null");

			if (DecisionsEnum.ACCEPT.name().equalsIgnoreCase(response.getDecision()))
			{
				// Validate signature
				if (validateSignature(response.getSubscriptionInfoData().getSubscriptionSignedValue(), response
						.getSubscriptionInfoData().getSubscriptionIDPublicSignature()))
				{
					// Look to see if there is already a CreditCardPaymentInfoModel with that SubscriptionID
					final String subscriptionID = response.getSubscriptionInfoData().getSubscriptionID();
					final CreditCardPaymentInfoModel paymentInfo = getCreditCardPaymentSubscriptionDao()
							.findCreditCartPaymentBySubscription(subscriptionID);
					if (paymentInfo != null)
					{
						// Mark the CreditCardPaymentInfoModel as validated
						paymentInfo.setSubscriptionValidated(true);
						getModelService().save(paymentInfo);
					}
					else
					{
						// No CreditCardPaymentInfoModel exists yet, create a CCPaySubValidationModel to store the validated subscription ID
						final CCPaySubValidationModel subscriptionInfo = getModelService().create(CCPaySubValidationModel.class);
						subscriptionInfo.setSubscriptionId(subscriptionID);
						getModelService().save(subscriptionInfo);
					}
				}
				else
				{
					LOG.error(String
							.format(
									"Cannot create subscription. Subscription signature does not match SubscriptionSignedValue=%s SubscriptionIDPublicSignature=%s",
									response.getSubscriptionInfoData().getSubscriptionSignedValue(), response.getSubscriptionInfoData()
											.getSubscriptionIDPublicSignature()));
				}
			}
		}
	}

	@SuppressWarnings("unused")
	protected CreateSubscriptionRequest getCreateSubscriptionRequestData(final String siteName, final String requestUrl,
			final String responseUrl, final String merchantCallbackUrl, final CustomerModel customerModel,
			final CreditCardPaymentInfoModel cardInfo, final AddressModel paymentAddress) throws IllegalArgumentException
	{
		final CartModel cartModel = getCartService().getSessionCart();
		if (cartModel == null)
		{
			return null;
		}

		final CreateSubscriptionRequest request = new CreateSubscriptionRequest();
		//Common Data
		request.setRequestId(UUID.randomUUID().toString());
		request.setSiteName(siteName);
		request.setRequestUrl(requestUrl);

		//Version Specific Data using converters
		request.setCustomerBillToData(getCustomerBillToDataConverter().convert(paymentAddress));
		setEmailAddress(request.getCustomerBillToData(), customerModel);
		request.setCustomerShipToData(getCustomerShipToDataConverter().convert(cartModel));
		request.setPaymentInfoData(getPaymentInfoDataConverter().convert(cardInfo));

		//In-line Version Specific Data
		request.setOrderInfoData(getRequestOrderInfoData(TransactionTypeEnum.subscription));
		request.setSignatureData(getRequestSignatureData());
		request.setSubscriptionSignatureData(getRequestSubscriptionSignatureData(SubscriptionFrequencyEnum.ON_DEMAND));
		request.setOrderPageAppearanceData(getHostedOrderPageAppearanceConfiguration());
		request.setOrderPageConfirmationData(getOrderPageConfirmationData(responseUrl, merchantCallbackUrl));

		return request;
	}

	protected void setEmailAddress(final CustomerBillToData customerBillToData, final CustomerModel customer)
	{
		if (customerBillToData.getBillToEmail() == null || customerBillToData.getBillToEmail().isEmpty())
		{
			customerBillToData.setBillToEmail(getCustomerEmailResolutionService().getEmailForCustomer(customer));
		}

	}

	protected OrderInfoData getRequestOrderInfoData(final TransactionTypeEnum transactionType)
	{
		final OrderInfoData data = new OrderInfoData();

		data.setOrderPageIgnoreAVS(Boolean.TRUE);
		data.setOrderPageIgnoreCVN(Boolean.TRUE);
		data.setOrderPageTransactionType(transactionType.name());

		return data;
	}

	protected SignatureData getRequestSignatureData()
	{
		final SignatureData data = new SignatureData();

		final CartModel cartModel = getCartService().getSessionCart();
		if (cartModel == null)
		{
			return null;
		}

		if (StringUtils.isNotEmpty(getHostedOrderPageTestCurrency()))
		{
			data.setCurrency(getHostedOrderPageTestCurrency());
		}
		else
		{
			data.setCurrency(cartModel.getCurrency().getIsocode());

		}

		data.setAmount(getSetupFeeAmount());
		data.setMerchantID(getMerchantId());
		data.setOrderPageSerialNumber(getSerialNumber());
		data.setOrderPageVersion(getHostedOrderPageVersion());
		data.setSharedSecret(getSharedSecret());

		return data;
	}

	protected SubscriptionSignatureData getRequestSubscriptionSignatureData(final SubscriptionFrequencyEnum frequencyEnum)
	{
		final SubscriptionSignatureData data = new SubscriptionSignatureData();

		final SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());

		data.setRecurringSubscriptionInfoAmount(BigDecimal.valueOf(0));
		data.setRecurringSubscriptionInfoAutomaticRenew(Boolean.FALSE);
		data.setRecurringSubscriptionInfoFrequency(frequencyEnum.getStringValue());
		data.setRecurringSubscriptionInfoNumberOfPayments(Integer.valueOf(0));
		data.setRecurringSubscriptionInfoStartDate(formatter.format(new Date()));
		data.setSharedSecret(getSharedSecret());

		return data;
	}

	protected OrderPageAppearanceData getHostedOrderPageAppearanceConfiguration()
	{
		final OrderPageAppearanceData data = new OrderPageAppearanceData();

		data.setOrderPageBackgroundImageURL(getSiteConfigProperty(CyberSourceV7HopConstants.HopAppearanceProperties.BACKGROUND_URL));
		data.setOrderPageBackgroundImageURL(getSiteConfigProperty(CyberSourceV7HopConstants.HopAppearanceProperties.BACKGROUND_URL));
		data.setOrderPageBarColor(getSiteConfigProperty(CyberSourceV7HopConstants.HopAppearanceProperties.BAR_COLOR));
		data.setOrderPageBarTextColor(getSiteConfigProperty(CyberSourceV7HopConstants.HopAppearanceProperties.BAR_TEXT_COLOR));
		data.setOrderPageColorScheme(getSiteConfigProperty(CyberSourceV7HopConstants.HopAppearanceProperties.COLOR_SCHEME));
		data.setOrderPageMessageBoxBackgroundColor(getSiteConfigProperty(CyberSourceV7HopConstants.HopAppearanceProperties.MESSAGE_BOX_BACKGROUND_COLOR));
		data.setOrderPageRequiredFieldColor(getSiteConfigProperty(CyberSourceV7HopConstants.HopAppearanceProperties.REQUIRED_FIELD_COLOR));

		return data;
	}

	protected OrderPageConfirmationData getOrderPageConfirmationData(final String responseUrl, final String merchantCallbackUrl)
	{
		final OrderPageConfirmationData data = new OrderPageConfirmationData();
		data.setCancelResponseUrl(responseUrl);
		data.setDeclineResponseUrl(responseUrl);
		data.setReceiptResponseUrl(responseUrl);
		data.setMerchantUrlPostAddress(merchantCallbackUrl);
		return data;
	}

	protected PaymentTransactionEntryModel savePaymentTransactionEntry(final CustomerModel customerModel, final String requestId,
			final OrderInfoData orderInfoData)
	{
		validateParameterNotNull(orderInfoData, "orderInfoData cannot be null");

		final PaymentTransactionModel transaction = getModelService().create(PaymentTransactionModel.class);
		transaction.setCode(customerModel.getUid() + "_" + UUID.randomUUID());
		transaction.setRequestId(requestId);
		transaction.setRequestToken(orderInfoData.getOrderPageRequestToken());
		transaction.setPaymentProvider(getCommerceCheckoutService().getPaymentProvider());
		getModelService().save(transaction);

		final PaymentTransactionEntryModel entry = getModelService().create(PaymentTransactionEntryModel.class);
		entry.setType(PaymentTransactionType.CREATE_SUBSCRIPTION);
		entry.setRequestId(requestId);
		entry.setRequestToken(orderInfoData.getOrderPageRequestToken());
		entry.setTime(new Date());
		entry.setPaymentTransaction(transaction);
		entry.setTransactionStatus(TransactionStatus.ACCEPTED.name());
		entry.setTransactionStatusDetails(TransactionStatusDetails.SUCCESFULL.name());

		final String newEntryCode;
		if (transaction.getEntries() == null)
		{
			newEntryCode = transaction.getCode() + "-1";
		}
		else
		{
			newEntryCode = transaction.getCode() + "-" + (transaction.getEntries().size() + 1);
		}

		entry.setCode(newEntryCode);
		getModelService().save(entry);
		return entry;
	}

	protected CreditCardPaymentInfoModel saveSubscription(final CustomerModel customerModel,
			final CustomerInfoData customerInfoData, final SubscriptionInfoData subscriptionInfo,
			final PaymentInfoData paymentInfoData, final boolean saveInAccount)
	{
		validateParameterNotNull(customerInfoData, "customerInfoData cannot be null");
		validateParameterNotNull(subscriptionInfo, "subscriptionInfo cannot be null");
		validateParameterNotNull(paymentInfoData, "paymentInfoData cannot be null");

		final AddressModel billingAddress = getModelService().create(AddressModel.class);
		billingAddress.setFirstname(customerInfoData.getBillToFirstName());
		billingAddress.setLastname(customerInfoData.getBillToLastName());
		billingAddress.setLine1(customerInfoData.getBillToStreet1());
		billingAddress.setLine2(customerInfoData.getBillToStreet2());
		billingAddress.setTown(customerInfoData.getBillToCity());
		billingAddress.setPostalcode(customerInfoData.getBillToPostalCode());

		final CountryModel country = getCommonI18NService().getCountry(customerInfoData.getBillToCountry());
		billingAddress.setCountry(country);
		if (StringUtils.isNotEmpty(customerInfoData.getBillToState()))
		{
			billingAddress.setRegion(getCommonI18NService().getRegion(country,
					country.getIsocode() + "-" + customerInfoData.getBillToState()));
		}
		final String email = getCustomerEmailResolutionService().getEmailForCustomer(customerModel);
		billingAddress.setEmail(email);

		final CreditCardPaymentInfoModel cardPaymentInfoModel = createCustomerCardInfo(subscriptionInfo, paymentInfoData,
				billingAddress, customerModel, saveInAccount);

		billingAddress.setOwner(cardPaymentInfoModel);

		getModelService().saveAll(cardPaymentInfoModel, billingAddress);
		getModelService().refresh(customerModel);

		final List<PaymentInfoModel> paymentInfoModels = new ArrayList<PaymentInfoModel>(customerModel.getPaymentInfos());
		if (!paymentInfoModels.contains(cardPaymentInfoModel))
		{
			paymentInfoModels.add(cardPaymentInfoModel);
			if (saveInAccount)
			{
				customerModel.setPaymentInfos(paymentInfoModels);
				getModelService().save(customerModel);
			}

			getModelService().save(cardPaymentInfoModel);
			getModelService().refresh(customerModel);
		}

		return cardPaymentInfoModel;
	}

	protected CreditCardPaymentInfoModel createCustomerCardInfo(final SubscriptionInfoData subscriptionInfo,
			final PaymentInfoData paymentInfo, final AddressModel billingAddress, final CustomerModel customerModel,
			final boolean saveInAccount)
	{
		validateParameterNotNull(subscriptionInfo, "subscriptionInfo cannot be null");
		validateParameterNotNull(paymentInfo, "paymentInfo cannot be null");
		validateParameterNotNull(billingAddress, "billingAddress cannot be null");
		validateParameterNotNull(customerModel, "customerModel cannot be null");

		final CreditCardPaymentInfoModel cardPaymentInfoModel = getModelService().create(CreditCardPaymentInfoModel.class);
		cardPaymentInfoModel.setBillingAddress(billingAddress);
		cardPaymentInfoModel.setCode(customerModel.getUid() + "_" + UUID.randomUUID());
		cardPaymentInfoModel.setUser(customerModel);
		cardPaymentInfoModel.setSubscriptionId(subscriptionInfo.getSubscriptionID());

		cardPaymentInfoModel.setNumber(paymentInfo.getCardAccountNumber());
		cardPaymentInfoModel.setType(CreditCardType.valueOf(CardTypeEnum.get(paymentInfo.getCardCardType()).name().toUpperCase()));
		cardPaymentInfoModel.setCcOwner(getCCOwner(paymentInfo, billingAddress));
		cardPaymentInfoModel.setValidFromMonth(paymentInfo.getCardStartMonth());
		cardPaymentInfoModel.setValidFromYear(paymentInfo.getCardStartYear());
		if (paymentInfo.getCardExpirationMonth().intValue() > 0)
		{
			cardPaymentInfoModel.setValidToMonth(String.valueOf(paymentInfo.getCardExpirationMonth()));
		}
		if (paymentInfo.getCardExpirationYear().intValue() > 0)
		{
			cardPaymentInfoModel.setValidToYear(String.valueOf(paymentInfo.getCardExpirationYear()));
		}

		cardPaymentInfoModel.setSubscriptionId(subscriptionInfo.getSubscriptionID());
		cardPaymentInfoModel.setSaved(saveInAccount);
		if (StringUtils.isNotBlank(paymentInfo.getCardIssueNumber()))
		{
			cardPaymentInfoModel.setIssueNumber(Integer.valueOf(paymentInfo.getCardIssueNumber()));
		}

		return cardPaymentInfoModel;
	}

	protected String getCCOwner(final PaymentInfoData paymentInfo, final AddressModel billingAddress)
	{
		if (paymentInfo.getCardAccountHolderName() != null && !paymentInfo.getCardAccountHolderName().isEmpty())
		{
			return paymentInfo.getCardAccountHolderName();
		}
		else
		{
			return billingAddress.getFirstname() + " " + billingAddress.getLastname();
		}
	}

	@Override
	public void handleFraudUpdate(final Map<String, String> parameters)
	{
		LOG.warn("empty implementation of handleFraudUpdate called");
	}

	/**
	 * This method add new PaymentTransactionEntry of type REVIEW_DECISION to the order. It also send event to allow
	 * submitorder proccess to end waitForReviewDecision action.
	 * 
	 * @param reviewDecisionEntry
	 *           - payment transaction entry of REVIEW_DECISION type
	 * @param guid
	 *           - {@link de.hybris.platform.core.model.order.AbstractOrderModel#GUID} to which PaymentTransaction will
	 *           be added
	 */
	@Override
	public void setPaymentTransactionReviewResult(final PaymentTransactionEntryModel reviewDecisionEntry, final String guid)
	{
		if (reviewDecisionEntry == null || guid == null)
		{
			return;
		}

		OrderModel order = new OrderModel();
		// the guid is the merchange id composed of order.guid + -<number> for example: 599b141c2dc0a5d2ecf6735d2c9fb7a7416d83fa-1
		// we want to search for an order using the original guid
		order.setGuid(StringUtils.substringBefore(guid, "-"));
		order = getFlexibleSearchService().getModelByExample(order);
		final PaymentTransactionModel transaction = (order.getPaymentTransactions().iterator().hasNext() ? order
				.getPaymentTransactions().iterator().next() : null);

		if (checkIfAuthorizationWaitForReview(transaction))
		{
			final String newEntryCode = getNewEntryCode(transaction);
			reviewDecisionEntry.setPaymentTransaction(transaction);
			reviewDecisionEntry.setCode(newEntryCode);
			getModelService().save(reviewDecisionEntry);

			//send an event
			businessProcessService.triggerEvent(transaction.getOrder().getCode() + REVIEW_DECISION_EVENT_NAME);
		}
	}

	/**
	 * Generate new merchant transaction code for payment transaction entries based on code for whole transaction
	 */
	protected String getNewEntryCode(final PaymentTransactionModel transaction)
	{
		if (transaction.getEntries() == null)
		{
			return transaction.getCode() + "-1";
		}
		return transaction.getCode() + "-" + (transaction.getEntries().size() + 1);
	}

	protected boolean checkIfAuthorizationWaitForReview(final PaymentTransactionModel transaction)
	{
		if (transaction != null)
		{
			final List<PaymentTransactionEntryModel> transactionEntries = transaction.getEntries();
			for (int index = transactionEntries.size() - 1; index >= 0; index--)
			{
				final PaymentTransactionEntryModel entry = transactionEntries.get(index);

				if (isReviewDecision(entry))
				{
					return false;
				}
				else if (isAuthorizationInReview(entry))
				{
					return true;
				}
			}
		}
		return false;
	}

	protected boolean isReviewDecision(final PaymentTransactionEntryModel entry)
	{
		return PaymentTransactionType.REVIEW_DECISION.equals(entry.getType());
	}

	protected boolean isAuthorizationInReview(final PaymentTransactionEntryModel entry)
	{
		return PaymentTransactionType.AUTHORIZATION.equals(entry.getType())
				&& TransactionStatus.REVIEW.name().equals(entry.getTransactionStatus());
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

	protected ModelService getModelService()
	{
		return modelService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	protected CartService getCartService()
	{
		return cartService;
	}

	@Required
	public void setCartService(final CartService cartService)
	{
		this.cartService = cartService;
	}

	protected FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	@Required
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	protected CustomerEmailResolutionService getCustomerEmailResolutionService()
	{
		return customerEmailResolutionService;
	}

	@Required
	public void setCustomerEmailResolutionService(final CustomerEmailResolutionService customerEmailResolutionService)
	{
		this.customerEmailResolutionService = customerEmailResolutionService;
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

	public CreditCardPaymentSubscriptionDao getCreditCardPaymentSubscriptionDao()
	{
		return creditCardPaymentSubscriptionDao;
	}

	@Required
	public void setCreditCardPaymentSubscriptionDao(final CreditCardPaymentSubscriptionDao creditCardPaymentSubscriptionDao)
	{
		this.creditCardPaymentSubscriptionDao = creditCardPaymentSubscriptionDao;
	}

	protected PaymentFormActionUrlStrategy getPaymentFormActionUrlStrategy()
	{
		return paymentFormActionUrlStrategy;
	}

	@Required
	public void setPaymentFormActionUrlStrategy(final PaymentFormActionUrlStrategy paymentFormActionUrlStrategy)
	{
		this.paymentFormActionUrlStrategy = paymentFormActionUrlStrategy;
	}

	protected PaymentResponseInterpretationStrategy getPaymentResponseInterpretation()
	{
		return paymentResponseInterpretation;
	}

	@Required
	public void setPaymentResponseInterpretation(final PaymentResponseInterpretationStrategy paymentResponseInterpretation)
	{
		this.paymentResponseInterpretation = paymentResponseInterpretation;
	}

	protected PaymentResponseInterpretationStrategy getHopPaymentResponseInterpretation()
	{
		return hopPaymentResponseInterpretation;
	}

	@Required
	public void setHopPaymentResponseInterpretation(final PaymentResponseInterpretationStrategy paymentResponseInterpretation)
	{
		this.hopPaymentResponseInterpretation = paymentResponseInterpretation;
	}

	protected Converter<AddressModel, CustomerBillToData> getCustomerBillToDataConverter()
	{
		return customerBillToDataConverter;
	}

	@Required
	public void setCustomerBillToDataConverter(final Converter<AddressModel, CustomerBillToData> customerBillToDataConverter)
	{
		this.customerBillToDataConverter = customerBillToDataConverter;
	}

	protected Converter<CartModel, CustomerShipToData> getCustomerShipToDataConverter()
	{
		return customerShipToDataConverter;
	}

	@Required
	public void setCustomerShipToDataConverter(final Converter<CartModel, CustomerShipToData> customerShipToDataConverter)
	{
		this.customerShipToDataConverter = customerShipToDataConverter;
	}

	protected Converter<CreditCardPaymentInfoModel, PaymentInfoData> getPaymentInfoDataConverter()
	{
		return paymentInfoDataConverter;
	}

	@Required
	public void setPaymentInfoDataConverter(final Converter<CreditCardPaymentInfoModel, PaymentInfoData> paymentInfoDataConverter)
	{
		this.paymentInfoDataConverter = paymentInfoDataConverter;
	}

	protected Converter<CreateSubscriptionRequest, PaymentData> getPaymentDataConverter()
	{
		return PaymentDataConverter;
	}

	@Required
	public void setPaymentDataConverter(final Converter<CreateSubscriptionRequest, PaymentData> PaymentDataConverter)
	{
		this.PaymentDataConverter = PaymentDataConverter;
	}

	protected Converter<Map<String, String>, CreateSubscriptionResult> getCreateSubscriptionResultConverter()
	{
		return createSubscriptionResultConverter;
	}

	@Required
	public void setCreateSubscriptionResultConverter(
			final Converter<Map<String, String>, CreateSubscriptionResult> createSubscriptionResultConverter)
	{
		this.createSubscriptionResultConverter = createSubscriptionResultConverter;
	}

	protected SiteConfigService getSiteConfigService()
	{
		return siteConfigService;
	}

	@Required
	public void setSiteConfigService(final SiteConfigService siteConfigService)
	{
		this.siteConfigService = siteConfigService;
	}

	public BusinessProcessService getBusinessProcessService()
	{
		return businessProcessService;
	}

	@Required
	public void setBusinessProcessService(final BusinessProcessService businessProcessService)
	{
		this.businessProcessService = businessProcessService;
	}

	protected String getHostedOrderPageVersion()
	{
		return VERSION;
	}

	protected ErroCodeToFormFieldMappingStrategy getErroCodeToFormFieldMappingStrategy()
	{
		return erroCodeToFormFieldMappingStrategy;
	}

	@Required
	public void setErroCodeToFormFieldMappingStrategy(final ErroCodeToFormFieldMappingStrategy erroCodeToFormFieldMappingStrategy)
	{
		this.erroCodeToFormFieldMappingStrategy = erroCodeToFormFieldMappingStrategy;
	}

	protected CommonI18NService getCommonI18NService()
	{
		return commonI18NService;
	}

	@Required
	public void setCommonI18NService(final CommonI18NService commonI18NService)
	{
		this.commonI18NService = commonI18NService;
	}
}
