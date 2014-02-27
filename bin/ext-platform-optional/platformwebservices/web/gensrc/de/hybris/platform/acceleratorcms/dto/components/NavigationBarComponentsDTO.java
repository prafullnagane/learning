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

import de.hybris.platform.acceleratorcms.dto.components.NavigationBarComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type NavigationBarComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@XmlRootElement(name = "navigationbarcomponents")
public class NavigationBarComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>NavigationBarComponentDTO*/
	private List<NavigationBarComponentDTO>  navigationbarcomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NavigationBarComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NavigationBarComponentsDTO(final List<NavigationBarComponentDTO> navigationbarcomponentsList)
	{
		super();
		this.navigationbarcomponentsList=navigationbarcomponentsList;
	}
	
	
	/**
	 * @return the navigationbarcomponents
	 */
	@XmlElement(name = "navigationbarcomponent")
	public List<NavigationBarComponentDTO> getNavigationBarComponents()
	{
		return	navigationbarcomponentsList;
	}
	
	/**
	 * @param navigationbarcomponentsList 
	 *  the navigationbarcomponentsList to set   
	 */
	public void setNavigationBarComponents(final List<NavigationBarComponentDTO> navigationbarcomponentsList)
	{
		this.navigationbarcomponentsList=navigationbarcomponentsList;
	}
	
}
