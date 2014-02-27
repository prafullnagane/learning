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
package de.hybris.platform.core.dto.order.payment;

import de.hybris.platform.core.dto.order.payment.PaymentInfoDTO;
import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CreditCardPaymentInfo first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = CreditCardPaymentInfoModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "creditcardpaymentinfo")
public class CreditCardPaymentInfoDTO extends PaymentInfoDTO
{
	/** <i>Generated variable</i> - Variable of <code>CreditCardPaymentInfo.issueNumber</code> attribute defined at extension <code> */
	private java.lang.Integer _issueNumber;
	/** <i>Generated variable</i> - Variable of <code>CreditCardPaymentInfo.type</code> attribute defined at extension <code> */
	private java.lang.String _type;
	/** <i>Generated variable</i> - Variable of <code>CreditCardPaymentInfo.ccOwner</code> attribute defined at extension <code> */
	private java.lang.String _ccOwner;
	/** <i>Generated variable</i> - Variable of <code>CreditCardPaymentInfo.validToMonth</code> attribute defined at extension <code> */
	private java.lang.String _validToMonth;
	/** <i>Generated variable</i> - Variable of <code>CreditCardPaymentInfo.validToYear</code> attribute defined at extension <code> */
	private java.lang.String _validToYear;
	/** <i>Generated variable</i> - Variable of <code>CreditCardPaymentInfo.validFromYear</code> attribute defined at extension <code> */
	private java.lang.String _validFromYear;
	/** <i>Generated variable</i> - Variable of <code>CreditCardPaymentInfo.subscriptionValidated</code> attribute defined at extension <code> */
	private boolean _subscriptionValidated;
	/** <i>Generated variable</i> - Variable of <code>CreditCardPaymentInfo.validFromMonth</code> attribute defined at extension <code> */
	private java.lang.String _validFromMonth;
	/** <i>Generated variable</i> - Variable of <code>CreditCardPaymentInfo.subscriptionId</code> attribute defined at extension <code> */
	private java.lang.String _subscriptionId;
	/** <i>Generated variable</i> - Variable of <code>CreditCardPaymentInfo.number</code> attribute defined at extension <code> */
	private java.lang.String _number;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CreditCardPaymentInfoDTO()
	{
		super();
	}
	
	
	public String getCcOwner()
	{
		return this._ccOwner;
	}
	
	public Integer getIssueNumber()
	{
		return this._issueNumber;
	}
	
	public String getNumber()
	{
		return this._number;
	}
	
	public String getSubscriptionId()
	{
		return this._subscriptionId;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getType()
	{
		return this._type;
	}
	
	public String getValidFromMonth()
	{
		return this._validFromMonth;
	}
	
	public String getValidFromYear()
	{
		return this._validFromYear;
	}
	
	public String getValidToMonth()
	{
		return this._validToMonth;
	}
	
	public String getValidToYear()
	{
		return this._validToYear;
	}
	
	public boolean isSubscriptionValidated()
	{
		return this._subscriptionValidated;
	}
	
	public void setCcOwner(final String value)
	{
		this.modifiedPropsSet.add("ccOwner");
		this._ccOwner = value;
	}
	
	public void setIssueNumber(final Integer value)
	{
		this.modifiedPropsSet.add("issueNumber");
		this._issueNumber = value;
	}
	
	public void setNumber(final String value)
	{
		this.modifiedPropsSet.add("number");
		this._number = value;
	}
	
	public void setSubscriptionId(final String value)
	{
		this.modifiedPropsSet.add("subscriptionId");
		this._subscriptionId = value;
	}
	
	public void setSubscriptionValidated(final boolean value)
	{
		this.modifiedPropsSet.add("subscriptionValidated");
		this._subscriptionValidated = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setType(final String value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
	public void setValidFromMonth(final String value)
	{
		this.modifiedPropsSet.add("validFromMonth");
		this._validFromMonth = value;
	}
	
	public void setValidFromYear(final String value)
	{
		this.modifiedPropsSet.add("validFromYear");
		this._validFromYear = value;
	}
	
	public void setValidToMonth(final String value)
	{
		this.modifiedPropsSet.add("validToMonth");
		this._validToMonth = value;
	}
	
	public void setValidToYear(final String value)
	{
		this.modifiedPropsSet.add("validToYear");
		this._validToYear = value;
	}
	
}
