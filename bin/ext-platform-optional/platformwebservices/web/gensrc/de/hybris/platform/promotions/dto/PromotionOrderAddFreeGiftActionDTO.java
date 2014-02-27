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

import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.promotions.dto.AbstractPromotionActionDTO;
import de.hybris.platform.promotions.model.PromotionOrderAddFreeGiftActionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PromotionOrderAddFreeGiftAction first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = PromotionOrderAddFreeGiftActionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "promotionorderaddfreegiftaction")
public class PromotionOrderAddFreeGiftActionDTO extends AbstractPromotionActionDTO
{
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderAddFreeGiftAction.freeProduct</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _freeProduct;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderAddFreeGiftActionDTO()
	{
		super();
	}
	
	
	public ProductDTO getFreeProduct()
	{
		return this._freeProduct;
	}
	
	public void setFreeProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("freeProduct");
		this._freeProduct = value;
	}
	
}
