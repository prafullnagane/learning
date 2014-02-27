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

import de.hybris.platform.btg.dto.BTGAbstractReferenceOperandDTO;
import de.hybris.platform.btg.model.BTGReferenceDateOperandModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGReferenceDateOperand first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGReferenceDateOperandModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btgreferencedateoperand")
public class BTGReferenceDateOperandDTO extends BTGAbstractReferenceOperandDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceDateOperand.unit</code> attribute defined at extension <code> */
	private java.lang.String _unit;
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceDateOperand.value</code> attribute defined at extension <code> */
	private java.lang.Integer _value;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceDateOperandDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getUnit()
	{
		return this._unit;
	}
	
	public Integer getValue()
	{
		return this._value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setUnit(final String value)
	{
		this.modifiedPropsSet.add("unit");
		this._unit = value;
	}
	
	public void setValue(final Integer value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
