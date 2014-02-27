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
package de.hybris.platform.europe1.model;

import de.hybris.platform.core.HybrisEnumValue;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.price.DiscountModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.europe1.enums.ProductDiscountGroup;
import de.hybris.platform.europe1.model.PDTRowModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type AbstractDiscountRow first defined at extension europe1.
 */
@SuppressWarnings("all")
public class AbstractDiscountRowModel extends PDTRowModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractDiscountRow";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractDiscountRow.absolute</code> attribute defined at extension <code>europe1</code>. */
	public static final String ABSOLUTE = "absolute";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractDiscountRow.value</code> attribute defined at extension <code>europe1</code>. */
	public static final String VALUE = "value";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractDiscountRow.discountString</code> attribute defined at extension <code>europe1</code>. */
	public static final String DISCOUNTSTRING = "discountString";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractDiscountRow.currency</code> attribute defined at extension <code>europe1</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractDiscountRow.discount</code> attribute defined at extension <code>europe1</code>. */
	public static final String DISCOUNT = "discount";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractDiscountRow.absolute</code> attribute defined at extension <code>europe1</code>. */
	private Boolean _absolute;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractDiscountRow.value</code> attribute defined at extension <code>europe1</code>. */
	private Double _value;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractDiscountRow.discountString</code> attribute defined at extension <code>europe1</code>. */
	private String _discountString;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractDiscountRow.currency</code> attribute defined at extension <code>europe1</code>. */
	private CurrencyModel _currency;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractDiscountRow.discount</code> attribute defined at extension <code>europe1</code>. */
	private DiscountModel _discount;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractDiscountRowModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractDiscountRowModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _discount initial attribute declared by type <code>AbstractDiscountRow</code> at extension <code>europe1</code>
	 */
	@Deprecated
	public AbstractDiscountRowModel(final DiscountModel _discount)
	{
		super();
		setDiscount(_discount);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _discount initial attribute declared by type <code>AbstractDiscountRow</code> at extension <code>europe1</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _pg initial attribute declared by type <code>AbstractDiscountRow</code> at extension <code>europe1</code>
	 * @param _product initial attribute declared by type <code>PDTRow</code> at extension <code>europe1</code>
	 */
	@Deprecated
	public AbstractDiscountRowModel(final DiscountModel _discount, final ItemModel _owner, final ProductDiscountGroup _pg, final ProductModel _product)
	{
		super();
		setDiscount(_discount);
		setOwner(_owner);
		setPg(_pg);
		setProduct(_product);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDiscountRow.absolute</code> attribute defined at extension <code>europe1</code>. 
	 * @return the absolute
	 */
	public Boolean getAbsolute()
	{
		return _absolute = getPersistenceContext().getValue(ABSOLUTE, _absolute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDiscountRow.currency</code> attribute defined at extension <code>europe1</code>. 
	 * @return the currency
	 */
	public CurrencyModel getCurrency()
	{
		return _currency = getPersistenceContext().getValue(CURRENCY, _currency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDiscountRow.discount</code> attribute defined at extension <code>europe1</code>. 
	 * @return the discount
	 */
	public DiscountModel getDiscount()
	{
		return _discount = getPersistenceContext().getValue(DISCOUNT, _discount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDiscountRow.discountString</code> attribute defined at extension <code>europe1</code>. 
	 * @return the discountString
	 */
	public String getDiscountString()
	{
		return _discountString = getPersistenceContext().getValue(DISCOUNTSTRING, _discountString);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDiscountRow.value</code> attribute defined at extension <code>europe1</code>. 
	 * @return the value
	 */
	public Double getValue()
	{
		return _value = getPersistenceContext().getValue(VALUE, _value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractDiscountRow.currency</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the currency
	 */
	public void setCurrency(final CurrencyModel value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AbstractDiscountRow.discount</code> attribute defined at extension <code>europe1</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the discount
	 */
	public void setDiscount(final DiscountModel value)
	{
		_discount = getPersistenceContext().setValue(DISCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>PDTRow.pg</code> attribute defined at extension <code>europe1</code> and redeclared at extension <code>europe1</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.europe1.enums.ProductDiscountGroup}.  
	 *  
	 * @param value the pg
	 */
	@Override
	public void setPg(final HybrisEnumValue value)
	{
		super.setPg(value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractDiscountRow.value</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the value
	 */
	public void setValue(final Double value)
	{
		_value = getPersistenceContext().setValue(VALUE, value);
	}
	
}
