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

import de.hybris.platform.cockpit.dto.WidgetParameterDTO;
import de.hybris.platform.cockpit.dto.WidgetPreferencesDTO;
import de.hybris.platform.cockpit.model.DynamicWidgetPreferencesModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DynamicWidgetPreferences first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = DynamicWidgetPreferencesModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "dynamicwidgetpreferences")
public class DynamicWidgetPreferencesDTO extends WidgetPreferencesDTO
{
	/** <i>Generated variable</i> - Variable of <code>DynamicWidgetPreferences.parameters</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.WidgetParameterDTO> _parameters;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicWidgetPreferencesDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "parameters")
	@XmlElement(name = "widgetParameter")
	public Collection<WidgetParameterDTO> getParameters()
	{
		return this._parameters;
	}
	
	public void setParameters(final Collection<WidgetParameterDTO> value)
	{
		this.modifiedPropsSet.add("parameters");
		this._parameters = value;
	}
	
}
