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

import de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSLinkComponent first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmslinkcomponents")
public class CMSLinkComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSLinkComponentDTO*/
	private List<CMSLinkComponentDTO>  cmslinkcomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSLinkComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSLinkComponentsDTO(final List<CMSLinkComponentDTO> cmslinkcomponentsList)
	{
		super();
		this.cmslinkcomponentsList=cmslinkcomponentsList;
	}
	
	
	/**
	 * @return the cmslinkcomponents
	 */
	@XmlElement(name = "cmslinkcomponent")
	public List<CMSLinkComponentDTO> getCMSLinkComponents()
	{
		return	cmslinkcomponentsList;
	}
	
	/**
	 * @param cmslinkcomponentsList 
	 *  the cmslinkcomponentsList to set   
	 */
	public void setCMSLinkComponents(final List<CMSLinkComponentDTO> cmslinkcomponentsList)
	{
		this.cmslinkcomponentsList=cmslinkcomponentsList;
	}
	
}
