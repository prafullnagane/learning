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
package de.hybris.platform.refund.dto;

import de.hybris.platform.refund.dto.OrderRefundRecordEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderRefundRecordEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderrefundrecordentries")
public class OrderRefundRecordEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderRefundRecordEntryDTO*/
	private List<OrderRefundRecordEntryDTO>  orderrefundrecordentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderRefundRecordEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderRefundRecordEntriesDTO(final List<OrderRefundRecordEntryDTO> orderrefundrecordentriesList)
	{
		super();
		this.orderrefundrecordentriesList=orderrefundrecordentriesList;
	}
	
	
	/**
	 * @return the orderrefundrecordentries
	 */
	@XmlElement(name = "orderrefundrecordentry")
	public List<OrderRefundRecordEntryDTO> getOrderRefundRecordEntries()
	{
		return	orderrefundrecordentriesList;
	}
	
	/**
	 * @param orderrefundrecordentriesList 
	 *  the orderrefundrecordentriesList to set   
	 */
	public void setOrderRefundRecordEntries(final List<OrderRefundRecordEntryDTO> orderrefundrecordentriesList)
	{
		this.orderrefundrecordentriesList=orderrefundrecordentriesList;
	}
	
}
