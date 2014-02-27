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
package de.hybris.platform.ordermodify.dto;

import de.hybris.platform.ordermodify.dto.OrderEntryModificationRecordEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderEntryModificationRecordEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderentrymodificationrecordentries")
public class OrderEntryModificationRecordEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderEntryModificationRecordEntryDTO*/
	private List<OrderEntryModificationRecordEntryDTO>  orderentrymodificationrecordentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryModificationRecordEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryModificationRecordEntriesDTO(final List<OrderEntryModificationRecordEntryDTO> orderentrymodificationrecordentriesList)
	{
		super();
		this.orderentrymodificationrecordentriesList=orderentrymodificationrecordentriesList;
	}
	
	
	/**
	 * @return the orderentrymodificationrecordentries
	 */
	@XmlElement(name = "orderentrymodificationrecordentry")
	public List<OrderEntryModificationRecordEntryDTO> getOrderEntryModificationRecordEntries()
	{
		return	orderentrymodificationrecordentriesList;
	}
	
	/**
	 * @param orderentrymodificationrecordentriesList 
	 *  the orderentrymodificationrecordentriesList to set   
	 */
	public void setOrderEntryModificationRecordEntries(final List<OrderEntryModificationRecordEntryDTO> orderentrymodificationrecordentriesList)
	{
		this.orderentrymodificationrecordentriesList=orderentrymodificationrecordentriesList;
	}
	
}
