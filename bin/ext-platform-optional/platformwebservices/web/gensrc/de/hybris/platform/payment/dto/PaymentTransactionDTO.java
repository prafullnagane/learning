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
import de.hybris.platform.core.dto.order.AbstractOrderDTO;
import de.hybris.platform.core.dto.order.payment.PaymentInfoDTO;
import de.hybris.platform.payment.dto.PaymentTransactionEntryDTO;
import de.hybris.platform.payment.model.PaymentTransactionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PaymentTransaction first defined at extension payment
 */
@SuppressWarnings("all")
@GraphNode(target = PaymentTransactionModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "paymenttransaction")
public class PaymentTransactionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.paymentProvider</code> attribute defined at extension <code> */
	private java.lang.String _paymentProvider;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.AbstractOrderDTO _order;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.entries</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.payment.dto.PaymentTransactionEntryDTO> _entries;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.requestId</code> attribute defined at extension <code> */
	private java.lang.String _requestId;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.versionID</code> attribute defined at extension <code> */
	private java.lang.String _versionID;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.requestToken</code> attribute defined at extension <code> */
	private java.lang.String _requestToken;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.info</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.payment.PaymentInfoDTO _info;
	/** <i>Generated variable</i> - Variable of <code>PaymentTransaction.plannedAmount</code> attribute defined at extension <code> */
	private java.math.BigDecimal _plannedAmount;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentTransactionDTO()
	{
		super();
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
	
	@XmlElementWrapper(name = "entries")
	@XmlElement(name = "paymentTransactionEntry")
	public List<PaymentTransactionEntryDTO> getEntries()
	{
		return this._entries;
	}
	
	public PaymentInfoDTO getInfo()
	{
		return this._info;
	}
	
	public AbstractOrderDTO getOrder()
	{
		return this._order;
	}
	
	public String getPaymentProvider()
	{
		return this._paymentProvider;
	}
	
	public BigDecimal getPlannedAmount()
	{
		return this._plannedAmount;
	}
	
	public String getRequestId()
	{
		return this._requestId;
	}
	
	public String getRequestToken()
	{
		return this._requestToken;
	}
	
	@XmlAttribute
	public String getVersionID()
	{
		return this._versionID;
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
	
	public void setEntries(final List<PaymentTransactionEntryDTO> value)
	{
		this.modifiedPropsSet.add("entries");
		this._entries = value;
	}
	
	public void setInfo(final PaymentInfoDTO value)
	{
		this.modifiedPropsSet.add("info");
		this._info = value;
	}
	
	public void setOrder(final AbstractOrderDTO value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
	public void setPaymentProvider(final String value)
	{
		this.modifiedPropsSet.add("paymentProvider");
		this._paymentProvider = value;
	}
	
	public void setPlannedAmount(final BigDecimal value)
	{
		this.modifiedPropsSet.add("plannedAmount");
		this._plannedAmount = value;
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
	
	public void setVersionID(final String value)
	{
		this.modifiedPropsSet.add("versionID");
		this._versionID = value;
	}
	
}
