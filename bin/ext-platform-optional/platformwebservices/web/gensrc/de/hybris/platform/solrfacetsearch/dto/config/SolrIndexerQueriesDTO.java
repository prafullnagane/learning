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

import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexerQueryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrIndexerQuery first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrindexerqueries")
public class SolrIndexerQueriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrIndexerQueryDTO*/
	private List<SolrIndexerQueryDTO>  solrindexerqueriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerQueriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerQueriesDTO(final List<SolrIndexerQueryDTO> solrindexerqueriesList)
	{
		super();
		this.solrindexerqueriesList=solrindexerqueriesList;
	}
	
	
	/**
	 * @return the solrindexerqueries
	 */
	@XmlElement(name = "solrindexerquery")
	public List<SolrIndexerQueryDTO> getSolrIndexerQueries()
	{
		return	solrindexerqueriesList;
	}
	
	/**
	 * @param solrindexerqueriesList 
	 *  the solrindexerqueriesList to set   
	 */
	public void setSolrIndexerQueries(final List<SolrIndexerQueryDTO> solrindexerqueriesList)
	{
		this.solrindexerqueriesList=solrindexerqueriesList;
	}
	
}
