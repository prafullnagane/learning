/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 13, 2013 6:34:48 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.payment.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.payment.dto.PaymentTransactionDTO;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PaymentTransactionEntry first defined at extension payment
 */
@SuppressWarnings("all")
@GraphNode(target = PaymentTransactionEntryModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "paymenttransactionentry")
public class PaymentTransactionEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.requestId</code> attribute defined at extension <code> */
	private java.lang.String _requestId;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.versionID</code> attribute defined at extension <code> */
	private java.lang.String _versionID;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.paymentTransaction</code> attribute defined at extension <code> */
	private de.hybris.platform.payment.dto.PaymentTransactionDTO _paymentTransaction;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.type</code> attribute defined at extension <code> */
	private java.lang.String _type;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.transactionStatus</code> attribute defined at extension <code> */
	private java.lang.String _transactionStatus;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.requestToken</code> attribute defined at extension <code> */
	private java.lang.String _requestToken;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.subscriptionID</code> attribute defined at extension <code> */
	private java.lang.String _subscriptionID;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.transactionStatusDetails</code> attribute defined at extension <code> */
	private java.lang.String _transactionStatusDetails;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.time</code> attribute defined at extension <code> */
	private java.util.Date _time;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransactionEntry.amount</code> attribute defined at extension <code> */
	private java.math.BigDecimal _amount;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentTransactionEntryDTO()
	{
		super();
	}
	
	
	public BigDecimal getAmount()
	{
		return this._amount;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public PaymentTransactionDTO getPaymentTransaction()
	{
		return this._paymentTransaction;
	}
	
	public String getRequestId()
	{
		return this._requestId;
	}
	
	public String getRequestToken()
	{
		return this._requestToken;
	}
	
	public String getSubscriptionID()
	{
		return this._subscriptionID;
	}
	
	public Date getTime()
	{
		return this._time;
	}
	
	public String getTransactionStatus()
	{
		return this._transactionStatus;
	}
	
	public String getTransactionStatusDetails()
	{
		return this._transactionStatusDetails;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getType()
	{
		return this._type;
	}
	
	@XmlAttribute
	public String getVersionID()
	{
		return this._versionID;
	}
	
	public void setAmount(final BigDecimal value)
	{
		this.modifiedPropsSet.add("amount");
		this._amount = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setPaymentTransaction(final PaymentTransactionDTO value)
	{
		this.modifiedPropsSet.add("paymentTransaction");
		this._paymentTransaction = value;
	}
	
	public void setRequestId(final String value)
	{
		this.modifiedPropsSet.add("requestId");
		this._requestId = value;
	}
	
	public void setRequestToken(final String value)
	{
		this.modifiedPropsSet.add("requestToken");
		this._requestToken = value;
	}
	
	public void setSubscriptionID(final String value)
	{
		this.modifiedPropsSet.add("subscriptionID");
		this._subscriptionID = value;
	}
	
	public void setTime(final Date value)
	{
		this.modifiedPropsSet.add("time");
		this._time = value;
	}
	
	public void setTransactionStatus(final String value)
	{
		this.modifiedPropsSet.add("transactionStatus");
		this._transactionStatus = value;
	}
	
	public void setTransactionStatusDetails(final String value)
	{
		this.modifiedPropsSet.add("transactionStatusDetails");
		this._transactionStatusDetails = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setType(final String value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
	public void setVersionID(final String value)
	{
		this.modifiedPropsSet.add("versionID");
		this._versionID = value;
	}
	
}
