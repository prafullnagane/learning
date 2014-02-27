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
import de.hybris.platform.task.TaskModel;
import java.util.Date;

/**
 * Generated model class for type TaskCondition first defined at extension processing.
 */
@SuppressWarnings("all")
public class TaskConditionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "TaskCondition";
	
	/**<i>Generated relation code constant for relation <code>TaskConditionRelation</code> defining source attribute <code>task</code> in extension <code>processing</code>.</i>*/
	public final static String _TASKCONDITIONRELATION = "TaskConditionRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaskCondition.processedDate</code> attribute defined at extension <code>processing</code>. */
	public static final String PROCESSEDDATE = "processedDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaskCondition.expirationDate</code> attribute defined at extension <code>processing</code>. */
	public static final String EXPIRATIONDATE = "expirationDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaskCondition.task</code> attribute defined at extension <code>processing</code>. */
	public static final String TASK = "task";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaskCondition.fulfilled</code> attribute defined at extension <code>processing</code>. */
	public static final String FULFILLED = "fulfilled";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaskCondition.uniqueID</code> attribute defined at extension <code>processing</code>. */
	public static final String UNIQUEID = "uniqueID";
	
	
	/** <i>Generated variable</i> - Variable of <code>TaskCondition.processedDate</code> attribute defined at extension <code>processing</code>. */
	private Date _processedDate;
	
	/** <i>Generated variable</i> - Variable of <code>TaskCondition.expirationDate</code> attribute defined at extension <code>processing</code>. */
	private Date _expirationDate;
	
	/** <i>Generated variable</i> - Variable of <code>TaskCondition.task</code> attribute defined at extension <code>processing</code>. */
	private TaskModel _task;
	
	/** <i>Generated variable</i> - Variable of <code>TaskCondition.fulfilled</code> attribute defined at extension <code>processing</code>. */
	private Boolean _fulfilled;
	
	/** <i>Generated variable</i> - Variable of <code>TaskCondition.uniqueID</code> attribute defined at extension <code>processing</code>. */
	private String _uniqueID;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TaskConditionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TaskConditionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _uniqueID initial attribute declared by type <code>TaskCondition</code> at extension <code>processing</code>
	 */
	@Deprecated
	public TaskConditionModel(final String _uniqueID)
	{
		super();
		setUniqueID(_uniqueID);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _expirationDate initial attribute declared by type <code>TaskCondition</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uniqueID initial attribute declared by type <code>TaskCondition</code> at extension <code>processing</code>
	 */
	@Deprecated
	public TaskConditionModel(final Date _expirationDate, final ItemModel _owner, final String _uniqueID)
	{
		super();
		setExpirationDate(_expirationDate);
		setOwner(_owner);
		setUniqueID(_uniqueID);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskCondition.expirationDate</code> attribute defined at extension <code>processing</code>. 
	 * @return the expirationDate - The maximum allowed time to wait for completion
	 */
	public Date getExpirationDate()
	{
		return _expirationDate = getPersistenceContext().getValue(EXPIRATIONDATE, _expirationDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskCondition.fulfilled</code> attribute defined at extension <code>processing</code>. 
	 * @return the fulfilled
	 */
	public Boolean getFulfilled()
	{
		return _fulfilled = getPersistenceContext().getValue(FULFILLED, _fulfilled);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskCondition.processedDate</code> attribute defined at extension <code>processing</code>. 
	 * @return the processedDate - The date when this condition has been processed.
	 * 					             Then state is switched to FULFILLED or REJECTED.
	 */
	public Date getProcessedDate()
	{
		return _processedDate = getPersistenceContext().getValue(PROCESSEDDATE, _processedDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskCondition.task</code> attribute defined at extension <code>processing</code>. 
	 * @return the task
	 */
	public TaskModel getTask()
	{
		return _task = getPersistenceContext().getValue(TASK, _task);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskCondition.uniqueID</code> attribute defined at extension <code>processing</code>. 
	 * @return the uniqueID - The unique id of this condition - may be created by number series !?
	 */
	public String getUniqueID()
	{
		return _uniqueID = getPersistenceContext().getValue(UNIQUEID, _uniqueID);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>TaskCondition.expirationDate</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the expirationDate - The maximum allowed time to wait for completion
	 */
	public void setExpirationDate(final Date value)
	{
		_expirationDate = getPersistenceContext().setValue(EXPIRATIONDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaskCondition.fulfilled</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the fulfilled
	 */
	public void setFulfilled(final Boolean value)
	{
		_fulfilled = getPersistenceContext().setValue(FULFILLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaskCondition.processedDate</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the processedDate - The date when this condition has been processed.
	 * 					             Then state is switched to FULFILLED or REJECTED.
	 */
	public void setProcessedDate(final Date value)
	{
		_processedDate = getPersistenceContext().setValue(PROCESSEDDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaskCondition.task</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the task
	 */
	public void setTask(final TaskModel value)
	{
		_task = getPersistenceContext().setValue(TASK, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>TaskCondition.uniqueID</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the uniqueID - The unique id of this condition - may be created by number series !?
	 */
	public void setUniqueID(final String value)
	{
		_uniqueID = getPersistenceContext().setValue(UNIQUEID, value);
	}
	
}
