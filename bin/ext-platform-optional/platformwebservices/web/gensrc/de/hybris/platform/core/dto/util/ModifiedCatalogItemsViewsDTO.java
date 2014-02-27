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

import de.hybris.platform.core.dto.util.ModifiedCatalogItemsViewDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ModifiedCatalogItemsView first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "modifiedcatalogitemsviews")
public class ModifiedCatalogItemsViewsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ModifiedCatalogItemsViewDTO*/
	private List<ModifiedCatalogItemsViewDTO>  modifiedcatalogitemsviewsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ModifiedCatalogItemsViewsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ModifiedCatalogItemsViewsDTO(final List<ModifiedCatalogItemsViewDTO> modifiedcatalogitemsviewsList)
	{
		super();
		this.modifiedcatalogitemsviewsList=modifiedcatalogitemsviewsList;
	}
	
	
	/**
	 * @return the modifiedcatalogitemsviews
	 */
	@XmlElement(name = "modifiedcatalogitemsview")
	public List<ModifiedCatalogItemsViewDTO> getModifiedCatalogItemsViews()
	{
		return	modifiedcatalogitemsviewsList;
	}
	
	/**
	 * @param modifiedcatalogitemsviewsList 
	 *  the modifiedcatalogitemsviewsList to set   
	 */
	public void setModifiedCatalogItemsViews(final List<ModifiedCatalogItemsViewDTO> modifiedcatalogitemsviewsList)
	{
		this.modifiedcatalogitemsviewsList=modifiedcatalogitemsviewsList;
	}
	
}
