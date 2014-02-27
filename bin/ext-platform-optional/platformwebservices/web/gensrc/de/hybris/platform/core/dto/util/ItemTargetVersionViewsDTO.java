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

import de.hybris.platform.core.dto.util.ItemTargetVersionViewDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ItemTargetVersionView first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "itemtargetversionviews")
public class ItemTargetVersionViewsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ItemTargetVersionViewDTO*/
	private List<ItemTargetVersionViewDTO>  itemtargetversionviewsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemTargetVersionViewsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemTargetVersionViewsDTO(final List<ItemTargetVersionViewDTO> itemtargetversionviewsList)
	{
		super();
		this.itemtargetversionviewsList=itemtargetversionviewsList;
	}
	
	
	/**
	 * @return the itemtargetversionviews
	 */
	@XmlElement(name = "itemtargetversionview")
	public List<ItemTargetVersionViewDTO> getItemTargetVersionViews()
	{
		return	itemtargetversionviewsList;
	}
	
	/**
	 * @param itemtargetversionviewsList 
	 *  the itemtargetversionviewsList to set   
	 */
	public void setItemTargetVersionViews(final List<ItemTargetVersionViewDTO> itemtargetversionviewsList)
	{
		this.itemtargetversionviewsList=itemtargetversionviewsList;
	}
	
}
