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

import de.hybris.platform.mcc.dto.DynamicLinkDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DynamicLink first defined at extension mcc
 */
@SuppressWarnings("all")
@XmlRootElement(name = "dynamiclinks")
public class DynamicLinksDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DynamicLinkDTO*/
	private List<DynamicLinkDTO>  dynamiclinksList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicLinksDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicLinksDTO(final List<DynamicLinkDTO> dynamiclinksList)
	{
		super();
		this.dynamiclinksList=dynamiclinksList;
	}
	
	
	/**
	 * @return the dynamiclinks
	 */
	@XmlElement(name = "dynamiclink")
	public List<DynamicLinkDTO> getDynamicLinks()
	{
		return	dynamiclinksList;
	}
	
	/**
	 * @param dynamiclinksList 
	 *  the dynamiclinksList to set   
	 */
	public void setDynamicLinks(final List<DynamicLinkDTO> dynamiclinksList)
	{
		this.dynamiclinksList=dynamiclinksList;
	}
	
}
