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
import de.hybris.platform.task.TaskConditionDTO;
import de.hybris.platform.task.TaskModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Task first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = TaskModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "task")
public class TaskDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Task.context</code> attribute defined at extension <code> */
	private java.lang.Object _context;
	/** <i>Generated variable</i> - Variable of <code>Task.retry</code> attribute defined at extension <code> */
	private java.lang.Integer _retry;
	/** <i>Generated variable</i> - Variable of <code>Task.executionDate</code> attribute defined at extension <code> */
	private java.util.Date _executionDate;
	/** <i>Generated variable</i> - Variable of <code>Task.conditions</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.task.TaskConditionDTO> _conditions;
	/** <i>Generated variable</i> - Variable of <code>Task.runnerBean</code> attribute defined at extension <code> */
	private java.lang.String _runnerBean;
	/** <i>Generated variable</i> - Variable of <code>Task.failed</code> attribute defined at extension <code> */
	private java.lang.Boolean _failed;
	/** <i>Generated variable</i> - Variable of <code>Task.nodeId</code> attribute defined at extension <code> */
	private java.lang.Integer _nodeId;
	/** <i>Generated variable</i> - Variable of <code>Task.expirationDate</code> attribute defined at extension <code> */
	private java.util.Date _expirationDate;
	/** <i>Generated variable</i> - Variable of <code>Task.contextItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _contextItem;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaskDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "conditions")
	@XmlElement(name = "taskCondition")
	public Set<TaskConditionDTO> getConditions()
	{
		return this._conditions;
	}
	
	public Object getContext()
	{
		return this._context;
	}
	
	public ItemDTO getContextItem()
	{
		return this._contextItem;
	}
	
	public Date getExecutionDate()
	{
		return this._executionDate;
	}
	
	public Date getExpirationDate()
	{
		return this._expirationDate;
	}
	
	public Boolean getFailed()
	{
		return this._failed;
	}
	
	public Integer getNodeId()
	{
		return this._nodeId;
	}
	
	public Integer getRetry()
	{
		return this._retry;
	}
	
	public String getRunnerBean()
	{
		return this._runnerBean;
	}
	
	public void setConditions(final Set<TaskConditionDTO> value)
	{
		this.modifiedPropsSet.add("conditions");
		this._conditions = value;
	}
	
	public void setContext(final Object value)
	{
		this.modifiedPropsSet.add("context");
		this._context = value;
	}
	
	public void setContextItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("contextItem");
		this._contextItem = value;
	}
	
	public void setExecutionDate(final Date value)
	{
		this.modifiedPropsSet.add("executionDate");
		this._executionDate = value;
	}
	
	public void setExpirationDate(final Date value)
	{
		this.modifiedPropsSet.add("expirationDate");
		this._expirationDate = value;
	}
	
	public void setFailed(final Boolean value)
	{
		this.modifiedPropsSet.add("failed");
		this._failed = value;
	}
	
	public void setNodeId(final Integer value)
	{
		this.modifiedPropsSet.add("nodeId");
		this._nodeId = value;
	}
	
	public void setRetry(final Integer value)
	{
		this.modifiedPropsSet.add("retry");
		this._retry = value;
	}
	
	public void setRunnerBean(final String value)
	{
		this.modifiedPropsSet.add("runnerBean");
		this._runnerBean = value;
	}
	
}
