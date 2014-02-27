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

import de.hybris.platform.validation.dto.constraints.TypeConstraintDTO;
import de.hybris.platform.validation.model.constraints.DynamicConstraintModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DynamicConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@GraphNode(target = DynamicConstraintModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "dynamicconstraint")
public class DynamicConstraintDTO extends TypeConstraintDTO
{
	/** <i>Generated variable</i> - Variable of <code>DynamicConstraint.language</code> attribute defined at extension <code> */
	private java.lang.String _language;
	/** <i>Generated variable</i> - Variable of <code>DynamicConstraint.expression</code> attribute defined at extension <code> */
	private java.lang.String _expression;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicConstraintDTO()
	{
		super();
	}
	
	
	public String getExpression()
	{
		return this._expression;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getLanguage()
	{
		return this._language;
	}
	
	public void setExpression(final String value)
	{
		this.modifiedPropsSet.add("expression");
		this._expression = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setLanguage(final String value)
	{
		this.modifiedPropsSet.add("language");
		this._language = value;
	}
	
}
