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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.workflow.dto.WorkflowActionDTO;
import de.hybris.platform.workflow.dto.WorkflowDTO;
import de.hybris.platform.workflow.model.WorkflowItemAttachmentModel;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type WorkflowItemAttachment first defined at extension workflow
 */
@SuppressWarnings("all")
@GraphNode(target = WorkflowItemAttachmentModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "workflowitemattachment")
public class WorkflowItemAttachmentDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>WorkflowItemAttachment.actionStr</code> attribute defined at extension <code> */
	private java.lang.String _actionStr;
	/** <i>Generated variable</i> - Variable of <code>WorkflowItemAttachment.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>WorkflowItemAttachment.item</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _item;
	/** <i>Generated variable</i> - Variable of <code>WorkflowItemAttachment.workflow</code> attribute defined at extension <code> */
	private de.hybris.platform.workflow.dto.WorkflowDTO _workflow;
	/** <i>Generated variable</i> - Variable of <code>WorkflowItemAttachment.actions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.workflow.dto.WorkflowActionDTO> _actions;
	/** <i>Generated variable</i> - Variable of <code>WorkflowItemAttachment.typeOfItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _typeOfItem;
	/** <i>Generated variable</i> - Variable of <code>WorkflowItemAttachment.comment</code> attribute defined at extension <code> */
	private java.lang.String _comment;
	/** <i>Generated variable</i> - Variable of <code>WorkflowItemAttachment.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowItemAttachmentDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "actions")
	@XmlElement(name = "workflowAction")
	public Collection<WorkflowActionDTO> getActions()
	{
		return this._actions;
	}
	
	public String getActionStr()
	{
		return this._actionStr;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public String getComment()
	{
		return this._comment;
	}
	
	public ItemDTO getItem()
	{
		return this._item;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public ComposedTypeDTO getTypeOfItem()
	{
		return this._typeOfItem;
	}
	
	public WorkflowDTO getWorkflow()
	{
		return this._workflow;
	}
	
	public void setActions(final Collection<WorkflowActionDTO> value)
	{
		this.modifiedPropsSet.add("actions");
		this._actions = value;
	}
	
	public void setActionStr(final String value)
	{
		this.modifiedPropsSet.add("actionStr");
		this._actionStr = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setComment(final String value)
	{
		this.modifiedPropsSet.add("comment");
		this._comment = value;
	}
	
	public void setItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("item");
		this._item = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setTypeOfItem(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("typeOfItem");
		this._typeOfItem = value;
	}
	
	public void setWorkflow(final WorkflowDTO value)
	{
		this.modifiedPropsSet.add("workflow");
		this._workflow = value;
	}
	
}
