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

import de.hybris.platform.solrfacetsearch.dto.indexer.cron.SolrIndexOptimizationCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrIndexOptimizationCronJob first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrindexoptimizationcronjobs")
public class SolrIndexOptimizationCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrIndexOptimizationCronJobDTO*/
	private List<SolrIndexOptimizationCronJobDTO>  solrindexoptimizationcronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexOptimizationCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexOptimizationCronJobsDTO(final List<SolrIndexOptimizationCronJobDTO> solrindexoptimizationcronjobsList)
	{
		super();
		this.solrindexoptimizationcronjobsList=solrindexoptimizationcronjobsList;
	}
	
	
	/**
	 * @return the solrindexoptimizationcronjobs
	 */
	@XmlElement(name = "solrindexoptimizationcronjob")
	public List<SolrIndexOptimizationCronJobDTO> getSolrIndexOptimizationCronJobs()
	{
		return	solrindexoptimizationcronjobsList;
	}
	
	/**
	 * @param solrindexoptimizationcronjobsList 
	 *  the solrindexoptimizationcronjobsList to set   
	 */
	public void setSolrIndexOptimizationCronJobs(final List<SolrIndexOptimizationCronJobDTO> solrindexoptimizationcronjobsList)
	{
		this.solrindexoptimizationcronjobsList=solrindexoptimizationcronjobsList;
	}
	
}
