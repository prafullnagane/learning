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
package de.hybris.platform.voucher.dto;

import de.hybris.platform.voucher.dto.OrderRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderrestrictions")
public class OrderRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderRestrictionDTO*/
	private List<OrderRestrictionDTO>  orderrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderRestrictionsDTO(final List<OrderRestrictionDTO> orderrestrictionsList)
	{
		super();
		this.orderrestrictionsList=orderrestrictionsList;
	}
	
	
	/**
	 * @return the orderrestrictions
	 */
	@XmlElement(name = "orderrestriction")
	public List<OrderRestrictionDTO> getOrderRestrictions()
	{
		return	orderrestrictionsList;
	}
	
	/**
	 * @param orderrestrictionsList 
	 *  the orderrestrictionsList to set   
	 */
	public void setOrderRestrictions(final List<OrderRestrictionDTO> orderrestrictionsList)
	{
		this.orderrestrictionsList=orderrestrictionsList;
	}
	
}
