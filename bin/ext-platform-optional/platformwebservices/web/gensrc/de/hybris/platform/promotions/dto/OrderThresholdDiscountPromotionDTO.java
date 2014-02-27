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

import de.hybris.platform.promotions.dto.OrderPromotionDTO;
import de.hybris.platform.promotions.dto.PromotionPriceRowDTO;
import de.hybris.platform.promotions.model.OrderThresholdDiscountPromotionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderThresholdDiscountPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = OrderThresholdDiscountPromotionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "orderthresholddiscountpromotion")
public class OrderThresholdDiscountPromotionDTO extends OrderPromotionDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdDiscountPromotion.messageFired</code> attribute defined at extension <code> */
	private java.lang.String _messageFired;
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdDiscountPromotion.thresholdTotals</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.PromotionPriceRowDTO> _thresholdTotals;
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdDiscountPromotion.messageCouldHaveFired</code> attribute defined at extension <code> */
	private java.lang.String _messageCouldHaveFired;
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdDiscountPromotion.discountPrices</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.PromotionPriceRowDTO> _discountPrices;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdDiscountPromotionDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "discountPrices")
	@XmlElement(name = "promotionPriceRow")
	public Collection<PromotionPriceRowDTO> getDiscountPrices()
	{
		return this._discountPrices;
	}
	
	public String getMessageCouldHaveFired()
	{
		return this._messageCouldHaveFired;
	}
	
	public String getMessageFired()
	{
		return this._messageFired;
	}
	
	@XmlElementWrapper(name = "thresholdTotals")
	@XmlElement(name = "promotionPriceRow")
	public Collection<PromotionPriceRowDTO> getThresholdTotals()
	{
		return this._thresholdTotals;
	}
	
	public void setDiscountPrices(final Collection<PromotionPriceRowDTO> value)
	{
		this.modifiedPropsSet.add("discountPrices");
		this._discountPrices = value;
	}
	
	public void setMessageCouldHaveFired(final String value)
	{
		this.modifiedPropsSet.add("messageCouldHaveFired");
		this._messageCouldHaveFired = value;
	}
	
	public void setMessageFired(final String value)
	{
		this.modifiedPropsSet.add("messageFired");
		this._messageFired = value;
	}
	
	public void setThresholdTotals(final Collection<PromotionPriceRowDTO> value)
	{
		this.modifiedPropsSet.add("thresholdTotals");
		this._thresholdTotals = value;
	}
	
}
