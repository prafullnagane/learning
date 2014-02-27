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
import de.hybris.platform.btg.dto.BTGRuleDTO;
import de.hybris.platform.btg.model.BTGRuleResultModel;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGRuleResult first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGRuleResultModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "btgruleresult")
public class BTGRuleResultDTO extends BTGAbstractResultDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGRuleResult.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>BTGRuleResult.rule</code> attribute defined at extension <code> */
	private de.hybris.platform.btg.dto.BTGRuleDTO _rule;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGRuleResultDTO()
	{
		super();
	}
	
	
	public BTGRuleDTO getRule()
	{
		return this._rule;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public void setRule(final BTGRuleDTO value)
	{
		this.modifiedPropsSet.add("rule");
		this._rule = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
