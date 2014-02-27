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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.BTGItemDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGItem first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgitems")
public class BTGItemsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGItemDTO*/
	private List<BTGItemDTO>  btgitemsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGItemsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGItemsDTO(final List<BTGItemDTO> btgitemsList)
	{
		super();
		this.btgitemsList=btgitemsList;
	}
	
	
	/**
	 * @return the btgitems
	 */
	@XmlElement(name = "btgitem")
	public List<BTGItemDTO> getBTGItems()
	{
		return	btgitemsList;
	}
	
	/**
	 * @param btgitemsList 
	 *  the btgitemsList to set   
	 */
	public void setBTGItems(final List<BTGItemDTO> btgitemsList)
	{
		this.btgitemsList=btgitemsList;
	}
	
}
