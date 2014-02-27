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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.SyncItemCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SyncItemCronJob first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "syncitemcronjobs")
public class SyncItemCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SyncItemCronJobDTO*/
	private List<SyncItemCronJobDTO>  syncitemcronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SyncItemCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SyncItemCronJobsDTO(final List<SyncItemCronJobDTO> syncitemcronjobsList)
	{
		super();
		this.syncitemcronjobsList=syncitemcronjobsList;
	}
	
	
	/**
	 * @return the syncitemcronjobs
	 */
	@XmlElement(name = "syncitemcronjob")
	public List<SyncItemCronJobDTO> getSyncItemCronJobs()
	{
		return	syncitemcronjobsList;
	}
	
	/**
	 * @param syncitemcronjobsList 
	 *  the syncitemcronjobsList to set   
	 */
	public void setSyncItemCronJobs(final List<SyncItemCronJobDTO> syncitemcronjobsList)
	{
		this.syncitemcronjobsList=syncitemcronjobsList;
	}
	
}
