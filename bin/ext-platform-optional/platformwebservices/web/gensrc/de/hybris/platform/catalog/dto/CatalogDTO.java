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

import de.hybris.platform.catalog.dto.AgreementDTO;
import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.dto.CompanyDTO;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.cms2.dto.restrictions.CMSCatalogRestrictionDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CountryDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Catalog first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = CatalogModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "catalog")
public class CatalogDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Catalog.restrictions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.restrictions.CMSCatalogRestrictionDTO> _restrictions;
	/** <i>Generated variable</i> - Variable of <code>Catalog.inclAssurance</code> attribute defined at extension <code> */
	private java.lang.Boolean _inclAssurance;
	/** <i>Generated variable</i> - Variable of <code>Catalog.territories</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.c2l.CountryDTO> _territories;
	/** <i>Generated variable</i> - Variable of <code>Catalog.inclPacking</code> attribute defined at extension <code> */
	private java.lang.Boolean _inclPacking;
	/** <i>Generated variable</i> - Variable of <code>Catalog.urlPatterns</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _urlPatterns;
	/** <i>Generated variable</i> - Variable of <code>Catalog.baseStores</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.store.BaseStoreDTO> _baseStores;
	/** <i>Generated variable</i> - Variable of <code>Catalog.version</code> attribute defined at extension <code> */
	private java.lang.String _version;
	/** <i>Generated variable</i> - Variable of <code>Catalog.previewURLTemplate</code> attribute defined at extension <code> */
	private java.lang.String _previewURLTemplate;
	/** <i>Generated variable</i> - Variable of <code>Catalog.agreements</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.AgreementDTO> _agreements;
	/** <i>Generated variable</i> - Variable of <code>Catalog.generationDate</code> attribute defined at extension <code> */
	private java.util.Date _generationDate;
	/** <i>Generated variable</i> - Variable of <code>Catalog.mimeRootDirectory</code> attribute defined at extension <code> */
	private java.lang.String _mimeRootDirectory;
	/** <i>Generated variable</i> - Variable of <code>Catalog.defaultCurrency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _defaultCurrency;
	/** <i>Generated variable</i> - Variable of <code>Catalog.catalogVersions</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.catalog.dto.CatalogVersionDTO> _catalogVersions;
	/** <i>Generated variable</i> - Variable of <code>Catalog.inclDuty</code> attribute defined at extension <code> */
	private java.lang.Boolean _inclDuty;
	/** <i>Generated variable</i> - Variable of <code>Catalog.rootCategories</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.category.dto.CategoryDTO> _rootCategories;
	/** <i>Generated variable</i> - Variable of <code>Catalog.activeCatalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _activeCatalogVersion;
	/** <i>Generated variable</i> - Variable of <code>Catalog.defaultCatalog</code> attribute defined at extension <code> */
	private java.lang.Boolean _defaultCatalog;
	/** <i>Generated variable</i> - Variable of <code>Catalog.languages</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.c2l.LanguageDTO> _languages;
	/** <i>Generated variable</i> - Variable of <code>Catalog.buyer</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CompanyDTO _buyer;
	/** <i>Generated variable</i> - Variable of <code>Catalog.generatorInfo</code> attribute defined at extension <code> */
	private java.lang.String _generatorInfo;
	/** <i>Generated variable</i> - Variable of <code>Catalog.inclFreight</code> attribute defined at extension <code> */
	private java.lang.Boolean _inclFreight;
	/** <i>Generated variable</i> - Variable of <code>Catalog.id</code> attribute defined at extension <code> */
	private java.lang.String _id;
	/** <i>Generated variable</i> - Variable of <code>Catalog.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>Catalog.supplier</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CompanyDTO _supplier;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogDTO()
	{
		super();
	}
	
	
	public CatalogVersionDTO getActiveCatalogVersion()
	{
		return this._activeCatalogVersion;
	}
	
	@XmlElementWrapper(name = "agreements")
	@XmlElement(name = "agreement")
	public Collection<AgreementDTO> getAgreements()
	{
		return this._agreements;
	}
	
	@XmlElementWrapper(name = "baseStores")
	@XmlElement(name = "baseStore")
	public Collection<BaseStoreDTO> getBaseStores()
	{
		return this._baseStores;
	}
	
	public CompanyDTO getBuyer()
	{
		return this._buyer;
	}
	
	@XmlElementWrapper(name = "catalogVersions")
	@XmlElement(name = "catalogVersion")
	public Set<CatalogVersionDTO> getCatalogVersions()
	{
		return this._catalogVersions;
	}
	
	public Boolean getDefaultCatalog()
	{
		return this._defaultCatalog;
	}
	
	public CurrencyDTO getDefaultCurrency()
	{
		return this._defaultCurrency;
	}
	
	public Date getGenerationDate()
	{
		return this._generationDate;
	}
	
	public String getGeneratorInfo()
	{
		return this._generatorInfo;
	}
	
	@XmlAttribute
	public String getId()
	{
		return this._id;
	}
	
	public Boolean getInclAssurance()
	{
		return this._inclAssurance;
	}
	
	public Boolean getInclDuty()
	{
		return this._inclDuty;
	}
	
	public Boolean getInclFreight()
	{
		return this._inclFreight;
	}
	
	public Boolean getInclPacking()
	{
		return this._inclPacking;
	}
	
	@XmlElementWrapper(name = "languages")
	@XmlElement(name = "language")
	public Collection<LanguageDTO> getLanguages()
	{
		return this._languages;
	}
	
	public String getMimeRootDirectory()
	{
		return this._mimeRootDirectory;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public String getPreviewURLTemplate()
	{
		return this._previewURLTemplate;
	}
	
	@XmlElementWrapper(name = "restrictions")
	@XmlElement(name = "cMSCatalogRestriction")
	public Collection<CMSCatalogRestrictionDTO> getRestrictions()
	{
		return this._restrictions;
	}
	
	@XmlElementWrapper(name = "rootCategories")
	@XmlElement(name = "category")
	public List<CategoryDTO> getRootCategories()
	{
		return this._rootCategories;
	}
	
	public CompanyDTO getSupplier()
	{
		return this._supplier;
	}
	
	@XmlElementWrapper(name = "territories")
	@XmlElement(name = "country")
	public Collection<CountryDTO> getTerritories()
	{
		return this._territories;
	}
	
	@XmlElementWrapper(name = "urlPatterns")
	@XmlElement(name = "value")
	public Collection<String> getUrlPatterns()
	{
		return this._urlPatterns;
	}
	
	public String getVersion()
	{
		return this._version;
	}
	
	public void setActiveCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("activeCatalogVersion");
		this._activeCatalogVersion = value;
	}
	
	public void setAgreements(final Collection<AgreementDTO> value)
	{
		this.modifiedPropsSet.add("agreements");
		this._agreements = value;
	}
	
	public void setBaseStores(final Collection<BaseStoreDTO> value)
	{
		this.modifiedPropsSet.add("baseStores");
		this._baseStores = value;
	}
	
	public void setBuyer(final CompanyDTO value)
	{
		this.modifiedPropsSet.add("buyer");
		this._buyer = value;
	}
	
	public void setCatalogVersions(final Set<CatalogVersionDTO> value)
	{
		this.modifiedPropsSet.add("catalogVersions");
		this._catalogVersions = value;
	}
	
	public void setDefaultCatalog(final Boolean value)
	{
		this.modifiedPropsSet.add("defaultCatalog");
		this._defaultCatalog = value;
	}
	
	public void setDefaultCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("defaultCurrency");
		this._defaultCurrency = value;
	}
	
	public void setGenerationDate(final Date value)
	{
		this.modifiedPropsSet.add("generationDate");
		this._generationDate = value;
	}
	
	public void setGeneratorInfo(final String value)
	{
		this.modifiedPropsSet.add("generatorInfo");
		this._generatorInfo = value;
	}
	
	public void setId(final String value)
	{
		this.modifiedPropsSet.add("id");
		this._id = value;
	}
	
	public void setInclAssurance(final Boolean value)
	{
		this.modifiedPropsSet.add("inclAssurance");
		this._inclAssurance = value;
	}
	
	public void setInclDuty(final Boolean value)
	{
		this.modifiedPropsSet.add("inclDuty");
		this._inclDuty = value;
	}
	
	public void setInclFreight(final Boolean value)
	{
		this.modifiedPropsSet.add("inclFreight");
		this._inclFreight = value;
	}
	
	public void setInclPacking(final Boolean value)
	{
		this.modifiedPropsSet.add("inclPacking");
		this._inclPacking = value;
	}
	
	public void setLanguages(final Collection<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("languages");
		this._languages = value;
	}
	
	public void setMimeRootDirectory(final String value)
	{
		this.modifiedPropsSet.add("mimeRootDirectory");
		this._mimeRootDirectory = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setPreviewURLTemplate(final String value)
	{
		this.modifiedPropsSet.add("previewURLTemplate");
		this._previewURLTemplate = value;
	}
	
	public void setRestrictions(final Collection<CMSCatalogRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("restrictions");
		this._restrictions = value;
	}
	
	public void setRootCategories(final List<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("rootCategories");
		this._rootCategories = value;
	}
	
	public void setSupplier(final CompanyDTO value)
	{
		this.modifiedPropsSet.add("supplier");
		this._supplier = value;
	}
	
	public void setTerritories(final Collection<CountryDTO> value)
	{
		this.modifiedPropsSet.add("territories");
		this._territories = value;
	}
	
	public void setUrlPatterns(final Collection<String> value)
	{
		this.modifiedPropsSet.add("urlPatterns");
		this._urlPatterns = value;
	}
	
	public void setVersion(final String value)
	{
		this.modifiedPropsSet.add("version");
		this._version = value;
	}
	
}
