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

import de.hybris.platform.servicelayer.internal.dto.MaintenanceCleanupJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MaintenanceCleanupJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "maintenancecleanupjobs")
public class MaintenanceCleanupJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MaintenanceCleanupJobDTO*/
	private List<MaintenanceCleanupJobDTO>  maintenancecleanupjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MaintenanceCleanupJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MaintenanceCleanupJobsDTO(final List<MaintenanceCleanupJobDTO> maintenancecleanupjobsList)
	{
		super();
		this.maintenancecleanupjobsList=maintenancecleanupjobsList;
	}
	
	
	/**
	 * @return the maintenancecleanupjobs
	 */
	@XmlElement(name = "maintenancecleanupjob")
	public List<MaintenanceCleanupJobDTO> getMaintenanceCleanupJobs()
	{
		return	maintenancecleanupjobsList;
	}
	
	/**
	 * @param maintenancecleanupjobsList 
	 *  the maintenancecleanupjobsList to set   
	 */
	public void setMaintenanceCleanupJobs(final List<MaintenanceCleanupJobDTO> maintenancecleanupjobsList)
	{
		this.maintenancecleanupjobsList=maintenancecleanupjobsList;
	}
	
}
