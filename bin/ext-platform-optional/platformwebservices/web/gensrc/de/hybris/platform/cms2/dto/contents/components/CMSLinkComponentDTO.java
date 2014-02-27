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
package de.hybris.platform.cms2.dto.contents.components;

import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO;
import de.hybris.platform.cms2.dto.pages.ContentPageDTO;
import de.hybris.platform.cms2.model.contents.components.CMSLinkComponentModel;
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
 * Generated dto class for type CMSLinkComponent first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSLinkComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmslinkcomponent")
public class CMSLinkComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.external</code> attribute defined at extension <code> */
	private boolean _external;
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.contentPage</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.pages.ContentPageDTO _contentPage;
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.url</code> attribute defined at extension <code> */
	private java.lang.String _url;
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.navigationNodes</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO> _navigationNodes;
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.categoryCode</code> attribute defined at extension <code> */
	private java.lang.String _categoryCode;
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.target</code> attribute defined at extension <code> */
	private java.lang.String _target;
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.productCode</code> attribute defined at extension <code> */
	private java.lang.String _productCode;
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.product</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _product;
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.contentPageLabelOrId</code> attribute defined at extension <code> */
	private java.lang.String _contentPageLabelOrId;
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.category</code> attribute defined at extension <code> */
	private de.hybris.platform.category.dto.CategoryDTO _category;
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.linkName</code> attribute defined at extension <code> */
	private java.lang.String _linkName;
	/** <i>Generated variable</i> - Variable of <code>CMSLinkComponent.styleAttributes</code> attribute defined at extension <code> */
	private java.lang.String _styleAttributes;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSLinkComponentDTO()
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
	
	public ContentPageDTO getContentPage()
	{
		return this._contentPage;
	}
	
	public String getContentPageLabelOrId()
	{
		return this._contentPageLabelOrId;
	}
	
	public String getLinkName()
	{
		return this._linkName;
	}
	
	@XmlElementWrapper(name = "navigationNodes")
	@XmlElement(name = "cMSNavigationNode")
	public List<CMSNavigationNodeDTO> getNavigationNodes()
	{
		return this._navigationNodes;
	}
	
	public ProductDTO getProduct()
	{
		return this._product;
	}
	
	public String getProductCode()
	{
		return this._productCode;
	}
	
	public String getStyleAttributes()
	{
		return this._styleAttributes;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getTarget()
	{
		return this._target;
	}
	
	public String getUrl()
	{
		return this._url;
	}
	
	public boolean isExternal()
	{
		return this._external;
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
	
	public void setContentPage(final ContentPageDTO value)
	{
		this.modifiedPropsSet.add("contentPage");
		this._contentPage = value;
	}
	
	public void setContentPageLabelOrId(final String value)
	{
		this.modifiedPropsSet.add("contentPageLabelOrId");
		this._contentPageLabelOrId = value;
	}
	
	public void setExternal(final boolean value)
	{
		this.modifiedPropsSet.add("external");
		this._external = value;
	}
	
	public void setLinkName(final String value)
	{
		this.modifiedPropsSet.add("linkName");
		this._linkName = value;
	}
	
	public void setNavigationNodes(final List<CMSNavigationNodeDTO> value)
	{
		this.modifiedPropsSet.add("navigationNodes");
		this._navigationNodes = value;
	}
	
	public void setProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("product");
		this._product = value;
	}
	
	public void setProductCode(final String value)
	{
		this.modifiedPropsSet.add("productCode");
		this._productCode = value;
	}
	
	public void setStyleAttributes(final String value)
	{
		this.modifiedPropsSet.add("styleAttributes");
		this._styleAttributes = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setTarget(final String value)
	{
		this.modifiedPropsSet.add("target");
		this._target = value;
	}
	
	public void setUrl(final String value)
	{
		this.modifiedPropsSet.add("url");
		this._url = value;
	}
	
}
