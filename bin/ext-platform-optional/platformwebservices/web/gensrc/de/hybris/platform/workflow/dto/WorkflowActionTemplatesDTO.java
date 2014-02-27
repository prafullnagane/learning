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
import de.hybris.platform.workflow.dto.WorkflowActionTemplateDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type WorkflowActionTemplate first defined at extension workflow
 */
@SuppressWarnings("all")
@XmlRootElement(name = "workflowactiontemplates")
public class WorkflowActionTemplatesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>WorkflowActionTemplateDTO*/
	private List<WorkflowActionTemplateDTO>  workflowactiontemplatesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowActionTemplatesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowActionTemplatesDTO(final List<WorkflowActionTemplateDTO> workflowactiontemplatesList)
	{
		super();
		this.workflowactiontemplatesList=workflowactiontemplatesList;
	}
	
	
	/**
	 * @return the workflowactiontemplates
	 */
	@XmlElement(name = "workflowactiontemplate")
	public List<WorkflowActionTemplateDTO> getWorkflowActionTemplates()
	{
		return	workflowactiontemplatesList;
	}
	
	/**
	 * @param workflowactiontemplatesList 
	 *  the workflowactiontemplatesList to set   
	 */
	public void setWorkflowActionTemplates(final List<WorkflowActionTemplateDTO> workflowactiontemplatesList)
	{
		this.workflowactiontemplatesList=workflowactiontemplatesList;
	}
	
}
