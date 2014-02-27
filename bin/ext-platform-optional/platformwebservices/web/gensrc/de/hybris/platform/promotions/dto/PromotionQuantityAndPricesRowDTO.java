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
import de.hybris.platform.promotions.dto.PromotionPriceRowDTO;
import de.hybris.platform.promotions.model.PromotionQuantityAndPricesRowModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PromotionQuantityAndPricesRow first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = PromotionQuantityAndPricesRowModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "promotionquantityandpricesrow")
public class PromotionQuantityAndPricesRowDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PromotionQuantityAndPricesRow.prices</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.PromotionPriceRowDTO> _prices;
	/** <i>Generated variable</i> - Variable of <code>PromotionQuantityAndPricesRow.quantity</code> attribute defined at extension <code> */
	private java.lang.Long _quantity;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionQuantityAndPricesRowDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "prices")
	@XmlElement(name = "promotionPriceRow")
	public Collection<PromotionPriceRowDTO> getPrices()
	{
		return this._prices;
	}
	
	public Long getQuantity()
	{
		return this._quantity;
	}
	
	public void setPrices(final Collection<PromotionPriceRowDTO> value)
	{
		this.modifiedPropsSet.add("prices");
		this._prices = value;
	}
	
	public void setQuantity(final Long value)
	{
		this.modifiedPropsSet.add("quantity");
		this._quantity = value;
	}
	
}
