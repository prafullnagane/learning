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

import de.hybris.platform.btg.dto.BTGOperandDTO;
import de.hybris.platform.btg.model.BTGGenericOperandModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGGenericOperand first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGGenericOperandModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btggenericoperand")
public class BTGGenericOperandDTO extends BTGOperandDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGGenericOperand.beanId</code> attribute defined at extension <code> */
	private java.lang.String _beanId;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGGenericOperandDTO()
	{
		super();
	}
	
	
	public String getBeanId()
	{
		return this._beanId;
	}
	
	public void setBeanId(final String value)
	{
		this.modifiedPropsSet.add("beanId");
		this._beanId = value;
	}
	
}
