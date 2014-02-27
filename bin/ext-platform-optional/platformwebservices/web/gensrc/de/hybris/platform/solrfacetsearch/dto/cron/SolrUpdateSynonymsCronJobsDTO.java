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

import de.hybris.platform.solrfacetsearch.dto.cron.SolrUpdateSynonymsCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrUpdateSynonymsCronJob first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrupdatesynonymscronjobs")
public class SolrUpdateSynonymsCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrUpdateSynonymsCronJobDTO*/
	private List<SolrUpdateSynonymsCronJobDTO>  solrupdatesynonymscronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrUpdateSynonymsCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrUpdateSynonymsCronJobsDTO(final List<SolrUpdateSynonymsCronJobDTO> solrupdatesynonymscronjobsList)
	{
		super();
		this.solrupdatesynonymscronjobsList=solrupdatesynonymscronjobsList;
	}
	
	
	/**
	 * @return the solrupdatesynonymscronjobs
	 */
	@XmlElement(name = "solrupdatesynonymscronjob")
	public List<SolrUpdateSynonymsCronJobDTO> getSolrUpdateSynonymsCronJobs()
	{
		return	solrupdatesynonymscronjobsList;
	}
	
	/**
	 * @param solrupdatesynonymscronjobsList 
	 *  the solrupdatesynonymscronjobsList to set   
	 */
	public void setSolrUpdateSynonymsCronJobs(final List<SolrUpdateSynonymsCronJobDTO> solrupdatesynonymscronjobsList)
	{
		this.solrupdatesynonymscronjobsList=solrupdatesynonymscronjobsList;
	}
	
}
