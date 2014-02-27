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
package de.hybris.platform.cms2.dto.preview;

import de.hybris.platform.catalog.dto.CatalogDTO;
import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.cms2.dto.pages.AbstractPageDTO;
import de.hybris.platform.cms2.dto.site.CMSSiteDTO;
import de.hybris.platform.cms2.model.preview.PreviewDataModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CountryDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.core.dto.user.UserGroupDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PreviewData first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = PreviewDataModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "previewdata")
public class PreviewDataDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PreviewData.activeCatalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _activeCatalogVersion;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.time</code> attribute defined at extension <code> */
	private java.util.Date _time;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.country</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CountryDTO _country;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.activeSite</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.site.CMSSiteDTO _activeSite;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.uiExperience</code> attribute defined at extension <code> */
	private java.lang.String _uiExperience;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.catalogVersions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.CatalogVersionDTO> _catalogVersions;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.editMode</code> attribute defined at extension <code> */
	private java.lang.Boolean _editMode;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.previewCategory</code> attribute defined at extension <code> */
	private de.hybris.platform.category.dto.CategoryDTO _previewCategory;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.language</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _language;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.userGroup</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserGroupDTO _userGroup;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.previewCatalog</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogDTO _previewCatalog;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.liveEdit</code> attribute defined at extension <code> */
	private java.lang.Boolean _liveEdit;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.page</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.pages.AbstractPageDTO _page;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.resourcePath</code> attribute defined at extension <code> */
	private java.lang.String _resourcePath;
	/** <i>Generated variable</i> - Variable of <code>PreviewData.previewProduct</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _previewProduct;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PreviewDataDTO()
	{
		super();
	}
	
	
	public CatalogVersionDTO getActiveCatalogVersion()
	{
		return this._activeCatalogVersion;
	}
	
	public CMSSiteDTO getActiveSite()
	{
		return this._activeSite;
	}
	
	@XmlElementWrapper(name = "catalogVersions")
	@XmlElement(name = "catalogVersion")
	public Collection<CatalogVersionDTO> getCatalogVersions()
	{
		return this._catalogVersions;
	}
	
	public CountryDTO getCountry()
	{
		return this._country;
	}
	
	public Boolean getEditMode()
	{
		return this._editMode;
	}
	
	public LanguageDTO getLanguage()
	{
		return this._language;
	}
	
	public Boolean getLiveEdit()
	{
		return this._liveEdit;
	}
	
	public AbstractPageDTO getPage()
	{
		return this._page;
	}
	
	public CatalogDTO getPreviewCatalog()
	{
		return this._previewCatalog;
	}
	
	public CategoryDTO getPreviewCategory()
	{
		return this._previewCategory;
	}
	
	public ProductDTO getPreviewProduct()
	{
		return this._previewProduct;
	}
	
	public String getResourcePath()
	{
		return this._resourcePath;
	}
	
	public Date getTime()
	{
		return this._time;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getUiExperience()
	{
		return this._uiExperience;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public UserGroupDTO getUserGroup()
	{
		return this._userGroup;
	}
	
	public void setActiveCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("activeCatalogVersion");
		this._activeCatalogVersion = value;
	}
	
	public void setActiveSite(final CMSSiteDTO value)
	{
		this.modifiedPropsSet.add("activeSite");
		this._activeSite = value;
	}
	
	public void setCatalogVersions(final Collection<CatalogVersionDTO> value)
	{
		this.modifiedPropsSet.add("catalogVersions");
		this._catalogVersions = value;
	}
	
	public void setCountry(final CountryDTO value)
	{
		this.modifiedPropsSet.add("country");
		this._country = value;
	}
	
	public void setEditMode(final Boolean value)
	{
		this.modifiedPropsSet.add("editMode");
		this._editMode = value;
	}
	
	public void setLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("language");
		this._language = value;
	}
	
	public void setLiveEdit(final Boolean value)
	{
		this.modifiedPropsSet.add("liveEdit");
		this._liveEdit = value;
	}
	
	public void setPage(final AbstractPageDTO value)
	{
		this.modifiedPropsSet.add("page");
		this._page = value;
	}
	
	public void setPreviewCatalog(final CatalogDTO value)
	{
		this.modifiedPropsSet.add("previewCatalog");
		this._previewCatalog = value;
	}
	
	public void setPreviewCategory(final CategoryDTO value)
	{
		this.modifiedPropsSet.add("previewCategory");
		this._previewCategory = value;
	}
	
	public void setPreviewProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("previewProduct");
		this._previewProduct = value;
	}
	
	public void setResourcePath(final String value)
	{
		this.modifiedPropsSet.add("resourcePath");
		this._resourcePath = value;
	}
	
	public void setTime(final Date value)
	{
		this.modifiedPropsSet.add("time");
		this._time = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setUiExperience(final String value)
	{
		this.modifiedPropsSet.add("uiExperience");
		this._uiExperience = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
	public void setUserGroup(final UserGroupDTO value)
	{
		this.modifiedPropsSet.add("userGroup");
		this._userGroup = value;
	}
	
}
