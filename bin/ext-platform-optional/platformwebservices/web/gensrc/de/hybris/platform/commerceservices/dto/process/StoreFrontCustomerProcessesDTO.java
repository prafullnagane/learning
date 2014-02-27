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
package de.hybris.platform.commerceservices.dto.process;

import de.hybris.platform.commerceservices.dto.process.StoreFrontCustomerProcessDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type StoreFrontCustomerProcess first defined at extension commerceservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "storefrontcustomerprocesses")
public class StoreFrontCustomerProcessesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>StoreFrontCustomerProcessDTO*/
	private List<StoreFrontCustomerProcessDTO>  storefrontcustomerprocessesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreFrontCustomerProcessesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreFrontCustomerProcessesDTO(final List<StoreFrontCustomerProcessDTO> storefrontcustomerprocessesList)
	{
		super();
		this.storefrontcustomerprocessesList=storefrontcustomerprocessesList;
	}
	
	
	/**
	 * @return the storefrontcustomerprocesses
	 */
	@XmlElement(name = "storefrontcustomerprocess")
	public List<StoreFrontCustomerProcessDTO> getStoreFrontCustomerProcesses()
	{
		return	storefrontcustomerprocessesList;
	}
	
	/**
	 * @param storefrontcustomerprocessesList 
	 *  the storefrontcustomerprocessesList to set   
	 */
	public void setStoreFrontCustomerProcesses(final List<StoreFrontCustomerProcessDTO> storefrontcustomerprocessesList)
	{
		this.storefrontcustomerprocessesList=storefrontcustomerprocessesList;
	}
	
}
