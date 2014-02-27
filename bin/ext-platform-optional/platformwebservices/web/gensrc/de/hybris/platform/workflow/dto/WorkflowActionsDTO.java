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
import de.hybris.platform.workflow.dto.WorkflowActionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type WorkflowAction first defined at extension workflow
 */
@SuppressWarnings("all")
@XmlRootElement(name = "workflowactions")
public class WorkflowActionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>WorkflowActionDTO*/
	private List<WorkflowActionDTO>  workflowactionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowActionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowActionsDTO(final List<WorkflowActionDTO> workflowactionsList)
	{
		super();
		this.workflowactionsList=workflowactionsList;
	}
	
	
	/**
	 * @return the workflowactions
	 */
	@XmlElement(name = "workflowaction")
	public List<WorkflowActionDTO> getWorkflowActions()
	{
		return	workflowactionsList;
	}
	
	/**
	 * @param workflowactionsList 
	 *  the workflowactionsList to set   
	 */
	public void setWorkflowActions(final List<WorkflowActionDTO> workflowactionsList)
	{
		this.workflowactionsList=workflowactionsList;
	}
	
}
