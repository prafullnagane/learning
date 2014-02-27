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
package de.hybris.platform.lucenesearch.dto;

import de.hybris.platform.lucenesearch.dto.UpdateIndexJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type UpdateIndexJob first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "updateindexjobs")
public class UpdateIndexJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>UpdateIndexJobDTO*/
	private List<UpdateIndexJobDTO>  updateindexjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UpdateIndexJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UpdateIndexJobsDTO(final List<UpdateIndexJobDTO> updateindexjobsList)
	{
		super();
		this.updateindexjobsList=updateindexjobsList;
	}
	
	
	/**
	 * @return the updateindexjobs
	 */
	@XmlElement(name = "updateindexjob")
	public List<UpdateIndexJobDTO> getUpdateIndexJobs()
	{
		return	updateindexjobsList;
	}
	
	/**
	 * @param updateindexjobsList 
	 *  the updateindexjobsList to set   
	 */
	public void setUpdateIndexJobs(final List<UpdateIndexJobDTO> updateindexjobsList)
	{
		this.updateindexjobsList=updateindexjobsList;
	}
	
}
