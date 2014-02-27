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
import de.hybris.platform.promotions.dto.OrderPromotionDTO;
import de.hybris.platform.promotions.dto.PromotionPriceRowDTO;
import de.hybris.platform.promotions.model.OrderThresholdPerfectPartnerPromotionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderThresholdPerfectPartnerPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = OrderThresholdPerfectPartnerPromotionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "orderthresholdperfectpartnerpromotion")
public class OrderThresholdPerfectPartnerPromotionDTO extends OrderPromotionDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.messageFired</code> attribute defined at extension <code> */
	private java.lang.String _messageFired;
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.includeDiscountedPriceInThreshold</code> attribute defined at extension <code> */
	private java.lang.Boolean _includeDiscountedPriceInThreshold;
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.discountProduct</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _discountProduct;
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.thresholdTotals</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.PromotionPriceRowDTO> _thresholdTotals;
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.messageThresholdNoProduct</code> attribute defined at extension <code> */
	private java.lang.String _messageThresholdNoProduct;
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.productPrices</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.PromotionPriceRowDTO> _productPrices;
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.messageProductNoThreshold</code> attribute defined at extension <code> */
	private java.lang.String _messageProductNoThreshold;
	/** <i>Generated variable</i> - Variable of <code>OrderThresholdPerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code> */
	private java.lang.String _messageCouldHaveFired;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdPerfectPartnerPromotionDTO()
	{
		super();
	}
	
	
	public ProductDTO getDiscountProduct()
	{
		return this._discountProduct;
	}
	
	public Boolean getIncludeDiscountedPriceInThreshold()
	{
		return this._includeDiscountedPriceInThreshold;
	}
	
	public String getMessageCouldHaveFired()
	{
		return this._messageCouldHaveFired;
	}
	
	public String getMessageFired()
	{
		return this._messageFired;
	}
	
	public String getMessageProductNoThreshold()
	{
		return this._messageProductNoThreshold;
	}
	
	public String getMessageThresholdNoProduct()
	{
		return this._messageThresholdNoProduct;
	}
	
	@XmlElementWrapper(name = "productPrices")
	@XmlElement(name = "promotionPriceRow")
	public Collection<PromotionPriceRowDTO> getProductPrices()
	{
		return this._productPrices;
	}
	
	@XmlElementWrapper(name = "thresholdTotals")
	@XmlElement(name = "promotionPriceRow")
	public Collection<PromotionPriceRowDTO> getThresholdTotals()
	{
		return this._thresholdTotals;
	}
	
	public void setDiscountProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("discountProduct");
		this._discountProduct = value;
	}
	
	public void setIncludeDiscountedPriceInThreshold(final Boolean value)
	{
		this.modifiedPropsSet.add("includeDiscountedPriceInThreshold");
		this._includeDiscountedPriceInThreshold = value;
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
	
	public void setMessageProductNoThreshold(final String value)
	{
		this.modifiedPropsSet.add("messageProductNoThreshold");
		this._messageProductNoThreshold = value;
	}
	
	public void setMessageThresholdNoProduct(final String value)
	{
		this.modifiedPropsSet.add("messageThresholdNoProduct");
		this._messageThresholdNoProduct = value;
	}
	
	public void setProductPrices(final Collection<PromotionPriceRowDTO> value)
	{
		this.modifiedPropsSet.add("productPrices");
		this._productPrices = value;
	}
	
	public void setThresholdTotals(final Collection<PromotionPriceRowDTO> value)
	{
		this.modifiedPropsSet.add("thresholdTotals");
		this._thresholdTotals = value;
	}
	
}
