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

import de.hybris.platform.cms2lib.dto.components.FlashComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type FlashComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@XmlRootElement(name = "flashcomponents")
public class FlashComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>FlashComponentDTO*/
	private List<FlashComponentDTO>  flashcomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FlashComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FlashComponentsDTO(final List<FlashComponentDTO> flashcomponentsList)
	{
		super();
		this.flashcomponentsList=flashcomponentsList;
	}
	
	
	/**
	 * @return the flashcomponents
	 */
	@XmlElement(name = "flashcomponent")
	public List<FlashComponentDTO> getFlashComponents()
	{
		return	flashcomponentsList;
	}
	
	/**
	 * @param flashcomponentsList 
	 *  the flashcomponentsList to set   
	 */
	public void setFlashComponents(final List<FlashComponentDTO> flashcomponentsList)
	{
		this.flashcomponentsList=flashcomponentsList;
	}
	
}
