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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrStopWordModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrStopWord first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrStopWordModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "solrstopword")
public class SolrStopWordDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrStopWord.StopWord</code> attribute defined at extension <code> */
	private java.lang.String _StopWord;
	/** <i>Generated variable</i> - Variable of <code>SolrStopWord.facetSearchConfig</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO _facetSearchConfig;
	/** <i>Generated variable</i> - Variable of <code>SolrStopWord.language</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _language;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrStopWordDTO()
	{
		super();
	}
	
	
	public SolrFacetSearchConfigDTO getFacetSearchConfig()
	{
		return this._facetSearchConfig;
	}
	
	public LanguageDTO getLanguage()
	{
		return this._language;
	}
	
	public String getStopWord()
	{
		return this._StopWord;
	}
	
	public void setFacetSearchConfig(final SolrFacetSearchConfigDTO value)
	{
		this.modifiedPropsSet.add("facetSearchConfig");
		this._facetSearchConfig = value;
	}
	
	public void setLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("language");
		this._language = value;
	}
	
	public void setStopWord(final String value)
	{
		this.modifiedPropsSet.add("StopWord");
		this._StopWord = value;
	}
	
}
