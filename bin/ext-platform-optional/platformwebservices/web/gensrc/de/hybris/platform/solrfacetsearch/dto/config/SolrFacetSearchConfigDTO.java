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
package de.hybris.platform.solrfacetsearch.dto.config;

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexConfigDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedTypeDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrSearchConfigDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrServerConfigDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrStopWordDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrSynonymConfigDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrValueRangeSetDTO;
import de.hybris.platform.solrfacetsearch.dto.cron.SolrUpdateStopWordsCronJobDTO;
import de.hybris.platform.solrfacetsearch.dto.cron.SolrUpdateSynonymsCronJobDTO;
import de.hybris.platform.solrfacetsearch.dto.indexer.cron.SolrIndexerCronJobDTO;
import de.hybris.platform.solrfacetsearch.dto.redirect.SolrFacetSearchKeywordRedirectDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrFacetSearchConfig first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrFacetSearchConfigModel.class, factory = GenericNodeFactory.class, uidProperties="name")
@XmlRootElement(name = "solrfacetsearchconfig")
public class SolrFacetSearchConfigDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.document</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _document;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.StopWords</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrStopWordDTO> _StopWords;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.currencies</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.c2l.CurrencyDTO> _currencies;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrUpdateSynonymsCronJobs</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.cron.SolrUpdateSynonymsCronJobDTO> _solrUpdateSynonymsCronJobs;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.languageStopWordMapping</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrStopWordDTO> _languageStopWordMapping;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.keywordRedirects</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.solrfacetsearch.dto.redirect.SolrFacetSearchKeywordRedirectDTO> _keywordRedirects;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.indexNamePrefix</code> attribute defined at extension <code> */
	private java.lang.String _indexNamePrefix;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.languageSynonymMapping</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrSynonymConfigDTO> _languageSynonymMapping;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrIndexedTypes</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedTypeDTO> _solrIndexedTypes;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.enabledLanguageFallbackMechanism</code> attribute defined at extension <code> */
	private boolean _enabledLanguageFallbackMechanism;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.languageKeywordRedirectMapping</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.redirect.SolrFacetSearchKeywordRedirectDTO> _languageKeywordRedirectMapping;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrServerConfig</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrServerConfigDTO _solrServerConfig;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrValueRangeSets</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrValueRangeSetDTO> _solrValueRangeSets;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.synonyms</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrSynonymConfigDTO> _synonyms;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.catalogVersions</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.CatalogVersionDTO> _catalogVersions;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.languages</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.c2l.LanguageDTO> _languages;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrSearchConfig</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrSearchConfigDTO _solrSearchConfig;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrUpdateStopWordsCronJobs</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.cron.SolrUpdateStopWordsCronJobDTO> _solrUpdateStopWordsCronJobs;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrIndexerCronJob</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.indexer.cron.SolrIndexerCronJobDTO> _solrIndexerCronJob;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchConfig.solrIndexConfig</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrIndexConfigDTO _solrIndexConfig;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrFacetSearchConfigDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "catalogVersions")
	@XmlElement(name = "catalogVersion")
	public List<CatalogVersionDTO> getCatalogVersions()
	{
		return this._catalogVersions;
	}
	
	@XmlElementWrapper(name = "currencies")
	@XmlElement(name = "currency")
	public List<CurrencyDTO> getCurrencies()
	{
		return this._currencies;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public MediaDTO getDocument()
	{
		return this._document;
	}
	
	public String getIndexNamePrefix()
	{
		return this._indexNamePrefix;
	}
	
	@XmlElementWrapper(name = "keywordRedirects")
	@XmlElement(name = "solrFacetSearchKeywordRedirect")
	public Collection<SolrFacetSearchKeywordRedirectDTO> getKeywordRedirects()
	{
		return this._keywordRedirects;
	}
	
	public List<SolrFacetSearchKeywordRedirectDTO> getLanguageKeywordRedirectMapping()
	{
		return this._languageKeywordRedirectMapping;
	}
	
	@XmlElementWrapper(name = "languages")
	@XmlElement(name = "language")
	public List<LanguageDTO> getLanguages()
	{
		return this._languages;
	}
	
	public List<SolrStopWordDTO> getLanguageStopWordMapping()
	{
		return this._languageStopWordMapping;
	}
	
	public List<SolrSynonymConfigDTO> getLanguageSynonymMapping()
	{
		return this._languageSynonymMapping;
	}
	
	@XmlAttribute
	public String getName()
	{
		return this._name;
	}
	
	public SolrIndexConfigDTO getSolrIndexConfig()
	{
		return this._solrIndexConfig;
	}
	
	@XmlElementWrapper(name = "solrIndexedTypes")
	@XmlElement(name = "solrIndexedType")
	public List<SolrIndexedTypeDTO> getSolrIndexedTypes()
	{
		return this._solrIndexedTypes;
	}
	
	@XmlElementWrapper(name = "solrIndexerCronJob")
	@XmlElement(name = "solrIndexerCronJob")
	public List<SolrIndexerCronJobDTO> getSolrIndexerCronJob()
	{
		return this._solrIndexerCronJob;
	}
	
	public SolrSearchConfigDTO getSolrSearchConfig()
	{
		return this._solrSearchConfig;
	}
	
	public SolrServerConfigDTO getSolrServerConfig()
	{
		return this._solrServerConfig;
	}
	
	@XmlElementWrapper(name = "solrUpdateStopWordsCronJobs")
	@XmlElement(name = "solrUpdateStopWordsCronJob")
	public List<SolrUpdateStopWordsCronJobDTO> getSolrUpdateStopWordsCronJobs()
	{
		return this._solrUpdateStopWordsCronJobs;
	}
	
	@XmlElementWrapper(name = "solrUpdateSynonymsCronJobs")
	@XmlElement(name = "solrUpdateSynonymsCronJob")
	public List<SolrUpdateSynonymsCronJobDTO> getSolrUpdateSynonymsCronJobs()
	{
		return this._solrUpdateSynonymsCronJobs;
	}
	
	@XmlElementWrapper(name = "solrValueRangeSets")
	@XmlElement(name = "solrValueRangeSet")
	public List<SolrValueRangeSetDTO> getSolrValueRangeSets()
	{
		return this._solrValueRangeSets;
	}
	
	@XmlElementWrapper(name = "StopWords")
	@XmlElement(name = "solrStopWord")
	public List<SolrStopWordDTO> getStopWords()
	{
		return this._StopWords;
	}
	
	@XmlElementWrapper(name = "synonyms")
	@XmlElement(name = "solrSynonymConfig")
	public List<SolrSynonymConfigDTO> getSynonyms()
	{
		return this._synonyms;
	}
	
	public boolean isEnabledLanguageFallbackMechanism()
	{
		return this._enabledLanguageFallbackMechanism;
	}
	
	public void setCatalogVersions(final List<CatalogVersionDTO> value)
	{
		this.modifiedPropsSet.add("catalogVersions");
		this._catalogVersions = value;
	}
	
	public void setCurrencies(final List<CurrencyDTO> value)
	{
		this.modifiedPropsSet.add("currencies");
		this._currencies = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setDocument(final MediaDTO value)
	{
		this.modifiedPropsSet.add("document");
		this._document = value;
	}
	
	public void setEnabledLanguageFallbackMechanism(final boolean value)
	{
		this.modifiedPropsSet.add("enabledLanguageFallbackMechanism");
		this._enabledLanguageFallbackMechanism = value;
	}
	
	public void setIndexNamePrefix(final String value)
	{
		this.modifiedPropsSet.add("indexNamePrefix");
		this._indexNamePrefix = value;
	}
	
	public void setKeywordRedirects(final Collection<SolrFacetSearchKeywordRedirectDTO> value)
	{
		this.modifiedPropsSet.add("keywordRedirects");
		this._keywordRedirects = value;
	}
	
	public void setLanguageKeywordRedirectMapping(final List<SolrFacetSearchKeywordRedirectDTO> value)
	{
		this.modifiedPropsSet.add("languageKeywordRedirectMapping");
		this._languageKeywordRedirectMapping = value;
	}
	
	public void setLanguages(final List<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("languages");
		this._languages = value;
	}
	
	public void setLanguageStopWordMapping(final List<SolrStopWordDTO> value)
	{
		this.modifiedPropsSet.add("languageStopWordMapping");
		this._languageStopWordMapping = value;
	}
	
	public void setLanguageSynonymMapping(final List<SolrSynonymConfigDTO> value)
	{
		this.modifiedPropsSet.add("languageSynonymMapping");
		this._languageSynonymMapping = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setSolrIndexConfig(final SolrIndexConfigDTO value)
	{
		this.modifiedPropsSet.add("solrIndexConfig");
		this._solrIndexConfig = value;
	}
	
	public void setSolrIndexedTypes(final List<SolrIndexedTypeDTO> value)
	{
		this.modifiedPropsSet.add("solrIndexedTypes");
		this._solrIndexedTypes = value;
	}
	
	public void setSolrIndexerCronJob(final List<SolrIndexerCronJobDTO> value)
	{
		this.modifiedPropsSet.add("solrIndexerCronJob");
		this._solrIndexerCronJob = value;
	}
	
	public void setSolrSearchConfig(final SolrSearchConfigDTO value)
	{
		this.modifiedPropsSet.add("solrSearchConfig");
		this._solrSearchConfig = value;
	}
	
	public void setSolrServerConfig(final SolrServerConfigDTO value)
	{
		this.modifiedPropsSet.add("solrServerConfig");
		this._solrServerConfig = value;
	}
	
	public void setSolrUpdateStopWordsCronJobs(final List<SolrUpdateStopWordsCronJobDTO> value)
	{
		this.modifiedPropsSet.add("solrUpdateStopWordsCronJobs");
		this._solrUpdateStopWordsCronJobs = value;
	}
	
	public void setSolrUpdateSynonymsCronJobs(final List<SolrUpdateSynonymsCronJobDTO> value)
	{
		this.modifiedPropsSet.add("solrUpdateSynonymsCronJobs");
		this._solrUpdateSynonymsCronJobs = value;
	}
	
	public void setSolrValueRangeSets(final List<SolrValueRangeSetDTO> value)
	{
		this.modifiedPropsSet.add("solrValueRangeSets");
		this._solrValueRangeSets = value;
	}
	
	public void setStopWords(final List<SolrStopWordDTO> value)
	{
		this.modifiedPropsSet.add("StopWords");
		this._StopWords = value;
	}
	
	public void setSynonyms(final List<SolrSynonymConfigDTO> value)
	{
		this.modifiedPropsSet.add("synonyms");
		this._synonyms = value;
	}
	
}
