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

import de.hybris.platform.acceleratorcms.dto.components.ImageMapComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ImageMapComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@XmlRootElement(name = "imagemapcomponents")
public class ImageMapComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ImageMapComponentDTO*/
	private List<ImageMapComponentDTO>  imagemapcomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImageMapComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImageMapComponentsDTO(final List<ImageMapComponentDTO> imagemapcomponentsList)
	{
		super();
		this.imagemapcomponentsList=imagemapcomponentsList;
	}
	
	
	/**
	 * @return the imagemapcomponents
	 */
	@XmlElement(name = "imagemapcomponent")
	public List<ImageMapComponentDTO> getImageMapComponents()
	{
		return	imagemapcomponentsList;
	}
	
	/**
	 * @param imagemapcomponentsList 
	 *  the imagemapcomponentsList to set   
	 */
	public void setImageMapComponents(final List<ImageMapComponentDTO> imagemapcomponentsList)
	{
		this.imagemapcomponentsList=imagemapcomponentsList;
	}
	
}
