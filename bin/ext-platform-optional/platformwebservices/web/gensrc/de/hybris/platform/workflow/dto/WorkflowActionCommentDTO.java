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
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.workflow.dto.AbstractWorkflowActionDTO;
import de.hybris.platform.workflow.model.WorkflowActionCommentModel;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type WorkflowActionComment first defined at extension workflow
 */
@SuppressWarnings("all")
@GraphNode(target = WorkflowActionCommentModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "workflowactioncomment")
public class WorkflowActionCommentDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>WorkflowActionComment.comment</code> attribute defined at extension <code> */
	private java.lang.String _comment;
	/** <i>Generated variable</i> - Variable of <code>WorkflowActionComment.workflowAction</code> attribute defined at extension <code> */
	private de.hybris.platform.workflow.dto.AbstractWorkflowActionDTO _workflowAction;
	/** <i>Generated variable</i> - Variable of <code>WorkflowActionComment.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowActionCommentDTO()
	{
		super();
	}
	
	
	public String getComment()
	{
		return this._comment;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public AbstractWorkflowActionDTO getWorkflowAction()
	{
		return this._workflowAction;
	}
	
	public void setComment(final String value)
	{
		this.modifiedPropsSet.add("comment");
		this._comment = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
	public void setWorkflowAction(final AbstractWorkflowActionDTO value)
	{
		this.modifiedPropsSet.add("workflowAction");
		this._workflowAction = value;
	}
	
}
