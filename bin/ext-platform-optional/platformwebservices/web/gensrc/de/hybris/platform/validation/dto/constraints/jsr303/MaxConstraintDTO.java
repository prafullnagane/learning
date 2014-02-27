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
package de.hybris.platform.validation.dto.constraints.jsr303;

import de.hybris.platform.validation.dto.constraints.AttributeConstraintDTO;
import de.hybris.platform.validation.model.constraints.jsr303.MaxConstraintModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type MaxConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@GraphNode(target = MaxConstraintModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "maxconstraint")
public class MaxConstraintDTO extends AttributeConstraintDTO
{
	/** <i>Generated variable</i> - Variable of <code>MaxConstraint.value</code> attribute defined at extension <code> */
	private java.lang.Long _value;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MaxConstraintDTO()
	{
		super();
	}
	
	
	public Long getValue()
	{
		return this._value;
	}
	
	public void setValue(final Long value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
