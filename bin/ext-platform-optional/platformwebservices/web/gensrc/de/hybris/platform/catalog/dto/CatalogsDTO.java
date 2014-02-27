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

import de.hybris.platform.catalog.dto.CatalogDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Catalog first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "catalogs")
public class CatalogsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CatalogDTO*/
	private List<CatalogDTO>  catalogsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogsDTO(final List<CatalogDTO> catalogsList)
	{
		super();
		this.catalogsList=catalogsList;
	}
	
	
	/**
	 * @return the catalogs
	 */
	@XmlElement(name = "catalog")
	public List<CatalogDTO> getCatalogs()
	{
		return	catalogsList;
	}
	
	/**
	 * @param catalogsList 
	 *  the catalogsList to set   
	 */
	public void setCatalogs(final List<CatalogDTO> catalogsList)
	{
		this.catalogsList=catalogsList;
	}
	
}
