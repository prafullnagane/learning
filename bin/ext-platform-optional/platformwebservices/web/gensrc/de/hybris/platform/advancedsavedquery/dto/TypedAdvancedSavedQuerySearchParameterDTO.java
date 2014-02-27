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
package de.hybris.platform.advancedsavedquery.dto;

import de.hybris.platform.advancedsavedquery.dto.AbstractAdvancedSavedQuerySearchParameterDTO;
import de.hybris.platform.advancedsavedquery.model.TypedAdvancedSavedQuerySearchParameterModel;
import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type TypedAdvancedSavedQuerySearchParameter first defined at extension advancedsavedquery
 */
@SuppressWarnings("all")
@GraphNode(target = TypedAdvancedSavedQuerySearchParameterModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "typedadvancedsavedquerysearchparameter")
public class TypedAdvancedSavedQuerySearchParameterDTO extends AbstractAdvancedSavedQuerySearchParameterDTO
{
	/** <i>Generated variable</i> - Variable of <code>TypedAdvancedSavedQuerySearchParameter.typedSearchParameter</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _typedSearchParameter;
	/** <i>Generated variable</i> - Variable of <code>TypedAdvancedSavedQuerySearchParameter.typeAttributes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.AttributeDescriptorDTO> _typeAttributes;
	/** <i>Generated variable</i> - Variable of <code>TypedAdvancedSavedQuerySearchParameter.enclosingType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _enclosingType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypedAdvancedSavedQuerySearchParameterDTO()
	{
		super();
	}
	
	
	public ComposedTypeDTO getEnclosingType()
	{
		return this._enclosingType;
	}
	
	@XmlElementWrapper(name = "typeAttributes")
	@XmlElement(name = "attributeDescriptor")
	public Collection<AttributeDescriptorDTO> getTypeAttributes()
	{
		return this._typeAttributes;
	}
	
	public AttributeDescriptorDTO getTypedSearchParameter()
	{
		return this._typedSearchParameter;
	}
	
	public void setEnclosingType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("enclosingType");
		this._enclosingType = value;
	}
	
	public void setTypeAttributes(final Collection<AttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("typeAttributes");
		this._typeAttributes = value;
	}
	
	public void setTypedSearchParameter(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("typedSearchParameter");
		this._typedSearchParameter = value;
	}
	
}
