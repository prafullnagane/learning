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

import de.hybris.platform.ordercancel.dto.OrderCancelConfigDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderCancelConfig first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "ordercancelconfigs")
public class OrderCancelConfigsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderCancelConfigDTO*/
	private List<OrderCancelConfigDTO>  ordercancelconfigsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderCancelConfigsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderCancelConfigsDTO(final List<OrderCancelConfigDTO> ordercancelconfigsList)
	{
		super();
		this.ordercancelconfigsList=ordercancelconfigsList;
	}
	
	
	/**
	 * @return the ordercancelconfigs
	 */
	@XmlElement(name = "ordercancelconfig")
	public List<OrderCancelConfigDTO> getOrderCancelConfigs()
	{
		return	ordercancelconfigsList;
	}
	
	/**
	 * @param ordercancelconfigsList 
	 *  the ordercancelconfigsList to set   
	 */
	public void setOrderCancelConfigs(final List<OrderCancelConfigDTO> ordercancelconfigsList)
	{
		this.ordercancelconfigsList=ordercancelconfigsList;
	}
	
}
