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
package de.hybris.platform.returns.dto;

import de.hybris.platform.returns.dto.OrderEntryReturnRecordEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderEntryReturnRecordEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderentryreturnrecordentries")
public class OrderEntryReturnRecordEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderEntryReturnRecordEntryDTO*/
	private List<OrderEntryReturnRecordEntryDTO>  orderentryreturnrecordentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryReturnRecordEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryReturnRecordEntriesDTO(final List<OrderEntryReturnRecordEntryDTO> orderentryreturnrecordentriesList)
	{
		super();
		this.orderentryreturnrecordentriesList=orderentryreturnrecordentriesList;
	}
	
	
	/**
	 * @return the orderentryreturnrecordentries
	 */
	@XmlElement(name = "orderentryreturnrecordentry")
	public List<OrderEntryReturnRecordEntryDTO> getOrderEntryReturnRecordEntries()
	{
		return	orderentryreturnrecordentriesList;
	}
	
	/**
	 * @param orderentryreturnrecordentriesList 
	 *  the orderentryreturnrecordentriesList to set   
	 */
	public void setOrderEntryReturnRecordEntries(final List<OrderEntryReturnRecordEntryDTO> orderentryreturnrecordentriesList)
	{
		this.orderentryreturnrecordentriesList=orderentryreturnrecordentriesList;
	}
	
}
