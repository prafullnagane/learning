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

import de.hybris.platform.btg.dto.BTGGenericOperandDTO;
import de.hybris.platform.btg.model.BTGAbstractCartOperandModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGAbstractCartOperand first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGAbstractCartOperandModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btgabstractcartoperand")
public class BTGAbstractCartOperandDTO extends BTGGenericOperandDTO
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractCartOperandDTO()
	{
		super();
	}
	
	
}
