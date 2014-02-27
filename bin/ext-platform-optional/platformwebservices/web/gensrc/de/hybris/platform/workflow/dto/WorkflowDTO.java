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

import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.workflow.dto.WorkflowActionDTO;
import de.hybris.platform.workflow.dto.WorkflowItemAttachmentDTO;
import de.hybris.platform.workflow.dto.WorkflowTemplateDTO;
import de.hybris.platform.workflow.model.WorkflowModel;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Workflow first defined at extension workflow
 */
@SuppressWarnings("all")
@GraphNode(target = WorkflowModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "workflow")
public class WorkflowDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>Workflow.actions</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.workflow.dto.WorkflowActionDTO> _actions;
	/** <i>Generated variable</i> - Variable of <code>Workflow.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>Workflow.attachments</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.workflow.dto.WorkflowItemAttachmentDTO> _attachments;
	/** <i>Generated variable</i> - Variable of <code>Workflow.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "actions")
	@XmlElement(name = "workflowAction")
	public List<WorkflowActionDTO> getActions()
	{
		return this._actions;
	}
	
	@XmlElementWrapper(name = "attachments")
	@XmlElement(name = "workflowItemAttachment")
	public List<WorkflowItemAttachmentDTO> getAttachments()
	{
		return this._attachments;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	@Override
	public WorkflowTemplateDTO getJob()
	{
		return (de.hybris.platform.workflow.dto.WorkflowTemplateDTO) super.getJob();
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@Override
	public UserDTO getOwner()
	{
		return (de.hybris.platform.core.dto.user.UserDTO) super.getOwner();
	}
	
	public void setActions(final List<WorkflowActionDTO> value)
	{
		this.modifiedPropsSet.add("actions");
		this._actions = value;
	}
	
	public void setAttachments(final List<WorkflowItemAttachmentDTO> value)
	{
		this.modifiedPropsSet.add("attachments");
		this._attachments = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
}
