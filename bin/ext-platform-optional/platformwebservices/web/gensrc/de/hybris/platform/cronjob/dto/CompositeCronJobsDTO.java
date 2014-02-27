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

import de.hybris.platform.cronjob.dto.CompositeCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CompositeCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "compositecronjobs")
public class CompositeCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CompositeCronJobDTO*/
	private List<CompositeCronJobDTO>  compositecronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompositeCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompositeCronJobsDTO(final List<CompositeCronJobDTO> compositecronjobsList)
	{
		super();
		this.compositecronjobsList=compositecronjobsList;
	}
	
	
	/**
	 * @return the compositecronjobs
	 */
	@XmlElement(name = "compositecronjob")
	public List<CompositeCronJobDTO> getCompositeCronJobs()
	{
		return	compositecronjobsList;
	}
	
	/**
	 * @param compositecronjobsList 
	 *  the compositecronjobsList to set   
	 */
	public void setCompositeCronJobs(final List<CompositeCronJobDTO> compositecronjobsList)
	{
		this.compositecronjobsList=compositecronjobsList;
	}
	
}
