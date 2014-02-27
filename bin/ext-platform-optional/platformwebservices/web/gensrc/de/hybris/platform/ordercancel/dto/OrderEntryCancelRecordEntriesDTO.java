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
package de.hybris.platform.ordercancel.dto;

import de.hybris.platform.ordercancel.dto.OrderEntryCancelRecordEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderEntryCancelRecordEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderentrycancelrecordentries")
public class OrderEntryCancelRecordEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderEntryCancelRecordEntryDTO*/
	private List<OrderEntryCancelRecordEntryDTO>  orderentrycancelrecordentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryCancelRecordEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryCancelRecordEntriesDTO(final List<OrderEntryCancelRecordEntryDTO> orderentrycancelrecordentriesList)
	{
		super();
		this.orderentrycancelrecordentriesList=orderentrycancelrecordentriesList;
	}
	
	
	/**
	 * @return the orderentrycancelrecordentries
	 */
	@XmlElement(name = "orderentrycancelrecordentry")
	public List<OrderEntryCancelRecordEntryDTO> getOrderEntryCancelRecordEntries()
	{
		return	orderentrycancelrecordentriesList;
	}
	
	/**
	 * @param orderentrycancelrecordentriesList 
	 *  the orderentrycancelrecordentriesList to set   
	 */
	public void setOrderEntryCancelRecordEntries(final List<OrderEntryCancelRecordEntryDTO> orderentrycancelrecordentriesList)
	{
		this.orderentrycancelrecordentriesList=orderentrycancelrecordentriesList;
	}
	
}
