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
import de.hybris.platform.promotions.dto.PromotionPriceRowDTO;
import de.hybris.platform.promotions.model.ProductFixedPricePromotionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductFixedPricePromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = ProductFixedPricePromotionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productfixedpricepromotion")
public class ProductFixedPricePromotionDTO extends ProductPromotionDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductFixedPricePromotion.productFixedUnitPrice</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.PromotionPriceRowDTO> _productFixedUnitPrice;
	/** <i>Generated variable</i> - Variable of <code>ProductFixedPricePromotion.messageFired</code> attribute defined at extension <code> */
	private java.lang.String _messageFired;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductFixedPricePromotionDTO()
	{
		super();
	}
	
	
	public String getMessageFired()
	{
		return this._messageFired;
	}
	
	@XmlElementWrapper(name = "productFixedUnitPrice")
	@XmlElement(name = "promotionPriceRow")
	public Collection<PromotionPriceRowDTO> getProductFixedUnitPrice()
	{
		return this._productFixedUnitPrice;
	}
	
	public void setMessageFired(final String value)
	{
		this.modifiedPropsSet.add("messageFired");
		this._messageFired = value;
	}
	
	public void setProductFixedUnitPrice(final Collection<PromotionPriceRowDTO> value)
	{
		this.modifiedPropsSet.add("productFixedUnitPrice");
		this._productFixedUnitPrice = value;
	}
	
}
