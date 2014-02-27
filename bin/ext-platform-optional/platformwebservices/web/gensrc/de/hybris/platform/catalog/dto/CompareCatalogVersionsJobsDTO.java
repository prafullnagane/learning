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

import de.hybris.platform.catalog.dto.CompareCatalogVersionsJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CompareCatalogVersionsJob first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "comparecatalogversionsjobs")
public class CompareCatalogVersionsJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CompareCatalogVersionsJobDTO*/
	private List<CompareCatalogVersionsJobDTO>  comparecatalogversionsjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompareCatalogVersionsJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompareCatalogVersionsJobsDTO(final List<CompareCatalogVersionsJobDTO> comparecatalogversionsjobsList)
	{
		super();
		this.comparecatalogversionsjobsList=comparecatalogversionsjobsList;
	}
	
	
	/**
	 * @return the comparecatalogversionsjobs
	 */
	@XmlElement(name = "comparecatalogversionsjob")
	public List<CompareCatalogVersionsJobDTO> getCompareCatalogVersionsJobs()
	{
		return	comparecatalogversionsjobsList;
	}
	
	/**
	 * @param comparecatalogversionsjobsList 
	 *  the comparecatalogversionsjobsList to set   
	 */
	public void setCompareCatalogVersionsJobs(final List<CompareCatalogVersionsJobDTO> comparecatalogversionsjobsList)
	{
		this.comparecatalogversionsjobsList=comparecatalogversionsjobsList;
	}
	
}
