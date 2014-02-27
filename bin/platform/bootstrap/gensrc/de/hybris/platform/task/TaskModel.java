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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.task.TaskConditionModel;
import java.util.Date;
import java.util.Set;

/**
 * Generated model class for type Task first defined at extension processing.
 */
@SuppressWarnings("all")
public class TaskModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Task";
	
	/** <i>Generated constant</i> - Attribute key of <code>Task.context</code> attribute defined at extension <code>processing</code>. */
	public static final String CONTEXT = "context";
	
	/** <i>Generated constant</i> - Attribute key of <code>Task.retry</code> attribute defined at extension <code>processing</code>. */
	public static final String RETRY = "retry";
	
	/** <i>Generated constant</i> - Attribute key of <code>Task.conditions</code> attribute defined at extension <code>processing</code>. */
	public static final String CONDITIONS = "conditions";
	
	/** <i>Generated constant</i> - Attribute key of <code>Task.executionDate</code> attribute defined at extension <code>processing</code>. */
	public static final String EXECUTIONDATE = "executionDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Task.runnerBean</code> attribute defined at extension <code>processing</code>. */
	public static final String RUNNERBEAN = "runnerBean";
	
	/** <i>Generated constant</i> - Attribute key of <code>Task.failed</code> attribute defined at extension <code>processing</code>. */
	public static final String FAILED = "failed";
	
	/** <i>Generated constant</i> - Attribute key of <code>Task.nodeId</code> attribute defined at extension <code>processing</code>. */
	public static final String NODEID = "nodeId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Task.expirationDate</code> attribute defined at extension <code>processing</code>. */
	public static final String EXPIRATIONDATE = "expirationDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Task.contextItem</code> attribute defined at extension <code>processing</code>. */
	public static final String CONTEXTITEM = "contextItem";
	
	
	/** <i>Generated variable</i> - Variable of <code>Task.context</code> attribute defined at extension <code>processing</code>. */
	private Object _context;
	
	/** <i>Generated variable</i> - Variable of <code>Task.retry</code> attribute defined at extension <code>processing</code>. */
	private Integer _retry;
	
	/** <i>Generated variable</i> - Variable of <code>Task.conditions</code> attribute defined at extension <code>processing</code>. */
	private Set<TaskConditionModel> _conditions;
	
	/** <i>Generated variable</i> - Variable of <code>Task.executionDate</code> attribute defined at extension <code>processing</code>. */
	private Date _executionDate;
	
	/** <i>Generated variable</i> - Variable of <code>Task.runnerBean</code> attribute defined at extension <code>processing</code>. */
	private String _runnerBean;
	
	/** <i>Generated variable</i> - Variable of <code>Task.failed</code> attribute defined at extension <code>processing</code>. */
	private Boolean _failed;
	
	/** <i>Generated variable</i> - Variable of <code>Task.nodeId</code> attribute defined at extension <code>processing</code>. */
	private Integer _nodeId;
	
	/** <i>Generated variable</i> - Variable of <code>Task.expirationDate</code> attribute defined at extension <code>processing</code>. */
	private Date _expirationDate;
	
	/** <i>Generated variable</i> - Variable of <code>Task.contextItem</code> attribute defined at extension <code>processing</code>. */
	private ItemModel _contextItem;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TaskModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TaskModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _runnerBean initial attribute declared by type <code>Task</code> at extension <code>processing</code>
	 */
	@Deprecated
	public TaskModel(final String _runnerBean)
	{
		super();
		setRunnerBean(_runnerBean);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _expirationDate initial attribute declared by type <code>Task</code> at extension <code>processing</code>
	 * @param _nodeId initial attribute declared by type <code>Task</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _runnerBean initial attribute declared by type <code>Task</code> at extension <code>processing</code>
	 */
	@Deprecated
	public TaskModel(final Date _expirationDate, final Integer _nodeId, final ItemModel _owner, final String _runnerBean)
	{
		super();
		setExpirationDate(_expirationDate);
		setNodeId(_nodeId);
		setOwner(_owner);
		setRunnerBean(_runnerBean);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Task.conditions</code> attribute defined at extension <code>processing</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the conditions
	 */
	public Set<TaskConditionModel> getConditions()
	{
		return _conditions = getPersistenceContext().getValue(CONDITIONS, _conditions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Task.context</code> attribute defined at extension <code>processing</code>. 
	 * @return the context
	 */
	public Object getContext()
	{
		return _context = getPersistenceContext().getValue(CONTEXT, _context);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Task.contextItem</code> attribute defined at extension <code>processing</code>. 
	 * @return the contextItem
	 */
	public ItemModel getContextItem()
	{
		return _contextItem = getPersistenceContext().getValue(CONTEXTITEM, _contextItem);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Task.executionDate</code> attribute defined at extension <code>processing</code>. 
	 * @return the executionDate - Date after this task is to be executed
	 */
	public Date getExecutionDate()
	{
		return _executionDate = getPersistenceContext().getValue(EXECUTIONDATE, _executionDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Task.expirationDate</code> attribute defined at extension <code>processing</code>. 
	 * @return the expirationDate
	 */
	public Date getExpirationDate()
	{
		return _expirationDate = getPersistenceContext().getValue(EXPIRATIONDATE, _expirationDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Task.failed</code> attribute defined at extension <code>processing</code>. 
	 * @return the failed
	 */
	public Boolean getFailed()
	{
		return _failed = getPersistenceContext().getValue(FAILED, _failed);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Task.nodeId</code> attribute defined at extension <code>processing</code>. 
	 * @return the nodeId
	 */
	public Integer getNodeId()
	{
		return _nodeId = getPersistenceContext().getValue(NODEID, _nodeId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Task.retry</code> attribute defined at extension <code>processing</code>. 
	 * @return the retry
	 */
	public Integer getRetry()
	{
		return _retry = getPersistenceContext().getValue(RETRY, _retry);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Task.runnerBean</code> attribute defined at extension <code>processing</code>. 
	 * @return the runnerBean
	 */
	public String getRunnerBean()
	{
		return _runnerBean = getPersistenceContext().getValue(RUNNERBEAN, _runnerBean);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Task.conditions</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the conditions
	 */
	public void setConditions(final Set<TaskConditionModel> value)
	{
		_conditions = getPersistenceContext().setValue(CONDITIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Task.context</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the context
	 */
	public void setContext(final Object value)
	{
		_context = getPersistenceContext().setValue(CONTEXT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Task.contextItem</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the contextItem
	 */
	public void setContextItem(final ItemModel value)
	{
		_contextItem = getPersistenceContext().setValue(CONTEXTITEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Task.executionDate</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the executionDate - Date after this task is to be executed
	 */
	public void setExecutionDate(final Date value)
	{
		_executionDate = getPersistenceContext().setValue(EXECUTIONDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Task.expirationDate</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the expirationDate
	 */
	public void setExpirationDate(final Date value)
	{
		_expirationDate = getPersistenceContext().setValue(EXPIRATIONDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Task.nodeId</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the nodeId
	 */
	public void setNodeId(final Integer value)
	{
		_nodeId = getPersistenceContext().setValue(NODEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Task.runnerBean</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the runnerBean
	 */
	public void setRunnerBean(final String value)
	{
		_runnerBean = getPersistenceContext().setValue(RUNNERBEAN, value);
	}
	
}
