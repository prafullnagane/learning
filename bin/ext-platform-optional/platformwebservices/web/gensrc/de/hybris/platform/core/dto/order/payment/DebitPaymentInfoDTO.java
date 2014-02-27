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
import de.hybris.platform.core.model.order.payment.DebitPaymentInfoModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DebitPaymentInfo first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = DebitPaymentInfoModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "debitpaymentinfo")
public class DebitPaymentInfoDTO extends PaymentInfoDTO
{
	/** <i>Generated variable</i> - Variable of <code>DebitPaymentInfo.accountNumber</code> attribute defined at extension <code> */
	private java.lang.String _accountNumber;
	/** <i>Generated variable</i> - Variable of <code>DebitPaymentInfo.bank</code> attribute defined at extension <code> */
	private java.lang.String _bank;
	/** <i>Generated variable</i> - Variable of <code>DebitPaymentInfo.bankIDNumber</code> attribute defined at extension <code> */
	private java.lang.String _bankIDNumber;
	/** <i>Generated variable</i> - Variable of <code>DebitPaymentInfo.baOwner</code> attribute defined at extension <code> */
	private java.lang.String _baOwner;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DebitPaymentInfoDTO()
	{
		super();
	}
	
	
	public String getAccountNumber()
	{
		return this._accountNumber;
	}
	
	public String getBank()
	{
		return this._bank;
	}
	
	public String getBankIDNumber()
	{
		return this._bankIDNumber;
	}
	
	public String getBaOwner()
	{
		return this._baOwner;
	}
	
	public void setAccountNumber(final String value)
	{
		this.modifiedPropsSet.add("accountNumber");
		this._accountNumber = value;
	}
	
	public void setBank(final String value)
	{
		this.modifiedPropsSet.add("bank");
		this._bank = value;
	}
	
	public void setBankIDNumber(final String value)
	{
		this.modifiedPropsSet.add("bankIDNumber");
		this._bankIDNumber = value;
	}
	
	public void setBaOwner(final String value)
	{
		this.modifiedPropsSet.add("baOwner");
		this._baOwner = value;
	}
	
}
