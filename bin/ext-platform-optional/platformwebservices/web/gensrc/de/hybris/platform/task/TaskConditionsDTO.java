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

import de.hybris.platform.task.TaskConditionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type TaskCondition first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "taskconditions")
public class TaskConditionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TaskConditionDTO*/
	private List<TaskConditionDTO>  taskconditionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaskConditionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaskConditionsDTO(final List<TaskConditionDTO> taskconditionsList)
	{
		super();
		this.taskconditionsList=taskconditionsList;
	}
	
	
	/**
	 * @return the taskconditions
	 */
	@XmlElement(name = "taskcondition")
	public List<TaskConditionDTO> getTaskConditions()
	{
		return	taskconditionsList;
	}
	
	/**
	 * @param taskconditionsList 
	 *  the taskconditionsList to set   
	 */
	public void setTaskConditions(final List<TaskConditionDTO> taskconditionsList)
	{
		this.taskconditionsList=taskconditionsList;
	}
	
}
