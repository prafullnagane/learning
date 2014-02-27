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
package de.hybris.platform.cms2lib.dto.components;

import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.cms2lib.model.components.AbstractBannerComponentModel;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractBannerComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractBannerComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "abstractbannercomponent")
public class AbstractBannerComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractBannerComponent.media</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _media;
	/** <i>Generated variable</i> - Variable of <code>AbstractBannerComponent.urlLink</code> attribute defined at extension <code> */
	private java.lang.String _urlLink;
	/** <i>Generated variable</i> - Variable of <code>AbstractBannerComponent.external</code> attribute defined at extension <code> */
	private boolean _external;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractBannerComponentDTO()
	{
		super();
	}
	
	
	public MediaDTO getMedia()
	{
		return this._media;
	}
	
	public String getUrlLink()
	{
		return this._urlLink;
	}
	
	public boolean isExternal()
	{
		return this._external;
	}
	
	public void setExternal(final boolean value)
	{
		this.modifiedPropsSet.add("external");
		this._external = value;
	}
	
	public void setMedia(final MediaDTO value)
	{
		this.modifiedPropsSet.add("media");
		this._media = value;
	}
	
	public void setUrlLink(final String value)
	{
		this.modifiedPropsSet.add("urlLink");
		this._urlLink = value;
	}
	
}
