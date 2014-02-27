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

import de.hybris.platform.catalog.dto.ItemSyncDescriptorDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ItemSyncDescriptor first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "itemsyncdescriptors")
public class ItemSyncDescriptorsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ItemSyncDescriptorDTO*/
	private List<ItemSyncDescriptorDTO>  itemsyncdescriptorsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemSyncDescriptorsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemSyncDescriptorsDTO(final List<ItemSyncDescriptorDTO> itemsyncdescriptorsList)
	{
		super();
		this.itemsyncdescriptorsList=itemsyncdescriptorsList;
	}
	
	
	/**
	 * @return the itemsyncdescriptors
	 */
	@XmlElement(name = "itemsyncdescriptor")
	public List<ItemSyncDescriptorDTO> getItemSyncDescriptors()
	{
		return	itemsyncdescriptorsList;
	}
	
	/**
	 * @param itemsyncdescriptorsList 
	 *  the itemsyncdescriptorsList to set   
	 */
	public void setItemSyncDescriptors(final List<ItemSyncDescriptorDTO> itemsyncdescriptorsList)
	{
		this.itemsyncdescriptorsList=itemsyncdescriptorsList;
	}
	
}
