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

import de.hybris.platform.core.dto.type.TypeManagerManagedDTO;
import de.hybris.platform.core.model.type.TypeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Type first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = TypeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "type")
public class TypeDTO extends TypeManagerManagedDTO
{
	/** <i>Generated variable</i> - Variable of <code>Type.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>Type.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Type.xmldefinition</code> attribute defined at extension <code> */
	private java.lang.String _xmldefinition;
	/** <i>Generated variable</i> - Variable of <code>Type.defaultValue</code> attribute defined at extension <code> */
	private java.lang.Object _defaultValue;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypeDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public Object getDefaultValue()
	{
		return this._defaultValue;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getXmldefinition()
	{
		return this._xmldefinition;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setDefaultValue(final Object value)
	{
		this.modifiedPropsSet.add("defaultValue");
		this._defaultValue = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setXmldefinition(final String value)
	{
		this.modifiedPropsSet.add("xmldefinition");
		this._xmldefinition = value;
	}
	
}
