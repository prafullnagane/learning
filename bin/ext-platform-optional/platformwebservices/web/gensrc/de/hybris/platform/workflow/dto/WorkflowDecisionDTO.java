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
package de.hybris.platform.workflow.dto;

import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.workflow.dto.AbstractWorkflowDecisionDTO;
import de.hybris.platform.workflow.dto.WorkflowActionDTO;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type WorkflowDecision first defined at extension workflow
 */
@SuppressWarnings("all")
@GraphNode(target = WorkflowDecisionModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "workflowdecision")
public class WorkflowDecisionDTO extends AbstractWorkflowDecisionDTO
{
	/** <i>Generated variable</i> - Variable of <code>WorkflowDecision.action</code> attribute defined at extension <code> */
	private de.hybris.platform.workflow.dto.WorkflowActionDTO _action;
	/** <i>Generated variable</i> - Variable of <code>WorkflowDecision.toActions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.workflow.dto.WorkflowActionDTO> _toActions;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowDecisionDTO()
	{
		super();
	}
	
	
	public WorkflowActionDTO getAction()
	{
		return this._action;
	}
	
	@XmlElementWrapper(name = "toActions")
	@XmlElement(name = "workflowAction")
	public Collection<WorkflowActionDTO> getToActions()
	{
		return this._toActions;
	}
	
	public void setAction(final WorkflowActionDTO value)
	{
		this.modifiedPropsSet.add("action");
		this._action = value;
	}
	
	public void setToActions(final Collection<WorkflowActionDTO> value)
	{
		this.modifiedPropsSet.add("toActions");
		this._toActions = value;
	}
	
}
