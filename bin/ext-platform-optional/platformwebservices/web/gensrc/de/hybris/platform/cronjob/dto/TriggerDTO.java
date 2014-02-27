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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.cronjob.dto.JobDTO;
import de.hybris.platform.cronjob.model.TriggerModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumListToStringValuesConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringListToHybrisEnumValuesConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Trigger first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = TriggerModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "trigger")
public class TriggerDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Trigger.minute</code> attribute defined at extension <code> */
	private java.lang.Integer _minute;
	/** <i>Generated variable</i> - Variable of <code>Trigger.timeTable</code> attribute defined at extension <code> */
	private java.lang.String _timeTable;
	/** <i>Generated variable</i> - Variable of <code>Trigger.job</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.JobDTO _job;
	/** <i>Generated variable</i> - Variable of <code>Trigger.maxAcceptableDelay</code> attribute defined at extension <code> */
	private java.lang.Integer _maxAcceptableDelay;
	/** <i>Generated variable</i> - Variable of <code>Trigger.active</code> attribute defined at extension <code> */
	private java.lang.Boolean _active;
	/** <i>Generated variable</i> - Variable of <code>Trigger.cronExpression</code> attribute defined at extension <code> */
	private java.lang.String _cronExpression;
	/** <i>Generated variable</i> - Variable of <code>Trigger.daysOfWeek</code> attribute defined at extension <code> */
	private java.util.List<java.lang.String> _daysOfWeek;
	/** <i>Generated variable</i> - Variable of <code>Trigger.hour</code> attribute defined at extension <code> */
	private java.lang.Integer _hour;
	/** <i>Generated variable</i> - Variable of <code>Trigger.day</code> attribute defined at extension <code> */
	private java.lang.Integer _day;
	/** <i>Generated variable</i> - Variable of <code>Trigger.year</code> attribute defined at extension <code> */
	private java.lang.Integer _year;
	/** <i>Generated variable</i> - Variable of <code>Trigger.activationTime</code> attribute defined at extension <code> */
	private java.util.Date _activationTime;
	/** <i>Generated variable</i> - Variable of <code>Trigger.month</code> attribute defined at extension <code> */
	private java.lang.Integer _month;
	/** <i>Generated variable</i> - Variable of <code>Trigger.second</code> attribute defined at extension <code> */
	private java.lang.Integer _second;
	/** <i>Generated variable</i> - Variable of <code>Trigger.cronJob</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.CronJobDTO _cronJob;
	/** <i>Generated variable</i> - Variable of <code>Trigger.relative</code> attribute defined at extension <code> */
	private java.lang.Boolean _relative;
	/** <i>Generated variable</i> - Variable of <code>Trigger.weekInterval</code> attribute defined at extension <code> */
	private java.lang.Integer _weekInterval;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TriggerDTO()
	{
		super();
	}
	
	
	public Date getActivationTime()
	{
		return this._activationTime;
	}
	
	public Boolean getActive()
	{
		return this._active;
	}
	
	public String getCronExpression()
	{
		return this._cronExpression;
	}
	
	public CronJobDTO getCronJob()
	{
		return this._cronJob;
	}
	
	public Integer getDay()
	{
		return this._day;
	}
	
	@GraphProperty(interceptor = StringListToHybrisEnumValuesConverter.class)
	@XmlElementWrapper(name = "daysOfWeek")
	@XmlElement(name = "dayOfWeek")
	public List<String> getDaysOfWeek()
	{
		return this._daysOfWeek;
	}
	
	public Integer getHour()
	{
		return this._hour;
	}
	
	public JobDTO getJob()
	{
		return this._job;
	}
	
	public Integer getMaxAcceptableDelay()
	{
		return this._maxAcceptableDelay;
	}
	
	public Integer getMinute()
	{
		return this._minute;
	}
	
	public Integer getMonth()
	{
		return this._month;
	}
	
	public Boolean getRelative()
	{
		return this._relative;
	}
	
	public Integer getSecond()
	{
		return this._second;
	}
	
	public String getTimeTable()
	{
		return this._timeTable;
	}
	
	public Integer getWeekInterval()
	{
		return this._weekInterval;
	}
	
	public Integer getYear()
	{
		return this._year;
	}
	
	public void setActivationTime(final Date value)
	{
		this.modifiedPropsSet.add("activationTime");
		this._activationTime = value;
	}
	
	public void setActive(final Boolean value)
	{
		this.modifiedPropsSet.add("active");
		this._active = value;
	}
	
	public void setCronExpression(final String value)
	{
		this.modifiedPropsSet.add("cronExpression");
		this._cronExpression = value;
	}
	
	public void setCronJob(final CronJobDTO value)
	{
		this.modifiedPropsSet.add("cronJob");
		this._cronJob = value;
	}
	
	public void setDay(final Integer value)
	{
		this.modifiedPropsSet.add("day");
		this._day = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumListToStringValuesConverter.class)
	public void setDaysOfWeek(final List<String> value)
	{
		this.modifiedPropsSet.add("daysOfWeek");
		this._daysOfWeek = value;
	}
	
	public void setHour(final Integer value)
	{
		this.modifiedPropsSet.add("hour");
		this._hour = value;
	}
	
	public void setJob(final JobDTO value)
	{
		this.modifiedPropsSet.add("job");
		this._job = value;
	}
	
	public void setMaxAcceptableDelay(final Integer value)
	{
		this.modifiedPropsSet.add("maxAcceptableDelay");
		this._maxAcceptableDelay = value;
	}
	
	public void setMinute(final Integer value)
	{
		this.modifiedPropsSet.add("minute");
		this._minute = value;
	}
	
	public void setMonth(final Integer value)
	{
		this.modifiedPropsSet.add("month");
		this._month = value;
	}
	
	public void setRelative(final Boolean value)
	{
		this.modifiedPropsSet.add("relative");
		this._relative = value;
	}
	
	public void setSecond(final Integer value)
	{
		this.modifiedPropsSet.add("second");
		this._second = value;
	}
	
	public void setTimeTable(final String value)
	{
		this.modifiedPropsSet.add("timeTable");
		this._timeTable = value;
	}
	
	public void setWeekInterval(final Integer value)
	{
		this.modifiedPropsSet.add("weekInterval");
		this._weekInterval = value;
	}
	
	public void setYear(final Integer value)
	{
		this.modifiedPropsSet.add("year");
		this._year = value;
	}
	
}
