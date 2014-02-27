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

import de.hybris.platform.cms2.dto.relations.ContentSlotForTemplateDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ContentSlotForTemplate first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "contentslotfortemplates")
public class ContentSlotForTemplatesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ContentSlotForTemplateDTO*/
	private List<ContentSlotForTemplateDTO>  contentslotfortemplatesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotForTemplatesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotForTemplatesDTO(final List<ContentSlotForTemplateDTO> contentslotfortemplatesList)
	{
		super();
		this.contentslotfortemplatesList=contentslotfortemplatesList;
	}
	
	
	/**
	 * @return the contentslotfortemplates
	 */
	@XmlElement(name = "contentslotfortemplate")
	public List<ContentSlotForTemplateDTO> getContentSlotForTemplates()
	{
		return	contentslotfortemplatesList;
	}
	
	/**
	 * @param contentslotfortemplatesList 
	 *  the contentslotfortemplatesList to set   
	 */
	public void setContentSlotForTemplates(final List<ContentSlotForTemplateDTO> contentslotfortemplatesList)
	{
		this.contentslotfortemplatesList=contentslotfortemplatesList;
	}
	
}
