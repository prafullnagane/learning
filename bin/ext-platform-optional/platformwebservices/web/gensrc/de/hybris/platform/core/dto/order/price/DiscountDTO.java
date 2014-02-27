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
package de.hybris.platform.core.dto.order.price;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.order.AbstractOrderDTO;
import de.hybris.platform.core.model.order.price.DiscountModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Discount first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = DiscountModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "discount")
public class DiscountDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Discount.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Discount.priority</code> attribute defined at extension <code> */
	private java.lang.Integer _priority;
	/** <i>Generated variable</i> - Variable of <code>Discount.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>Discount.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>Discount.global</code> attribute defined at extension <code> */
	private java.lang.Boolean _global;
	/** <i>Generated variable</i> - Variable of <code>Discount.value</code> attribute defined at extension <code> */
	private java.lang.Double _value;
	/** <i>Generated variable</i> - Variable of <code>Discount.discountString</code> attribute defined at extension <code> */
	private java.lang.String _discountString;
	/** <i>Generated variable</i> - Variable of <code>Discount.absolute</code> attribute defined at extension <code> */
	private java.lang.Boolean _absolute;
	/** <i>Generated variable</i> - Variable of <code>Discount.orders</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.order.AbstractOrderDTO> _orders;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DiscountDTO()
	{
		super();
	}
	
	
	public Boolean getAbsolute()
	{
		return this._absolute;
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
	
	public String getDiscountString()
	{
		return this._discountString;
	}
	
	public Boolean getGlobal()
	{
		return this._global;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlElementWrapper(name = "orders")
	@XmlElement(name = "abstractOrder")
	public Collection<AbstractOrderDTO> getOrders()
	{
		return this._orders;
	}
	
	public Integer getPriority()
	{
		return this._priority;
	}
	
	public Double getValue()
	{
		return this._value;
	}
	
	public void setAbsolute(final Boolean value)
	{
		this.modifiedPropsSet.add("absolute");
		this._absolute = value;
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
	
	public void setDiscountString(final String value)
	{
		this.modifiedPropsSet.add("discountString");
		this._discountString = value;
	}
	
	public void setGlobal(final Boolean value)
	{
		this.modifiedPropsSet.add("global");
		this._global = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setOrders(final Collection<AbstractOrderDTO> value)
	{
		this.modifiedPropsSet.add("orders");
		this._orders = value;
	}
	
	public void setPriority(final Integer value)
	{
		this.modifiedPropsSet.add("priority");
		this._priority = value;
	}
	
	public void setValue(final Double value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
