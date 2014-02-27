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
package de.hybris.platform.voucher.dto;

import de.hybris.platform.voucher.dto.UserRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type UserRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "userrestrictions")
public class UserRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>UserRestrictionDTO*/
	private List<UserRestrictionDTO>  userrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserRestrictionsDTO(final List<UserRestrictionDTO> userrestrictionsList)
	{
		super();
		this.userrestrictionsList=userrestrictionsList;
	}
	
	
	/**
	 * @return the userrestrictions
	 */
	@XmlElement(name = "userrestriction")
	public List<UserRestrictionDTO> getUserRestrictions()
	{
		return	userrestrictionsList;
	}
	
	/**
	 * @param userrestrictionsList 
	 *  the userrestrictionsList to set   
	 */
	public void setUserRestrictions(final List<UserRestrictionDTO> userrestrictionsList)
	{
		this.userrestrictionsList=userrestrictionsList;
	}
	
}
