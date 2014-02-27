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
import de.hybris.platform.catalog.dto.CatalogDTO;
import de.hybris.platform.catalog.dto.SyncItemJobDTO;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.cms2.dto.preview.PreviewDataDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CountryDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CatalogVersion first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = CatalogVersionModel.class, factory = GenericNodeFactory.class, uidProperties="version")
@XmlRootElement(name = "catalogversion")
public class CatalogVersionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.generatorInfo</code> attribute defined at extension <code> */
	private java.lang.String _generatorInfo;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.defaultCurrency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _defaultCurrency;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.agreements</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.AgreementDTO> _agreements;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.synchronizations</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.SyncItemJobDTO> _synchronizations;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.categorySystemName</code> attribute defined at extension <code> */
	private java.lang.String _categorySystemName;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.incomingSynchronizations</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.SyncItemJobDTO> _incomingSynchronizations;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.mnemonic</code> attribute defined at extension <code> */
	private java.lang.String _mnemonic;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.languages</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.c2l.LanguageDTO> _languages;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.active</code> attribute defined at extension <code> */
	private java.lang.Boolean _active;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.facetSearchConfigs</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO> _facetSearchConfigs;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.readPrincipals</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.security.PrincipalDTO> _readPrincipals;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.inclPacking</code> attribute defined at extension <code> */
	private java.lang.Boolean _inclPacking;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.rootCategories</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.category.dto.CategoryDTO> _rootCategories;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.generationDate</code> attribute defined at extension <code> */
	private java.util.Date _generationDate;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.inclFreight</code> attribute defined at extension <code> */
	private java.lang.Boolean _inclFreight;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.categorySystemID</code> attribute defined at extension <code> */
	private java.lang.String _categorySystemID;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.writePrincipals</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.security.PrincipalDTO> _writePrincipals;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.catalog</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogDTO _catalog;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.version</code> attribute defined at extension <code> */
	private java.lang.String _version;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.categorySystemDescription</code> attribute defined at extension <code> */
	private java.lang.String _categorySystemDescription;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.territories</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.c2l.CountryDTO> _territories;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.previews</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.preview.PreviewDataDTO> _previews;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.inclAssurance</code> attribute defined at extension <code> */
	private java.lang.Boolean _inclAssurance;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.inclDuty</code> attribute defined at extension <code> */
	private java.lang.Boolean _inclDuty;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.mimeRootDirectory</code> attribute defined at extension <code> */
	private java.lang.String _mimeRootDirectory;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.previousUpdateVersion</code> attribute defined at extension <code> */
	private java.lang.Integer _previousUpdateVersion;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionDTO()
	{
		super();
	}
	
	
	public Boolean getActive()
	{
		return this._active;
	}
	
	@XmlElementWrapper(name = "agreements")
	@XmlElement(name = "agreement")
	public Collection<AgreementDTO> getAgreements()
	{
		return this._agreements;
	}
	
	public CatalogDTO getCatalog()
	{
		return this._catalog;
	}
	
	public String getCategorySystemDescription()
	{
		return this._categorySystemDescription;
	}
	
	public String getCategorySystemID()
	{
		return this._categorySystemID;
	}
	
	public String getCategorySystemName()
	{
		return this._categorySystemName;
	}
	
	public CurrencyDTO getDefaultCurrency()
	{
		return this._defaultCurrency;
	}
	
	@XmlElementWrapper(name = "facetSearchConfigs")
	@XmlElement(name = "solrFacetSearchConfig")
	public List<SolrFacetSearchConfigDTO> getFacetSearchConfigs()
	{
		return this._facetSearchConfigs;
	}
	
	public Date getGenerationDate()
	{
		return this._generationDate;
	}
	
	public String getGeneratorInfo()
	{
		return this._generatorInfo;
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
	
	@XmlElementWrapper(name = "incomingSynchronizations")
	@XmlElement(name = "syncItemJob")
	public List<SyncItemJobDTO> getIncomingSynchronizations()
	{
		return this._incomingSynchronizations;
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
	
	public String getMnemonic()
	{
		return this._mnemonic;
	}
	
	@XmlElementWrapper(name = "previews")
	@XmlElement(name = "previewData")
	public Collection<PreviewDataDTO> getPreviews()
	{
		return this._previews;
	}
	
	public Integer getPreviousUpdateVersion()
	{
		return this._previousUpdateVersion;
	}
	
	@XmlElementWrapper(name = "readPrincipals")
	@XmlElement(name = "principal")
	public List<PrincipalDTO> getReadPrincipals()
	{
		return this._readPrincipals;
	}
	
	@XmlElementWrapper(name = "rootCategories")
	@XmlElement(name = "category")
	public List<CategoryDTO> getRootCategories()
	{
		return this._rootCategories;
	}
	
	@XmlElementWrapper(name = "synchronizations")
	@XmlElement(name = "syncItemJob")
	public List<SyncItemJobDTO> getSynchronizations()
	{
		return this._synchronizations;
	}
	
	@XmlElementWrapper(name = "territories")
	@XmlElement(name = "country")
	public Collection<CountryDTO> getTerritories()
	{
		return this._territories;
	}
	
	@XmlAttribute
	public String getVersion()
	{
		return this._version;
	}
	
	@XmlElementWrapper(name = "writePrincipals")
	@XmlElement(name = "principal")
	public List<PrincipalDTO> getWritePrincipals()
	{
		return this._writePrincipals;
	}
	
	public void setActive(final Boolean value)
	{
		this.modifiedPropsSet.add("active");
		this._active = value;
	}
	
	public void setAgreements(final Collection<AgreementDTO> value)
	{
		this.modifiedPropsSet.add("agreements");
		this._agreements = value;
	}
	
	public void setCatalog(final CatalogDTO value)
	{
		this.modifiedPropsSet.add("catalog");
		this._catalog = value;
	}
	
	public void setCategorySystemDescription(final String value)
	{
		this.modifiedPropsSet.add("categorySystemDescription");
		this._categorySystemDescription = value;
	}
	
	public void setCategorySystemID(final String value)
	{
		this.modifiedPropsSet.add("categorySystemID");
		this._categorySystemID = value;
	}
	
	public void setCategorySystemName(final String value)
	{
		this.modifiedPropsSet.add("categorySystemName");
		this._categorySystemName = value;
	}
	
	public void setDefaultCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("defaultCurrency");
		this._defaultCurrency = value;
	}
	
	public void setFacetSearchConfigs(final List<SolrFacetSearchConfigDTO> value)
	{
		this.modifiedPropsSet.add("facetSearchConfigs");
		this._facetSearchConfigs = value;
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
	
	public void setIncomingSynchronizations(final List<SyncItemJobDTO> value)
	{
		this.modifiedPropsSet.add("incomingSynchronizations");
		this._incomingSynchronizations = value;
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
	
	public void setMnemonic(final String value)
	{
		this.modifiedPropsSet.add("mnemonic");
		this._mnemonic = value;
	}
	
	public void setPreviews(final Collection<PreviewDataDTO> value)
	{
		this.modifiedPropsSet.add("previews");
		this._previews = value;
	}
	
	public void setPreviousUpdateVersion(final Integer value)
	{
		this.modifiedPropsSet.add("previousUpdateVersion");
		this._previousUpdateVersion = value;
	}
	
	public void setReadPrincipals(final List<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("readPrincipals");
		this._readPrincipals = value;
	}
	
	public void setRootCategories(final List<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("rootCategories");
		this._rootCategories = value;
	}
	
	public void setSynchronizations(final List<SyncItemJobDTO> value)
	{
		this.modifiedPropsSet.add("synchronizations");
		this._synchronizations = value;
	}
	
	public void setTerritories(final Collection<CountryDTO> value)
	{
		this.modifiedPropsSet.add("territories");
		this._territories = value;
	}
	
	public void setVersion(final String value)
	{
		this.modifiedPropsSet.add("version");
		this._version = value;
	}
	
	public void setWritePrincipals(final List<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("writePrincipals");
		this._writePrincipals = value;
	}
	
}
