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

import de.hybris.platform.catalog.dto.CategoryCatalogVersionDifferenceDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CategoryCatalogVersionDifference first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "categorycatalogversiondifferences")
public class CategoryCatalogVersionDifferencesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CategoryCatalogVersionDifferenceDTO*/
	private List<CategoryCatalogVersionDifferenceDTO>  categorycatalogversiondifferencesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CategoryCatalogVersionDifferencesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CategoryCatalogVersionDifferencesDTO(final List<CategoryCatalogVersionDifferenceDTO> categorycatalogversiondifferencesList)
	{
		super();
		this.categorycatalogversiondifferencesList=categorycatalogversiondifferencesList;
	}
	
	
	/**
	 * @return the categorycatalogversiondifferences
	 */
	@XmlElement(name = "categorycatalogversiondifference")
	public List<CategoryCatalogVersionDifferenceDTO> getCategoryCatalogVersionDifferences()
	{
		return	categorycatalogversiondifferencesList;
	}
	
	/**
	 * @param categorycatalogversiondifferencesList 
	 *  the categorycatalogversiondifferencesList to set   
	 */
	public void setCategoryCatalogVersionDifferences(final List<CategoryCatalogVersionDifferenceDTO> categorycatalogversiondifferencesList)
	{
		this.categorycatalogversiondifferencesList=categorycatalogversiondifferencesList;
	}
	
}
