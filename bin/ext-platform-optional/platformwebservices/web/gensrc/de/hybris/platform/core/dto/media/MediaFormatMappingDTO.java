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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaContextDTO;
import de.hybris.platform.core.dto.media.MediaFormatDTO;
import de.hybris.platform.core.model.media.MediaFormatMappingModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type MediaFormatMapping first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = MediaFormatMappingModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "mediaformatmapping")
public class MediaFormatMappingDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>MediaFormatMapping.mediaContext</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaContextDTO _mediaContext;
	/** <i>Generated variable</i> - Variable of <code>MediaFormatMapping.target</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaFormatDTO _target;
	/** <i>Generated variable</i> - Variable of <code>MediaFormatMapping.source</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaFormatDTO _source;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaFormatMappingDTO()
	{
		super();
	}
	
	
	public MediaContextDTO getMediaContext()
	{
		return this._mediaContext;
	}
	
	public MediaFormatDTO getSource()
	{
		return this._source;
	}
	
	public MediaFormatDTO getTarget()
	{
		return this._target;
	}
	
	public void setMediaContext(final MediaContextDTO value)
	{
		this.modifiedPropsSet.add("mediaContext");
		this._mediaContext = value;
	}
	
	public void setSource(final MediaFormatDTO value)
	{
		this.modifiedPropsSet.add("source");
		this._source = value;
	}
	
	public void setTarget(final MediaFormatDTO value)
	{
		this.modifiedPropsSet.add("target");
		this._target = value;
	}
	
}
