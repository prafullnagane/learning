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
import de.hybris.platform.validation.model.constraints.jsr303.PatternConstraintModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumSetToStringValuesConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringSetToHybrisEnumValuesConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PatternConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@GraphNode(target = PatternConstraintModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "patternconstraint")
public class PatternConstraintDTO extends AttributeConstraintDTO
{
	/** <i>Generated variable</i> - Variable of <code>PatternConstraint.regexp</code> attribute defined at extension <code> */
	private java.lang.String _regexp;
	/** <i>Generated variable</i> - Variable of <code>PatternConstraint.flags</code> attribute defined at extension <code> */
	private java.util.Set<java.lang.String> _flags;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PatternConstraintDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringSetToHybrisEnumValuesConverter.class)
	@XmlElementWrapper(name = "flags")
	@XmlElement(name = "regexpFlag")
	public Set<String> getFlags()
	{
		return this._flags;
	}
	
	public String getRegexp()
	{
		return this._regexp;
	}
	
	@GraphProperty(interceptor = HybrisEnumSetToStringValuesConverter.class)
	public void setFlags(final Set<String> value)
	{
		this.modifiedPropsSet.add("flags");
		this._flags = value;
	}
	
	public void setRegexp(final String value)
	{
		this.modifiedPropsSet.add("regexp");
		this._regexp = value;
	}
	
}
