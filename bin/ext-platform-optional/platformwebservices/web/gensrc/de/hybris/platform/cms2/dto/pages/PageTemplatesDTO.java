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

import de.hybris.platform.cms2.dto.pages.PageTemplateDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PageTemplate first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "pagetemplates")
public class PageTemplatesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PageTemplateDTO*/
	private List<PageTemplateDTO>  pagetemplatesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PageTemplatesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PageTemplatesDTO(final List<PageTemplateDTO> pagetemplatesList)
	{
		super();
		this.pagetemplatesList=pagetemplatesList;
	}
	
	
	/**
	 * @return the pagetemplates
	 */
	@XmlElement(name = "pagetemplate")
	public List<PageTemplateDTO> getPageTemplates()
	{
		return	pagetemplatesList;
	}
	
	/**
	 * @param pagetemplatesList 
	 *  the pagetemplatesList to set   
	 */
	public void setPageTemplates(final List<PageTemplateDTO> pagetemplatesList)
	{
		this.pagetemplatesList=pagetemplatesList;
	}
	
}
