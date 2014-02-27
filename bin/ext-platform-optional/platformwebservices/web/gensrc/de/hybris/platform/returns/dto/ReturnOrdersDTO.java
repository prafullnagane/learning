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

import de.hybris.platform.returns.dto.ReturnOrderDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ReturnOrder first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "returnorders")
public class ReturnOrdersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ReturnOrderDTO*/
	private List<ReturnOrderDTO>  returnordersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnOrdersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnOrdersDTO(final List<ReturnOrderDTO> returnordersList)
	{
		super();
		this.returnordersList=returnordersList;
	}
	
	
	/**
	 * @return the returnorders
	 */
	@XmlElement(name = "returnorder")
	public List<ReturnOrderDTO> getReturnOrders()
	{
		return	returnordersList;
	}
	
	/**
	 * @param returnordersList 
	 *  the returnordersList to set   
	 */
	public void setReturnOrders(final List<ReturnOrderDTO> returnordersList)
	{
		this.returnordersList=returnordersList;
	}
	
}
