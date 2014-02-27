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
import de.hybris.platform.workflow.dto.WorkflowDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Workflow first defined at extension workflow
 */
@SuppressWarnings("all")
@XmlRootElement(name = "workflows")
public class WorkflowsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>WorkflowDTO*/
	private List<WorkflowDTO>  workflowsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowsDTO(final List<WorkflowDTO> workflowsList)
	{
		super();
		this.workflowsList=workflowsList;
	}
	
	
	/**
	 * @return the workflows
	 */
	@XmlElement(name = "workflow")
	public List<WorkflowDTO> getWorkflows()
	{
		return	workflowsList;
	}
	
	/**
	 * @param workflowsList 
	 *  the workflowsList to set   
	 */
	public void setWorkflows(final List<WorkflowDTO> workflowsList)
	{
		this.workflowsList=workflowsList;
	}
	
}
