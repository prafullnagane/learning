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

import de.hybris.platform.solrfacetsearch.dto.indexer.cron.SolrIndexerCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrIndexerCronJob first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrindexercronjobs")
public class SolrIndexerCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrIndexerCronJobDTO*/
	private List<SolrIndexerCronJobDTO>  solrindexercronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerCronJobsDTO(final List<SolrIndexerCronJobDTO> solrindexercronjobsList)
	{
		super();
		this.solrindexercronjobsList=solrindexercronjobsList;
	}
	
	
	/**
	 * @return the solrindexercronjobs
	 */
	@XmlElement(name = "solrindexercronjob")
	public List<SolrIndexerCronJobDTO> getSolrIndexerCronJobs()
	{
		return	solrindexercronjobsList;
	}
	
	/**
	 * @param solrindexercronjobsList 
	 *  the solrindexercronjobsList to set   
	 */
	public void setSolrIndexerCronJobs(final List<SolrIndexerCronJobDTO> solrindexercronjobsList)
	{
		this.solrindexercronjobsList=solrindexercronjobsList;
	}
	
}
