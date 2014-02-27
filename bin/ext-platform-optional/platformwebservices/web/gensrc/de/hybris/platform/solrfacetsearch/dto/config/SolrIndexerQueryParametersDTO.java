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

import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexerQueryParameterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrIndexerQueryParameter first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrindexerqueryparameters")
public class SolrIndexerQueryParametersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrIndexerQueryParameterDTO*/
	private List<SolrIndexerQueryParameterDTO>  solrindexerqueryparametersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerQueryParametersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerQueryParametersDTO(final List<SolrIndexerQueryParameterDTO> solrindexerqueryparametersList)
	{
		super();
		this.solrindexerqueryparametersList=solrindexerqueryparametersList;
	}
	
	
	/**
	 * @return the solrindexerqueryparameters
	 */
	@XmlElement(name = "solrindexerqueryparameter")
	public List<SolrIndexerQueryParameterDTO> getSolrIndexerQueryParameters()
	{
		return	solrindexerqueryparametersList;
	}
	
	/**
	 * @param solrindexerqueryparametersList 
	 *  the solrindexerqueryparametersList to set   
	 */
	public void setSolrIndexerQueryParameters(final List<SolrIndexerQueryParameterDTO> solrindexerqueryparametersList)
	{
		this.solrindexerqueryparametersList=solrindexerqueryparametersList;
	}
	
}
