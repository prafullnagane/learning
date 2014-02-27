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

import de.hybris.platform.core.dto.user.UserGroupDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type UserGroup first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "usergroups")
public class UserGroupsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>UserGroupDTO*/
	private List<UserGroupDTO>  usergroupsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserGroupsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserGroupsDTO(final List<UserGroupDTO> usergroupsList)
	{
		super();
		this.usergroupsList=usergroupsList;
	}
	
	
	/**
	 * @return the usergroups
	 */
	@XmlElement(name = "usergroup")
	public List<UserGroupDTO> getUserGroups()
	{
		return	usergroupsList;
	}
	
	/**
	 * @param usergroupsList 
	 *  the usergroupsList to set   
	 */
	public void setUserGroups(final List<UserGroupDTO> usergroupsList)
	{
		this.usergroupsList=usergroupsList;
	}
	
}
