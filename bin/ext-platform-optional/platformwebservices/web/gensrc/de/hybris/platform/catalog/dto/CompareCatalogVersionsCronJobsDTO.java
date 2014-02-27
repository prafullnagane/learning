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

import de.hybris.platform.catalog.dto.CompareCatalogVersionsCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CompareCatalogVersionsCronJob first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "comparecatalogversionscronjobs")
public class CompareCatalogVersionsCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CompareCatalogVersionsCronJobDTO*/
	private List<CompareCatalogVersionsCronJobDTO>  comparecatalogversionscronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompareCatalogVersionsCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompareCatalogVersionsCronJobsDTO(final List<CompareCatalogVersionsCronJobDTO> comparecatalogversionscronjobsList)
	{
		super();
		this.comparecatalogversionscronjobsList=comparecatalogversionscronjobsList;
	}
	
	
	/**
	 * @return the comparecatalogversionscronjobs
	 */
	@XmlElement(name = "comparecatalogversionscronjob")
	public List<CompareCatalogVersionsCronJobDTO> getCompareCatalogVersionsCronJobs()
	{
		return	comparecatalogversionscronjobsList;
	}
	
	/**
	 * @param comparecatalogversionscronjobsList 
	 *  the comparecatalogversionscronjobsList to set   
	 */
	public void setCompareCatalogVersionsCronJobs(final List<CompareCatalogVersionsCronJobDTO> comparecatalogversionscronjobsList)
	{
		this.comparecatalogversionscronjobsList=comparecatalogversionscronjobsList;
	}
	
}
