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
package de.hybris.platform.core.dto.util;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.user.CustomerDTO;
import de.hybris.platform.core.model.util.CustomerOrderOverviewModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CustomerOrderOverview first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = CustomerOrderOverviewModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "customerorderoverview")
public class CustomerOrderOverviewDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CustomerOrderOverview.orderTotals</code> attribute defined at extension <code> */
	private java.lang.Double _orderTotals;
	/** <i>Generated variable</i> - Variable of <code>CustomerOrderOverview.customer</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.CustomerDTO _customer;
	/** <i>Generated variable</i> - Variable of <code>CustomerOrderOverview.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>CustomerOrderOverview.orderCount</code> attribute defined at extension <code> */
	private java.lang.Integer _orderCount;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomerOrderOverviewDTO()
	{
		super();
	}
	
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public CustomerDTO getCustomer()
	{
		return this._customer;
	}
	
	public Integer getOrderCount()
	{
		return this._orderCount;
	}
	
	public Double getOrderTotals()
	{
		return this._orderTotals;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setCustomer(final CustomerDTO value)
	{
		this.modifiedPropsSet.add("customer");
		this._customer = value;
	}
	
	public void setOrderCount(final Integer value)
	{
		this.modifiedPropsSet.add("orderCount");
		this._orderCount = value;
	}
	
	public void setOrderTotals(final Double value)
	{
		this.modifiedPropsSet.add("orderTotals");
		this._orderTotals = value;
	}
	
}
