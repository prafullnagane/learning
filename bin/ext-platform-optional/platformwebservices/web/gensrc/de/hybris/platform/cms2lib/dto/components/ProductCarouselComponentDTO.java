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
package de.hybris.platform.cms2lib.dto.components;

import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.cms2lib.model.components.ProductCarouselComponentModel;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductCarouselComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@GraphNode(target = ProductCarouselComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "productcarouselcomponent")
public class ProductCarouselComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.categoryCode</code> attribute defined at extension <code> */
	private java.lang.String _categoryCode;
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.popup</code> attribute defined at extension <code> */
	private boolean _popup;
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.categoryCodes</code> attribute defined at extension <code> */
	private java.util.List<java.lang.String> _categoryCodes;
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.searchQuery</code> attribute defined at extension <code> */
	private java.lang.String _searchQuery;
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.categories</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.category.dto.CategoryDTO> _categories;
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.productCodes</code> attribute defined at extension <code> */
	private java.util.List<java.lang.String> _productCodes;
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.scroll</code> attribute defined at extension <code> */
	private java.lang.String _scroll;
	/** <i>Generated variable</i> - Variable of <code>ProductCarouselComponent.products</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.product.ProductDTO> _products;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductCarouselComponentDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "categories")
	@XmlElement(name = "category")
	public List<CategoryDTO> getCategories()
	{
		return this._categories;
	}
	
	public String getCategoryCode()
	{
		return this._categoryCode;
	}
	
	@XmlElementWrapper(name = "categoryCodes")
	@XmlElement(name = "value")
	public List<String> getCategoryCodes()
	{
		return this._categoryCodes;
	}
	
	@XmlElementWrapper(name = "productCodes")
	@XmlElement(name = "value")
	public List<String> getProductCodes()
	{
		return this._productCodes;
	}
	
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	public List<ProductDTO> getProducts()
	{
		return this._products;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getScroll()
	{
		return this._scroll;
	}
	
	public String getSearchQuery()
	{
		return this._searchQuery;
	}
	
	public String getTitle()
	{
		return this._title;
	}
	
	public boolean isPopup()
	{
		return this._popup;
	}
	
	public void setCategories(final List<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("categories");
		this._categories = value;
	}
	
	public void setCategoryCode(final String value)
	{
		this.modifiedPropsSet.add("categoryCode");
		this._categoryCode = value;
	}
	
	public void setCategoryCodes(final List<String> value)
	{
		this.modifiedPropsSet.add("categoryCodes");
		this._categoryCodes = value;
	}
	
	public void setPopup(final boolean value)
	{
		this.modifiedPropsSet.add("popup");
		this._popup = value;
	}
	
	public void setProductCodes(final List<String> value)
	{
		this.modifiedPropsSet.add("productCodes");
		this._productCodes = value;
	}
	
	public void setProducts(final List<ProductDTO> value)
	{
		this.modifiedPropsSet.add("products");
		this._products = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setScroll(final String value)
	{
		this.modifiedPropsSet.add("scroll");
		this._scroll = value;
	}
	
	public void setSearchQuery(final String value)
	{
		this.modifiedPropsSet.add("searchQuery");
		this._searchQuery = value;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
}
