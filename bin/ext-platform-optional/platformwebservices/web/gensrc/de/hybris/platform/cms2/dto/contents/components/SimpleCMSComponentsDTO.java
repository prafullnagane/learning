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
package de.hybris.platform.cms2.dto.contents.components;

import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SimpleCMSComponent first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "simplecmscomponents")
public class SimpleCMSComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SimpleCMSComponentDTO*/
	private List<SimpleCMSComponentDTO>  simplecmscomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleCMSComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleCMSComponentsDTO(final List<SimpleCMSComponentDTO> simplecmscomponentsList)
	{
		super();
		this.simplecmscomponentsList=simplecmscomponentsList;
	}
	
	
	/**
	 * @return the simplecmscomponents
	 */
	@XmlElement(name = "simplecmscomponent")
	public List<SimpleCMSComponentDTO> getSimpleCMSComponents()
	{
		return	simplecmscomponentsList;
	}
	
	/**
	 * @param simplecmscomponentsList 
	 *  the simplecmscomponentsList to set   
	 */
	public void setSimpleCMSComponents(final List<SimpleCMSComponentDTO> simplecmscomponentsList)
	{
		this.simplecmscomponentsList=simplecmscomponentsList;
	}
	
}
