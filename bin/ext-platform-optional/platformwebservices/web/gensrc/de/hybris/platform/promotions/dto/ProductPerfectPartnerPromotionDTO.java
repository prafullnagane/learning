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
import de.hybris.platform.promotions.model.ProductPerfectPartnerPromotionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductPerfectPartnerPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = ProductPerfectPartnerPromotionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productperfectpartnerpromotion")
public class ProductPerfectPartnerPromotionDTO extends ProductPromotionDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductPerfectPartnerPromotion.partnerProducts</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.product.ProductDTO> _partnerProducts;
	/** <i>Generated variable</i> - Variable of <code>ProductPerfectPartnerPromotion.messageCouldHaveFired</code> attribute defined at extension <code> */
	private java.lang.String _messageCouldHaveFired;
	/** <i>Generated variable</i> - Variable of <code>ProductPerfectPartnerPromotion.partnerPrices</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.PromotionPriceRowDTO> _partnerPrices;
	/** <i>Generated variable</i> - Variable of <code>ProductPerfectPartnerPromotion.messageFired</code> attribute defined at extension <code> */
	private java.lang.String _messageFired;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPerfectPartnerPromotionDTO()
	{
		super();
	}
	
	
	public String getMessageCouldHaveFired()
	{
		return this._messageCouldHaveFired;
	}
	
	public String getMessageFired()
	{
		return this._messageFired;
	}
	
	@XmlElementWrapper(name = "partnerPrices")
	@XmlElement(name = "promotionPriceRow")
	public Collection<PromotionPriceRowDTO> getPartnerPrices()
	{
		return this._partnerPrices;
	}
	
	@XmlElementWrapper(name = "partnerProducts")
	@XmlElement(name = "product")
	public Collection<ProductDTO> getPartnerProducts()
	{
		return this._partnerProducts;
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
	
	public void setPartnerPrices(final Collection<PromotionPriceRowDTO> value)
	{
		this.modifiedPropsSet.add("partnerPrices");
		this._partnerPrices = value;
	}
	
	public void setPartnerProducts(final Collection<ProductDTO> value)
	{
		this.modifiedPropsSet.add("partnerProducts");
		this._partnerProducts = value;
	}
	
}
