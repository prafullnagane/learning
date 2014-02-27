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
package de.hybris.platform.core.dto.user;

import de.hybris.platform.core.dto.user.TitleDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Title first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "titles")
public class TitlesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TitleDTO*/
	private List<TitleDTO>  titlesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TitlesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TitlesDTO(final List<TitleDTO> titlesList)
	{
		super();
		this.titlesList=titlesList;
	}
	
	
	/**
	 * @return the titles
	 */
	@XmlElement(name = "title")
	public List<TitleDTO> getTitles()
	{
		return	titlesList;
	}
	
	/**
	 * @param titlesList 
	 *  the titlesList to set   
	 */
	public void setTitles(final List<TitleDTO> titlesList)
	{
		this.titlesList=titlesList;
	}
	
}
