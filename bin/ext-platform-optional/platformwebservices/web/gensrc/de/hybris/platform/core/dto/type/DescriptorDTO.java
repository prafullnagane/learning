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
package de.hybris.platform.core.dto.type;

import de.hybris.platform.core.dto.type.TypeDTO;
import de.hybris.platform.core.dto.type.TypeManagerManagedDTO;
import de.hybris.platform.core.model.type.DescriptorModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Descriptor first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = DescriptorModel.class, factory = GenericNodeFactory.class, uidProperties="qualifier")
@XmlRootElement(name = "descriptor")
public class DescriptorDTO extends TypeManagerManagedDTO
{
	/** <i>Generated variable</i> - Variable of <code>Descriptor.attributeType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.TypeDTO _attributeType;
	/** <i>Generated variable</i> - Variable of <code>Descriptor.qualifier</code> attribute defined at extension <code> */
	private java.lang.String _qualifier;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DescriptorDTO()
	{
		super();
	}
	
	
	public TypeDTO getAttributeType()
	{
		return this._attributeType;
	}
	
	@XmlAttribute
	public String getQualifier()
	{
		return this._qualifier;
	}
	
	public void setAttributeType(final TypeDTO value)
	{
		this.modifiedPropsSet.add("attributeType");
		this._attributeType = value;
	}
	
	public void setQualifier(final String value)
	{
		this.modifiedPropsSet.add("qualifier");
		this._qualifier = value;
	}
	
}
