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

import de.hybris.platform.cockpit.model.CockpitFavoriteCategoryModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitFavoriteCategory first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitFavoriteCategoryModel.class, factory = GenericNodeFactory.class, uidProperties="qualifier")
@XmlRootElement(name = "cockpitfavoritecategory")
public class CockpitFavoriteCategoryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CockpitFavoriteCategory.qualifier</code> attribute defined at extension <code> */
	private java.lang.String _qualifier;
	/** <i>Generated variable</i> - Variable of <code>CockpitFavoriteCategory.label</code> attribute defined at extension <code> */
	private java.lang.String _label;
	/** <i>Generated variable</i> - Variable of <code>CockpitFavoriteCategory.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>CockpitFavoriteCategory.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitFavoriteCategoryDTO()
	{
		super();
	}
	
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getLabel()
	{
		return this._label;
	}
	
	@XmlAttribute
	public String getQualifier()
	{
		return this._qualifier;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setLabel(final String value)
	{
		this.modifiedPropsSet.add("label");
		this._label = value;
	}
	
	public void setQualifier(final String value)
	{
		this.modifiedPropsSet.add("qualifier");
		this._qualifier = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
