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

import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Media first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "medias")
public class MediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MediaDTO*/
	private List<MediaDTO>  mediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediasDTO(final List<MediaDTO> mediasList)
	{
		super();
		this.mediasList=mediasList;
	}
	
	
	/**
	 * @return the medias
	 */
	@XmlElement(name = "media")
	public List<MediaDTO> getMedias()
	{
		return	mediasList;
	}
	
	/**
	 * @param mediasList 
	 *  the mediasList to set   
	 */
	public void setMedias(final List<MediaDTO> mediasList)
	{
		this.mediasList=mediasList;
	}
	
}
