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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.BTGOutputActionDefinitionDTO;
import de.hybris.platform.btg.model.BTGAssignToGroupDefinitionModel;
import de.hybris.platform.core.dto.user.UserGroupDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGAssignToGroupDefinition first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGAssignToGroupDefinitionModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btgassigntogroupdefinition")
public class BTGAssignToGroupDefinitionDTO extends BTGOutputActionDefinitionDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGAssignToGroupDefinition.userGroups</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.user.UserGroupDTO> _userGroups;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAssignToGroupDefinitionDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "userGroups")
	@XmlElement(name = "userGroup")
	public Collection<UserGroupDTO> getUserGroups()
	{
		return this._userGroups;
	}
	
	public void setUserGroups(final Collection<UserGroupDTO> value)
	{
		this.modifiedPropsSet.add("userGroups");
		this._userGroups = value;
	}
	
}
