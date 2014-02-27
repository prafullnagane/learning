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

import de.hybris.platform.core.dto.type.AtomicTypeDTO;
import de.hybris.platform.core.dto.type.TypeDTO;
import de.hybris.platform.core.model.type.AtomicTypeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AtomicType first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = AtomicTypeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "atomictype")
public class AtomicTypeDTO extends TypeDTO
{
	/** <i>Generated variable</i> - Variable of <code>AtomicType.superType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AtomicTypeDTO _superType;
	/** <i>Generated variable</i> - Variable of <code>AtomicType.subtypes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.AtomicTypeDTO> _subtypes;
	/** <i>Generated variable</i> - Variable of <code>AtomicType.javaClass</code> attribute defined at extension <code> */
	private java.lang.Class _javaClass;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AtomicTypeDTO()
	{
		super();
	}
	
	
	public Class getJavaClass()
	{
		return this._javaClass;
	}
	
	@XmlElementWrapper(name = "subtypes")
	@XmlElement(name = "atomicType")
	public Collection<AtomicTypeDTO> getSubtypes()
	{
		return this._subtypes;
	}
	
	public AtomicTypeDTO getSuperType()
	{
		return this._superType;
	}
	
	public void setJavaClass(final Class value)
	{
		this.modifiedPropsSet.add("javaClass");
		this._javaClass = value;
	}
	
	public void setSubtypes(final Collection<AtomicTypeDTO> value)
	{
		this.modifiedPropsSet.add("subtypes");
		this._subtypes = value;
	}
	
	public void setSuperType(final AtomicTypeDTO value)
	{
		this.modifiedPropsSet.add("superType");
		this._superType = value;
	}
	
}
