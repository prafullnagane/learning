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

import de.hybris.platform.acceleratorcms.dto.components.SimpleBannerComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SimpleBannerComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@XmlRootElement(name = "simplebannercomponents")
public class SimpleBannerComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SimpleBannerComponentDTO*/
	private List<SimpleBannerComponentDTO>  simplebannercomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleBannerComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleBannerComponentsDTO(final List<SimpleBannerComponentDTO> simplebannercomponentsList)
	{
		super();
		this.simplebannercomponentsList=simplebannercomponentsList;
	}
	
	
	/**
	 * @return the simplebannercomponents
	 */
	@XmlElement(name = "simplebannercomponent")
	public List<SimpleBannerComponentDTO> getSimpleBannerComponents()
	{
		return	simplebannercomponentsList;
	}
	
	/**
	 * @param simplebannercomponentsList 
	 *  the simplebannercomponentsList to set   
	 */
	public void setSimpleBannerComponents(final List<SimpleBannerComponentDTO> simplebannercomponentsList)
	{
		this.simplebannercomponentsList=simplebannercomponentsList;
	}
	
}
