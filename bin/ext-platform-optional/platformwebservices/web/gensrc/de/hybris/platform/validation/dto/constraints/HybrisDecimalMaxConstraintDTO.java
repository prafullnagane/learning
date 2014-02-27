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
package de.hybris.platform.validation.dto.constraints;

import de.hybris.platform.validation.dto.constraints.AttributeConstraintDTO;
import de.hybris.platform.validation.model.constraints.HybrisDecimalMaxConstraintModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type HybrisDecimalMaxConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@GraphNode(target = HybrisDecimalMaxConstraintModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "hybrisdecimalmaxconstraint")
public class HybrisDecimalMaxConstraintDTO extends AttributeConstraintDTO
{
	/** <i>Generated variable</i> - Variable of <code>HybrisDecimalMaxConstraint.value</code> attribute defined at extension <code> */
	private java.math.BigDecimal _value;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public HybrisDecimalMaxConstraintDTO()
	{
		super();
	}
	
	
	public BigDecimal getValue()
	{
		return this._value;
	}
	
	public void setValue(final BigDecimal value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
