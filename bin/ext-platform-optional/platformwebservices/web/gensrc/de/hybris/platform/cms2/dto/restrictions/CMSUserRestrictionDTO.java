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
package de.hybris.platform.cms2.dto.restrictions;

import de.hybris.platform.cms2.dto.restrictions.AbstractRestrictionDTO;
import de.hybris.platform.cms2.model.restrictions.CMSUserRestrictionModel;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSUserRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSUserRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmsuserrestriction")
public class CMSUserRestrictionDTO extends AbstractRestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSUserRestriction.users</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.user.UserDTO> _users;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSUserRestrictionDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "users")
	@XmlElement(name = "user")
	public Collection<UserDTO> getUsers()
	{
		return this._users;
	}
	
	public void setUsers(final Collection<UserDTO> value)
	{
		this.modifiedPropsSet.add("users");
		this._users = value;
	}
	
}
