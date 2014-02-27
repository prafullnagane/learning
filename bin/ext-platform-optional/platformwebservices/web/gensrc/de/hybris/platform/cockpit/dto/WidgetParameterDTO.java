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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.dto.DynamicWidgetPreferencesDTO;
import de.hybris.platform.cockpit.model.WidgetParameterModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.TypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type WidgetParameter first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = WidgetParameterModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "widgetparameter")
public class WidgetParameterDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>WidgetParameter.value</code> attribute defined at extension <code> */
	private java.lang.Object _value;
	/** <i>Generated variable</i> - Variable of <code>WidgetParameter.defaultValueExpression</code> attribute defined at extension <code> */
	private java.lang.String _defaultValueExpression;
	/** <i>Generated variable</i> - Variable of <code>WidgetParameter.type</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.TypeDTO _type;
	/** <i>Generated variable</i> - Variable of <code>WidgetParameter.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>WidgetParameter.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>WidgetParameter.widgetPreferences</code> attribute defined at extension <code> */
	private de.hybris.platform.cockpit.dto.DynamicWidgetPreferencesDTO _widgetPreferences;
	/** <i>Generated variable</i> - Variable of <code>WidgetParameter.targetType</code> attribute defined at extension <code> */
	private java.lang.String _targetType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WidgetParameterDTO()
	{
		super();
	}
	
	
	public String getDefaultValueExpression()
	{
		return this._defaultValueExpression;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public String getTargetType()
	{
		return this._targetType;
	}
	
	public TypeDTO getType()
	{
		return this._type;
	}
	
	public Object getValue()
	{
		return this._value;
	}
	
	public DynamicWidgetPreferencesDTO getWidgetPreferences()
	{
		return this._widgetPreferences;
	}
	
	public void setDefaultValueExpression(final String value)
	{
		this.modifiedPropsSet.add("defaultValueExpression");
		this._defaultValueExpression = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setTargetType(final String value)
	{
		this.modifiedPropsSet.add("targetType");
		this._targetType = value;
	}
	
	public void setType(final TypeDTO value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
	public void setValue(final Object value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
	public void setWidgetPreferences(final DynamicWidgetPreferencesDTO value)
	{
		this.modifiedPropsSet.add("widgetPreferences");
		this._widgetPreferences = value;
	}
	
}
