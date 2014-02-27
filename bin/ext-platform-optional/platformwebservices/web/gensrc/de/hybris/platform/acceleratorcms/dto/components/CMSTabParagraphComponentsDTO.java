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
package de.hybris.platform.acceleratorcms.dto.components;

import de.hybris.platform.acceleratorcms.dto.components.CMSTabParagraphComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSTabParagraphComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmstabparagraphcomponents")
public class CMSTabParagraphComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSTabParagraphComponentDTO*/
	private List<CMSTabParagraphComponentDTO>  cmstabparagraphcomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSTabParagraphComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSTabParagraphComponentsDTO(final List<CMSTabParagraphComponentDTO> cmstabparagraphcomponentsList)
	{
		super();
		this.cmstabparagraphcomponentsList=cmstabparagraphcomponentsList;
	}
	
	
	/**
	 * @return the cmstabparagraphcomponents
	 */
	@XmlElement(name = "cmstabparagraphcomponent")
	public List<CMSTabParagraphComponentDTO> getCMSTabParagraphComponents()
	{
		return	cmstabparagraphcomponentsList;
	}
	
	/**
	 * @param cmstabparagraphcomponentsList 
	 *  the cmstabparagraphcomponentsList to set   
	 */
	public void setCMSTabParagraphComponents(final List<CMSTabParagraphComponentDTO> cmstabparagraphcomponentsList)
	{
		this.cmstabparagraphcomponentsList=cmstabparagraphcomponentsList;
	}
	
}
