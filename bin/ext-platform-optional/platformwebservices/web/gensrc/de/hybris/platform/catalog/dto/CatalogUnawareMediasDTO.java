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

import de.hybris.platform.catalog.dto.CatalogUnawareMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CatalogUnawareMedia first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "catalogunawaremedias")
public class CatalogUnawareMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CatalogUnawareMediaDTO*/
	private List<CatalogUnawareMediaDTO>  catalogunawaremediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogUnawareMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogUnawareMediasDTO(final List<CatalogUnawareMediaDTO> catalogunawaremediasList)
	{
		super();
		this.catalogunawaremediasList=catalogunawaremediasList;
	}
	
	
	/**
	 * @return the catalogunawaremedias
	 */
	@XmlElement(name = "catalogunawaremedia")
	public List<CatalogUnawareMediaDTO> getCatalogUnawareMedias()
	{
		return	catalogunawaremediasList;
	}
	
	/**
	 * @param catalogunawaremediasList 
	 *  the catalogunawaremediasList to set   
	 */
	public void setCatalogUnawareMedias(final List<CatalogUnawareMediaDTO> catalogunawaremediasList)
	{
		this.catalogunawaremediasList=catalogunawaremediasList;
	}
	
}
