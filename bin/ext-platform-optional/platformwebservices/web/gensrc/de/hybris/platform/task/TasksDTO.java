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
package de.hybris.platform.task;

import de.hybris.platform.task.TaskDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Task first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "tasks")
public class TasksDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TaskDTO*/
	private List<TaskDTO>  tasksList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TasksDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TasksDTO(final List<TaskDTO> tasksList)
	{
		super();
		this.tasksList=tasksList;
	}
	
	
	/**
	 * @return the tasks
	 */
	@XmlElement(name = "task")
	public List<TaskDTO> getTasks()
	{
		return	tasksList;
	}
	
	/**
	 * @param tasksList 
	 *  the tasksList to set   
	 */
	public void setTasks(final List<TaskDTO> tasksList)
	{
		this.tasksList=tasksList;
	}
	
}
