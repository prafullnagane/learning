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
package de.hybris.platform.cronjob.dto.config;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.cronjob.model.config.CronJobConfigProxyItemModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CronJobConfigProxyItem first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = CronJobConfigProxyItemModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "cronjobconfigproxyitem")
public class CronJobConfigProxyItemDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CronJobConfigProxyItem.testEmailAddress</code> attribute defined at extension <code> */
	private java.lang.String _testEmailAddress;
	/** <i>Generated variable</i> - Variable of <code>CronJobConfigProxyItem.timerTaskNextRun</code> attribute defined at extension <code> */
	private java.lang.String _timerTaskNextRun;
	/** <i>Generated variable</i> - Variable of <code>CronJobConfigProxyItem.cronjob_timertask_loadonstartup</code> attribute defined at extension <code> */
	private java.lang.Boolean _cronjob_timertask_loadonstartup;
	/** <i>Generated variable</i> - Variable of <code>CronJobConfigProxyItem.cronjob_trigger_interval</code> attribute defined at extension <code> */
	private java.lang.Integer _cronjob_trigger_interval;
	/** <i>Generated variable</i> - Variable of <code>CronJobConfigProxyItem.timerTaskStatus</code> attribute defined at extension <code> */
	private java.lang.String _timerTaskStatus;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CronJobConfigProxyItemDTO()
	{
		super();
	}
	
	
	public Boolean getCronjob_timertask_loadonstartup()
	{
		return this._cronjob_timertask_loadonstartup;
	}
	
	public Integer getCronjob_trigger_interval()
	{
		return this._cronjob_trigger_interval;
	}
	
	public String getTestEmailAddress()
	{
		return this._testEmailAddress;
	}
	
	public String getTimerTaskNextRun()
	{
		return this._timerTaskNextRun;
	}
	
	public String getTimerTaskStatus()
	{
		return this._timerTaskStatus;
	}
	
	public void setCronjob_timertask_loadonstartup(final Boolean value)
	{
		this.modifiedPropsSet.add("cronjob_timertask_loadonstartup");
		this._cronjob_timertask_loadonstartup = value;
	}
	
	public void setCronjob_trigger_interval(final Integer value)
	{
		this.modifiedPropsSet.add("cronjob_trigger_interval");
		this._cronjob_trigger_interval = value;
	}
	
	public void setTestEmailAddress(final String value)
	{
		this.modifiedPropsSet.add("testEmailAddress");
		this._testEmailAddress = value;
	}
	
	public void setTimerTaskNextRun(final String value)
	{
		this.modifiedPropsSet.add("timerTaskNextRun");
		this._timerTaskNextRun = value;
	}
	
	public void setTimerTaskStatus(final String value)
	{
		this.modifiedPropsSet.add("timerTaskStatus");
		this._timerTaskStatus = value;
	}
	
}
