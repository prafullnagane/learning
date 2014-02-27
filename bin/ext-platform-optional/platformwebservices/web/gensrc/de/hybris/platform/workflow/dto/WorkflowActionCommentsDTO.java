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

import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import de.hybris.platform.workflow.dto.WorkflowActionCommentDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type WorkflowActionComment first defined at extension workflow
 */
@SuppressWarnings("all")
@XmlRootElement(name = "workflowactioncomments")
public class WorkflowActionCommentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>WorkflowActionCommentDTO*/
	private List<WorkflowActionCommentDTO>  workflowactioncommentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowActionCommentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowActionCommentsDTO(final List<WorkflowActionCommentDTO> workflowactioncommentsList)
	{
		super();
		this.workflowactioncommentsList=workflowactioncommentsList;
	}
	
	
	/**
	 * @return the workflowactioncomments
	 */
	@XmlElement(name = "workflowactioncomment")
	public List<WorkflowActionCommentDTO> getWorkflowActionComments()
	{
		return	workflowactioncommentsList;
	}
	
	/**
	 * @param workflowactioncommentsList 
	 *  the workflowactioncommentsList to set   
	 */
	public void setWorkflowActionComments(final List<WorkflowActionCommentDTO> workflowactioncommentsList)
	{
		this.workflowactioncommentsList=workflowactioncommentsList;
	}
	
}
