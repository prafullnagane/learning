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

import de.hybris.platform.cronjob.dto.JobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Job first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "jobs")
public class JobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>JobDTO*/
	private List<JobDTO>  jobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JobsDTO(final List<JobDTO> jobsList)
	{
		super();
		this.jobsList=jobsList;
	}
	
	
	/**
	 * @return the jobs
	 */
	@XmlElement(name = "job")
	public List<JobDTO> getJobs()
	{
		return	jobsList;
	}
	
	/**
	 * @param jobsList 
	 *  the jobsList to set   
	 */
	public void setJobs(final List<JobDTO> jobsList)
	{
		this.jobsList=jobsList;
	}
	
}
