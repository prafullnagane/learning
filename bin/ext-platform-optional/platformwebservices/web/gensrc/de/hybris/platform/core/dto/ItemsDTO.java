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
package de.hybris.platform.core.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Item first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "items")
public class ItemsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ItemDTO*/
	private List<ItemDTO>  itemsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemsDTO(final List<ItemDTO> itemsList)
	{
		super();
		this.itemsList=itemsList;
	}
	
	
	/**
	 * @return the items
	 */
	@XmlElement(name = "item")
	public List<ItemDTO> getItems()
	{
		return	itemsList;
	}
	
	/**
	 * @param itemsList 
	 *  the itemsList to set   
	 */
	public void setItems(final List<ItemDTO> itemsList)
	{
		this.itemsList=itemsList;
	}
	
}
