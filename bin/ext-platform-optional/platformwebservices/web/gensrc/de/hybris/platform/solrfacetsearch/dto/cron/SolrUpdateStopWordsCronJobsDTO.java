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

import de.hybris.platform.solrfacetsearch.dto.cron.SolrUpdateStopWordsCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrUpdateStopWordsCronJob first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrupdatestopwordscronjobs")
public class SolrUpdateStopWordsCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrUpdateStopWordsCronJobDTO*/
	private List<SolrUpdateStopWordsCronJobDTO>  solrupdatestopwordscronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrUpdateStopWordsCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrUpdateStopWordsCronJobsDTO(final List<SolrUpdateStopWordsCronJobDTO> solrupdatestopwordscronjobsList)
	{
		super();
		this.solrupdatestopwordscronjobsList=solrupdatestopwordscronjobsList;
	}
	
	
	/**
	 * @return the solrupdatestopwordscronjobs
	 */
	@XmlElement(name = "solrupdatestopwordscronjob")
	public List<SolrUpdateStopWordsCronJobDTO> getSolrUpdateStopWordsCronJobs()
	{
		return	solrupdatestopwordscronjobsList;
	}
	
	/**
	 * @param solrupdatestopwordscronjobsList 
	 *  the solrupdatestopwordscronjobsList to set   
	 */
	public void setSolrUpdateStopWordsCronJobs(final List<SolrUpdateStopWordsCronJobDTO> solrupdatestopwordscronjobsList)
	{
		this.solrupdatestopwordscronjobsList=solrupdatestopwordscronjobsList;
	}
	
}