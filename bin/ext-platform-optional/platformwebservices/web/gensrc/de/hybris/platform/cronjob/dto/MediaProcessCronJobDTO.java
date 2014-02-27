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

import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.cronjob.dto.JobMediaDTO;
import de.hybris.platform.cronjob.model.MediaProcessCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type MediaProcessCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = MediaProcessCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "mediaprocesscronjob")
public class MediaProcessCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>MediaProcessCronJob.lastSuccessfulLine</code> attribute defined at extension <code> */
	private java.lang.Integer _lastSuccessfulLine;
	/** <i>Generated variable</i> - Variable of <code>MediaProcessCronJob.jobMedia</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.JobMediaDTO _jobMedia;
	/** <i>Generated variable</i> - Variable of <code>MediaProcessCronJob.currentLine</code> attribute defined at extension <code> */
	private java.lang.Integer _currentLine;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaProcessCronJobDTO()
	{
		super();
	}
	
	
	public Integer getCurrentLine()
	{
		return this._currentLine;
	}
	
	public JobMediaDTO getJobMedia()
	{
		return this._jobMedia;
	}
	
	public Integer getLastSuccessfulLine()
	{
		return this._lastSuccessfulLine;
	}
	
	public void setCurrentLine(final Integer value)
	{
		this.modifiedPropsSet.add("currentLine");
		this._currentLine = value;
	}
	
	public void setJobMedia(final JobMediaDTO value)
	{
		this.modifiedPropsSet.add("jobMedia");
		this._jobMedia = value;
	}
	
	public void setLastSuccessfulLine(final Integer value)
	{
		this.modifiedPropsSet.add("lastSuccessfulLine");
		this._lastSuccessfulLine = value;
	}
	
}
