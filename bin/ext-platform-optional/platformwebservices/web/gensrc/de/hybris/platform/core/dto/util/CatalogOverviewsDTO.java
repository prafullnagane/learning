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
package de.hybris.platform.core.dto.util;

import de.hybris.platform.core.dto.util.CatalogOverviewDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CatalogOverview first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "catalogoverviews")
public class CatalogOverviewsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CatalogOverviewDTO*/
	private List<CatalogOverviewDTO>  catalogoverviewsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogOverviewsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogOverviewsDTO(final List<CatalogOverviewDTO> catalogoverviewsList)
	{
		super();
		this.catalogoverviewsList=catalogoverviewsList;
	}
	
	
	/**
	 * @return the catalogoverviews
	 */
	@XmlElement(name = "catalogoverview")
	public List<CatalogOverviewDTO> getCatalogOverviews()
	{
		return	catalogoverviewsList;
	}
	
	/**
	 * @param catalogoverviewsList 
	 *  the catalogoverviewsList to set   
	 */
	public void setCatalogOverviews(final List<CatalogOverviewDTO> catalogoverviewsList)
	{
		this.catalogoverviewsList=catalogoverviewsList;
	}
	
}
