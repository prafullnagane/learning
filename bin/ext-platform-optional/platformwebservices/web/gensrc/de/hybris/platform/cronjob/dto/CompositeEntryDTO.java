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
import de.hybris.platform.cronjob.dto.CompositeCronJobDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.cronjob.dto.JobDTO;
import de.hybris.platform.cronjob.model.CompositeEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CompositeEntry first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = CompositeEntryModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "compositeentry")
public class CompositeEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CompositeEntry.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>CompositeEntry.compositeCronJob</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.CompositeCronJobDTO _compositeCronJob;
	/** <i>Generated variable</i> - Variable of <code>CompositeEntry.triggerableJob</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.JobDTO _triggerableJob;
	/** <i>Generated variable</i> - Variable of <code>CompositeEntry.executableCronJob</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.CronJobDTO _executableCronJob;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompositeEntryDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public CompositeCronJobDTO getCompositeCronJob()
	{
		return this._compositeCronJob;
	}
	
	public CronJobDTO getExecutableCronJob()
	{
		return this._executableCronJob;
	}
	
	public JobDTO getTriggerableJob()
	{
		return this._triggerableJob;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setCompositeCronJob(final CompositeCronJobDTO value)
	{
		this.modifiedPropsSet.add("compositeCronJob");
		this._compositeCronJob = value;
	}
	
	public void setExecutableCronJob(final CronJobDTO value)
	{
		this.modifiedPropsSet.add("executableCronJob");
		this._executableCronJob = value;
	}
	
	public void setTriggerableJob(final JobDTO value)
	{
		this.modifiedPropsSet.add("triggerableJob");
		this._triggerableJob = value;
	}
	
}
