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
import de.hybris.platform.core.dto.order.AbstractOrderEntryDTO;
import de.hybris.platform.promotions.dto.PromotionResultDTO;
import de.hybris.platform.promotions.model.PromotionOrderEntryConsumedModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PromotionOrderEntryConsumed first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = PromotionOrderEntryConsumedModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "promotionorderentryconsumed")
public class PromotionOrderEntryConsumedDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryConsumed.quantity</code> attribute defined at extension <code> */
	private java.lang.Long _quantity;
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryConsumed.adjustedUnitPrice</code> attribute defined at extension <code> */
	private java.lang.Double _adjustedUnitPrice;
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryConsumed.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryConsumed.orderEntry</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.AbstractOrderEntryDTO _orderEntry;
	/** <i>Generated variable</i> - Variable of <code>PromotionOrderEntryConsumed.promotionResult</code> attribute defined at extension <code> */
	private de.hybris.platform.promotions.dto.PromotionResultDTO _promotionResult;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderEntryConsumedDTO()
	{
		super();
	}
	
	
	public Double getAdjustedUnitPrice()
	{
		return this._adjustedUnitPrice;
	}
	
	public String getCode()
	{
		return this._code;
	}
	
	public AbstractOrderEntryDTO getOrderEntry()
	{
		return this._orderEntry;
	}
	
	public PromotionResultDTO getPromotionResult()
	{
		return this._promotionResult;
	}
	
	public Long getQuantity()
	{
		return this._quantity;
	}
	
	public void setAdjustedUnitPrice(final Double value)
	{
		this.modifiedPropsSet.add("adjustedUnitPrice");
		this._adjustedUnitPrice = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setOrderEntry(final AbstractOrderEntryDTO value)
	{
		this.modifiedPropsSet.add("orderEntry");
		this._orderEntry = value;
	}
	
	public void setPromotionResult(final PromotionResultDTO value)
	{
		this.modifiedPropsSet.add("promotionResult");
		this._promotionResult = value;
	}
	
	public void setQuantity(final Long value)
	{
		this.modifiedPropsSet.add("quantity");
		this._quantity = value;
	}
	
}
