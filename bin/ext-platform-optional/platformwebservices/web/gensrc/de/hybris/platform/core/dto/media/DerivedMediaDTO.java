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
package de.hybris.platform.core.dto.media;

import de.hybris.platform.core.dto.media.AbstractMediaDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.model.media.DerivedMediaModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DerivedMedia first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = DerivedMediaModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "derivedmedia")
public class DerivedMediaDTO extends AbstractMediaDTO
{
	/** <i>Generated variable</i> - Variable of <code>DerivedMedia.version</code> attribute defined at extension <code> */
	private java.lang.String _version;
	/** <i>Generated variable</i> - Variable of <code>DerivedMedia.media</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _media;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DerivedMediaDTO()
	{
		super();
	}
	
	
	public MediaDTO getMedia()
	{
		return this._media;
	}
	
	public String getVersion()
	{
		return this._version;
	}
	
	public void setMedia(final MediaDTO value)
	{
		this.modifiedPropsSet.add("media");
		this._media = value;
	}
	
	public void setVersion(final String value)
	{
		this.modifiedPropsSet.add("version");
		this._version = value;
	}
	
}
