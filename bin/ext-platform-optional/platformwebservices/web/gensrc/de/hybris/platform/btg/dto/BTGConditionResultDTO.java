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

import de.hybris.platform.btg.dto.BTGAbstractResultDTO;
import de.hybris.platform.btg.dto.BTGConditionDTO;
import de.hybris.platform.btg.model.BTGConditionResultModel;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGConditionResult first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGConditionResultModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "btgconditionresult")
public class BTGConditionResultDTO extends BTGAbstractResultDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGConditionResult.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>BTGConditionResult.condition</code> attribute defined at extension <code> */
	private de.hybris.platform.btg.dto.BTGConditionDTO _condition;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGConditionResultDTO()
	{
		super();
	}
	
	
	public BTGConditionDTO getCondition()
	{
		return this._condition;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public void setCondition(final BTGConditionDTO value)
	{
		this.modifiedPropsSet.add("condition");
		this._condition = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
