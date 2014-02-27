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

import de.hybris.platform.ordercancel.dto.OrderCancelRecordEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderCancelRecordEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "ordercancelrecordentries")
public class OrderCancelRecordEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderCancelRecordEntryDTO*/
	private List<OrderCancelRecordEntryDTO>  ordercancelrecordentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderCancelRecordEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderCancelRecordEntriesDTO(final List<OrderCancelRecordEntryDTO> ordercancelrecordentriesList)
	{
		super();
		this.ordercancelrecordentriesList=ordercancelrecordentriesList;
	}
	
	
	/**
	 * @return the ordercancelrecordentries
	 */
	@XmlElement(name = "ordercancelrecordentry")
	public List<OrderCancelRecordEntryDTO> getOrderCancelRecordEntries()
	{
		return	ordercancelrecordentriesList;
	}
	
	/**
	 * @param ordercancelrecordentriesList 
	 *  the ordercancelrecordentriesList to set   
	 */
	public void setOrderCancelRecordEntries(final List<OrderCancelRecordEntryDTO> ordercancelrecordentriesList)
	{
		this.ordercancelrecordentriesList=ordercancelrecordentriesList;
	}
	
}
