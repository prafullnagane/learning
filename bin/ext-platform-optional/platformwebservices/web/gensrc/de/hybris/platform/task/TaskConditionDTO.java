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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.task.TaskConditionModel;
import de.hybris.platform.task.TaskDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type TaskCondition first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = TaskConditionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "taskcondition")
public class TaskConditionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>TaskCondition.processedDate</code> attribute defined at extension <code> */
	private java.util.Date _processedDate;
	/** <i>Generated variable</i> - Variable of <code>TaskCondition.expirationDate</code> attribute defined at extension <code> */
	private java.util.Date _expirationDate;
	/** <i>Generated variable</i> - Variable of <code>TaskCondition.uniqueID</code> attribute defined at extension <code> */
	private java.lang.String _uniqueID;
	/** <i>Generated variable</i> - Variable of <code>TaskCondition.fulfilled</code> attribute defined at extension <code> */
	private java.lang.Boolean _fulfilled;
	/** <i>Generated variable</i> - Variable of <code>TaskCondition.task</code> attribute defined at extension <code> */
	private de.hybris.platform.task.TaskDTO _task;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaskConditionDTO()
	{
		super();
	}
	
	
	public Date getExpirationDate()
	{
		return this._expirationDate;
	}
	
	public Boolean getFulfilled()
	{
		return this._fulfilled;
	}
	
	public Date getProcessedDate()
	{
		return this._processedDate;
	}
	
	public TaskDTO getTask()
	{
		return this._task;
	}
	
	public String getUniqueID()
	{
		return this._uniqueID;
	}
	
	public void setExpirationDate(final Date value)
	{
		this.modifiedPropsSet.add("expirationDate");
		this._expirationDate = value;
	}
	
	public void setFulfilled(final Boolean value)
	{
		this.modifiedPropsSet.add("fulfilled");
		this._fulfilled = value;
	}
	
	public void setProcessedDate(final Date value)
	{
		this.modifiedPropsSet.add("processedDate");
		this._processedDate = value;
	}
	
	public void setTask(final TaskDTO value)
	{
		this.modifiedPropsSet.add("task");
		this._task = value;
	}
	
	public void setUniqueID(final String value)
	{
		this.modifiedPropsSet.add("uniqueID");
		this._uniqueID = value;
	}
	
}
