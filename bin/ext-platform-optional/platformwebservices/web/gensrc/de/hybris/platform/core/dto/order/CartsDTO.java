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

import de.hybris.platform.core.dto.order.CartDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Cart first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "carts")
public class CartsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CartDTO*/
	private List<CartDTO>  cartsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartsDTO(final List<CartDTO> cartsList)
	{
		super();
		this.cartsList=cartsList;
	}
	
	
	/**
	 * @return the carts
	 */
	@XmlElement(name = "cart")
	public List<CartDTO> getCarts()
	{
		return	cartsList;
	}
	
	/**
	 * @param cartsList 
	 *  the cartsList to set   
	 */
	public void setCarts(final List<CartDTO> cartsList)
	{
		this.cartsList=cartsList;
	}
	
}
