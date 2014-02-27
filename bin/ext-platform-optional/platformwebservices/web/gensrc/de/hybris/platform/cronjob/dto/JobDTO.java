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
package de.hybris.platform.cronjob.dto;

import de.hybris.platform.commons.dto.renderer.RendererTemplateDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.cronjob.dto.JobSearchRestrictionDTO;
import de.hybris.platform.cronjob.dto.TriggerDTO;
import de.hybris.platform.cronjob.model.JobModel;
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
 * Generated dto class for type Job first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = JobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "job")
public class JobDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Job.changeRecordingEnabled</code> attribute defined at extension <code> */
	private java.lang.Boolean _changeRecordingEnabled;
	/** <i>Generated variable</i> - Variable of <code>Job.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Job.restrictions</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cronjob.dto.JobSearchRestrictionDTO> _restrictions;
	/** <i>Generated variable</i> - Variable of <code>Job.removeOnExit</code> attribute defined at extension <code> */
	private java.lang.Boolean _removeOnExit;
	/** <i>Generated variable</i> - Variable of <code>Job.emailAddress</code> attribute defined at extension <code> */
	private java.lang.String _emailAddress;
	/** <i>Generated variable</i> - Variable of <code>Job.logLevelFile</code> attribute defined at extension <code> */
	private java.lang.String _logLevelFile;
	/** <i>Generated variable</i> - Variable of <code>Job.logToFile</code> attribute defined at extension <code> */
	private java.lang.Boolean _logToFile;
	/** <i>Generated variable</i> - Variable of <code>Job.nodeID</code> attribute defined at extension <code> */
	private java.lang.Integer _nodeID;
	/** <i>Generated variable</i> - Variable of <code>Job.sessionLanguage</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _sessionLanguage;
	/** <i>Generated variable</i> - Variable of <code>Job.alternativeDataSourceID</code> attribute defined at extension <code> */
	private java.lang.String _alternativeDataSourceID;
	/** <i>Generated variable</i> - Variable of <code>Job.sendEmail</code> attribute defined at extension <code> */
	private java.lang.Boolean _sendEmail;
	/** <i>Generated variable</i> - Variable of <code>Job.requestAbort</code> attribute defined at extension <code> */
	private java.lang.Boolean _requestAbort;
	/** <i>Generated variable</i> - Variable of <code>Job.sessionUser</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _sessionUser;
	/** <i>Generated variable</i> - Variable of <code>Job.active</code> attribute defined at extension <code> */
	private java.lang.Boolean _active;
	/** <i>Generated variable</i> - Variable of <code>Job.sessionCurrency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _sessionCurrency;
	/** <i>Generated variable</i> - Variable of <code>Job.retry</code> attribute defined at extension <code> */
	private java.lang.Boolean _retry;
	/** <i>Generated variable</i> - Variable of <code>Job.errorMode</code> attribute defined at extension <code> */
	private java.lang.String _errorMode;
	/** <i>Generated variable</i> - Variable of <code>Job.emailNotificationTemplate</code> attribute defined at extension <code> */
	private de.hybris.platform.commons.dto.renderer.RendererTemplateDTO _emailNotificationTemplate;
	/** <i>Generated variable</i> - Variable of <code>Job.priority</code> attribute defined at extension <code> */
	private java.lang.Integer _priority;
	/** <i>Generated variable</i> - Variable of <code>Job.logLevelDatabase</code> attribute defined at extension <code> */
	private java.lang.String _logLevelDatabase;
	/** <i>Generated variable</i> - Variable of <code>Job.logToDatabase</code> attribute defined at extension <code> */
	private java.lang.Boolean _logToDatabase;
	/** <i>Generated variable</i> - Variable of <code>Job.cronJobs</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cronjob.dto.CronJobDTO> _cronJobs;
	/** <i>Generated variable</i> - Variable of <code>Job.singleExecutable</code> attribute defined at extension <code> */
	private java.lang.Boolean _singleExecutable;
	/** <i>Generated variable</i> - Variable of <code>Job.triggers</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cronjob.dto.TriggerDTO> _triggers;
	/** <i>Generated variable</i> - Variable of <code>Job.requestAbortStep</code> attribute defined at extension <code> */
	private java.lang.Boolean _requestAbortStep;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JobDTO()
	{
		super();
	}
	
	
	public Boolean getActive()
	{
		return this._active;
	}
	
	public String getAlternativeDataSourceID()
	{
		return this._alternativeDataSourceID;
	}
	
	public Boolean getChangeRecordingEnabled()
	{
		return this._changeRecordingEnabled;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "cronJobs")
	@XmlElement(name = "cronJob")
	public Collection<CronJobDTO> getCronJobs()
	{
		return this._cronJobs;
	}
	
	public String getEmailAddress()
	{
		return this._emailAddress;
	}
	
	public RendererTemplateDTO getEmailNotificationTemplate()
	{
		return this._emailNotificationTemplate;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getErrorMode()
	{
		return this._errorMode;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getLogLevelDatabase()
	{
		return this._logLevelDatabase;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getLogLevelFile()
	{
		return this._logLevelFile;
	}
	
	public Boolean getLogToDatabase()
	{
		return this._logToDatabase;
	}
	
	public Boolean getLogToFile()
	{
		return this._logToFile;
	}
	
	public Integer getNodeID()
	{
		return this._nodeID;
	}
	
	public Integer getPriority()
	{
		return this._priority;
	}
	
	public Boolean getRemoveOnExit()
	{
		return this._removeOnExit;
	}
	
	public Boolean getRequestAbort()
	{
		return this._requestAbort;
	}
	
	public Boolean getRequestAbortStep()
	{
		return this._requestAbortStep;
	}
	
	@XmlElementWrapper(name = "restrictions")
	@XmlElement(name = "jobSearchRestriction")
	public List<JobSearchRestrictionDTO> getRestrictions()
	{
		return this._restrictions;
	}
	
	public Boolean getRetry()
	{
		return this._retry;
	}
	
	public Boolean getSendEmail()
	{
		return this._sendEmail;
	}
	
	public CurrencyDTO getSessionCurrency()
	{
		return this._sessionCurrency;
	}
	
	public LanguageDTO getSessionLanguage()
	{
		return this._sessionLanguage;
	}
	
	public UserDTO getSessionUser()
	{
		return this._sessionUser;
	}
	
	public Boolean getSingleExecutable()
	{
		return this._singleExecutable;
	}
	
	@XmlElementWrapper(name = "triggers")
	@XmlElement(name = "trigger")
	public List<TriggerDTO> getTriggers()
	{
		return this._triggers;
	}
	
	public void setActive(final Boolean value)
	{
		this.modifiedPropsSet.add("active");
		this._active = value;
	}
	
	public void setAlternativeDataSourceID(final String value)
	{
		this.modifiedPropsSet.add("alternativeDataSourceID");
		this._alternativeDataSourceID = value;
	}
	
	public void setChangeRecordingEnabled(final Boolean value)
	{
		this.modifiedPropsSet.add("changeRecordingEnabled");
		this._changeRecordingEnabled = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setCronJobs(final Collection<CronJobDTO> value)
	{
		this.modifiedPropsSet.add("cronJobs");
		this._cronJobs = value;
	}
	
	public void setEmailAddress(final String value)
	{
		this.modifiedPropsSet.add("emailAddress");
		this._emailAddress = value;
	}
	
	public void setEmailNotificationTemplate(final RendererTemplateDTO value)
	{
		this.modifiedPropsSet.add("emailNotificationTemplate");
		this._emailNotificationTemplate = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setErrorMode(final String value)
	{
		this.modifiedPropsSet.add("errorMode");
		this._errorMode = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setLogLevelDatabase(final String value)
	{
		this.modifiedPropsSet.add("logLevelDatabase");
		this._logLevelDatabase = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setLogLevelFile(final String value)
	{
		this.modifiedPropsSet.add("logLevelFile");
		this._logLevelFile = value;
	}
	
	public void setLogToDatabase(final Boolean value)
	{
		this.modifiedPropsSet.add("logToDatabase");
		this._logToDatabase = value;
	}
	
	public void setLogToFile(final Boolean value)
	{
		this.modifiedPropsSet.add("logToFile");
		this._logToFile = value;
	}
	
	public void setNodeID(final Integer value)
	{
		this.modifiedPropsSet.add("nodeID");
		this._nodeID = value;
	}
	
	public void setPriority(final Integer value)
	{
		this.modifiedPropsSet.add("priority");
		this._priority = value;
	}
	
	public void setRemoveOnExit(final Boolean value)
	{
		this.modifiedPropsSet.add("removeOnExit");
		this._removeOnExit = value;
	}
	
	public void setRequestAbort(final Boolean value)
	{
		this.modifiedPropsSet.add("requestAbort");
		this._requestAbort = value;
	}
	
	public void setRequestAbortStep(final Boolean value)
	{
		this.modifiedPropsSet.add("requestAbortStep");
		this._requestAbortStep = value;
	}
	
	public void setRestrictions(final List<JobSearchRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("restrictions");
		this._restrictions = value;
	}
	
	public void setRetry(final Boolean value)
	{
		this.modifiedPropsSet.add("retry");
		this._retry = value;
	}
	
	public void setSendEmail(final Boolean value)
	{
		this.modifiedPropsSet.add("sendEmail");
		this._sendEmail = value;
	}
	
	public void setSessionCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("sessionCurrency");
		this._sessionCurrency = value;
	}
	
	public void setSessionLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("sessionLanguage");
		this._sessionLanguage = value;
	}
	
	public void setSessionUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("sessionUser");
		this._sessionUser = value;
	}
	
	public void setSingleExecutable(final Boolean value)
	{
		this.modifiedPropsSet.add("singleExecutable");
		this._singleExecutable = value;
	}
	
	public void setTriggers(final List<TriggerDTO> value)
	{
		this.modifiedPropsSet.add("triggers");
		this._triggers = value;
	}
	
}
