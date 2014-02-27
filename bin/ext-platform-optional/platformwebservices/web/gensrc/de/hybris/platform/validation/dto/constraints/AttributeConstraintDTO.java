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

import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.validation.dto.constraints.AbstractConstraintDTO;
import de.hybris.platform.validation.model.constraints.AttributeConstraintModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AttributeConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@GraphNode(target = AttributeConstraintModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "attributeconstraint")
public class AttributeConstraintDTO extends AbstractConstraintDTO
{
	/** <i>Generated variable</i> - Variable of <code>AttributeConstraint.qualifier</code> attribute defined at extension <code> */
	private java.lang.String _qualifier;
	/** <i>Generated variable</i> - Variable of <code>AttributeConstraint.descriptor</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _descriptor;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeConstraintDTO()
	{
		super();
	}
	
	
	public AttributeDescriptorDTO getDescriptor()
	{
		return this._descriptor;
	}
	
	public String getQualifier()
	{
		return this._qualifier;
	}
	
	public void setDescriptor(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("descriptor");
		this._descriptor = value;
	}
	
	public void setQualifier(final String value)
	{
		this.modifiedPropsSet.add("qualifier");
		this._qualifier = value;
	}
	
}
