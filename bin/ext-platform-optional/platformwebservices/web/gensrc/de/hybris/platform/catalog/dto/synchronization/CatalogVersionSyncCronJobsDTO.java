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

import de.hybris.platform.catalog.dto.synchronization.CatalogVersionSyncCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CatalogVersionSyncCronJob first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "catalogversionsynccronjobs")
public class CatalogVersionSyncCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CatalogVersionSyncCronJobDTO*/
	private List<CatalogVersionSyncCronJobDTO>  catalogversionsynccronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionSyncCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionSyncCronJobsDTO(final List<CatalogVersionSyncCronJobDTO> catalogversionsynccronjobsList)
	{
		super();
		this.catalogversionsynccronjobsList=catalogversionsynccronjobsList;
	}
	
	
	/**
	 * @return the catalogversionsynccronjobs
	 */
	@XmlElement(name = "catalogversionsynccronjob")
	public List<CatalogVersionSyncCronJobDTO> getCatalogVersionSyncCronJobs()
	{
		return	catalogversionsynccronjobsList;
	}
	
	/**
	 * @param catalogversionsynccronjobsList 
	 *  the catalogversionsynccronjobsList to set   
	 */
	public void setCatalogVersionSyncCronJobs(final List<CatalogVersionSyncCronJobDTO> catalogversionsynccronjobsList)
	{
		this.catalogversionsynccronjobsList=catalogversionsynccronjobsList;
	}
	
}
