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
package de.hybris.platform.promotions.dto;

import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.promotions.dto.AbstractPromotionRestrictionDTO;
import de.hybris.platform.promotions.model.PromotionUserRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PromotionUserRestriction first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = PromotionUserRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "promotionuserrestriction")
public class PromotionUserRestrictionDTO extends AbstractPromotionRestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>PromotionUserRestriction.positive</code> attribute defined at extension <code> */
	private java.lang.Boolean _positive;
	/** <i>Generated variable</i> - Variable of <code>PromotionUserRestriction.users</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _users;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionUserRestrictionDTO()
	{
		super();
	}
	
	
	public Boolean getPositive()
	{
		return this._positive;
	}
	
	@XmlElementWrapper(name = "users")
	@XmlElement(name = "principal")
	public Collection<PrincipalDTO> getUsers()
	{
		return this._users;
	}
	
	public void setPositive(final Boolean value)
	{
		this.modifiedPropsSet.add("positive");
		this._positive = value;
	}
	
	public void setUsers(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("users");
		this._users = value;
	}
	
}
