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

import de.hybris.platform.acceleratorcms.dto.components.FooterComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type FooterComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@XmlRootElement(name = "footercomponents")
public class FooterComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>FooterComponentDTO*/
	private List<FooterComponentDTO>  footercomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FooterComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FooterComponentsDTO(final List<FooterComponentDTO> footercomponentsList)
	{
		super();
		this.footercomponentsList=footercomponentsList;
	}
	
	
	/**
	 * @return the footercomponents
	 */
	@XmlElement(name = "footercomponent")
	public List<FooterComponentDTO> getFooterComponents()
	{
		return	footercomponentsList;
	}
	
	/**
	 * @param footercomponentsList 
	 *  the footercomponentsList to set   
	 */
	public void setFooterComponents(final List<FooterComponentDTO> footercomponentsList)
	{
		this.footercomponentsList=footercomponentsList;
	}
	
}
