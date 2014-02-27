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
package de.hybris.platform.category.dto;

import de.hybris.platform.acceleratorcms.dto.components.CategoryFeatureComponentDTO;
import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.dto.KeywordDTO;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentDTO;
import de.hybris.platform.cms2.dto.restrictions.CMSCategoryRestrictionDTO;
import de.hybris.platform.cms2lib.dto.components.ProductCarouselComponentDTO;
import de.hybris.platform.cms2lib.dto.components.ProductListComponentDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.promotions.dto.ProductPromotionDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Category first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = CategoryModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "category")
public class CategoryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Category.thumbnails</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _thumbnails;
	/** <i>Generated variable</i> - Variable of <code>Category.logo</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _logo;
	/** <i>Generated variable</i> - Variable of <code>Category.allSupercategories</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.category.dto.CategoryDTO> _allSupercategories;
	/** <i>Generated variable</i> - Variable of <code>Category.categories</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.category.dto.CategoryDTO> _categories;
	/** <i>Generated variable</i> - Variable of <code>Category.others</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _others;
	/** <i>Generated variable</i> - Variable of <code>Category.data_sheet</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _data_sheet;
	/** <i>Generated variable</i> - Variable of <code>Category.supercategories</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.category.dto.CategoryDTO> _supercategories;
	/** <i>Generated variable</i> - Variable of <code>Category.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Category.medias</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.media.MediaDTO> _medias;
	/** <i>Generated variable</i> - Variable of <code>Category.products</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.product.ProductDTO> _products;
	/** <i>Generated variable</i> - Variable of <code>Category.order</code> attribute defined at extension <code> */
	private java.lang.Integer _order;
	/** <i>Generated variable</i> - Variable of <code>Category.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>Category.promotions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.ProductPromotionDTO> _promotions;
	/** <i>Generated variable</i> - Variable of <code>Category.linkComponents</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentDTO> _linkComponents;
	/** <i>Generated variable</i> - Variable of <code>Category.detail</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _detail;
	/** <i>Generated variable</i> - Variable of <code>Category.normal</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _normal;
	/** <i>Generated variable</i> - Variable of <code>Category.allowedPrincipals</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.security.PrincipalDTO> _allowedPrincipals;
	/** <i>Generated variable</i> - Variable of <code>Category.keywords</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.KeywordDTO> _keywords;
	/** <i>Generated variable</i> - Variable of <code>Category.productCarouselComponents</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2lib.dto.components.ProductCarouselComponentDTO> _productCarouselComponents;
	/** <i>Generated variable</i> - Variable of <code>Category.categoryFeatureComponents</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorcms.dto.components.CategoryFeatureComponentDTO> _categoryFeatureComponents;
	/** <i>Generated variable</i> - Variable of <code>Category.catalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _catalogVersion;
	/** <i>Generated variable</i> - Variable of <code>Category.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>Category.picture</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _picture;
	/** <i>Generated variable</i> - Variable of <code>Category.allSubcategories</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.category.dto.CategoryDTO> _allSubcategories;
	/** <i>Generated variable</i> - Variable of <code>Category.thumbnail</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _thumbnail;
	/** <i>Generated variable</i> - Variable of <code>Category.restrictions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.restrictions.CMSCategoryRestrictionDTO> _restrictions;
	/** <i>Generated variable</i> - Variable of <code>Category.productListComponents</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2lib.dto.components.ProductListComponentDTO> _productListComponents;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CategoryDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "allowedPrincipals")
	@XmlElement(name = "principal")
	public List<PrincipalDTO> getAllowedPrincipals()
	{
		return this._allowedPrincipals;
	}
	
	@XmlElementWrapper(name = "allSubcategories")
	@XmlElement(name = "category")
	public Collection<CategoryDTO> getAllSubcategories()
	{
		return this._allSubcategories;
	}
	
	@XmlElementWrapper(name = "allSupercategories")
	@XmlElement(name = "category")
	public Collection<CategoryDTO> getAllSupercategories()
	{
		return this._allSupercategories;
	}
	
	public CatalogVersionDTO getCatalogVersion()
	{
		return this._catalogVersion;
	}
	
	@XmlElementWrapper(name = "categories")
	@XmlElement(name = "category")
	public List<CategoryDTO> getCategories()
	{
		return this._categories;
	}
	
	@XmlElementWrapper(name = "categoryFeatureComponents")
	@XmlElement(name = "categoryFeatureComponent")
	public List<CategoryFeatureComponentDTO> getCategoryFeatureComponents()
	{
		return this._categoryFeatureComponents;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "data_sheet")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getData_sheet()
	{
		return this._data_sheet;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	@XmlElementWrapper(name = "detail")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getDetail()
	{
		return this._detail;
	}
	
	public List<KeywordDTO> getKeywords()
	{
		return this._keywords;
	}
	
	@XmlElementWrapper(name = "linkComponents")
	@XmlElement(name = "cMSLinkComponent")
	public List<CMSLinkComponentDTO> getLinkComponents()
	{
		return this._linkComponents;
	}
	
	@XmlElementWrapper(name = "logo")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getLogo()
	{
		return this._logo;
	}
	
	@XmlElementWrapper(name = "medias")
	@XmlElement(name = "media")
	public List<MediaDTO> getMedias()
	{
		return this._medias;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlElementWrapper(name = "normal")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getNormal()
	{
		return this._normal;
	}
	
	public Integer getOrder()
	{
		return this._order;
	}
	
	@XmlElementWrapper(name = "others")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getOthers()
	{
		return this._others;
	}
	
	public MediaDTO getPicture()
	{
		return this._picture;
	}
	
	@XmlElementWrapper(name = "productCarouselComponents")
	@XmlElement(name = "productCarouselComponent")
	public Collection<ProductCarouselComponentDTO> getProductCarouselComponents()
	{
		return this._productCarouselComponents;
	}
	
	@XmlElementWrapper(name = "productListComponents")
	@XmlElement(name = "productListComponent")
	public List<ProductListComponentDTO> getProductListComponents()
	{
		return this._productListComponents;
	}
	
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	public List<ProductDTO> getProducts()
	{
		return this._products;
	}
	
	@XmlElementWrapper(name = "promotions")
	@XmlElement(name = "productPromotion")
	public Collection<ProductPromotionDTO> getPromotions()
	{
		return this._promotions;
	}
	
	@XmlElementWrapper(name = "restrictions")
	@XmlElement(name = "cMSCategoryRestriction")
	public Collection<CMSCategoryRestrictionDTO> getRestrictions()
	{
		return this._restrictions;
	}
	
	@XmlElementWrapper(name = "supercategories")
	@XmlElement(name = "category")
	public List<CategoryDTO> getSupercategories()
	{
		return this._supercategories;
	}
	
	public MediaDTO getThumbnail()
	{
		return this._thumbnail;
	}
	
	@XmlElementWrapper(name = "thumbnails")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getThumbnails()
	{
		return this._thumbnails;
	}
	
	public void setAllowedPrincipals(final List<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("allowedPrincipals");
		this._allowedPrincipals = value;
	}
	
	public void setAllSubcategories(final Collection<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("allSubcategories");
		this._allSubcategories = value;
	}
	
	public void setAllSupercategories(final Collection<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("allSupercategories");
		this._allSupercategories = value;
	}
	
	public void setCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("catalogVersion");
		this._catalogVersion = value;
	}
	
	public void setCategories(final List<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("categories");
		this._categories = value;
	}
	
	public void setCategoryFeatureComponents(final List<CategoryFeatureComponentDTO> value)
	{
		this.modifiedPropsSet.add("categoryFeatureComponents");
		this._categoryFeatureComponents = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setData_sheet(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("data_sheet");
		this._data_sheet = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setDetail(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("detail");
		this._detail = value;
	}
	
	public void setKeywords(final List<KeywordDTO> value)
	{
		this.modifiedPropsSet.add("keywords");
		this._keywords = value;
	}
	
	public void setLinkComponents(final List<CMSLinkComponentDTO> value)
	{
		this.modifiedPropsSet.add("linkComponents");
		this._linkComponents = value;
	}
	
	public void setLogo(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("logo");
		this._logo = value;
	}
	
	public void setMedias(final List<MediaDTO> value)
	{
		this.modifiedPropsSet.add("medias");
		this._medias = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setNormal(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("normal");
		this._normal = value;
	}
	
	public void setOrder(final Integer value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
	public void setOthers(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("others");
		this._others = value;
	}
	
	public void setPicture(final MediaDTO value)
	{
		this.modifiedPropsSet.add("picture");
		this._picture = value;
	}
	
	public void setProductCarouselComponents(final Collection<ProductCarouselComponentDTO> value)
	{
		this.modifiedPropsSet.add("productCarouselComponents");
		this._productCarouselComponents = value;
	}
	
	public void setProductListComponents(final List<ProductListComponentDTO> value)
	{
		this.modifiedPropsSet.add("productListComponents");
		this._productListComponents = value;
	}
	
	public void setProducts(final List<ProductDTO> value)
	{
		this.modifiedPropsSet.add("products");
		this._products = value;
	}
	
	public void setPromotions(final Collection<ProductPromotionDTO> value)
	{
		this.modifiedPropsSet.add("promotions");
		this._promotions = value;
	}
	
	public void setRestrictions(final Collection<CMSCategoryRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("restrictions");
		this._restrictions = value;
	}
	
	public void setSupercategories(final List<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("supercategories");
		this._supercategories = value;
	}
	
	public void setThumbnail(final MediaDTO value)
	{
		this.modifiedPropsSet.add("thumbnail");
		this._thumbnail = value;
	}
	
	public void setThumbnails(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("thumbnails");
		this._thumbnails = value;
	}
	
}
