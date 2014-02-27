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

import de.hybris.platform.catalog.dto.synchronization.CatalogVersionSyncScheduleMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CatalogVersionSyncScheduleMedia first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "catalogversionsyncschedulemedias")
public class CatalogVersionSyncScheduleMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CatalogVersionSyncScheduleMediaDTO*/
	private List<CatalogVersionSyncScheduleMediaDTO>  catalogversionsyncschedulemediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionSyncScheduleMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionSyncScheduleMediasDTO(final List<CatalogVersionSyncScheduleMediaDTO> catalogversionsyncschedulemediasList)
	{
		super();
		this.catalogversionsyncschedulemediasList=catalogversionsyncschedulemediasList;
	}
	
	
	/**
	 * @return the catalogversionsyncschedulemedias
	 */
	@XmlElement(name = "catalogversionsyncschedulemedia")
	public List<CatalogVersionSyncScheduleMediaDTO> getCatalogVersionSyncScheduleMedias()
	{
		return	catalogversionsyncschedulemediasList;
	}
	
	/**
	 * @param catalogversionsyncschedulemediasList 
	 *  the catalogversionsyncschedulemediasList to set   
	 */
	public void setCatalogVersionSyncScheduleMedias(final List<CatalogVersionSyncScheduleMediaDTO> catalogversionsyncschedulemediasList)
	{
		this.catalogversionsyncschedulemediasList=catalogversionsyncschedulemediasList;
	}
	
}
