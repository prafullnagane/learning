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
package de.hybris.platform.admincockpit.dto.cronjob;

import de.hybris.platform.admincockpit.dto.cronjob.RemoveOrphanedFilesCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RemoveOrphanedFilesCronJob first defined at extension admincockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "removeorphanedfilescronjobs")
public class RemoveOrphanedFilesCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RemoveOrphanedFilesCronJobDTO*/
	private List<RemoveOrphanedFilesCronJobDTO>  removeorphanedfilescronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveOrphanedFilesCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveOrphanedFilesCronJobsDTO(final List<RemoveOrphanedFilesCronJobDTO> removeorphanedfilescronjobsList)
	{
		super();
		this.removeorphanedfilescronjobsList=removeorphanedfilescronjobsList;
	}
	
	
	/**
	 * @return the removeorphanedfilescronjobs
	 */
	@XmlElement(name = "removeorphanedfilescronjob")
	public List<RemoveOrphanedFilesCronJobDTO> getRemoveOrphanedFilesCronJobs()
	{
		return	removeorphanedfilescronjobsList;
	}
	
	/**
	 * @param removeorphanedfilescronjobsList 
	 *  the removeorphanedfilescronjobsList to set   
	 */
	public void setRemoveOrphanedFilesCronJobs(final List<RemoveOrphanedFilesCronJobDTO> removeorphanedfilescronjobsList)
	{
		this.removeorphanedfilescronjobsList=removeorphanedfilescronjobsList;
	}
	
}
