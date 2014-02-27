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
import de.hybris.platform.cms2lib.model.components.ProductListComponentModel;
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
 * Generated dto class for type ProductListComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@GraphNode(target = ProductListComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "productlistcomponent")
public class ProductListComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.products</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.product.ProductDTO> _products;
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.productCodes</code> attribute defined at extension <code> */
	private java.util.List<java.lang.String> _productCodes;
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.searchQuery</code> attribute defined at extension <code> */
	private java.lang.String _searchQuery;
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.category</code> attribute defined at extension <code> */
	private de.hybris.platform.category.dto.CategoryDTO _category;
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.headline</code> attribute defined at extension <code> */
	private java.lang.String _headline;
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.productsFromContext</code> attribute defined at extension <code> */
	private boolean _productsFromContext;
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.pagination</code> attribute defined at extension <code> */
	private boolean _pagination;
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.categoryCode</code> attribute defined at extension <code> */
	private java.lang.String _categoryCode;
	/** <i>Generated variable</i> - Variable of <code>ProductListComponent.layout</code> attribute defined at extension <code> */
	private java.lang.String _layout;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductListComponentDTO()
	{
		super();
	}
	
	
	public CategoryDTO getCategory()
	{
		return this._category;
	}
	
	public String getCategoryCode()
	{
		return this._categoryCode;
	}
	
	public String getHeadline()
	{
		return this._headline;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getLayout()
	{
		return this._layout;
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
	
	public String getSearchQuery()
	{
		return this._searchQuery;
	}
	
	public boolean isPagination()
	{
		return this._pagination;
	}
	
	public boolean isProductsFromContext()
	{
		return this._productsFromContext;
	}
	
	public void setCategory(final CategoryDTO value)
	{
		this.modifiedPropsSet.add("category");
		this._category = value;
	}
	
	public void setCategoryCode(final String value)
	{
		this.modifiedPropsSet.add("categoryCode");
		this._categoryCode = value;
	}
	
	public void setHeadline(final String value)
	{
		this.modifiedPropsSet.add("headline");
		this._headline = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setLayout(final String value)
	{
		this.modifiedPropsSet.add("layout");
		this._layout = value;
	}
	
	public void setPagination(final boolean value)
	{
		this.modifiedPropsSet.add("pagination");
		this._pagination = value;
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
	
	public void setProductsFromContext(final boolean value)
	{
		this.modifiedPropsSet.add("productsFromContext");
		this._productsFromContext = value;
	}
	
	public void setSearchQuery(final String value)
	{
		this.modifiedPropsSet.add("searchQuery");
		this._searchQuery = value;
	}
	
}
