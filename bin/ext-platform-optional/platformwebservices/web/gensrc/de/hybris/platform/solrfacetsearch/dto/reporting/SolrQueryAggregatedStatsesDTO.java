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
package de.hybris.platform.solrfacetsearch.dto.reporting;

import de.hybris.platform.solrfacetsearch.dto.reporting.SolrQueryAggregatedStatsDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrQueryAggregatedStats first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrqueryaggregatedstatses")
public class SolrQueryAggregatedStatsesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrQueryAggregatedStatsDTO*/
	private List<SolrQueryAggregatedStatsDTO>  solrqueryaggregatedstatsesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrQueryAggregatedStatsesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrQueryAggregatedStatsesDTO(final List<SolrQueryAggregatedStatsDTO> solrqueryaggregatedstatsesList)
	{
		super();
		this.solrqueryaggregatedstatsesList=solrqueryaggregatedstatsesList;
	}
	
	
	/**
	 * @return the solrqueryaggregatedstatses
	 */
	@XmlElement(name = "solrqueryaggregatedstats")
	public List<SolrQueryAggregatedStatsDTO> getSolrQueryAggregatedStatses()
	{
		return	solrqueryaggregatedstatsesList;
	}
	
	/**
	 * @param solrqueryaggregatedstatsesList 
	 *  the solrqueryaggregatedstatsesList to set   
	 */
	public void setSolrQueryAggregatedStatses(final List<SolrQueryAggregatedStatsDTO> solrqueryaggregatedstatsesList)
	{
		this.solrqueryaggregatedstatsesList=solrqueryaggregatedstatsesList;
	}
	
}
