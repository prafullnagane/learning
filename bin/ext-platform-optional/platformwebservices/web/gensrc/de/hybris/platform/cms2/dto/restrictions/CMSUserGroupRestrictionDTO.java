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
import de.hybris.platform.cms2.model.restrictions.CMSUserGroupRestrictionModel;
import de.hybris.platform.core.dto.user.UserGroupDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSUserGroupRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSUserGroupRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmsusergrouprestriction")
public class CMSUserGroupRestrictionDTO extends AbstractRestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSUserGroupRestriction.userGroups</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.user.UserGroupDTO> _userGroups;
	/** <i>Generated variable</i> - Variable of <code>CMSUserGroupRestriction.includeSubgroups</code> attribute defined at extension <code> */
	private boolean _includeSubgroups;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSUserGroupRestrictionDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "userGroups")
	@XmlElement(name = "userGroup")
	public Collection<UserGroupDTO> getUserGroups()
	{
		return this._userGroups;
	}
	
	public boolean isIncludeSubgroups()
	{
		return this._includeSubgroups;
	}
	
	public void setIncludeSubgroups(final boolean value)
	{
		this.modifiedPropsSet.add("includeSubgroups");
		this._includeSubgroups = value;
	}
	
	public void setUserGroups(final Collection<UserGroupDTO> value)
	{
		this.modifiedPropsSet.add("userGroups");
		this._userGroups = value;
	}
	
}
