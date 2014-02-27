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

import de.hybris.platform.cronjob.dto.CompositeEntryDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.cronjob.model.CompositeCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CompositeCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = CompositeCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "compositecronjob")
public class CompositeCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>CompositeCronJob.compositeEntries</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cronjob.dto.CompositeEntryDTO> _compositeEntries;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompositeCronJobDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "compositeEntries")
	@XmlElement(name = "compositeEntry")
	public List<CompositeEntryDTO> getCompositeEntries()
	{
		return this._compositeEntries;
	}
	
	public void setCompositeEntries(final List<CompositeEntryDTO> value)
	{
		this.modifiedPropsSet.add("compositeEntries");
		this._compositeEntries = value;
	}
	
}
