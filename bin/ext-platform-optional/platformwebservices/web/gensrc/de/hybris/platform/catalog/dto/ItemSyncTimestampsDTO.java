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

import de.hybris.platform.catalog.dto.ItemSyncTimestampDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ItemSyncTimestamp first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "itemsynctimestamps")
public class ItemSyncTimestampsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ItemSyncTimestampDTO*/
	private List<ItemSyncTimestampDTO>  itemsynctimestampsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemSyncTimestampsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemSyncTimestampsDTO(final List<ItemSyncTimestampDTO> itemsynctimestampsList)
	{
		super();
		this.itemsynctimestampsList=itemsynctimestampsList;
	}
	
	
	/**
	 * @return the itemsynctimestamps
	 */
	@XmlElement(name = "itemsynctimestamp")
	public List<ItemSyncTimestampDTO> getItemSyncTimestamps()
	{
		return	itemsynctimestampsList;
	}
	
	/**
	 * @param itemsynctimestampsList 
	 *  the itemsynctimestampsList to set   
	 */
	public void setItemSyncTimestamps(final List<ItemSyncTimestampDTO> itemsynctimestampsList)
	{
		this.itemsynctimestampsList=itemsynctimestampsList;
	}
	
}
