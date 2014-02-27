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
package de.hybris.platform.promotions.dto;

import de.hybris.platform.promotions.dto.ProductPromotionDTO;
import de.hybris.platform.promotions.model.ProductPercentageDiscountPromotionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductPercentageDiscountPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = ProductPercentageDiscountPromotionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productpercentagediscountpromotion")
public class ProductPercentageDiscountPromotionDTO extends ProductPromotionDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductPercentageDiscountPromotion.percentageDiscount</code> attribute defined at extension <code> */
	private java.lang.Double _percentageDiscount;
	/** <i>Generated variable</i> - Variable of <code>ProductPercentageDiscountPromotion.messageFired</code> attribute defined at extension <code> */
	private java.lang.String _messageFired;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPercentageDiscountPromotionDTO()
	{
		super();
	}
	
	
	public String getMessageFired()
	{
		return this._messageFired;
	}
	
	public Double getPercentageDiscount()
	{
		return this._percentageDiscount;
	}
	
	public void setMessageFired(final String value)
	{
		this.modifiedPropsSet.add("messageFired");
		this._messageFired = value;
	}
	
	public void setPercentageDiscount(final Double value)
	{
		this.modifiedPropsSet.add("percentageDiscount");
		this._percentageDiscount = value;
	}
	
}
