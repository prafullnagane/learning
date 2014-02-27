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

import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PrincipalGroup first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = PrincipalGroupModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "principalgroup")
public class PrincipalGroupDTO extends PrincipalDTO
{
	/** <i>Generated variable</i> - Variable of <code>PrincipalGroup.members</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.security.PrincipalDTO> _members;
	/** <i>Generated variable</i> - Variable of <code>PrincipalGroup.locName</code> attribute defined at extension <code> */
	private java.lang.String _locName;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PrincipalGroupDTO()
	{
		super();
	}
	
	
	public String getLocName()
	{
		return this._locName;
	}
	
	@XmlElementWrapper(name = "members")
	@XmlElement(name = "principal")
	public Set<PrincipalDTO> getMembers()
	{
		return this._members;
	}
	
	public void setLocName(final String value)
	{
		this.modifiedPropsSet.add("locName");
		this._locName = value;
	}
	
	public void setMembers(final Set<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("members");
		this._members = value;
	}
	
}
