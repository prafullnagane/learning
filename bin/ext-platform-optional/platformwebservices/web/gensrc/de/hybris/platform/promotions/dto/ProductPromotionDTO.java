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

import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.promotions.dto.AbstractPromotionDTO;
import de.hybris.platform.promotions.model.ProductPromotionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = ProductPromotionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productpromotion")
public class ProductPromotionDTO extends AbstractPromotionDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductPromotion.products</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.product.ProductDTO> _products;
	/** <i>Generated variable</i> - Variable of <code>ProductPromotion.categories</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.category.dto.CategoryDTO> _categories;
	/** <i>Generated variable</i> - Variable of <code>ProductPromotion.productBanner</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _productBanner;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPromotionDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "categories")
	@XmlElement(name = "category")
	public Collection<CategoryDTO> getCategories()
	{
		return this._categories;
	}
	
	public MediaDTO getProductBanner()
	{
		return this._productBanner;
	}
	
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	public Collection<ProductDTO> getProducts()
	{
		return this._products;
	}
	
	public void setCategories(final Collection<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("categories");
		this._categories = value;
	}
	
	public void setProductBanner(final MediaDTO value)
	{
		this.modifiedPropsSet.add("productBanner");
		this._productBanner = value;
	}
	
	public void setProducts(final Collection<ProductDTO> value)
	{
		this.modifiedPropsSet.add("products");
		this._products = value;
	}
	
}
