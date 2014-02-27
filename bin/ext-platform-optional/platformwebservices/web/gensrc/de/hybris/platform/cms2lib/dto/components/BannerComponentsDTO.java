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

import de.hybris.platform.cms2lib.dto.components.BannerComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BannerComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@XmlRootElement(name = "bannercomponents")
public class BannerComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BannerComponentDTO*/
	private List<BannerComponentDTO>  bannercomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BannerComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BannerComponentsDTO(final List<BannerComponentDTO> bannercomponentsList)
	{
		super();
		this.bannercomponentsList=bannercomponentsList;
	}
	
	
	/**
	 * @return the bannercomponents
	 */
	@XmlElement(name = "bannercomponent")
	public List<BannerComponentDTO> getBannerComponents()
	{
		return	bannercomponentsList;
	}
	
	/**
	 * @param bannercomponentsList 
	 *  the bannercomponentsList to set   
	 */
	public void setBannerComponents(final List<BannerComponentDTO> bannercomponentsList)
	{
		this.bannercomponentsList=bannercomponentsList;
	}
	
}
