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

import de.hybris.platform.ordercancel.dto.OrderCancelRecordDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderCancelRecord first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "ordercancelrecords")
public class OrderCancelRecordsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderCancelRecordDTO*/
	private List<OrderCancelRecordDTO>  ordercancelrecordsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderCancelRecordsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderCancelRecordsDTO(final List<OrderCancelRecordDTO> ordercancelrecordsList)
	{
		super();
		this.ordercancelrecordsList=ordercancelrecordsList;
	}
	
	
	/**
	 * @return the ordercancelrecords
	 */
	@XmlElement(name = "ordercancelrecord")
	public List<OrderCancelRecordDTO> getOrderCancelRecords()
	{
		return	ordercancelrecordsList;
	}
	
	/**
	 * @param ordercancelrecordsList 
	 *  the ordercancelrecordsList to set   
	 */
	public void setOrderCancelRecords(final List<OrderCancelRecordDTO> ordercancelrecordsList)
	{
		this.ordercancelrecordsList=ordercancelrecordsList;
	}
	
}
