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
package de.hybris.platform.processengine.dto;

import de.hybris.platform.processengine.dto.ProcessTaskDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProcessTask first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "processtasks")
public class ProcessTasksDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProcessTaskDTO*/
	private List<ProcessTaskDTO>  processtasksList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProcessTasksDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProcessTasksDTO(final List<ProcessTaskDTO> processtasksList)
	{
		super();
		this.processtasksList=processtasksList;
	}
	
	
	/**
	 * @return the processtasks
	 */
	@XmlElement(name = "processtask")
	public List<ProcessTaskDTO> getProcessTasks()
	{
		return	processtasksList;
	}
	
	/**
	 * @param processtasksList 
	 *  the processtasksList to set   
	 */
	public void setProcessTasks(final List<ProcessTaskDTO> processtasksList)
	{
		this.processtasksList=processtasksList;
	}
	
}
