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
package de.hybris.platform.core.model.order.price;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Locale;

/**
 * Generated model class for type Discount first defined at extension core.
 */
@SuppressWarnings("all")
public class DiscountModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Discount";
	
	/**<i>Generated relation code constant for relation <code>OrderDiscountRelation</code> defining source attribute <code>orders</code> in extension <code>core</code>.</i>*/
	public final static String _ORDERDISCOUNTRELATION = "OrderDiscountRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>Discount.priority</code> attribute defined at extension <code>core</code>. */
	public static final String PRIORITY = "priority";
	
	/** <i>Generated constant</i> - Attribute key of <code>Discount.code</code> attribute defined at extension <code>core</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Discount.name</code> attribute defined at extension <code>core</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>Discount.currency</code> attribute defined at extension <code>core</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>Discount.global</code> attribute defined at extension <code>core</code>. */
	public static final String GLOBAL = "global";
	
	/** <i>Generated constant</i> - Attribute key of <code>Discount.value</code> attribute defined at extension <code>core</code>. */
	public static final String VALUE = "value";
	
	/** <i>Generated constant</i> - Attribute key of <code>Discount.discountString</code> attribute defined at extension <code>core</code>. */
	public static final String DISCOUNTSTRING = "discountString";
	
	/** <i>Generated constant</i> - Attribute key of <code>Discount.absolute</code> attribute defined at extension <code>core</code>. */
	public static final String ABSOLUTE = "absolute";
	
	/** <i>Generated constant</i> - Attribute key of <code>Discount.orders</code> attribute defined at extension <code>core</code>. */
	public static final String ORDERS = "orders";
	
	
	/** <i>Generated variable</i> - Variable of <code>Discount.priority</code> attribute defined at extension <code>core</code>. */
	private Integer _priority;
	
	/** <i>Generated variable</i> - Variable of <code>Discount.code</code> attribute defined at extension <code>core</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>Discount.currency</code> attribute defined at extension <code>core</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>Discount.global</code> attribute defined at extension <code>core</code>. */
	private Boolean _global;
	
	/** <i>Generated variable</i> - Variable of <code>Discount.value</code> attribute defined at extension <code>core</code>. */
	private Double _value;
	
	/** <i>Generated variable</i> - Variable of <code>Discount.discountString</code> attribute defined at extension <code>core</code>. */
	private String _discountString;
	
	/** <i>Generated variable</i> - Variable of <code>Discount.absolute</code> attribute defined at extension <code>core</code>. */
	private Boolean _absolute;
	
	/** <i>Generated variable</i> - Variable of <code>Discount.orders</code> attribute defined at extension <code>core</code>. */
	private Collection<AbstractOrderModel> _orders;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public DiscountModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public DiscountModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Discount</code> at extension <code>core</code>
	 */
	@Deprecated
	public DiscountModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Discount</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public DiscountModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Discount.absolute</code> attribute defined at extension <code>core</code>. 
	 * @return the absolute
	 */
	public Boolean getAbsolute()
	{
		return _absolute = getPersistenceContext().getValue(ABSOLUTE, _absolute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Discount.code</code> attribute defined at extension <code>core</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Discount.currency</code> attribute defined at extension <code>core</code>. 
	 * @return the currency
	 */
	public CurrencyModel getCurrency()
	{
		return _currency = getPersistenceContext().getValue(CURRENCY, _currency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Discount.discountString</code> attribute defined at extension <code>core</code>. 
	 * @return the discountString
	 */
	public String getDiscountString()
	{
		return _discountString = getPersistenceContext().getValue(DISCOUNTSTRING, _discountString);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Discount.discountString</code> attribute defined at extension <code>core</code>. 
	 * @return the discountString
	 * @deprecated use {@link #getDiscountString()} instead
	 */
	@Deprecated
	public String getDiscountstring()
	{
		return this.getDiscountString();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Discount.global</code> attribute defined at extension <code>core</code>. 
	 * @return the global
	 */
	public Boolean getGlobal()
	{
		return _global = getPersistenceContext().getValue(GLOBAL, _global);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Discount.name</code> attribute defined at extension <code>core</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Discount.name</code> attribute defined at extension <code>core</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Discount.orders</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the orders
	 */
	public Collection<AbstractOrderModel> getOrders()
	{
		return _orders = getPersistenceContext().getValue(ORDERS, _orders);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Discount.priority</code> attribute defined at extension <code>core</code>. 
	 * @return the priority
	 */
	public Integer getPriority()
	{
		return _priority = getPersistenceContext().getValue(PRIORITY, _priority);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Discount.value</code> attribute defined at extension <code>core</code>. 
	 * @return the value
	 */
	public Double getValue()
	{
		return _value = getPersistenceContext().getValue(VALUE, _value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Discount.code</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Discount.currency</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the currency
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Discount.global</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the global
	 */
	public void setGlobal(final Boolean value)
	{
		_global = getPersistenceContext().setValue(GLOBAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Discount.name</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>Discount.name</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Discount.orders</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the orders
	 */
	public void setOrders(final Collection<AbstractOrderModel> value)
	{
		_orders = getPersistenceContext().setValue(ORDERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Discount.priority</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the priority
	 */
	public void setPriority(final Integer value)
	{
		_priority = getPersistenceContext().setValue(PRIORITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Discount.value</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the value
	 */
	public void setValue(final Double value)
	{
		_value = getPersistenceContext().setValue(VALUE, value);
	}
	
}