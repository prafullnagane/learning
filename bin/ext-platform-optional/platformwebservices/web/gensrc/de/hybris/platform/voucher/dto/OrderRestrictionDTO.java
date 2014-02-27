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
package de.hybris.platform.voucher.dto;

import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.voucher.dto.RestrictionDTO;
import de.hybris.platform.voucher.model.OrderRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@GraphNode(target = OrderRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "orderrestriction")
public class OrderRestrictionDTO extends RestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderRestriction.valueofgoodsonly</code> attribute defined at extension <code> */
	private java.lang.Boolean _valueofgoodsonly;
	/** <i>Generated variable</i> - Variable of <code>OrderRestriction.total</code> attribute defined at extension <code> */
	private java.lang.Double _total;
	/** <i>Generated variable</i> - Variable of <code>OrderRestriction.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>OrderRestriction.net</code> attribute defined at extension <code> */
	private java.lang.Boolean _net;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderRestrictionDTO()
	{
		super();
	}
	
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public Boolean getNet()
	{
		return this._net;
	}
	
	public Double getTotal()
	{
		return this._total;
	}
	
	public Boolean getValueofgoodsonly()
	{
		return this._valueofgoodsonly;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setNet(final Boolean value)
	{
		this.modifiedPropsSet.add("net");
		this._net = value;
	}
	
	public void setTotal(final Double value)
	{
		this.modifiedPropsSet.add("total");
		this._total = value;
	}
	
	public void setValueofgoodsonly(final Boolean value)
	{
		this.modifiedPropsSet.add("valueofgoodsonly");
		this._valueofgoodsonly = value;
	}
	
}
