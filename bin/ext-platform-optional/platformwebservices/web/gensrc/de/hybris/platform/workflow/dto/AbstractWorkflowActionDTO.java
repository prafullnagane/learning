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

import de.hybris.platform.commons.dto.renderer.RendererTemplateDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import de.hybris.platform.workflow.dto.AbstractWorkflowActionDTO;
import de.hybris.platform.workflow.dto.WorkflowActionCommentDTO;
import de.hybris.platform.workflow.model.AbstractWorkflowActionModel;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractWorkflowAction first defined at extension workflow
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractWorkflowActionModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "abstractworkflowaction")
public class AbstractWorkflowActionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.principalAssigned</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.security.PrincipalDTO _principalAssigned;
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.actionType</code> attribute defined at extension <code> */
	private java.lang.String _actionType;
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.workflowActionComments</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.workflow.dto.WorkflowActionCommentDTO> _workflowActionComments;
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.predecessors</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.workflow.dto.AbstractWorkflowActionDTO> _predecessors;
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.emailAddress</code> attribute defined at extension <code> */
	private java.lang.String _emailAddress;
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.predecessorsStr</code> attribute defined at extension <code> */
	private java.lang.String _predecessorsStr;
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.rendererTemplate</code> attribute defined at extension <code> */
	private de.hybris.platform.commons.dto.renderer.RendererTemplateDTO _rendererTemplate;
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.successors</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.workflow.dto.AbstractWorkflowActionDTO> _successors;
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>AbstractWorkflowAction.sendEmail</code> attribute defined at extension <code> */
	private java.lang.Boolean _sendEmail;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractWorkflowActionDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getActionType()
	{
		return this._actionType;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getEmailAddress()
	{
		return this._emailAddress;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@Override
	public UserDTO getOwner()
	{
		return (de.hybris.platform.core.dto.user.UserDTO) super.getOwner();
	}
	
	@XmlElementWrapper(name = "predecessors")
	@XmlElement(name = "abstractWorkflowAction")
	public List<AbstractWorkflowActionDTO> getPredecessors()
	{
		return this._predecessors;
	}
	
	public String getPredecessorsStr()
	{
		return this._predecessorsStr;
	}
	
	public PrincipalDTO getPrincipalAssigned()
	{
		return this._principalAssigned;
	}
	
	public RendererTemplateDTO getRendererTemplate()
	{
		return this._rendererTemplate;
	}
	
	public Boolean getSendEmail()
	{
		return this._sendEmail;
	}
	
	@XmlElementWrapper(name = "successors")
	@XmlElement(name = "abstractWorkflowAction")
	public List<AbstractWorkflowActionDTO> getSuccessors()
	{
		return this._successors;
	}
	
	@XmlElementWrapper(name = "workflowActionComments")
	@XmlElement(name = "workflowActionComment")
	public Collection<WorkflowActionCommentDTO> getWorkflowActionComments()
	{
		return this._workflowActionComments;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setActionType(final String value)
	{
		this.modifiedPropsSet.add("actionType");
		this._actionType = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setEmailAddress(final String value)
	{
		this.modifiedPropsSet.add("emailAddress");
		this._emailAddress = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setPredecessors(final List<AbstractWorkflowActionDTO> value)
	{
		this.modifiedPropsSet.add("predecessors");
		this._predecessors = value;
	}
	
	public void setPredecessorsStr(final String value)
	{
		this.modifiedPropsSet.add("predecessorsStr");
		this._predecessorsStr = value;
	}
	
	public void setPrincipalAssigned(final PrincipalDTO value)
	{
		this.modifiedPropsSet.add("principalAssigned");
		this._principalAssigned = value;
	}
	
	public void setRendererTemplate(final RendererTemplateDTO value)
	{
		this.modifiedPropsSet.add("rendererTemplate");
		this._rendererTemplate = value;
	}
	
	public void setSendEmail(final Boolean value)
	{
		this.modifiedPropsSet.add("sendEmail");
		this._sendEmail = value;
	}
	
	public void setSuccessors(final List<AbstractWorkflowActionDTO> value)
	{
		this.modifiedPropsSet.add("successors");
		this._successors = value;
	}
	
	public void setWorkflowActionComments(final Collection<WorkflowActionCommentDTO> value)
	{
		this.modifiedPropsSet.add("workflowActionComments");
		this._workflowActionComments = value;
	}
	
}
