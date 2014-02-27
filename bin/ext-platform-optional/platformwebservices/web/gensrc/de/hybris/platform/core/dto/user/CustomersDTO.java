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
package de.hybris.platform.core.dto.user;

import de.hybris.platform.core.dto.user.CustomerDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Customer first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "customers")
public class CustomersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CustomerDTO*/
	private List<CustomerDTO>  customersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomersDTO(final List<CustomerDTO> customersList)
	{
		super();
		this.customersList=customersList;
	}
	
	
	/**
	 * @return the customers
	 */
	@XmlElement(name = "customer")
	public List<CustomerDTO> getCustomers()
	{
		return	customersList;
	}
	
	/**
	 * @param customersList 
	 *  the customersList to set   
	 */
	public void setCustomers(final List<CustomerDTO> customersList)
	{
		this.customersList=customersList;
	}
	
}
