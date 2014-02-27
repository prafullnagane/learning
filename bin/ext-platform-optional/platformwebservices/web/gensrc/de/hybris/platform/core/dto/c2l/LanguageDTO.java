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
package de.hybris.platform.core.dto.c2l;

import de.hybris.platform.core.dto.c2l.C2LItemDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrStopWordDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrSynonymConfigDTO;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Language first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = LanguageModel.class, factory = GenericNodeFactory.class, uidProperties="isocode")
@XmlRootElement(name = "language")
public class LanguageDTO extends C2LItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Language.fallbackLanguages</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.c2l.LanguageDTO> _fallbackLanguages;
	/** <i>Generated variable</i> - Variable of <code>Language.synonyms</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrSynonymConfigDTO> _synonyms;
	/** <i>Generated variable</i> - Variable of <code>Language.baseStores</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.store.BaseStoreDTO> _baseStores;
	/** <i>Generated variable</i> - Variable of <code>Language.facetSearchConfigs</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO> _facetSearchConfigs;
	/** <i>Generated variable</i> - Variable of <code>Language.StopWords</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrStopWordDTO> _StopWords;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LanguageDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "baseStores")
	@XmlElement(name = "baseStore")
	public Collection<BaseStoreDTO> getBaseStores()
	{
		return this._baseStores;
	}
	
	@XmlElementWrapper(name = "facetSearchConfigs")
	@XmlElement(name = "solrFacetSearchConfig")
	public List<SolrFacetSearchConfigDTO> getFacetSearchConfigs()
	{
		return this._facetSearchConfigs;
	}
	
	@XmlElementWrapper(name = "fallbackLanguages")
	@XmlElement(name = "language")
	public List<LanguageDTO> getFallbackLanguages()
	{
		return this._fallbackLanguages;
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
	
	public void setBaseStores(final Collection<BaseStoreDTO> value)
	{
		this.modifiedPropsSet.add("baseStores");
		this._baseStores = value;
	}
	
	public void setFacetSearchConfigs(final List<SolrFacetSearchConfigDTO> value)
	{
		this.modifiedPropsSet.add("facetSearchConfigs");
		this._facetSearchConfigs = value;
	}
	
	public void setFallbackLanguages(final List<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("fallbackLanguages");
		this._fallbackLanguages = value;
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
