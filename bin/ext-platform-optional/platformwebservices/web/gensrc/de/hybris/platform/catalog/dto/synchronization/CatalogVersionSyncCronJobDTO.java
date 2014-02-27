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

import de.hybris.platform.catalog.dto.SyncItemCronJobDTO;
import de.hybris.platform.catalog.dto.synchronization.CatalogVersionSyncScheduleMediaDTO;
import de.hybris.platform.catalog.model.synchronization.CatalogVersionSyncCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CatalogVersionSyncCronJob first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = CatalogVersionSyncCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "catalogversionsynccronjob")
public class CatalogVersionSyncCronJobDTO extends SyncItemCronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionSyncCronJob.statusMessage</code> attribute defined at extension <code> */
	private java.lang.String _statusMessage;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionSyncCronJob.scheduleMedias</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.synchronization.CatalogVersionSyncScheduleMediaDTO> _scheduleMedias;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionSyncCronJobDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "scheduleMedias")
	@XmlElement(name = "catalogVersionSyncScheduleMedia")
	public List<CatalogVersionSyncScheduleMediaDTO> getScheduleMedias()
	{
		return this._scheduleMedias;
	}
	
	public String getStatusMessage()
	{
		return this._statusMessage;
	}
	
	public void setScheduleMedias(final List<CatalogVersionSyncScheduleMediaDTO> value)
	{
		this.modifiedPropsSet.add("scheduleMedias");
		this._scheduleMedias = value;
	}
	
	public void setStatusMessage(final String value)
	{
		this.modifiedPropsSet.add("statusMessage");
		this._statusMessage = value;
	}
	
}
