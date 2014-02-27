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
package de.hybris.platform.promotions.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.promotions.model.ProductPromotionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type ProductPercentageDiscountPromotion first defined at extension promotions.
 */
@SuppressWarnings("all")
public class ProductPercentageDiscountPromotionModel extends ProductPromotionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ProductPercentageDiscountPromotion";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductPercentageDiscountPromotion.percentageDiscount</code> attribute defined at extension <code>promotions</code>. */
	public static final String PERCENTAGEDISCOUNT = "percentageDiscount";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductPercentageDiscountPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. */
	public static final String MESSAGEFIRED = "messageFired";
	
	
	/** <i>Generated variable</i> - Variable of <code>ProductPercentageDiscountPromotion.percentageDiscount</code> attribute defined at extension <code>promotions</code>. */
	private Double _percentageDiscount;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ProductPercentageDiscountPromotionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ProductPercentageDiscountPromotionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractPromotion</code> at extension <code>promotions</code>
	 */
	@Deprecated
	public ProductPercentageDiscountPromotionModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractPromotion</code> at extension <code>promotions</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ProductPercentageDiscountPromotionModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPercentageDiscountPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
	 * @return the messageFired - The message to show when the promotion has fired.
	 */
	public String getMessageFired()
	{
		return getMessageFired(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPercentageDiscountPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
	 * @param loc the value localization key 
	 * @return the messageFired - The message to show when the promotion has fired.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getMessageFired(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(MESSAGEFIRED, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductPercentageDiscountPromotion.percentageDiscount</code> attribute defined at extension <code>promotions</code>. 
	 * @return the percentageDiscount - Percentage discount.
	 */
	public Double getPercentageDiscount()
	{
		return _percentageDiscount = getPersistenceContext().getValue(PERCENTAGEDISCOUNT, _percentageDiscount);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductPercentageDiscountPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setMessageFired(final String value)
	{
		setMessageFired(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ProductPercentageDiscountPromotion.messageFired</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the messageFired - The message to show when the promotion has fired.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setMessageFired(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(MESSAGEFIRED, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductPercentageDiscountPromotion.percentageDiscount</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the percentageDiscount - Percentage discount.
	 */
	public void setPercentageDiscount(final Double value)
	{
		_percentageDiscount = getPersistenceContext().setValue(PERCENTAGEDISCOUNT, value);
	}
	
}
