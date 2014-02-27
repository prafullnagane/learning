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
package de.hybris.platform.solrfacetsearch.dto.indexer.cron;

import de.hybris.platform.solrfacetsearch.dto.indexer.cron.SolrIndexerHotUpdateCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrIndexerHotUpdateCronJob first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrindexerhotupdatecronjobs")
public class SolrIndexerHotUpdateCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrIndexerHotUpdateCronJobDTO*/
	private List<SolrIndexerHotUpdateCronJobDTO>  solrindexerhotupdatecronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerHotUpdateCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerHotUpdateCronJobsDTO(final List<SolrIndexerHotUpdateCronJobDTO> solrindexerhotupdatecronjobsList)
	{
		super();
		this.solrindexerhotupdatecronjobsList=solrindexerhotupdatecronjobsList;
	}
	
	
	/**
	 * @return the solrindexerhotupdatecronjobs
	 */
	@XmlElement(name = "solrindexerhotupdatecronjob")
	public List<SolrIndexerHotUpdateCronJobDTO> getSolrIndexerHotUpdateCronJobs()
	{
		return	solrindexerhotupdatecronjobsList;
	}
	
	/**
	 * @param solrindexerhotupdatecronjobsList 
	 *  the solrindexerhotupdatecronjobsList to set   
	 */
	public void setSolrIndexerHotUpdateCronJobs(final List<SolrIndexerHotUpdateCronJobDTO> solrindexerhotupdatecronjobsList)
	{
		this.solrindexerhotupdatecronjobsList=solrindexerhotupdatecronjobsList;
	}
	
}
