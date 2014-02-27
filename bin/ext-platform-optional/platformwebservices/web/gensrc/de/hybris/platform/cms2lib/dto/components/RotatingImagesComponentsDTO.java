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

import de.hybris.platform.cms2lib.dto.components.RotatingImagesComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RotatingImagesComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@XmlRootElement(name = "rotatingimagescomponents")
public class RotatingImagesComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RotatingImagesComponentDTO*/
	private List<RotatingImagesComponentDTO>  rotatingimagescomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RotatingImagesComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RotatingImagesComponentsDTO(final List<RotatingImagesComponentDTO> rotatingimagescomponentsList)
	{
		super();
		this.rotatingimagescomponentsList=rotatingimagescomponentsList;
	}
	
	
	/**
	 * @return the rotatingimagescomponents
	 */
	@XmlElement(name = "rotatingimagescomponent")
	public List<RotatingImagesComponentDTO> getRotatingImagesComponents()
	{
		return	rotatingimagescomponentsList;
	}
	
	/**
	 * @param rotatingimagescomponentsList 
	 *  the rotatingimagescomponentsList to set   
	 */
	public void setRotatingImagesComponents(final List<RotatingImagesComponentDTO> rotatingimagescomponentsList)
	{
		this.rotatingimagescomponentsList=rotatingimagescomponentsList;
	}
	
}
