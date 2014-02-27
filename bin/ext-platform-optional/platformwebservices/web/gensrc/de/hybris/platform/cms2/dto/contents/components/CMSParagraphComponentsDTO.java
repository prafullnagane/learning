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
package de.hybris.platform.cms2.dto.contents.components;

import de.hybris.platform.cms2.dto.contents.components.CMSParagraphComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSParagraphComponent first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmsparagraphcomponents")
public class CMSParagraphComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSParagraphComponentDTO*/
	private List<CMSParagraphComponentDTO>  cmsparagraphcomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSParagraphComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSParagraphComponentsDTO(final List<CMSParagraphComponentDTO> cmsparagraphcomponentsList)
	{
		super();
		this.cmsparagraphcomponentsList=cmsparagraphcomponentsList;
	}
	
	
	/**
	 * @return the cmsparagraphcomponents
	 */
	@XmlElement(name = "cmsparagraphcomponent")
	public List<CMSParagraphComponentDTO> getCMSParagraphComponents()
	{
		return	cmsparagraphcomponentsList;
	}
	
	/**
	 * @param cmsparagraphcomponentsList 
	 *  the cmsparagraphcomponentsList to set   
	 */
	public void setCMSParagraphComponents(final List<CMSParagraphComponentDTO> cmsparagraphcomponentsList)
	{
		this.cmsparagraphcomponentsList=cmsparagraphcomponentsList;
	}
	
}
