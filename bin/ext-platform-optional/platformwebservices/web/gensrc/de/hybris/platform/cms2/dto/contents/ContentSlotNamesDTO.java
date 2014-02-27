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
package de.hybris.platform.cms2.dto.contents;

import de.hybris.platform.cms2.dto.contents.ContentSlotNameDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ContentSlotName first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "contentslotnames")
public class ContentSlotNamesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ContentSlotNameDTO*/
	private List<ContentSlotNameDTO>  contentslotnamesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotNamesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotNamesDTO(final List<ContentSlotNameDTO> contentslotnamesList)
	{
		super();
		this.contentslotnamesList=contentslotnamesList;
	}
	
	
	/**
	 * @return the contentslotnames
	 */
	@XmlElement(name = "contentslotname")
	public List<ContentSlotNameDTO> getContentSlotNames()
	{
		return	contentslotnamesList;
	}
	
	/**
	 * @param contentslotnamesList 
	 *  the contentslotnamesList to set   
	 */
	public void setContentSlotNames(final List<ContentSlotNameDTO> contentslotnamesList)
	{
		this.contentslotnamesList=contentslotnamesList;
	}
	
}
