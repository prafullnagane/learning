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
package de.hybris.platform.core.dto.util;

import de.hybris.platform.core.dto.util.CustomerOrderOverviewDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CustomerOrderOverview first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "customerorderoverviews")
public class CustomerOrderOverviewsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CustomerOrderOverviewDTO*/
	private List<CustomerOrderOverviewDTO>  customerorderoverviewsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomerOrderOverviewsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomerOrderOverviewsDTO(final List<CustomerOrderOverviewDTO> customerorderoverviewsList)
	{
		super();
		this.customerorderoverviewsList=customerorderoverviewsList;
	}
	
	
	/**
	 * @return the customerorderoverviews
	 */
	@XmlElement(name = "customerorderoverview")
	public List<CustomerOrderOverviewDTO> getCustomerOrderOverviews()
	{
		return	customerorderoverviewsList;
	}
	
	/**
	 * @param customerorderoverviewsList 
	 *  the customerorderoverviewsList to set   
	 */
	public void setCustomerOrderOverviews(final List<CustomerOrderOverviewDTO> customerorderoverviewsList)
	{
		this.customerorderoverviewsList=customerorderoverviewsList;
	}
	
}
