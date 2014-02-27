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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.model.KeywordModel;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Keyword first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = KeywordModel.class, factory = GenericNodeFactory.class, uidProperties="keyword")
@XmlRootElement(name = "keyword")
public class KeywordDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Keyword.catalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _catalogVersion;
	/** <i>Generated variable</i> - Variable of <code>Keyword.language</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _language;
	/** <i>Generated variable</i> - Variable of <code>Keyword.categories</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.category.dto.CategoryDTO> _categories;
	/** <i>Generated variable</i> - Variable of <code>Keyword.keyword</code> attribute defined at extension <code> */
	private java.lang.String _keyword;
	/** <i>Generated variable</i> - Variable of <code>Keyword.products</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.product.ProductDTO> _products;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public KeywordDTO()
	{
		super();
	}
	
	
	public CatalogVersionDTO getCatalogVersion()
	{
		return this._catalogVersion;
	}
	
	public Collection<CategoryDTO> getCategories()
	{
		return this._categories;
	}
	
	@XmlAttribute
	public String getKeyword()
	{
		return this._keyword;
	}
	
	public LanguageDTO getLanguage()
	{
		return this._language;
	}
	
	public Collection<ProductDTO> getProducts()
	{
		return this._products;
	}
	
	public void setCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("catalogVersion");
		this._catalogVersion = value;
	}
	
	public void setCategories(final Collection<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("categories");
		this._categories = value;
	}
	
	public void setKeyword(final String value)
	{
		this.modifiedPropsSet.add("keyword");
		this._keyword = value;
	}
	
	public void setLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("language");
		this._language = value;
	}
	
	public void setProducts(final Collection<ProductDTO> value)
	{
		this.modifiedPropsSet.add("products");
		this._products = value;
	}
	
}
