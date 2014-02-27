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

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CatalogVersion first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "catalogversions")
public class CatalogVersionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CatalogVersionDTO*/
	private List<CatalogVersionDTO>  catalogversionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionsDTO(final List<CatalogVersionDTO> catalogversionsList)
	{
		super();
		this.catalogversionsList=catalogversionsList;
	}
	
	
	/**
	 * @return the catalogversions
	 */
	@XmlElement(name = "catalogversion")
	public List<CatalogVersionDTO> getCatalogVersions()
	{
		return	catalogversionsList;
	}
	
	/**
	 * @param catalogversionsList 
	 *  the catalogversionsList to set   
	 */
	public void setCatalogVersions(final List<CatalogVersionDTO> catalogversionsList)
	{
		this.catalogversionsList=catalogversionsList;
	}
	
}
