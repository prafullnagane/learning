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

import de.hybris.platform.acceleratorcms.model.components.ImageMapComponentModel;
import de.hybris.platform.cms2lib.dto.components.AbstractBannerComponentDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ImageMapComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@GraphNode(target = ImageMapComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "imagemapcomponent")
public class ImageMapComponentDTO extends AbstractBannerComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>ImageMapComponent.imageMapHTML</code> attribute defined at extension <code> */
	private java.lang.String _imageMapHTML;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImageMapComponentDTO()
	{
		super();
	}
	
	
	public String getImageMapHTML()
	{
		return this._imageMapHTML;
	}
	
	public void setImageMapHTML(final String value)
	{
		this.modifiedPropsSet.add("imageMapHTML");
		this._imageMapHTML = value;
	}
	
}
