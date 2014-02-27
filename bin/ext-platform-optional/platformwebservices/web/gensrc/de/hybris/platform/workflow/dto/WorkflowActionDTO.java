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
import de.hybris.platform.core.dto.link.LinkDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import de.hybris.platform.workflow.dto.AbstractWorkflowActionDTO;
import de.hybris.platform.workflow.dto.WorkflowActionDTO;
import de.hybris.platform.workflow.dto.WorkflowActionTemplateDTO;
import de.hybris.platform.workflow.dto.WorkflowDTO;
import de.hybris.platform.workflow.dto.WorkflowDecisionDTO;
import de.hybris.platform.workflow.dto.WorkflowItemAttachmentDTO;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type WorkflowAction first defined at extension workflow
 */
@SuppressWarnings("all")
@GraphNode(target = WorkflowActionModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "workflowaction")
public class WorkflowActionDTO extends AbstractWorkflowActionDTO
{
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.selectedDecision</code> attribute defined at extension <code> */
	private de.hybris.platform.workflow.dto.WorkflowDecisionDTO _selectedDecision;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.attachments</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.workflow.dto.WorkflowItemAttachmentDTO> _attachments;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.decisions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.workflow.dto.WorkflowDecisionDTO> _decisions;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.firstActivated</code> attribute defined at extension <code> */
	private java.util.Date _firstActivated;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.activated</code> attribute defined at extension <code> */
	private java.util.Date _activated;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.incomingDecisions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.workflow.dto.WorkflowDecisionDTO> _incomingDecisions;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.incomingLinks</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.link.LinkDTO> _incomingLinks;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.workflow</code> attribute defined at extension <code> */
	private de.hybris.platform.workflow.dto.WorkflowDTO _workflow;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.attachmentItems</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.ItemDTO> _attachmentItems;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.incomingLinksStr</code> attribute defined at extension <code> */
	private java.lang.String _incomingLinksStr;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.status</code> attribute defined at extension <code> */
	private java.lang.String _status;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.comment</code> attribute defined at extension <code> */
	private java.lang.String _comment;
	/** <i>Generated variable</i> - Variable of <code>WorkflowAction.template</code> attribute defined at extension <code> */
	private de.hybris.platform.workflow.dto.WorkflowActionTemplateDTO _template;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowActionDTO()
	{
		super();
	}
	
	
	public Date getActivated()
	{
		return this._activated;
	}
	
	@XmlElementWrapper(name = "attachmentItems")
	@XmlElement(name = "item")
	public List<ItemDTO> getAttachmentItems()
	{
		return this._attachmentItems;
	}
	
	@XmlElementWrapper(name = "attachments")
	@XmlElement(name = "workflowItemAttachment")
	public List<WorkflowItemAttachmentDTO> getAttachments()
	{
		return this._attachments;
	}
	
	public String getComment()
	{
		return this._comment;
	}
	
	@XmlElementWrapper(name = "decisions")
	@XmlElement(name = "workflowDecision")
	public Collection<WorkflowDecisionDTO> getDecisions()
	{
		return this._decisions;
	}
	
	public Date getFirstActivated()
	{
		return this._firstActivated;
	}
	
	@XmlElementWrapper(name = "incomingDecisions")
	@XmlElement(name = "workflowDecision")
	public Collection<WorkflowDecisionDTO> getIncomingDecisions()
	{
		return this._incomingDecisions;
	}
	
	@XmlElementWrapper(name = "incomingLinks")
	@XmlElement(name = "link")
	public List<LinkDTO> getIncomingLinks()
	{
		return this._incomingLinks;
	}
	
	public String getIncomingLinksStr()
	{
		return this._incomingLinksStr;
	}
	
	public WorkflowDecisionDTO getSelectedDecision()
	{
		return this._selectedDecision;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getStatus()
	{
		return this._status;
	}
	
	public WorkflowActionTemplateDTO getTemplate()
	{
		return this._template;
	}
	
	public WorkflowDTO getWorkflow()
	{
		return this._workflow;
	}
	
	public void setActivated(final Date value)
	{
		this.modifiedPropsSet.add("activated");
		this._activated = value;
	}
	
	public void setAttachmentItems(final List<ItemDTO> value)
	{
		this.modifiedPropsSet.add("attachmentItems");
		this._attachmentItems = value;
	}
	
	public void setAttachments(final List<WorkflowItemAttachmentDTO> value)
	{
		this.modifiedPropsSet.add("attachments");
		this._attachments = value;
	}
	
	public void setComment(final String value)
	{
		this.modifiedPropsSet.add("comment");
		this._comment = value;
	}
	
	public void setDecisions(final Collection<WorkflowDecisionDTO> value)
	{
		this.modifiedPropsSet.add("decisions");
		this._decisions = value;
	}
	
	public void setFirstActivated(final Date value)
	{
		this.modifiedPropsSet.add("firstActivated");
		this._firstActivated = value;
	}
	
	public void setIncomingDecisions(final Collection<WorkflowDecisionDTO> value)
	{
		this.modifiedPropsSet.add("incomingDecisions");
		this._incomingDecisions = value;
	}
	
	public void setIncomingLinks(final List<LinkDTO> value)
	{
		this.modifiedPropsSet.add("incomingLinks");
		this._incomingLinks = value;
	}
	
	public void setIncomingLinksStr(final String value)
	{
		this.modifiedPropsSet.add("incomingLinksStr");
		this._incomingLinksStr = value;
	}
	
	public void setSelectedDecision(final WorkflowDecisionDTO value)
	{
		this.modifiedPropsSet.add("selectedDecision");
		this._selectedDecision = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setStatus(final String value)
	{
		this.modifiedPropsSet.add("status");
		this._status = value;
	}
	
	public void setTemplate(final WorkflowActionTemplateDTO value)
	{
		this.modifiedPropsSet.add("template");
		this._template = value;
	}
	
	public void setWorkflow(final WorkflowDTO value)
	{
		this.modifiedPropsSet.add("workflow");
		this._workflow = value;
	}
	
}
