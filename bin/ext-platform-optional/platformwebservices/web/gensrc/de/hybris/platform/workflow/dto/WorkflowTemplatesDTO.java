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
import de.hybris.platform.workflow.dto.WorkflowTemplateDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type WorkflowTemplate first defined at extension workflow
 */
@SuppressWarnings("all")
@XmlRootElement(name = "workflowtemplates")
public class WorkflowTemplatesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>WorkflowTemplateDTO*/
	private List<WorkflowTemplateDTO>  workflowtemplatesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowTemplatesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowTemplatesDTO(final List<WorkflowTemplateDTO> workflowtemplatesList)
	{
		super();
		this.workflowtemplatesList=workflowtemplatesList;
	}
	
	
	/**
	 * @return the workflowtemplates
	 */
	@XmlElement(name = "workflowtemplate")
	public List<WorkflowTemplateDTO> getWorkflowTemplates()
	{
		return	workflowtemplatesList;
	}
	
	/**
	 * @param workflowtemplatesList 
	 *  the workflowtemplatesList to set   
	 */
	public void setWorkflowTemplates(final List<WorkflowTemplateDTO> workflowtemplatesList)
	{
		this.workflowtemplatesList=workflowtemplatesList;
	}
	
}
