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
package de.hybris.platform.cronjob.dto;

import de.hybris.platform.cronjob.dto.CleanUpCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CleanUpCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cleanupcronjobs")
public class CleanUpCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CleanUpCronJobDTO*/
	private List<CleanUpCronJobDTO>  cleanupcronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CleanUpCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CleanUpCronJobsDTO(final List<CleanUpCronJobDTO> cleanupcronjobsList)
	{
		super();
		this.cleanupcronjobsList=cleanupcronjobsList;
	}
	
	
	/**
	 * @return the cleanupcronjobs
	 */
	@XmlElement(name = "cleanupcronjob")
	public List<CleanUpCronJobDTO> getCleanUpCronJobs()
	{
		return	cleanupcronjobsList;
	}
	
	/**
	 * @param cleanupcronjobsList 
	 *  the cleanupcronjobsList to set   
	 */
	public void setCleanUpCronJobs(final List<CleanUpCronJobDTO> cleanupcronjobsList)
	{
		this.cleanupcronjobsList=cleanupcronjobsList;
	}
	
}