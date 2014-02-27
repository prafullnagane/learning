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

import de.hybris.platform.cronjob.dto.RemoveItemsJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RemoveItemsJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "removeitemsjobs")
public class RemoveItemsJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RemoveItemsJobDTO*/
	private List<RemoveItemsJobDTO>  removeitemsjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveItemsJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveItemsJobsDTO(final List<RemoveItemsJobDTO> removeitemsjobsList)
	{
		super();
		this.removeitemsjobsList=removeitemsjobsList;
	}
	
	
	/**
	 * @return the removeitemsjobs
	 */
	@XmlElement(name = "removeitemsjob")
	public List<RemoveItemsJobDTO> getRemoveItemsJobs()
	{
		return	removeitemsjobsList;
	}
	
	/**
	 * @param removeitemsjobsList 
	 *  the removeitemsjobsList to set   
	 */
	public void setRemoveItemsJobs(final List<RemoveItemsJobDTO> removeitemsjobsList)
	{
		this.removeitemsjobsList=removeitemsjobsList;
	}
	
}