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

import de.hybris.platform.commerceservices.dto.process.StoreFrontProcessDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type StoreFrontProcess first defined at extension commerceservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "storefrontprocesses")
public class StoreFrontProcessesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>StoreFrontProcessDTO*/
	private List<StoreFrontProcessDTO>  storefrontprocessesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreFrontProcessesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreFrontProcessesDTO(final List<StoreFrontProcessDTO> storefrontprocessesList)
	{
		super();
		this.storefrontprocessesList=storefrontprocessesList;
	}
	
	
	/**
	 * @return the storefrontprocesses
	 */
	@XmlElement(name = "storefrontprocess")
	public List<StoreFrontProcessDTO> getStoreFrontProcesses()
	{
		return	storefrontprocessesList;
	}
	
	/**
	 * @param storefrontprocessesList 
	 *  the storefrontprocessesList to set   
	 */
	public void setStoreFrontProcesses(final List<StoreFrontProcessDTO> storefrontprocessesList)
	{
		this.storefrontprocessesList=storefrontprocessesList;
	}
	
}
