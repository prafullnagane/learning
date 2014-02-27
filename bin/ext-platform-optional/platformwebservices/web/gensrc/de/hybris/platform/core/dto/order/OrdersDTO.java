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

import de.hybris.platform.core.dto.order.OrderDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Order first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orders")
public class OrdersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderDTO*/
	private List<OrderDTO>  ordersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrdersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrdersDTO(final List<OrderDTO> ordersList)
	{
		super();
		this.ordersList=ordersList;
	}
	
	
	/**
	 * @return the orders
	 */
	@XmlElement(name = "order")
	public List<OrderDTO> getOrders()
	{
		return	ordersList;
	}
	
	/**
	 * @param ordersList 
	 *  the ordersList to set   
	 */
	public void setOrders(final List<OrderDTO> ordersList)
	{
		this.ordersList=ordersList;
	}
	
}
