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

import de.hybris.platform.core.dto.media.MediaFormatMappingDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MediaFormatMapping first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "mediaformatmappings")
public class MediaFormatMappingsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MediaFormatMappingDTO*/
	private List<MediaFormatMappingDTO>  mediaformatmappingsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaFormatMappingsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaFormatMappingsDTO(final List<MediaFormatMappingDTO> mediaformatmappingsList)
	{
		super();
		this.mediaformatmappingsList=mediaformatmappingsList;
	}
	
	
	/**
	 * @return the mediaformatmappings
	 */
	@XmlElement(name = "mediaformatmapping")
	public List<MediaFormatMappingDTO> getMediaFormatMappings()
	{
		return	mediaformatmappingsList;
	}
	
	/**
	 * @param mediaformatmappingsList 
	 *  the mediaformatmappingsList to set   
	 */
	public void setMediaFormatMappings(final List<MediaFormatMappingDTO> mediaformatmappingsList)
	{
		this.mediaformatmappingsList=mediaformatmappingsList;
	}
	
}
