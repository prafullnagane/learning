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
import de.hybris.platform.cronjob.dto.StepDTO;
import de.hybris.platform.cronjob.model.JobLogModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type JobLog first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = JobLogModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "joblog")
public class JobLogDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>JobLog.message</code> attribute defined at extension <code> */
	private java.lang.String _message;
	/** <i>Generated variable</i> - Variable of <code>JobLog.cronJob</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.CronJobDTO _cronJob;
	/** <i>Generated variable</i> - Variable of <code>JobLog.step</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.StepDTO _step;
	/** <i>Generated variable</i> - Variable of <code>JobLog.level</code> attribute defined at extension <code> */
	private java.lang.String _level;
	/** <i>Generated variable</i> - Variable of <code>JobLog.shortMessage</code> attribute defined at extension <code> */
	private java.lang.String _shortMessage;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JobLogDTO()
	{
		super();
	}
	
	
	public CronJobDTO getCronJob()
	{
		return this._cronJob;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getLevel()
	{
		return this._level;
	}
	
	public String getMessage()
	{
		return this._message;
	}
	
	public String getShortMessage()
	{
		return this._shortMessage;
	}
	
	public StepDTO getStep()
	{
		return this._step;
	}
	
	public void setCronJob(final CronJobDTO value)
	{
		this.modifiedPropsSet.add("cronJob");
		this._cronJob = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setLevel(final String value)
	{
		this.modifiedPropsSet.add("level");
		this._level = value;
	}
	
	public void setMessage(final String value)
	{
		this.modifiedPropsSet.add("message");
		this._message = value;
	}
	
	public void setShortMessage(final String value)
	{
		this.modifiedPropsSet.add("shortMessage");
		this._shortMessage = value;
	}
	
	public void setStep(final StepDTO value)
	{
		this.modifiedPropsSet.add("step");
		this._step = value;
	}
	
}
