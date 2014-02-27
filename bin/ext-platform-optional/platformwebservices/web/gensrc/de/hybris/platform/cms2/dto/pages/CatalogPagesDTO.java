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
package de.hybris.platform.cms2.dto.pages;

import de.hybris.platform.cms2.dto.pages.CatalogPageDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CatalogPage first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "catalogpages")
public class CatalogPagesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CatalogPageDTO*/
	private List<CatalogPageDTO>  catalogpagesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogPagesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogPagesDTO(final List<CatalogPageDTO> catalogpagesList)
	{
		super();
		this.catalogpagesList=catalogpagesList;
	}
	
	
	/**
	 * @return the catalogpages
	 */
	@XmlElement(name = "catalogpage")
	public List<CatalogPageDTO> getCatalogPages()
	{
		return	catalogpagesList;
	}
	
	/**
	 * @param catalogpagesList 
	 *  the catalogpagesList to set   
	 */
	public void setCatalogPages(final List<CatalogPageDTO> catalogpagesList)
	{
		this.catalogpagesList=catalogpagesList;
	}
	
}
