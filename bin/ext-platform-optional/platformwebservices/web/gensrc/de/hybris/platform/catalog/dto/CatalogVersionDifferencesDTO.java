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

import de.hybris.platform.catalog.dto.CatalogVersionDifferenceDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CatalogVersionDifference first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "catalogversiondifferences")
public class CatalogVersionDifferencesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CatalogVersionDifferenceDTO*/
	private List<CatalogVersionDifferenceDTO>  catalogversiondifferencesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionDifferencesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionDifferencesDTO(final List<CatalogVersionDifferenceDTO> catalogversiondifferencesList)
	{
		super();
		this.catalogversiondifferencesList=catalogversiondifferencesList;
	}
	
	
	/**
	 * @return the catalogversiondifferences
	 */
	@XmlElement(name = "catalogversiondifference")
	public List<CatalogVersionDifferenceDTO> getCatalogVersionDifferences()
	{
		return	catalogversiondifferencesList;
	}
	
	/**
	 * @param catalogversiondifferencesList 
	 *  the catalogversiondifferencesList to set   
	 */
	public void setCatalogVersionDifferences(final List<CatalogVersionDifferenceDTO> catalogversiondifferencesList)
	{
		this.catalogversiondifferencesList=catalogversiondifferencesList;
	}
	
}
