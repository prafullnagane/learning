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

import de.hybris.platform.admincockpit.dto.cronjob.RemoveOrphanedFilesJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RemoveOrphanedFilesJob first defined at extension admincockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "removeorphanedfilesjobs")
public class RemoveOrphanedFilesJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RemoveOrphanedFilesJobDTO*/
	private List<RemoveOrphanedFilesJobDTO>  removeorphanedfilesjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveOrphanedFilesJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveOrphanedFilesJobsDTO(final List<RemoveOrphanedFilesJobDTO> removeorphanedfilesjobsList)
	{
		super();
		this.removeorphanedfilesjobsList=removeorphanedfilesjobsList;
	}
	
	
	/**
	 * @return the removeorphanedfilesjobs
	 */
	@XmlElement(name = "removeorphanedfilesjob")
	public List<RemoveOrphanedFilesJobDTO> getRemoveOrphanedFilesJobs()
	{
		return	removeorphanedfilesjobsList;
	}
	
	/**
	 * @param removeorphanedfilesjobsList 
	 *  the removeorphanedfilesjobsList to set   
	 */
	public void setRemoveOrphanedFilesJobs(final List<RemoveOrphanedFilesJobDTO> removeorphanedfilesjobsList)
	{
		this.removeorphanedfilesjobsList=removeorphanedfilesjobsList;
	}
	
}
