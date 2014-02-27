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
import de.hybris.platform.workflow.dto.WorkflowActionTemplateDTO;
import de.hybris.platform.workflow.dto.WorkflowTemplateDTO;
import de.hybris.platform.workflow.model.WorkflowDecisionTemplateModel;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type WorkflowDecisionTemplate first defined at extension workflow
 */
@SuppressWarnings("all")
@GraphNode(target = WorkflowDecisionTemplateModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "workflowdecisiontemplate")
public class WorkflowDecisionTemplateDTO extends AbstractWorkflowDecisionDTO
{
	/** <i>Generated variable</i> - Variable of <code>WorkflowDecisionTemplate.parentWorkflowTemplate</code> attribute defined at extension <code> */
	private de.hybris.platform.workflow.dto.WorkflowTemplateDTO _parentWorkflowTemplate;
	/** <i>Generated variable</i> - Variable of <code>WorkflowDecisionTemplate.toTemplateActions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.workflow.dto.WorkflowActionTemplateDTO> _toTemplateActions;
	/** <i>Generated variable</i> - Variable of <code>WorkflowDecisionTemplate.actionTemplate</code> attribute defined at extension <code> */
	private de.hybris.platform.workflow.dto.WorkflowActionTemplateDTO _actionTemplate;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowDecisionTemplateDTO()
	{
		super();
	}
	
	
	public WorkflowActionTemplateDTO getActionTemplate()
	{
		return this._actionTemplate;
	}
	
	public WorkflowTemplateDTO getParentWorkflowTemplate()
	{
		return this._parentWorkflowTemplate;
	}
	
	@XmlElementWrapper(name = "toTemplateActions")
	@XmlElement(name = "workflowActionTemplate")
	public Collection<WorkflowActionTemplateDTO> getToTemplateActions()
	{
		return this._toTemplateActions;
	}
	
	public void setActionTemplate(final WorkflowActionTemplateDTO value)
	{
		this.modifiedPropsSet.add("actionTemplate");
		this._actionTemplate = value;
	}
	
	public void setParentWorkflowTemplate(final WorkflowTemplateDTO value)
	{
		this.modifiedPropsSet.add("parentWorkflowTemplate");
		this._parentWorkflowTemplate = value;
	}
	
	public void setToTemplateActions(final Collection<WorkflowActionTemplateDTO> value)
	{
		this.modifiedPropsSet.add("toTemplateActions");
		this._toTemplateActions = value;
	}
	
}
