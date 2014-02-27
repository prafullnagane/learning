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
package de.hybris.platform.cms2.dto.site;

import de.hybris.platform.basecommerce.dto.site.BaseSiteDTO;
import de.hybris.platform.btg.dto.BTGSegmentDTO;
import de.hybris.platform.catalog.dto.CatalogDTO;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.cms2.dto.CMSComponentTypeDTO;
import de.hybris.platform.cms2.dto.contents.ContentCatalogDTO;
import de.hybris.platform.cms2.dto.pages.ContentPageDTO;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSSite first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSSiteModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmssite")
public class CMSSiteDTO extends BaseSiteDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSSite.startingPage</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.pages.ContentPageDTO _startingPage;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.validComponentTypes</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.cms2.dto.CMSComponentTypeDTO> _validComponentTypes;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.productCatalogs</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.CatalogDTO> _productCatalogs;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.defaultCatalog</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogDTO _defaultCatalog;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.urlPatterns</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _urlPatterns;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.urlEncodingAttributes</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _urlEncodingAttributes;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.redirectURL</code> attribute defined at extension <code> */
	private java.lang.String _redirectURL;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.defaultPreviewProduct</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _defaultPreviewProduct;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.previewURL</code> attribute defined at extension <code> */
	private java.lang.String _previewURL;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.activeFrom</code> attribute defined at extension <code> */
	private java.util.Date _activeFrom;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.defaultPreviewCatalog</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogDTO _defaultPreviewCatalog;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.startPageLabel</code> attribute defined at extension <code> */
	private java.lang.String _startPageLabel;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.segments</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.btg.dto.BTGSegmentDTO> _segments;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.activeUntil</code> attribute defined at extension <code> */
	private java.util.Date _activeUntil;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.defaultPreviewCategory</code> attribute defined at extension <code> */
	private de.hybris.platform.category.dto.CategoryDTO _defaultPreviewCategory;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.active</code> attribute defined at extension <code> */
	private java.lang.Boolean _active;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.classificationCatalogs</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.CatalogDTO> _classificationCatalogs;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.contentCatalogs</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.contents.ContentCatalogDTO> _contentCatalogs;
	/** <i>Generated variable</i> - Variable of <code>CMSSite.openPreviewInNewTab</code> attribute defined at extension <code> */
	private boolean _openPreviewInNewTab;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSSiteDTO()
	{
		super();
	}
	
	
	public Boolean getActive()
	{
		return this._active;
	}
	
	public Date getActiveFrom()
	{
		return this._activeFrom;
	}
	
	public Date getActiveUntil()
	{
		return this._activeUntil;
	}
	
	@XmlElementWrapper(name = "classificationCatalogs")
	@XmlElement(name = "catalog")
	public List<CatalogDTO> getClassificationCatalogs()
	{
		return this._classificationCatalogs;
	}
	
	@XmlElementWrapper(name = "contentCatalogs")
	@XmlElement(name = "contentCatalog")
	public List<ContentCatalogDTO> getContentCatalogs()
	{
		return this._contentCatalogs;
	}
	
	public CatalogDTO getDefaultCatalog()
	{
		return this._defaultCatalog;
	}
	
	public CatalogDTO getDefaultPreviewCatalog()
	{
		return this._defaultPreviewCatalog;
	}
	
	public CategoryDTO getDefaultPreviewCategory()
	{
		return this._defaultPreviewCategory;
	}
	
	public ProductDTO getDefaultPreviewProduct()
	{
		return this._defaultPreviewProduct;
	}
	
	public String getPreviewURL()
	{
		return this._previewURL;
	}
	
	@XmlElementWrapper(name = "productCatalogs")
	@XmlElement(name = "catalog")
	public List<CatalogDTO> getProductCatalogs()
	{
		return this._productCatalogs;
	}
	
	public String getRedirectURL()
	{
		return this._redirectURL;
	}
	
	@XmlElementWrapper(name = "segments")
	@XmlElement(name = "bTGSegment")
	public Collection<BTGSegmentDTO> getSegments()
	{
		return this._segments;
	}
	
	public ContentPageDTO getStartingPage()
	{
		return this._startingPage;
	}
	
	public String getStartPageLabel()
	{
		return this._startPageLabel;
	}
	
	@XmlElementWrapper(name = "urlEncodingAttributes")
	@XmlElement(name = "value")
	public Collection<String> getUrlEncodingAttributes()
	{
		return this._urlEncodingAttributes;
	}
	
	@XmlElementWrapper(name = "urlPatterns")
	@XmlElement(name = "value")
	public Collection<String> getUrlPatterns()
	{
		return this._urlPatterns;
	}
	
	@XmlElementWrapper(name = "validComponentTypes")
	@XmlElement(name = "cMSComponentType")
	public Set<CMSComponentTypeDTO> getValidComponentTypes()
	{
		return this._validComponentTypes;
	}
	
	public boolean isOpenPreviewInNewTab()
	{
		return this._openPreviewInNewTab;
	}
	
	public void setActive(final Boolean value)
	{
		this.modifiedPropsSet.add("active");
		this._active = value;
	}
	
	public void setActiveFrom(final Date value)
	{
		this.modifiedPropsSet.add("activeFrom");
		this._activeFrom = value;
	}
	
	public void setActiveUntil(final Date value)
	{
		this.modifiedPropsSet.add("activeUntil");
		this._activeUntil = value;
	}
	
	public void setClassificationCatalogs(final List<CatalogDTO> value)
	{
		this.modifiedPropsSet.add("classificationCatalogs");
		this._classificationCatalogs = value;
	}
	
	public void setContentCatalogs(final List<ContentCatalogDTO> value)
	{
		this.modifiedPropsSet.add("contentCatalogs");
		this._contentCatalogs = value;
	}
	
	public void setDefaultCatalog(final CatalogDTO value)
	{
		this.modifiedPropsSet.add("defaultCatalog");
		this._defaultCatalog = value;
	}
	
	public void setDefaultPreviewCatalog(final CatalogDTO value)
	{
		this.modifiedPropsSet.add("defaultPreviewCatalog");
		this._defaultPreviewCatalog = value;
	}
	
	public void setDefaultPreviewCategory(final CategoryDTO value)
	{
		this.modifiedPropsSet.add("defaultPreviewCategory");
		this._defaultPreviewCategory = value;
	}
	
	public void setDefaultPreviewProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("defaultPreviewProduct");
		this._defaultPreviewProduct = value;
	}
	
	public void setOpenPreviewInNewTab(final boolean value)
	{
		this.modifiedPropsSet.add("openPreviewInNewTab");
		this._openPreviewInNewTab = value;
	}
	
	public void setPreviewURL(final String value)
	{
		this.modifiedPropsSet.add("previewURL");
		this._previewURL = value;
	}
	
	public void setProductCatalogs(final List<CatalogDTO> value)
	{
		this.modifiedPropsSet.add("productCatalogs");
		this._productCatalogs = value;
	}
	
	public void setRedirectURL(final String value)
	{
		this.modifiedPropsSet.add("redirectURL");
		this._redirectURL = value;
	}
	
	public void setSegments(final Collection<BTGSegmentDTO> value)
	{
		this.modifiedPropsSet.add("segments");
		this._segments = value;
	}
	
	public void setStartingPage(final ContentPageDTO value)
	{
		this.modifiedPropsSet.add("startingPage");
		this._startingPage = value;
	}
	
	public void setStartPageLabel(final String value)
	{
		this.modifiedPropsSet.add("startPageLabel");
		this._startPageLabel = value;
	}
	
	public void setUrlEncodingAttributes(final Collection<String> value)
	{
		this.modifiedPropsSet.add("urlEncodingAttributes");
		this._urlEncodingAttributes = value;
	}
	
	public void setUrlPatterns(final Collection<String> value)
	{
		this.modifiedPropsSet.add("urlPatterns");
		this._urlPatterns = value;
	}
	
	public void setValidComponentTypes(final Set<CMSComponentTypeDTO> value)
	{
		this.modifiedPropsSet.add("validComponentTypes");
		this._validComponentTypes = value;
	}
	
}
