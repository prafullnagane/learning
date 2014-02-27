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

import de.hybris.platform.cronjob.dto.JobDTO;
import de.hybris.platform.cronjob.dto.StepDTO;
import de.hybris.platform.cronjob.model.BatchJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BatchJob first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = BatchJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "batchjob")
public class BatchJobDTO extends JobDTO
{
	/** <i>Generated variable</i> - Variable of <code>BatchJob.steps</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cronjob.dto.StepDTO> _steps;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BatchJobDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "steps")
	@XmlElement(name = "step")
	public List<StepDTO> getSteps()
	{
		return this._steps;
	}
	
	public void setSteps(final List<StepDTO> value)
	{
		this.modifiedPropsSet.add("steps");
		this._steps = value;
	}
	
}
