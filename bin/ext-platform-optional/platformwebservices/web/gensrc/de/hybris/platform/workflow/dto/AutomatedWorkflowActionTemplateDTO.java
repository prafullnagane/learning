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

import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.workflow.dto.WorkflowActionTemplateDTO;
import de.hybris.platform.workflow.model.AutomatedWorkflowActionTemplateModel;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AutomatedWorkflowActionTemplate first defined at extension workflow
 */
@SuppressWarnings("all")
@GraphNode(target = AutomatedWorkflowActionTemplateModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "automatedworkflowactiontemplate")
public class AutomatedWorkflowActionTemplateDTO extends WorkflowActionTemplateDTO
{
	/** <i>Generated variable</i> - Variable of <code>AutomatedWorkflowActionTemplate.jobHandler</code> attribute defined at extension <code> */
	private java.lang.String _jobHandler;
	/** <i>Generated variable</i> - Variable of <code>AutomatedWorkflowActionTemplate.jobClass</code> attribute defined at extension <code> */
	private java.lang.Class _jobClass;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AutomatedWorkflowActionTemplateDTO()
	{
		super();
	}
	
	
	public Class getJobClass()
	{
		return this._jobClass;
	}
	
	public String getJobHandler()
	{
		return this._jobHandler;
	}
	
	public void setJobClass(final Class value)
	{
		this.modifiedPropsSet.add("jobClass");
		this._jobClass = value;
	}
	
	public void setJobHandler(final String value)
	{
		this.modifiedPropsSet.add("jobHandler");
		this._jobHandler = value;
	}
	
}
