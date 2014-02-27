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
package de.hybris.platform.cms2.dto.relations;

import de.hybris.platform.cms2.dto.relations.ContentSlotForPageDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ContentSlotForPage first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "contentslotforpages")
public class ContentSlotForPagesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ContentSlotForPageDTO*/
	private List<ContentSlotForPageDTO>  contentslotforpagesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotForPagesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotForPagesDTO(final List<ContentSlotForPageDTO> contentslotforpagesList)
	{
		super();
		this.contentslotforpagesList=contentslotforpagesList;
	}
	
	
	/**
	 * @return the contentslotforpages
	 */
	@XmlElement(name = "contentslotforpage")
	public List<ContentSlotForPageDTO> getContentSlotForPages()
	{
		return	contentslotforpagesList;
	}
	
	/**
	 * @param contentslotforpagesList 
	 *  the contentslotforpagesList to set   
	 */
	public void setContentSlotForPages(final List<ContentSlotForPageDTO> contentslotforpagesList)
	{
		this.contentslotforpagesList=contentslotforpagesList;
	}
	
}
