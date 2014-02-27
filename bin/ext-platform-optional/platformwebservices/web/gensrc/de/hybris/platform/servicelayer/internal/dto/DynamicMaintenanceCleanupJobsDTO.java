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
package de.hybris.platform.servicelayer.internal.dto;

import de.hybris.platform.servicelayer.internal.dto.DynamicMaintenanceCleanupJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DynamicMaintenanceCleanupJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "dynamicmaintenancecleanupjobs")
public class DynamicMaintenanceCleanupJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DynamicMaintenanceCleanupJobDTO*/
	private List<DynamicMaintenanceCleanupJobDTO>  dynamicmaintenancecleanupjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicMaintenanceCleanupJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicMaintenanceCleanupJobsDTO(final List<DynamicMaintenanceCleanupJobDTO> dynamicmaintenancecleanupjobsList)
	{
		super();
		this.dynamicmaintenancecleanupjobsList=dynamicmaintenancecleanupjobsList;
	}
	
	
	/**
	 * @return the dynamicmaintenancecleanupjobs
	 */
	@XmlElement(name = "dynamicmaintenancecleanupjob")
	public List<DynamicMaintenanceCleanupJobDTO> getDynamicMaintenanceCleanupJobs()
	{
		return	dynamicmaintenancecleanupjobsList;
	}
	
	/**
	 * @param dynamicmaintenancecleanupjobsList 
	 *  the dynamicmaintenancecleanupjobsList to set   
	 */
	public void setDynamicMaintenanceCleanupJobs(final List<DynamicMaintenanceCleanupJobDTO> dynamicmaintenancecleanupjobsList)
	{
		this.dynamicmaintenancecleanupjobsList=dynamicmaintenancecleanupjobsList;
	}
	
}
