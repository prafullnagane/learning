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
package de.hybris.platform.acceleratorservices.dto;

import de.hybris.platform.acceleratorservices.dto.CartRemovalCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CartRemovalCronJob first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cartremovalcronjobs")
public class CartRemovalCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CartRemovalCronJobDTO*/
	private List<CartRemovalCronJobDTO>  cartremovalcronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartRemovalCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartRemovalCronJobsDTO(final List<CartRemovalCronJobDTO> cartremovalcronjobsList)
	{
		super();
		this.cartremovalcronjobsList=cartremovalcronjobsList;
	}
	
	
	/**
	 * @return the cartremovalcronjobs
	 */
	@XmlElement(name = "cartremovalcronjob")
	public List<CartRemovalCronJobDTO> getCartRemovalCronJobs()
	{
		return	cartremovalcronjobsList;
	}
	
	/**
	 * @param cartremovalcronjobsList 
	 *  the cartremovalcronjobsList to set   
	 */
	public void setCartRemovalCronJobs(final List<CartRemovalCronJobDTO> cartremovalcronjobsList)
	{
		this.cartremovalcronjobsList=cartremovalcronjobsList;
	}
	
}
