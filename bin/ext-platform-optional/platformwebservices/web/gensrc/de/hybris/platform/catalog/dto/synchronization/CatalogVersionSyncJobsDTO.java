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

import de.hybris.platform.catalog.dto.synchronization.CatalogVersionSyncJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CatalogVersionSyncJob first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "catalogversionsyncjobs")
public class CatalogVersionSyncJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CatalogVersionSyncJobDTO*/
	private List<CatalogVersionSyncJobDTO>  catalogversionsyncjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionSyncJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionSyncJobsDTO(final List<CatalogVersionSyncJobDTO> catalogversionsyncjobsList)
	{
		super();
		this.catalogversionsyncjobsList=catalogversionsyncjobsList;
	}
	
	
	/**
	 * @return the catalogversionsyncjobs
	 */
	@XmlElement(name = "catalogversionsyncjob")
	public List<CatalogVersionSyncJobDTO> getCatalogVersionSyncJobs()
	{
		return	catalogversionsyncjobsList;
	}
	
	/**
	 * @param catalogversionsyncjobsList 
	 *  the catalogversionsyncjobsList to set   
	 */
	public void setCatalogVersionSyncJobs(final List<CatalogVersionSyncJobDTO> catalogversionsyncjobsList)
	{
		this.catalogversionsyncjobsList=catalogversionsyncjobsList;
	}
	
}
