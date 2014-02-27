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

import de.hybris.platform.cronjob.dto.RemoveItemsCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RemoveItemsCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "removeitemscronjobs")
public class RemoveItemsCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RemoveItemsCronJobDTO*/
	private List<RemoveItemsCronJobDTO>  removeitemscronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveItemsCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveItemsCronJobsDTO(final List<RemoveItemsCronJobDTO> removeitemscronjobsList)
	{
		super();
		this.removeitemscronjobsList=removeitemscronjobsList;
	}
	
	
	/**
	 * @return the removeitemscronjobs
	 */
	@XmlElement(name = "removeitemscronjob")
	public List<RemoveItemsCronJobDTO> getRemoveItemsCronJobs()
	{
		return	removeitemscronjobsList;
	}
	
	/**
	 * @param removeitemscronjobsList 
	 *  the removeitemscronjobsList to set   
	 */
	public void setRemoveItemsCronJobs(final List<RemoveItemsCronJobDTO> removeitemscronjobsList)
	{
		this.removeitemscronjobsList=removeitemscronjobsList;
	}
	
}
