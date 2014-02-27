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
package de.hybris.platform.catalog.model;

import de.hybris.platform.catalog.model.AgreementModel;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.SyncItemJobModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2.model.preview.PreviewDataModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type CatalogVersion first defined at extension catalog.
 */
@SuppressWarnings("all")
public class CatalogVersionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CatalogVersion";
	
	/**<i>Generated relation code constant for relation <code>Principal2ReadableCatalogVersionRelation</code> defining source attribute <code>readPrincipals</code> in extension <code>catalog</code>.</i>*/
	public final static String _PRINCIPAL2READABLECATALOGVERSIONRELATION = "Principal2ReadableCatalogVersionRelation";
	
	/**<i>Generated relation code constant for relation <code>SolrFacetSearchConfig2CatalogVersionRelation</code> defining source attribute <code>facetSearchConfigs</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRFACETSEARCHCONFIG2CATALOGVERSIONRELATION = "SolrFacetSearchConfig2CatalogVersionRelation";
	
	/**<i>Generated relation code constant for relation <code>Principal2WriteableCatalogVersionRelation</code> defining source attribute <code>writePrincipals</code> in extension <code>catalog</code>.</i>*/
	public final static String _PRINCIPAL2WRITEABLECATALOGVERSIONRELATION = "Principal2WriteableCatalogVersionRelation";
	
	/**<i>Generated relation code constant for relation <code>Catalog2VersionsRelation</code> defining source attribute <code>catalog</code> in extension <code>catalog</code>.</i>*/
	public final static String _CATALOG2VERSIONSRELATION = "Catalog2VersionsRelation";
	
	/**<i>Generated relation code constant for relation <code>PreviewDataToCatalogVersion</code> defining source attribute <code>previews</code> in extension <code>cms2</code>.</i>*/
	public final static String _PREVIEWDATATOCATALOGVERSION = "PreviewDataToCatalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.generatorInfo</code> attribute defined at extension <code>catalog</code>. */
	public static final String GENERATORINFO = "generatorInfo";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.defaultCurrency</code> attribute defined at extension <code>catalog</code>. */
	public static final String DEFAULTCURRENCY = "defaultCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.agreements</code> attribute defined at extension <code>catalog</code>. */
	public static final String AGREEMENTS = "agreements";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.synchronizations</code> attribute defined at extension <code>catalog</code>. */
	public static final String SYNCHRONIZATIONS = "synchronizations";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.mnemonic</code> attribute defined at extension <code>cockpit</code>. */
	public static final String MNEMONIC = "mnemonic";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.incomingSynchronizations</code> attribute defined at extension <code>catalog</code>. */
	public static final String INCOMINGSYNCHRONIZATIONS = "incomingSynchronizations";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.categorySystemName</code> attribute defined at extension <code>catalog</code>. */
	public static final String CATEGORYSYSTEMNAME = "categorySystemName";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.languages</code> attribute defined at extension <code>catalog</code>. */
	public static final String LANGUAGES = "languages";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.active</code> attribute defined at extension <code>catalog</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.readPrincipals</code> attribute defined at extension <code>catalog</code>. */
	public static final String READPRINCIPALS = "readPrincipals";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FACETSEARCHCONFIGS = "facetSearchConfigs";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.inclPacking</code> attribute defined at extension <code>catalog</code>. */
	public static final String INCLPACKING = "inclPacking";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.rootCategories</code> attribute defined at extension <code>catalog</code>. */
	public static final String ROOTCATEGORIES = "rootCategories";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.generationDate</code> attribute defined at extension <code>catalog</code>. */
	public static final String GENERATIONDATE = "generationDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.inclFreight</code> attribute defined at extension <code>catalog</code>. */
	public static final String INCLFREIGHT = "inclFreight";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.categorySystemID</code> attribute defined at extension <code>catalog</code>. */
	public static final String CATEGORYSYSTEMID = "categorySystemID";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.writePrincipals</code> attribute defined at extension <code>catalog</code>. */
	public static final String WRITEPRINCIPALS = "writePrincipals";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.catalog</code> attribute defined at extension <code>catalog</code>. */
	public static final String CATALOG = "catalog";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.version</code> attribute defined at extension <code>catalog</code>. */
	public static final String VERSION = "version";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.categorySystemDescription</code> attribute defined at extension <code>catalog</code>. */
	public static final String CATEGORYSYSTEMDESCRIPTION = "categorySystemDescription";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.territories</code> attribute defined at extension <code>catalog</code>. */
	public static final String TERRITORIES = "territories";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.previews</code> attribute defined at extension <code>cms2</code>. */
	public static final String PREVIEWS = "previews";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.inclAssurance</code> attribute defined at extension <code>catalog</code>. */
	public static final String INCLASSURANCE = "inclAssurance";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.inclDuty</code> attribute defined at extension <code>catalog</code>. */
	public static final String INCLDUTY = "inclDuty";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.mimeRootDirectory</code> attribute defined at extension <code>catalog</code>. */
	public static final String MIMEROOTDIRECTORY = "mimeRootDirectory";
	
	/** <i>Generated constant</i> - Attribute key of <code>CatalogVersion.previousUpdateVersion</code> attribute defined at extension <code>catalog</code>. */
	public static final String PREVIOUSUPDATEVERSION = "previousUpdateVersion";
	
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.generatorInfo</code> attribute defined at extension <code>catalog</code>. */
	private String _generatorInfo;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.defaultCurrency</code> attribute defined at extension <code>catalog</code>. */
	private CurrencyModel _defaultCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.agreements</code> attribute defined at extension <code>catalog</code>. */
	private Collection<AgreementModel> _agreements;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.synchronizations</code> attribute defined at extension <code>catalog</code>. */
	private List<SyncItemJobModel> _synchronizations;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.mnemonic</code> attribute defined at extension <code>cockpit</code>. */
	private String _mnemonic;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.incomingSynchronizations</code> attribute defined at extension <code>catalog</code>. */
	private List<SyncItemJobModel> _incomingSynchronizations;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.languages</code> attribute defined at extension <code>catalog</code>. */
	private Collection<LanguageModel> _languages;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.active</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _active;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.readPrincipals</code> attribute defined at extension <code>catalog</code>. */
	private List<PrincipalModel> _readPrincipals;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrFacetSearchConfigModel> _facetSearchConfigs;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.inclPacking</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _inclPacking;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.rootCategories</code> attribute defined at extension <code>catalog</code>. */
	private List<CategoryModel> _rootCategories;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.generationDate</code> attribute defined at extension <code>catalog</code>. */
	private Date _generationDate;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.inclFreight</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _inclFreight;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.categorySystemID</code> attribute defined at extension <code>catalog</code>. */
	private String _categorySystemID;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.writePrincipals</code> attribute defined at extension <code>catalog</code>. */
	private List<PrincipalModel> _writePrincipals;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.catalog</code> attribute defined at extension <code>catalog</code>. */
	private CatalogModel _catalog;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.version</code> attribute defined at extension <code>catalog</code>. */
	private String _version;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.territories</code> attribute defined at extension <code>catalog</code>. */
	private Collection<CountryModel> _territories;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.previews</code> attribute defined at extension <code>cms2</code>. */
	private Collection<PreviewDataModel> _previews;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.inclAssurance</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _inclAssurance;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.inclDuty</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _inclDuty;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.mimeRootDirectory</code> attribute defined at extension <code>catalog</code>. */
	private String _mimeRootDirectory;
	
	/** <i>Generated variable</i> - Variable of <code>CatalogVersion.previousUpdateVersion</code> attribute defined at extension <code>catalog</code>. */
	private Integer _previousUpdateVersion;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CatalogVersionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CatalogVersionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalog initial attribute declared by type <code>CatalogVersion</code> at extension <code>catalog</code>
	 * @param _version initial attribute declared by type <code>CatalogVersion</code> at extension <code>catalog</code>
	 */
	@Deprecated
	public CatalogVersionModel(final CatalogModel _catalog, final String _version)
	{
		super();
		setCatalog(_catalog);
		setVersion(_version);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalog initial attribute declared by type <code>CatalogVersion</code> at extension <code>catalog</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _version initial attribute declared by type <code>CatalogVersion</code> at extension <code>catalog</code>
	 */
	@Deprecated
	public CatalogVersionModel(final CatalogModel _catalog, final ItemModel _owner, final String _version)
	{
		super();
		setCatalog(_catalog);
		setOwner(_owner);
		setVersion(_version);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.active</code> attribute defined at extension <code>catalog</code>. 
	 * @return the active - active flag
	 */
	public Boolean getActive()
	{
		return _active = getPersistenceContext().getValue(ACTIVE, _active);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.agreements</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the agreements - Agreement Collection
	 */
	public Collection<AgreementModel> getAgreements()
	{
		return _agreements = getPersistenceContext().getValue(AGREEMENTS, _agreements);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.catalog</code> attribute defined at extension <code>catalog</code>. 
	 * @return the catalog
	 */
	public CatalogModel getCatalog()
	{
		return _catalog = getPersistenceContext().getValue(CATALOG, _catalog);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.categorySystemDescription</code> attribute defined at extension <code>catalog</code>. 
	 * @return the categorySystemDescription
	 */
	public String getCategorySystemDescription()
	{
		return getCategorySystemDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.categorySystemDescription</code> attribute defined at extension <code>catalog</code>. 
	 * @param loc the value localization key 
	 * @return the categorySystemDescription
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getCategorySystemDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(CATEGORYSYSTEMDESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.categorySystemID</code> attribute defined at extension <code>catalog</code>. 
	 * @return the categorySystemID
	 */
	public String getCategorySystemID()
	{
		return _categorySystemID = getPersistenceContext().getValue(CATEGORYSYSTEMID, _categorySystemID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.categorySystemName</code> attribute defined at extension <code>catalog</code>. 
	 * @return the categorySystemName
	 */
	public String getCategorySystemName()
	{
		return getCategorySystemName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.categorySystemName</code> attribute defined at extension <code>catalog</code>. 
	 * @param loc the value localization key 
	 * @return the categorySystemName
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getCategorySystemName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(CATEGORYSYSTEMNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.defaultCurrency</code> attribute defined at extension <code>catalog</code>. 
	 * @return the defaultCurrency - Default Currency
	 */
	public CurrencyModel getDefaultCurrency()
	{
		return _defaultCurrency = getPersistenceContext().getValue(DEFAULTCURRENCY, _defaultCurrency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the facetSearchConfigs
	 */
	public List<SolrFacetSearchConfigModel> getFacetSearchConfigs()
	{
		return _facetSearchConfigs = getPersistenceContext().getValue(FACETSEARCHCONFIGS, _facetSearchConfigs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.generationDate</code> attribute defined at extension <code>catalog</code>. 
	 * @return the generationDate - Generation Date
	 */
	public Date getGenerationDate()
	{
		return _generationDate = getPersistenceContext().getValue(GENERATIONDATE, _generationDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.generatorInfo</code> attribute defined at extension <code>catalog</code>. 
	 * @return the generatorInfo - Generator Info
	 */
	public String getGeneratorInfo()
	{
		return _generatorInfo = getPersistenceContext().getValue(GENERATORINFO, _generatorInfo);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.inclAssurance</code> attribute defined at extension <code>catalog</code>. 
	 * @return the inclAssurance - incl.Assurance
	 */
	public Boolean getInclAssurance()
	{
		return _inclAssurance = getPersistenceContext().getValue(INCLASSURANCE, _inclAssurance);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.inclDuty</code> attribute defined at extension <code>catalog</code>. 
	 * @return the inclDuty - incl.Duty
	 */
	public Boolean getInclDuty()
	{
		return _inclDuty = getPersistenceContext().getValue(INCLDUTY, _inclDuty);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.inclFreight</code> attribute defined at extension <code>catalog</code>. 
	 * @return the inclFreight - incl.Freight
	 */
	public Boolean getInclFreight()
	{
		return _inclFreight = getPersistenceContext().getValue(INCLFREIGHT, _inclFreight);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.inclPacking</code> attribute defined at extension <code>catalog</code>. 
	 * @return the inclPacking - incl.Packing
	 */
	public Boolean getInclPacking()
	{
		return _inclPacking = getPersistenceContext().getValue(INCLPACKING, _inclPacking);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.incomingSynchronizations</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the incomingSynchronizations
	 */
	public List<SyncItemJobModel> getIncomingSynchronizations()
	{
		return _incomingSynchronizations = getPersistenceContext().getValue(INCOMINGSYNCHRONIZATIONS, _incomingSynchronizations);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.languages</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the languages - languages
	 */
	public Collection<LanguageModel> getLanguages()
	{
		return _languages = getPersistenceContext().getValue(LANGUAGES, _languages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.mimeRootDirectory</code> attribute defined at extension <code>catalog</code>. 
	 * @return the mimeRootDirectory - Mime Root Directory
	 */
	public String getMimeRootDirectory()
	{
		return _mimeRootDirectory = getPersistenceContext().getValue(MIMEROOTDIRECTORY, _mimeRootDirectory);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.mnemonic</code> attribute defined at extension <code>cockpit</code>. 
	 * @return the mnemonic
	 */
	public String getMnemonic()
	{
		return _mnemonic = getPersistenceContext().getValue(MNEMONIC, _mnemonic);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.previews</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the previews
	 */
	public Collection<PreviewDataModel> getPreviews()
	{
		return _previews = getPersistenceContext().getValue(PREVIEWS, _previews);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.previousUpdateVersion</code> attribute defined at extension <code>catalog</code>. 
	 * @return the previousUpdateVersion
	 */
	public Integer getPreviousUpdateVersion()
	{
		return _previousUpdateVersion = getPersistenceContext().getValue(PREVIOUSUPDATEVERSION, _previousUpdateVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.readPrincipals</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the readPrincipals
	 */
	public List<PrincipalModel> getReadPrincipals()
	{
		return _readPrincipals = getPersistenceContext().getValue(READPRINCIPALS, _readPrincipals);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.rootCategories</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the rootCategories
	 */
	public List<CategoryModel> getRootCategories()
	{
		return _rootCategories = getPersistenceContext().getValue(ROOTCATEGORIES, _rootCategories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.synchronizations</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the synchronizations
	 */
	public List<SyncItemJobModel> getSynchronizations()
	{
		return _synchronizations = getPersistenceContext().getValue(SYNCHRONIZATIONS, _synchronizations);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.territories</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the territories - Territory
	 */
	public Collection<CountryModel> getTerritories()
	{
		return _territories = getPersistenceContext().getValue(TERRITORIES, _territories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.version</code> attribute defined at extension <code>catalog</code>. 
	 * @return the version - version
	 */
	public String getVersion()
	{
		return _version = getPersistenceContext().getValue(VERSION, _version);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.writePrincipals</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the writePrincipals
	 */
	public List<PrincipalModel> getWritePrincipals()
	{
		return _writePrincipals = getPersistenceContext().getValue(WRITEPRINCIPALS, _writePrincipals);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.active</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the active - active flag
	 */
	public void setActive(final Boolean value)
	{
		_active = getPersistenceContext().setValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.agreements</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the agreements - Agreement Collection
	 */
	public void setAgreements(final Collection<AgreementModel> value)
	{
		_agreements = getPersistenceContext().setValue(AGREEMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CatalogVersion.catalog</code> attribute defined at extension <code>catalog</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the catalog
	 */
	public void setCatalog(final CatalogModel value)
	{
		_catalog = getPersistenceContext().setValue(CATALOG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.categorySystemDescription</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the categorySystemDescription
	 */
	public void setCategorySystemDescription(final String value)
	{
		setCategorySystemDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.categorySystemDescription</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the categorySystemDescription
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setCategorySystemDescription(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(CATEGORYSYSTEMDESCRIPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.categorySystemID</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the categorySystemID
	 */
	public void setCategorySystemID(final String value)
	{
		_categorySystemID = getPersistenceContext().setValue(CATEGORYSYSTEMID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.categorySystemName</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the categorySystemName
	 */
	public void setCategorySystemName(final String value)
	{
		setCategorySystemName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.categorySystemName</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the categorySystemName
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setCategorySystemName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(CATEGORYSYSTEMNAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.defaultCurrency</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the defaultCurrency - Default Currency
	 */
	public void setDefaultCurrency(final CurrencyModel value)
	{
		_defaultCurrency = getPersistenceContext().setValue(DEFAULTCURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.facetSearchConfigs</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the facetSearchConfigs
	 */
	public void setFacetSearchConfigs(final List<SolrFacetSearchConfigModel> value)
	{
		_facetSearchConfigs = getPersistenceContext().setValue(FACETSEARCHCONFIGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.generationDate</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the generationDate - Generation Date
	 */
	public void setGenerationDate(final Date value)
	{
		_generationDate = getPersistenceContext().setValue(GENERATIONDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.generatorInfo</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the generatorInfo - Generator Info
	 */
	public void setGeneratorInfo(final String value)
	{
		_generatorInfo = getPersistenceContext().setValue(GENERATORINFO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.inclAssurance</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the inclAssurance - incl.Assurance
	 */
	public void setInclAssurance(final Boolean value)
	{
		_inclAssurance = getPersistenceContext().setValue(INCLASSURANCE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.inclDuty</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the inclDuty - incl.Duty
	 */
	public void setInclDuty(final Boolean value)
	{
		_inclDuty = getPersistenceContext().setValue(INCLDUTY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.inclFreight</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the inclFreight - incl.Freight
	 */
	public void setInclFreight(final Boolean value)
	{
		_inclFreight = getPersistenceContext().setValue(INCLFREIGHT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.inclPacking</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the inclPacking - incl.Packing
	 */
	public void setInclPacking(final Boolean value)
	{
		_inclPacking = getPersistenceContext().setValue(INCLPACKING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.languages</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the languages - languages
	 */
	public void setLanguages(final Collection<LanguageModel> value)
	{
		_languages = getPersistenceContext().setValue(LANGUAGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.mimeRootDirectory</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the mimeRootDirectory - Mime Root Directory
	 */
	public void setMimeRootDirectory(final String value)
	{
		_mimeRootDirectory = getPersistenceContext().setValue(MIMEROOTDIRECTORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.mnemonic</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the mnemonic
	 */
	public void setMnemonic(final String value)
	{
		_mnemonic = getPersistenceContext().setValue(MNEMONIC, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.previews</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the previews
	 */
	public void setPreviews(final Collection<PreviewDataModel> value)
	{
		_previews = getPersistenceContext().setValue(PREVIEWS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.previousUpdateVersion</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the previousUpdateVersion
	 */
	public void setPreviousUpdateVersion(final Integer value)
	{
		_previousUpdateVersion = getPersistenceContext().setValue(PREVIOUSUPDATEVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.readPrincipals</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the readPrincipals
	 */
	public void setReadPrincipals(final List<PrincipalModel> value)
	{
		_readPrincipals = getPersistenceContext().setValue(READPRINCIPALS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.rootCategories</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the rootCategories
	 */
	public void setRootCategories(final List<CategoryModel> value)
	{
		_rootCategories = getPersistenceContext().setValue(ROOTCATEGORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.synchronizations</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the synchronizations
	 */
	public void setSynchronizations(final List<SyncItemJobModel> value)
	{
		_synchronizations = getPersistenceContext().setValue(SYNCHRONIZATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.territories</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the territories - Territory
	 */
	public void setTerritories(final Collection<CountryModel> value)
	{
		_territories = getPersistenceContext().setValue(TERRITORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.version</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the version - version
	 */
	public void setVersion(final String value)
	{
		_version = getPersistenceContext().setValue(VERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CatalogVersion.writePrincipals</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the writePrincipals
	 */
	public void setWritePrincipals(final List<PrincipalModel> value)
	{
		_writePrincipals = getPersistenceContext().setValue(WRITEPRINCIPALS, value);
	}
	
}
