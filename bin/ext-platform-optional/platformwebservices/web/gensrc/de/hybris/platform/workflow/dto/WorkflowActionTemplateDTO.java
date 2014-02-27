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

import de.hybris.platform.core.dto.link.LinkDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.workflow.dto.AbstractWorkflowActionDTO;
import de.hybris.platform.workflow.dto.WorkflowActionTemplateDTO;
import de.hybris.platform.workflow.dto.WorkflowDecisionTemplateDTO;
import de.hybris.platform.workflow.dto.WorkflowTemplateDTO;
import de.hybris.platform.workflow.model.WorkflowActionTemplateModel;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type WorkflowActionTemplate first defined at extension workflow
 */
@SuppressWarnings("all")
@GraphNode(target = WorkflowActionTemplateModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "workflowactiontemplate")
public class WorkflowActionTemplateDTO extends AbstractWorkflowActionDTO
{
	/** <i>Generated variable</i> - Variable of <code>WorkflowActionTemplate.creationType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _creationType;
	/** <i>Generated variable</i> - Variable of <code>WorkflowActionTemplate.decisionTemplates</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.workflow.dto.WorkflowDecisionTemplateDTO> _decisionTemplates;
	/** <i>Generated variable</i> - Variable of <code>WorkflowActionTemplate.incomingTemplateDecisions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.workflow.dto.WorkflowDecisionTemplateDTO> _incomingTemplateDecisions;
	/** <i>Generated variable</i> - Variable of <code>WorkflowActionTemplate.workflow</code> attribute defined at extension <code> */
	private de.hybris.platform.workflow.dto.WorkflowTemplateDTO _workflow;
	/** <i>Generated variable</i> - Variable of <code>WorkflowActionTemplate.incomingLinkTemplates</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.link.LinkDTO> _incomingLinkTemplates;
	/** <i>Generated variable</i> - Variable of <code>WorkflowActionTemplate.incomingLinkTemplatesStr</code> attribute defined at extension <code> */
	private java.lang.String _incomingLinkTemplatesStr;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowActionTemplateDTO()
	{
		super();
	}
	
	
	public ComposedTypeDTO getCreationType()
	{
		return this._creationType;
	}
	
	@XmlElementWrapper(name = "decisionTemplates")
	@XmlElement(name = "workflowDecisionTemplate")
	public Collection<WorkflowDecisionTemplateDTO> getDecisionTemplates()
	{
		return this._decisionTemplates;
	}
	
	@XmlElementWrapper(name = "incomingLinkTemplates")
	@XmlElement(name = "link")
	public List<LinkDTO> getIncomingLinkTemplates()
	{
		return this._incomingLinkTemplates;
	}
	
	public String getIncomingLinkTemplatesStr()
	{
		return this._incomingLinkTemplatesStr;
	}
	
	@XmlElementWrapper(name = "incomingTemplateDecisions")
	@XmlElement(name = "workflowDecisionTemplate")
	public Collection<WorkflowDecisionTemplateDTO> getIncomingTemplateDecisions()
	{
		return this._incomingTemplateDecisions;
	}
	
	public WorkflowTemplateDTO getWorkflow()
	{
		return this._workflow;
	}
	
	public void setCreationType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("creationType");
		this._creationType = value;
	}
	
	public void setDecisionTemplates(final Collection<WorkflowDecisionTemplateDTO> value)
	{
		this.modifiedPropsSet.add("decisionTemplates");
		this._decisionTemplates = value;
	}
	
	public void setIncomingLinkTemplates(final List<LinkDTO> value)
	{
		this.modifiedPropsSet.add("incomingLinkTemplates");
		this._incomingLinkTemplates = value;
	}
	
	public void setIncomingLinkTemplatesStr(final String value)
	{
		this.modifiedPropsSet.add("incomingLinkTemplatesStr");
		this._incomingLinkTemplatesStr = value;
	}
	
	public void setIncomingTemplateDecisions(final Collection<WorkflowDecisionTemplateDTO> value)
	{
		this.modifiedPropsSet.add("incomingTemplateDecisions");
		this._incomingTemplateDecisions = value;
	}
	
	public void setWorkflow(final WorkflowTemplateDTO value)
	{
		this.modifiedPropsSet.add("workflow");
		this._workflow = value;
	}
	
}
