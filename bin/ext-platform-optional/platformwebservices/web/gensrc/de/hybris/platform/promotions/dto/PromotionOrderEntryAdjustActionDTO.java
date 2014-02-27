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
import de.hybris.platform.promotions.model.PromotionOrderEntryAdjustActionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PromotionOrderEntryAdjustAction first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = PromotionOrderEntryAdjustActionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "promotionorderentryadjustaction")
public class PromotionOrderEntryAdjustActionDTO extends AbstractPromotionActionDTO
{
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryAdjustAction.orderEntryNumber</code> attribute defined at extension <code> */
	private java.lang.Integer _orderEntryNumber;
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryAdjustAction.orderEntryQuantity</code> attribute defined at extension <code> */
	private java.lang.Long _orderEntryQuantity;
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryAdjustAction.amount</code> attribute defined at extension <code> */
	private java.lang.Double _amount;
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryAdjustAction.orderEntryProduct</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _orderEntryProduct;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderEntryAdjustActionDTO()
	{
		super();
	}
	
	
	public Double getAmount()
	{
		return this._amount;
	}
	
	public Integer getOrderEntryNumber()
	{
		return this._orderEntryNumber;
	}
	
	public ProductDTO getOrderEntryProduct()
	{
		return this._orderEntryProduct;
	}
	
	public Long getOrderEntryQuantity()
	{
		return this._orderEntryQuantity;
	}
	
	public void setAmount(final Double value)
	{
		this.modifiedPropsSet.add("amount");
		this._amount = value;
	}
	
	public void setOrderEntryNumber(final Integer value)
	{
		this.modifiedPropsSet.add("orderEntryNumber");
		this._orderEntryNumber = value;
	}
	
	public void setOrderEntryProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("orderEntryProduct");
		this._orderEntryProduct = value;
	}
	
	public void setOrderEntryQuantity(final Long value)
	{
		this.modifiedPropsSet.add("orderEntryQuantity");
		this._orderEntryQuantity = value;
	}
	
}
