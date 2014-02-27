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
package de.hybris.platform.orderhistory.dto;

import de.hybris.platform.orderhistory.dto.OrderHistoryEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderHistoryEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderhistoryentries")
public class OrderHistoryEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderHistoryEntryDTO*/
	private List<OrderHistoryEntryDTO>  orderhistoryentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderHistoryEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderHistoryEntriesDTO(final List<OrderHistoryEntryDTO> orderhistoryentriesList)
	{
		super();
		this.orderhistoryentriesList=orderhistoryentriesList;
	}
	
	
	/**
	 * @return the orderhistoryentries
	 */
	@XmlElement(name = "orderhistoryentry")
	public List<OrderHistoryEntryDTO> getOrderHistoryEntries()
	{
		return	orderhistoryentriesList;
	}
	
	/**
	 * @param orderhistoryentriesList 
	 *  the orderhistoryentriesList to set   
	 */
	public void setOrderHistoryEntries(final List<OrderHistoryEntryDTO> orderhistoryentriesList)
	{
		this.orderhistoryentriesList=orderhistoryentriesList;
	}
	
}
