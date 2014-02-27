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
package de.hybris.platform.hmc.dto;

import de.hybris.platform.hmc.dto.UserProfileDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type UserProfile first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "userprofiles")
public class UserProfilesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>UserProfileDTO*/
	private List<UserProfileDTO>  userprofilesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserProfilesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserProfilesDTO(final List<UserProfileDTO> userprofilesList)
	{
		super();
		this.userprofilesList=userprofilesList;
	}
	
	
	/**
	 * @return the userprofiles
	 */
	@XmlElement(name = "userprofile")
	public List<UserProfileDTO> getUserProfiles()
	{
		return	userprofilesList;
	}
	
	/**
	 * @param userprofilesList 
	 *  the userprofilesList to set   
	 */
	public void setUserProfiles(final List<UserProfileDTO> userprofilesList)
	{
		this.userprofilesList=userprofilesList;
	}
	
}
