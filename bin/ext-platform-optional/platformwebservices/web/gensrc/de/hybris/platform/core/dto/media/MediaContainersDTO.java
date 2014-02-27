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

import de.hybris.platform.core.dto.media.MediaContainerDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MediaContainer first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "mediacontainers")
public class MediaContainersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MediaContainerDTO*/
	private List<MediaContainerDTO>  mediacontainersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaContainersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaContainersDTO(final List<MediaContainerDTO> mediacontainersList)
	{
		super();
		this.mediacontainersList=mediacontainersList;
	}
	
	
	/**
	 * @return the mediacontainers
	 */
	@XmlElement(name = "mediacontainer")
	public List<MediaContainerDTO> getMediaContainers()
	{
		return	mediacontainersList;
	}
	
	/**
	 * @param mediacontainersList 
	 *  the mediacontainersList to set   
	 */
	public void setMediaContainers(final List<MediaContainerDTO> mediacontainersList)
	{
		this.mediacontainersList=mediacontainersList;
	}
	
}
