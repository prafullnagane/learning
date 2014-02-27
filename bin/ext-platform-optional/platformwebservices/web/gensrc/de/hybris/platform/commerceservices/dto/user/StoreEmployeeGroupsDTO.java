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
package de.hybris.platform.commerceservices.dto.user;

import de.hybris.platform.commerceservices.dto.user.StoreEmployeeGroupDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type StoreEmployeeGroup first defined at extension commerceservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "storeemployeegroups")
public class StoreEmployeeGroupsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>StoreEmployeeGroupDTO*/
	private List<StoreEmployeeGroupDTO>  storeemployeegroupsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreEmployeeGroupsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreEmployeeGroupsDTO(final List<StoreEmployeeGroupDTO> storeemployeegroupsList)
	{
		super();
		this.storeemployeegroupsList=storeemployeegroupsList;
	}
	
	
	/**
	 * @return the storeemployeegroups
	 */
	@XmlElement(name = "storeemployeegroup")
	public List<StoreEmployeeGroupDTO> getStoreEmployeeGroups()
	{
		return	storeemployeegroupsList;
	}
	
	/**
	 * @param storeemployeegroupsList 
	 *  the storeemployeegroupsList to set   
	 */
	public void setStoreEmployeeGroups(final List<StoreEmployeeGroupDTO> storeemployeegroupsList)
	{
		this.storeemployeegroupsList=storeemployeegroupsList;
	}
	
}
