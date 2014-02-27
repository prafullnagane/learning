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

import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.cronjob.model.JobMediaModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type JobMedia first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = JobMediaModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "jobmedia")
public class JobMediaDTO extends MediaDTO
{
	/** <i>Generated variable</i> - Variable of <code>JobMedia.locked</code> attribute defined at extension <code> */
	private java.lang.Boolean _locked;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JobMediaDTO()
	{
		super();
	}
	
	
	public Boolean getLocked()
	{
		return this._locked;
	}
	
	public void setLocked(final Boolean value)
	{
		this.modifiedPropsSet.add("locked");
		this._locked = value;
	}
	
}
