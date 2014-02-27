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
package de.hybris.platform.mcc.dto;

import de.hybris.platform.mcc.dto.StaticLinkDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type StaticLink first defined at extension mcc
 */
@SuppressWarnings("all")
@XmlRootElement(name = "staticlinks")
public class StaticLinksDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>StaticLinkDTO*/
	private List<StaticLinkDTO>  staticlinksList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StaticLinksDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StaticLinksDTO(final List<StaticLinkDTO> staticlinksList)
	{
		super();
		this.staticlinksList=staticlinksList;
	}
	
	
	/**
	 * @return the staticlinks
	 */
	@XmlElement(name = "staticlink")
	public List<StaticLinkDTO> getStaticLinks()
	{
		return	staticlinksList;
	}
	
	/**
	 * @param staticlinksList 
	 *  the staticlinksList to set   
	 */
	public void setStaticLinks(final List<StaticLinkDTO> staticlinksList)
	{
		this.staticlinksList=staticlinksList;
	}
	
}
