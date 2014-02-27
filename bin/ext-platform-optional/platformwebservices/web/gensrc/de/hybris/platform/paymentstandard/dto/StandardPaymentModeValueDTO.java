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
package de.hybris.platform.paymentstandard.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.paymentstandard.dto.StandardPaymentModeDTO;
import de.hybris.platform.paymentstandard.model.StandardPaymentModeValueModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type StandardPaymentModeValue first defined at extension paymentstandard
 */
@SuppressWarnings("all")
@GraphNode(target = StandardPaymentModeValueModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "standardpaymentmodevalue")
public class StandardPaymentModeValueDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>StandardPaymentModeValue.value</code> attribute defined at extension <code> */
	private java.lang.Double _value;
	/** <i>Generated variable</i> - Variable of <code>StandardPaymentModeValue.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>StandardPaymentModeValue.paymentMode</code> attribute defined at extension <code> */
	private de.hybris.platform.paymentstandard.dto.StandardPaymentModeDTO _paymentMode;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StandardPaymentModeValueDTO()
	{
		super();
	}
	
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public StandardPaymentModeDTO getPaymentMode()
	{
		return this._paymentMode;
	}
	
	public Double getValue()
	{
		return this._value;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setPaymentMode(final StandardPaymentModeDTO value)
	{
		this.modifiedPropsSet.add("paymentMode");
		this._paymentMode = value;
	}
	
	public void setValue(final Double value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
