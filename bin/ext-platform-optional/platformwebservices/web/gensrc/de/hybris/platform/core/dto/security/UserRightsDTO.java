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
package de.hybris.platform.core.dto.security;

import de.hybris.platform.core.dto.security.UserRightDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type UserRight first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "userrights")
public class UserRightsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>UserRightDTO*/
	private List<UserRightDTO>  userrightsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserRightsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserRightsDTO(final List<UserRightDTO> userrightsList)
	{
		super();
		this.userrightsList=userrightsList;
	}
	
	
	/**
	 * @return the userrights
	 */
	@XmlElement(name = "userright")
	public List<UserRightDTO> getUserRights()
	{
		return	userrightsList;
	}
	
	/**
	 * @param userrightsList 
	 *  the userrightsList to set   
	 */
	public void setUserRights(final List<UserRightDTO> userrightsList)
	{
		this.userrightsList=userrightsList;
	}
	
}
