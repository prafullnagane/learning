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
import de.hybris.platform.workflow.dto.WorkflowDecisionTemplateDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type WorkflowDecisionTemplate first defined at extension workflow
 */
@SuppressWarnings("all")
@XmlRootElement(name = "workflowdecisiontemplates")
public class WorkflowDecisionTemplatesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>WorkflowDecisionTemplateDTO*/
	private List<WorkflowDecisionTemplateDTO>  workflowdecisiontemplatesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowDecisionTemplatesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowDecisionTemplatesDTO(final List<WorkflowDecisionTemplateDTO> workflowdecisiontemplatesList)
	{
		super();
		this.workflowdecisiontemplatesList=workflowdecisiontemplatesList;
	}
	
	
	/**
	 * @return the workflowdecisiontemplates
	 */
	@XmlElement(name = "workflowdecisiontemplate")
	public List<WorkflowDecisionTemplateDTO> getWorkflowDecisionTemplates()
	{
		return	workflowdecisiontemplatesList;
	}
	
	/**
	 * @param workflowdecisiontemplatesList 
	 *  the workflowdecisiontemplatesList to set   
	 */
	public void setWorkflowDecisionTemplates(final List<WorkflowDecisionTemplateDTO> workflowdecisiontemplatesList)
	{
		this.workflowdecisiontemplatesList=workflowdecisiontemplatesList;
	}
	
}
