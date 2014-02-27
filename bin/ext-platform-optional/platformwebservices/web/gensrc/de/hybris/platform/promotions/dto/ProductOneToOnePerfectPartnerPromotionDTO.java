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
import de.hybris.platform.promotions.dto.ProductPromotionDTO;
import de.hybris.platform.promotions.dto.PromotionPriceRowDTO;
import de.hybris.platform.promotions.model.ProductOneToOnePerfectPartnerPromotionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductOneToOnePerfectPartnerPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = ProductOneToOnePerfectPartnerPromotionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productonetooneperfectpartnerpromotion")
public class ProductOneToOnePerfectPartnerPromotionDTO extends ProductPromotionDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductOneToOnePerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code> */
	private java.lang.String _messageCouldHaveFired;
	/** <i>Generated variable</i> - Variable of <code>ProductOneToOnePerfectPartnerPromotion.baseProduct</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _baseProduct;
	/** <i>Generated variable</i> - Variable of <code>ProductOneToOnePerfectPartnerPromotion.partnerProduct</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _partnerProduct;
	/** <i>Generated variable</i> - Variable of <code>ProductOneToOnePerfectPartnerPromotion.bundlePrices</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.PromotionPriceRowDTO> _bundlePrices;
	/** <i>Generated variable</i> - Variable of <code>ProductOneToOnePerfectPartnerPromotion.messageFired</code> attribute defined at extension <code> */
	private java.lang.String _messageFired;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductOneToOnePerfectPartnerPromotionDTO()
	{
		super();
	}
	
	
	public ProductDTO getBaseProduct()
	{
		return this._baseProduct;
	}
	
	@XmlElementWrapper(name = "bundlePrices")
	@XmlElement(name = "promotionPriceRow")
	public Collection<PromotionPriceRowDTO> getBundlePrices()
	{
		return this._bundlePrices;
	}
	
	public String getMessageCouldHaveFired()
	{
		return this._messageCouldHaveFired;
	}
	
	public String getMessageFired()
	{
		return this._messageFired;
	}
	
	public ProductDTO getPartnerProduct()
	{
		return this._partnerProduct;
	}
	
	public void setBaseProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("baseProduct");
		this._baseProduct = value;
	}
	
	public void setBundlePrices(final Collection<PromotionPriceRowDTO> value)
	{
		this.modifiedPropsSet.add("bundlePrices");
		this._bundlePrices = value;
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
	
	public void setPartnerProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("partnerProduct");
		this._partnerProduct = value;
	}
	
}
