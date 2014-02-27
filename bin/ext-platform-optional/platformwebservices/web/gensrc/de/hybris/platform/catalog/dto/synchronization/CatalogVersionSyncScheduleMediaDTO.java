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
package de.hybris.platform.catalog.dto.synchronization;

import de.hybris.platform.catalog.model.synchronization.CatalogVersionSyncScheduleMediaModel;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CatalogVersionSyncScheduleMedia first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = CatalogVersionSyncScheduleMediaModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "catalogversionsyncschedulemedia")
public class CatalogVersionSyncScheduleMediaDTO extends MediaDTO
{
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionSyncScheduleMedia.scheduledCount</code> attribute defined at extension <code> */
	private java.lang.Integer _scheduledCount;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionSyncScheduleMediaDTO()
	{
		super();
	}
	
	
	public Integer getScheduledCount()
	{
		return this._scheduledCount;
	}
	
	public void setScheduledCount(final Integer value)
	{
		this.modifiedPropsSet.add("scheduledCount");
		this._scheduledCount = value;
	}
	
}
