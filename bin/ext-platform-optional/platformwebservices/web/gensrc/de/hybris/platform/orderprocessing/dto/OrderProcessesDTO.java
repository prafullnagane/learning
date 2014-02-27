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
package de.hybris.platform.orderprocessing.dto;

import de.hybris.platform.orderprocessing.dto.OrderProcessDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderProcess first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderprocesses")
public class OrderProcessesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderProcessDTO*/
	private List<OrderProcessDTO>  orderprocessesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderProcessesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderProcessesDTO(final List<OrderProcessDTO> orderprocessesList)
	{
		super();
		this.orderprocessesList=orderprocessesList;
	}
	
	
	/**
	 * @return the orderprocesses
	 */
	@XmlElement(name = "orderprocess")
	public List<OrderProcessDTO> getOrderProcesses()
	{
		return	orderprocessesList;
	}
	
	/**
	 * @param orderprocessesList 
	 *  the orderprocessesList to set   
	 */
	public void setOrderProcesses(final List<OrderProcessDTO> orderprocessesList)
	{
		this.orderprocessesList=orderprocessesList;
	}
	
}
