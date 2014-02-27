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
package de.hybris.platform.core.dto.link;

import de.hybris.platform.core.dto.link.LinkDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Link first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "links")
public class LinksDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>LinkDTO*/
	private List<LinkDTO>  linksList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LinksDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LinksDTO(final List<LinkDTO> linksList)
	{
		super();
		this.linksList=linksList;
	}
	
	
	/**
	 * @return the links
	 */
	@XmlElement(name = "link")
	public List<LinkDTO> getLinks()
	{
		return	linksList;
	}
	
	/**
	 * @param linksList 
	 *  the linksList to set   
	 */
	public void setLinks(final List<LinkDTO> linksList)
	{
		this.linksList=linksList;
	}
	
}
