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
package de.hybris.platform.returns.dto;

import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.returns.dto.ReturnEntryDTO;
import de.hybris.platform.returns.model.RefundEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RefundEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = RefundEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "refundentry")
public class RefundEntryDTO extends ReturnEntryDTO
{
	/** <i>Generated variable</i> - Variable of <code>RefundEntry.amount</code> attribute defined at extension <code> */
	private java.math.BigDecimal _amount;
	/** <i>Generated variable</i> - Variable of <code>RefundEntry.reason</code> attribute defined at extension <code> */
	private java.lang.String _reason;
	/** <i>Generated variable</i> - Variable of <code>RefundEntry.refundedDate</code> attribute defined at extension <code> */
	private java.util.Date _refundedDate;
	/** <i>Generated variable</i> - Variable of <code>RefundEntry.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RefundEntryDTO()
	{
		super();
	}
	
	
	public BigDecimal getAmount()
	{
		return this._amount;
	}
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getReason()
	{
		return this._reason;
	}
	
	public Date getRefundedDate()
	{
		return this._refundedDate;
	}
	
	public void setAmount(final BigDecimal value)
	{
		this.modifiedPropsSet.add("amount");
		this._amount = value;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setReason(final String value)
	{
		this.modifiedPropsSet.add("reason");
		this._reason = value;
	}
	
	public void setRefundedDate(final Date value)
	{
		this.modifiedPropsSet.add("refundedDate");
		this._refundedDate = value;
	}
	
}
