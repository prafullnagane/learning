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
package de.hybris.platform.core.dto.util;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.model.util.InboxViewModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import de.hybris.platform.workflow.dto.WorkflowActionDTO;
import de.hybris.platform.workflow.dto.WorkflowDTO;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type InboxView first defined at extension workflow
 */
@SuppressWarnings("all")
@GraphNode(target = InboxViewModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "inboxview")
public class InboxViewDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>InboxView.status</code> attribute defined at extension <code> */
	private java.lang.String _status;
	/** <i>Generated variable</i> - Variable of <code>InboxView.action</code> attribute defined at extension <code> */
	private de.hybris.platform.workflow.dto.WorkflowActionDTO _action;
	/** <i>Generated variable</i> - Variable of <code>InboxView.activated</code> attribute defined at extension <code> */
	private java.lang.String _activated;
	/** <i>Generated variable</i> - Variable of <code>InboxView.workflow</code> attribute defined at extension <code> */
	private de.hybris.platform.workflow.dto.WorkflowDTO _workflow;
	/** <i>Generated variable</i> - Variable of <code>InboxView.actioncomment</code> attribute defined at extension <code> */
	private java.lang.String _actioncomment;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public InboxViewDTO()
	{
		super();
	}
	
	
	public WorkflowActionDTO getAction()
	{
		return this._action;
	}
	
	public String getActioncomment()
	{
		return this._actioncomment;
	}
	
	public String getActivated()
	{
		return this._activated;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getStatus()
	{
		return this._status;
	}
	
	public WorkflowDTO getWorkflow()
	{
		return this._workflow;
	}
	
	public void setAction(final WorkflowActionDTO value)
	{
		this.modifiedPropsSet.add("action");
		this._action = value;
	}
	
	public void setActioncomment(final String value)
	{
		this.modifiedPropsSet.add("actioncomment");
		this._actioncomment = value;
	}
	
	public void setActivated(final String value)
	{
		this.modifiedPropsSet.add("activated");
		this._activated = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setStatus(final String value)
	{
		this.modifiedPropsSet.add("status");
		this._status = value;
	}
	
	public void setWorkflow(final WorkflowDTO value)
	{
		this.modifiedPropsSet.add("workflow");
		this._workflow = value;
	}
	
}
