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

import de.hybris.platform.cockpit.model.WidgetPreferencesModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type WidgetPreferences first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = WidgetPreferencesModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "widgetpreferences")
public class WidgetPreferencesDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>WidgetPreferences.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	/** <i>Generated variable</i> - Variable of <code>WidgetPreferences.ownerUser</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _ownerUser;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WidgetPreferencesDTO()
	{
		super();
	}
	
	
	public UserDTO getOwnerUser()
	{
		return this._ownerUser;
	}
	
	public String getTitle()
	{
		return this._title;
	}
	
	public void setOwnerUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("ownerUser");
		this._ownerUser = value;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
}
