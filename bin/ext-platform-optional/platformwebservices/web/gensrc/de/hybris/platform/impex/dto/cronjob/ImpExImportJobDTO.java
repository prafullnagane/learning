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
package de.hybris.platform.impex.dto.cronjob;

import de.hybris.platform.cronjob.dto.JobDTO;
import de.hybris.platform.impex.model.cronjob.ImpExImportJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ImpExImportJob first defined at extension impex
 */
@SuppressWarnings("all")
@GraphNode(target = ImpExImportJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "impeximportjob")
public class ImpExImportJobDTO extends JobDTO
{
	/** <i>Generated variable</i> - Variable of <code>ImpExImportJob.maxThreads</code> attribute defined at extension <code> */
	private java.lang.Integer _maxThreads;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExImportJobDTO()
	{
		super();
	}
	
	
	public Integer getMaxThreads()
	{
		return this._maxThreads;
	}
	
	public void setMaxThreads(final Integer value)
	{
		this.modifiedPropsSet.add("maxThreads");
		this._maxThreads = value;
	}
	
}
