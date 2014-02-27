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

import de.hybris.platform.btg.dto.BTGLastOrdersOperandDTO;
import de.hybris.platform.btg.model.BTGCategoriesInOrdersOperandModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGCategoriesInOrdersOperand first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGCategoriesInOrdersOperandModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btgcategoriesinordersoperand")
public class BTGCategoriesInOrdersOperandDTO extends BTGLastOrdersOperandDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGCategoriesInOrdersOperand.withSupercategories</code> attribute defined at extension <code> */
	private java.lang.Boolean _withSupercategories;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGCategoriesInOrdersOperandDTO()
	{
		super();
	}
	
	
	public Boolean getWithSupercategories()
	{
		return this._withSupercategories;
	}
	
	public void setWithSupercategories(final Boolean value)
	{
		this.modifiedPropsSet.add("withSupercategories");
		this._withSupercategories = value;
	}
	
}
