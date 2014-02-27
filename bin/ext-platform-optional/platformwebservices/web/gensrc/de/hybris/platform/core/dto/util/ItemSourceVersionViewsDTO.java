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

import de.hybris.platform.core.dto.util.ItemSourceVersionViewDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ItemSourceVersionView first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "itemsourceversionviews")
public class ItemSourceVersionViewsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ItemSourceVersionViewDTO*/
	private List<ItemSourceVersionViewDTO>  itemsourceversionviewsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemSourceVersionViewsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemSourceVersionViewsDTO(final List<ItemSourceVersionViewDTO> itemsourceversionviewsList)
	{
		super();
		this.itemsourceversionviewsList=itemsourceversionviewsList;
	}
	
	
	/**
	 * @return the itemsourceversionviews
	 */
	@XmlElement(name = "itemsourceversionview")
	public List<ItemSourceVersionViewDTO> getItemSourceVersionViews()
	{
		return	itemsourceversionviewsList;
	}
	
	/**
	 * @param itemsourceversionviewsList 
	 *  the itemsourceversionviewsList to set   
	 */
	public void setItemSourceVersionViews(final List<ItemSourceVersionViewDTO> itemsourceversionviewsList)
	{
		this.itemsourceversionviewsList=itemsourceversionviewsList;
	}
	
}
