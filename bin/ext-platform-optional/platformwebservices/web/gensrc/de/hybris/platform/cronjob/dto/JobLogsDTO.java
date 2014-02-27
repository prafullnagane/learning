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

import de.hybris.platform.cronjob.dto.JobLogDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type JobLog first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "joblogs")
public class JobLogsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>JobLogDTO*/
	private List<JobLogDTO>  joblogsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JobLogsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JobLogsDTO(final List<JobLogDTO> joblogsList)
	{
		super();
		this.joblogsList=joblogsList;
	}
	
	
	/**
	 * @return the joblogs
	 */
	@XmlElement(name = "joblog")
	public List<JobLogDTO> getJobLogs()
	{
		return	joblogsList;
	}
	
	/**
	 * @param joblogsList 
	 *  the joblogsList to set   
	 */
	public void setJobLogs(final List<JobLogDTO> joblogsList)
	{
		this.joblogsList=joblogsList;
	}
	
}