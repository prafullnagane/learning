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
package de.hybris.platform.processengine.dto;

import de.hybris.platform.acceleratorservices.dto.email.EmailMessageDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.processengine.dto.BusinessProcessParameterDTO;
import de.hybris.platform.processengine.dto.ProcessTaskDTO;
import de.hybris.platform.processengine.dto.ProcessTaskLogDTO;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BusinessProcess first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = BusinessProcessModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "businessprocess")
public class BusinessProcessDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>BusinessProcess.endMessage</code> attribute defined at extension <code> */
	private java.lang.String _endMessage;
	/** <i>Generated variable</i> - Variable of <code>BusinessProcess.state</code> attribute defined at extension <code> */
	private java.lang.String _state;
	/** <i>Generated variable</i> - Variable of <code>BusinessProcess.taskLogs</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.processengine.dto.ProcessTaskLogDTO> _taskLogs;
	/** <i>Generated variable</i> - Variable of <code>BusinessProcess.contextParameters</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.processengine.dto.BusinessProcessParameterDTO> _contextParameters;
	/** <i>Generated variable</i> - Variable of <code>BusinessProcess.emails</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorservices.dto.email.EmailMessageDTO> _emails;
	/** <i>Generated variable</i> - Variable of <code>BusinessProcess.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>BusinessProcess.processState</code> attribute defined at extension <code> */
	private java.lang.String _processState;
	/** <i>Generated variable</i> - Variable of <code>BusinessProcess.currentTasks</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.processengine.dto.ProcessTaskDTO> _currentTasks;
	/** <i>Generated variable</i> - Variable of <code>BusinessProcess.processDefinitionName</code> attribute defined at extension <code> */
	private java.lang.String _processDefinitionName;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BusinessProcessDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "contextParameters")
	@XmlElement(name = "businessProcessParameter")
	public Collection<BusinessProcessParameterDTO> getContextParameters()
	{
		return this._contextParameters;
	}
	
	@XmlElementWrapper(name = "currentTasks")
	@XmlElement(name = "processTask")
	public Collection<ProcessTaskDTO> getCurrentTasks()
	{
		return this._currentTasks;
	}
	
	@XmlElementWrapper(name = "emails")
	@XmlElement(name = "emailMessage")
	public List<EmailMessageDTO> getEmails()
	{
		return this._emails;
	}
	
	public String getEndMessage()
	{
		return this._endMessage;
	}
	
	public String getProcessDefinitionName()
	{
		return this._processDefinitionName;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getProcessState()
	{
		return this._processState;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getState()
	{
		return this._state;
	}
	
	@XmlElementWrapper(name = "taskLogs")
	@XmlElement(name = "processTaskLog")
	public Collection<ProcessTaskLogDTO> getTaskLogs()
	{
		return this._taskLogs;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setContextParameters(final Collection<BusinessProcessParameterDTO> value)
	{
		this.modifiedPropsSet.add("contextParameters");
		this._contextParameters = value;
	}
	
	public void setCurrentTasks(final Collection<ProcessTaskDTO> value)
	{
		this.modifiedPropsSet.add("currentTasks");
		this._currentTasks = value;
	}
	
	public void setEmails(final List<EmailMessageDTO> value)
	{
		this.modifiedPropsSet.add("emails");
		this._emails = value;
	}
	
	public void setEndMessage(final String value)
	{
		this.modifiedPropsSet.add("endMessage");
		this._endMessage = value;
	}
	
	public void setProcessDefinitionName(final String value)
	{
		this.modifiedPropsSet.add("processDefinitionName");
		this._processDefinitionName = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setProcessState(final String value)
	{
		this.modifiedPropsSet.add("processState");
		this._processState = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setState(final String value)
	{
		this.modifiedPropsSet.add("state");
		this._state = value;
	}
	
	public void setTaskLogs(final Collection<ProcessTaskLogDTO> value)
	{
		this.modifiedPropsSet.add("taskLogs");
		this._taskLogs = value;
	}
	
}
