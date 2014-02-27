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
package de.hybris.platform.cms2.dto.contents.contentslot;

import de.hybris.platform.cms2.dto.contents.contentslot.ContentSlotDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ContentSlot first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "contentslots")
public class ContentSlotsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ContentSlotDTO*/
	private List<ContentSlotDTO>  contentslotsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotsDTO(final List<ContentSlotDTO> contentslotsList)
	{
		super();
		this.contentslotsList=contentslotsList;
	}
	
	
	/**
	 * @return the contentslots
	 */
	@XmlElement(name = "contentslot")
	public List<ContentSlotDTO> getContentSlots()
	{
		return	contentslotsList;
	}
	
	/**
	 * @param contentslotsList 
	 *  the contentslotsList to set   
	 */
	public void setContentSlots(final List<ContentSlotDTO> contentslotsList)
	{
		this.contentslotsList=contentslotsList;
	}
	
}
