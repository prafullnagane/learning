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

import de.hybris.platform.cronjob.dto.SessionTimeoutJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SessionTimeoutJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "sessiontimeoutjobs")
public class SessionTimeoutJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SessionTimeoutJobDTO*/
	private List<SessionTimeoutJobDTO>  sessiontimeoutjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SessionTimeoutJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SessionTimeoutJobsDTO(final List<SessionTimeoutJobDTO> sessiontimeoutjobsList)
	{
		super();
		this.sessiontimeoutjobsList=sessiontimeoutjobsList;
	}
	
	
	/**
	 * @return the sessiontimeoutjobs
	 */
	@XmlElement(name = "sessiontimeoutjob")
	public List<SessionTimeoutJobDTO> getSessionTimeoutJobs()
	{
		return	sessiontimeoutjobsList;
	}
	
	/**
	 * @param sessiontimeoutjobsList 
	 *  the sessiontimeoutjobsList to set   
	 */
	public void setSessionTimeoutJobs(final List<SessionTimeoutJobDTO> sessiontimeoutjobsList)
	{
		this.sessiontimeoutjobsList=sessiontimeoutjobsList;
	}
	
}
