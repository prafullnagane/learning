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

import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.cronjob.dto.JobDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.workflow.dto.WorkflowActionTemplateDTO;
import de.hybris.platform.workflow.model.WorkflowTemplateModel;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type WorkflowTemplate first defined at extension workflow
 */
@SuppressWarnings("all")
@GraphNode(target = WorkflowTemplateModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "workflowtemplate")
public class WorkflowTemplateDTO extends JobDTO
{
	/** <i>Generated variable</i> - Variable of <code>WorkflowTemplate.visibleForPrincipals</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _visibleForPrincipals;
	/** <i>Generated variable</i> - Variable of <code>WorkflowTemplate.actions</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.workflow.dto.WorkflowActionTemplateDTO> _actions;
	/** <i>Generated variable</i> - Variable of <code>WorkflowTemplate.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>WorkflowTemplate.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>WorkflowTemplate.activationScript</code> attribute defined at extension <code> */
	private java.lang.String _activationScript;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowTemplateDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "actions")
	@XmlElement(name = "workflowActionTemplate")
	public List<WorkflowActionTemplateDTO> getActions()
	{
		return this._actions;
	}
	
	public String getActivationScript()
	{
		return this._activationScript;
	}
	
	public String getDescription()
	{
		return this._description;
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
	
	@XmlElementWrapper(name = "visibleForPrincipals")
	@XmlElement(name = "principal")
	public Collection<PrincipalDTO> getVisibleForPrincipals()
	{
		return this._visibleForPrincipals;
	}
	
	public void setActions(final List<WorkflowActionTemplateDTO> value)
	{
		this.modifiedPropsSet.add("actions");
		this._actions = value;
	}
	
	public void setActivationScript(final String value)
	{
		this.modifiedPropsSet.add("activationScript");
		this._activationScript = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setVisibleForPrincipals(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("visibleForPrincipals");
		this._visibleForPrincipals = value;
	}
	
}
