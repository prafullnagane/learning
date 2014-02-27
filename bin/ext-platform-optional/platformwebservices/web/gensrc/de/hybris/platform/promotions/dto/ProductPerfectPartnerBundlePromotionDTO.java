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
import de.hybris.platform.promotions.model.ProductPerfectPartnerBundlePromotionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductPerfectPartnerBundlePromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = ProductPerfectPartnerBundlePromotionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productperfectpartnerbundlepromotion")
public class ProductPerfectPartnerBundlePromotionDTO extends ProductPromotionDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductPerfectPartnerBundlePromotion.qualifyingCount</code> attribute defined at extension <code> */
	private java.lang.Integer _qualifyingCount;
	/** <i>Generated variable</i> - Variable of <code>ProductPerfectPartnerBundlePromotion.partnerProducts</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.product.ProductDTO> _partnerProducts;
	/** <i>Generated variable</i> - Variable of <code>ProductPerfectPartnerBundlePromotion.messageCouldHaveFired</code> attribute defined at extension <code> */
	private java.lang.String _messageCouldHaveFired;
	/** <i>Generated variable</i> - Variable of <code>ProductPerfectPartnerBundlePromotion.bundlePrices</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.PromotionPriceRowDTO> _bundlePrices;
	/** <i>Generated variable</i> - Variable of <code>ProductPerfectPartnerBundlePromotion.messageFired</code> attribute defined at extension <code> */
	private java.lang.String _messageFired;
	/** <i>Generated variable</i> - Variable of <code>ProductPerfectPartnerBundlePromotion.baseProduct</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _baseProduct;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPerfectPartnerBundlePromotionDTO()
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
	
	@XmlElementWrapper(name = "partnerProducts")
	@XmlElement(name = "product")
	public Collection<ProductDTO> getPartnerProducts()
	{
		return this._partnerProducts;
	}
	
	public Integer getQualifyingCount()
	{
		return this._qualifyingCount;
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
	
	public void setPartnerProducts(final Collection<ProductDTO> value)
	{
		this.modifiedPropsSet.add("partnerProducts");
		this._partnerProducts = value;
	}
	
	public void setQualifyingCount(final Integer value)
	{
		this.modifiedPropsSet.add("qualifyingCount");
		this._qualifyingCount = value;
	}
	
}
