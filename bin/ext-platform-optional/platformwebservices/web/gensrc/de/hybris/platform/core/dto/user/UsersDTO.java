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

import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type User first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "users")
public class UsersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>UserDTO*/
	private List<UserDTO>  usersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UsersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UsersDTO(final List<UserDTO> usersList)
	{
		super();
		this.usersList=usersList;
	}
	
	
	/**
	 * @return the users
	 */
	@XmlElement(name = "user")
	public List<UserDTO> getUsers()
	{
		return	usersList;
	}
	
	/**
	 * @param usersList 
	 *  the usersList to set   
	 */
	public void setUsers(final List<UserDTO> usersList)
	{
		this.usersList=usersList;
	}
	
}
