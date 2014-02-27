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
package de.hybris.platform.variants.dto;

import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.variants.dto.VariantTypeDTO;
import de.hybris.platform.variants.model.VariantAttributeDescriptorModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type VariantAttributeDescriptor first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = VariantAttributeDescriptorModel.class, factory = GenericNodeFactory.class, uidProperties="qualifier")
@XmlRootElement(name = "variantattributedescriptor")
public class VariantAttributeDescriptorDTO extends AttributeDescriptorDTO
{
	/** <i>Generated variable</i> - Variable of <code>VariantAttributeDescriptor.position</code> attribute defined at extension <code> */
	private java.lang.Integer _position;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VariantAttributeDescriptorDTO()
	{
		super();
	}
	
	
	@Override
	public VariantTypeDTO getEnclosingType()
	{
		return (de.hybris.platform.variants.dto.VariantTypeDTO) super.getEnclosingType();
	}
	
	public Integer getPosition()
	{
		return this._position;
	}
	
	public void setPosition(final Integer value)
	{
		this.modifiedPropsSet.add("position");
		this._position = value;
	}
	
}
