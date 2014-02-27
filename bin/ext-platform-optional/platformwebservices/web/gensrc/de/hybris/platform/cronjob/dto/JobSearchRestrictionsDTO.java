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

import de.hybris.platform.cronjob.dto.JobSearchRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type JobSearchRestriction first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "jobsearchrestrictions")
public class JobSearchRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>JobSearchRestrictionDTO*/
	private List<JobSearchRestrictionDTO>  jobsearchrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JobSearchRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JobSearchRestrictionsDTO(final List<JobSearchRestrictionDTO> jobsearchrestrictionsList)
	{
		super();
		this.jobsearchrestrictionsList=jobsearchrestrictionsList;
	}
	
	
	/**
	 * @return the jobsearchrestrictions
	 */
	@XmlElement(name = "jobsearchrestriction")
	public List<JobSearchRestrictionDTO> getJobSearchRestrictions()
	{
		return	jobsearchrestrictionsList;
	}
	
	/**
	 * @param jobsearchrestrictionsList 
	 *  the jobsearchrestrictionsList to set   
	 */
	public void setJobSearchRestrictions(final List<JobSearchRestrictionDTO> jobsearchrestrictionsList)
	{
		this.jobsearchrestrictionsList=jobsearchrestrictionsList;
	}
	
}
