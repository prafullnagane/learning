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
package de.hybris.platform.orderscheduling.dto;

import de.hybris.platform.orderscheduling.dto.CartToOrderCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CartToOrderCronJob first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "carttoordercronjobs")
public class CartToOrderCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CartToOrderCronJobDTO*/
	private List<CartToOrderCronJobDTO>  carttoordercronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartToOrderCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartToOrderCronJobsDTO(final List<CartToOrderCronJobDTO> carttoordercronjobsList)
	{
		super();
		this.carttoordercronjobsList=carttoordercronjobsList;
	}
	
	
	/**
	 * @return the carttoordercronjobs
	 */
	@XmlElement(name = "carttoordercronjob")
	public List<CartToOrderCronJobDTO> getCartToOrderCronJobs()
	{
		return	carttoordercronjobsList;
	}
	
	/**
	 * @param carttoordercronjobsList 
	 *  the carttoordercronjobsList to set   
	 */
	public void setCartToOrderCronJobs(final List<CartToOrderCronJobDTO> carttoordercronjobsList)
	{
		this.carttoordercronjobsList=carttoordercronjobsList;
	}
	
}
