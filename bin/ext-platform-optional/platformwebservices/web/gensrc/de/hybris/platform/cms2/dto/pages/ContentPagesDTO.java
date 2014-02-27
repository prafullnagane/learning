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
package de.hybris.platform.cms2.dto.pages;

import de.hybris.platform.cms2.dto.pages.ContentPageDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ContentPage first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "contentpages")
public class ContentPagesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ContentPageDTO*/
	private List<ContentPageDTO>  contentpagesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentPagesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentPagesDTO(final List<ContentPageDTO> contentpagesList)
	{
		super();
		this.contentpagesList=contentpagesList;
	}
	
	
	/**
	 * @return the contentpages
	 */
	@XmlElement(name = "contentpage")
	public List<ContentPageDTO> getContentPages()
	{
		return	contentpagesList;
	}
	
	/**
	 * @param contentpagesList 
	 *  the contentpagesList to set   
	 */
	public void setContentPages(final List<ContentPageDTO> contentpagesList)
	{
		this.contentpagesList=contentpagesList;
	}
	
}
