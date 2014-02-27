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

import de.hybris.platform.catalog.dto.SyncItemJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SyncItemJob first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "syncitemjobs")
public class SyncItemJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SyncItemJobDTO*/
	private List<SyncItemJobDTO>  syncitemjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SyncItemJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SyncItemJobsDTO(final List<SyncItemJobDTO> syncitemjobsList)
	{
		super();
		this.syncitemjobsList=syncitemjobsList;
	}
	
	
	/**
	 * @return the syncitemjobs
	 */
	@XmlElement(name = "syncitemjob")
	public List<SyncItemJobDTO> getSyncItemJobs()
	{
		return	syncitemjobsList;
	}
	
	/**
	 * @param syncitemjobsList 
	 *  the syncitemjobsList to set   
	 */
	public void setSyncItemJobs(final List<SyncItemJobDTO> syncitemjobsList)
	{
		this.syncitemjobsList=syncitemjobsList;
	}
	
}
