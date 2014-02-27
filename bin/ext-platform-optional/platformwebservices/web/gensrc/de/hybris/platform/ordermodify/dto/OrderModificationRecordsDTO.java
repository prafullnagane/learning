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

import de.hybris.platform.ordermodify.dto.OrderModificationRecordDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderModificationRecord first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "ordermodificationrecords")
public class OrderModificationRecordsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderModificationRecordDTO*/
	private List<OrderModificationRecordDTO>  ordermodificationrecordsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderModificationRecordsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderModificationRecordsDTO(final List<OrderModificationRecordDTO> ordermodificationrecordsList)
	{
		super();
		this.ordermodificationrecordsList=ordermodificationrecordsList;
	}
	
	
	/**
	 * @return the ordermodificationrecords
	 */
	@XmlElement(name = "ordermodificationrecord")
	public List<OrderModificationRecordDTO> getOrderModificationRecords()
	{
		return	ordermodificationrecordsList;
	}
	
	/**
	 * @param ordermodificationrecordsList 
	 *  the ordermodificationrecordsList to set   
	 */
	public void setOrderModificationRecords(final List<OrderModificationRecordDTO> ordermodificationrecordsList)
	{
		this.ordermodificationrecordsList=ordermodificationrecordsList;
	}
	
}
