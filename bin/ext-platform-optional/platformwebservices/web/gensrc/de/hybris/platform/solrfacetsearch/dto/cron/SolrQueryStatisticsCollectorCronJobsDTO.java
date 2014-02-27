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
package de.hybris.platform.solrfacetsearch.dto.cron;

import de.hybris.platform.solrfacetsearch.dto.cron.SolrQueryStatisticsCollectorCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrQueryStatisticsCollectorCronJob first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrquerystatisticscollectorcronjobs")
public class SolrQueryStatisticsCollectorCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrQueryStatisticsCollectorCronJobDTO*/
	private List<SolrQueryStatisticsCollectorCronJobDTO>  solrquerystatisticscollectorcronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrQueryStatisticsCollectorCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrQueryStatisticsCollectorCronJobsDTO(final List<SolrQueryStatisticsCollectorCronJobDTO> solrquerystatisticscollectorcronjobsList)
	{
		super();
		this.solrquerystatisticscollectorcronjobsList=solrquerystatisticscollectorcronjobsList;
	}
	
	
	/**
	 * @return the solrquerystatisticscollectorcronjobs
	 */
	@XmlElement(name = "solrquerystatisticscollectorcronjob")
	public List<SolrQueryStatisticsCollectorCronJobDTO> getSolrQueryStatisticsCollectorCronJobs()
	{
		return	solrquerystatisticscollectorcronjobsList;
	}
	
	/**
	 * @param solrquerystatisticscollectorcronjobsList 
	 *  the solrquerystatisticscollectorcronjobsList to set   
	 */
	public void setSolrQueryStatisticsCollectorCronJobs(final List<SolrQueryStatisticsCollectorCronJobDTO> solrquerystatisticscollectorcronjobsList)
	{
		this.solrquerystatisticscollectorcronjobsList=solrquerystatisticscollectorcronjobsList;
	}
	
}
