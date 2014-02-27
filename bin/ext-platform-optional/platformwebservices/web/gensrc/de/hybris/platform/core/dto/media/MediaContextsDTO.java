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

import de.hybris.platform.core.dto.media.MediaContextDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MediaContext first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "mediacontexts")
public class MediaContextsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MediaContextDTO*/
	private List<MediaContextDTO>  mediacontextsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaContextsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaContextsDTO(final List<MediaContextDTO> mediacontextsList)
	{
		super();
		this.mediacontextsList=mediacontextsList;
	}
	
	
	/**
	 * @return the mediacontexts
	 */
	@XmlElement(name = "mediacontext")
	public List<MediaContextDTO> getMediaContexts()
	{
		return	mediacontextsList;
	}
	
	/**
	 * @param mediacontextsList 
	 *  the mediacontextsList to set   
	 */
	public void setMediaContexts(final List<MediaContextDTO> mediacontextsList)
	{
		this.mediacontextsList=mediacontextsList;
	}
	
}
