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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.RemoveCatalogVersionCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RemoveCatalogVersionCronJob first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "removecatalogversioncronjobs")
public class RemoveCatalogVersionCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RemoveCatalogVersionCronJobDTO*/
	private List<RemoveCatalogVersionCronJobDTO>  removecatalogversioncronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveCatalogVersionCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveCatalogVersionCronJobsDTO(final List<RemoveCatalogVersionCronJobDTO> removecatalogversioncronjobsList)
	{
		super();
		this.removecatalogversioncronjobsList=removecatalogversioncronjobsList;
	}
	
	
	/**
	 * @return the removecatalogversioncronjobs
	 */
	@XmlElement(name = "removecatalogversioncronjob")
	public List<RemoveCatalogVersionCronJobDTO> getRemoveCatalogVersionCronJobs()
	{
		return	removecatalogversioncronjobsList;
	}
	
	/**
	 * @param removecatalogversioncronjobsList 
	 *  the removecatalogversioncronjobsList to set   
	 */
	public void setRemoveCatalogVersionCronJobs(final List<RemoveCatalogVersionCronJobDTO> removecatalogversioncronjobsList)
	{
		this.removecatalogversioncronjobsList=removecatalogversioncronjobsList;
	}
	
}
