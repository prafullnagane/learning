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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.promotions.model.PromotionPriceRowModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PromotionPriceRow first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = PromotionPriceRowModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "promotionpricerow")
public class PromotionPriceRowDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PromotionPriceRow.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>PromotionPriceRow.price</code> attribute defined at extension <code> */
	private java.lang.Double _price;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionPriceRowDTO()
	{
		super();
	}
	
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public Double getPrice()
	{
		return this._price;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setPrice(final Double value)
	{
		this.modifiedPropsSet.add("price");
		this._price = value;
	}
	
}
