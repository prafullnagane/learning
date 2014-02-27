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
package de.hybris.platform.core.dto.order;

import de.hybris.platform.core.dto.order.OrderEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderEntry first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderentries")
public class OrderEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderEntryDTO*/
	private List<OrderEntryDTO>  orderentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntriesDTO(final List<OrderEntryDTO> orderentriesList)
	{
		super();
		this.orderentriesList=orderentriesList;
	}
	
	
	/**
	 * @return the orderentries
	 */
	@XmlElement(name = "orderentry")
	public List<OrderEntryDTO> getOrderEntries()
	{
		return	orderentriesList;
	}
	
	/**
	 * @param orderentriesList 
	 *  the orderentriesList to set   
	 */
	public void setOrderEntries(final List<OrderEntryDTO> orderentriesList)
	{
		this.orderentriesList=orderentriesList;
	}
	
}
