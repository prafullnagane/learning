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
import de.hybris.platform.workflow.dto.WorkflowItemAttachmentDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type WorkflowItemAttachment first defined at extension workflow
 */
@SuppressWarnings("all")
@XmlRootElement(name = "workflowitemattachments")
public class WorkflowItemAttachmentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>WorkflowItemAttachmentDTO*/
	private List<WorkflowItemAttachmentDTO>  workflowitemattachmentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowItemAttachmentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowItemAttachmentsDTO(final List<WorkflowItemAttachmentDTO> workflowitemattachmentsList)
	{
		super();
		this.workflowitemattachmentsList=workflowitemattachmentsList;
	}
	
	
	/**
	 * @return the workflowitemattachments
	 */
	@XmlElement(name = "workflowitemattachment")
	public List<WorkflowItemAttachmentDTO> getWorkflowItemAttachments()
	{
		return	workflowitemattachmentsList;
	}
	
	/**
	 * @param workflowitemattachmentsList 
	 *  the workflowitemattachmentsList to set   
	 */
	public void setWorkflowItemAttachments(final List<WorkflowItemAttachmentDTO> workflowitemattachmentsList)
	{
		this.workflowitemattachmentsList=workflowitemattachmentsList;
	}
	
}
