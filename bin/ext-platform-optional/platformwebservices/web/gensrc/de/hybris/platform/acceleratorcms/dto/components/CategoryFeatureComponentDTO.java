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
package de.hybris.platform.acceleratorcms.dto.components;

import de.hybris.platform.acceleratorcms.model.components.CategoryFeatureComponentModel;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CategoryFeatureComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@GraphNode(target = CategoryFeatureComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "categoryfeaturecomponent")
public class CategoryFeatureComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>CategoryFeatureComponent.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>CategoryFeatureComponent.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	/** <i>Generated variable</i> - Variable of <code>CategoryFeatureComponent.media</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _media;
	/** <i>Generated variable</i> - Variable of <code>CategoryFeatureComponent.category</code> attribute defined at extension <code> */
	private de.hybris.platform.category.dto.CategoryDTO _category;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CategoryFeatureComponentDTO()
	{
		super();
	}
	
	
	public CategoryDTO getCategory()
	{
		return this._category;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public MediaDTO getMedia()
	{
		return this._media;
	}
	
	public String getTitle()
	{
		return this._title;
	}
	
	public void setCategory(final CategoryDTO value)
	{
		this.modifiedPropsSet.add("category");
		this._category = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setMedia(final MediaDTO value)
	{
		this.modifiedPropsSet.add("media");
		this._media = value;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
}
