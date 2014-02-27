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

import de.hybris.platform.cms2.dto.contents.components.CMSImageComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSImageComponent first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmsimagecomponents")
public class CMSImageComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSImageComponentDTO*/
	private List<CMSImageComponentDTO>  cmsimagecomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSImageComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSImageComponentsDTO(final List<CMSImageComponentDTO> cmsimagecomponentsList)
	{
		super();
		this.cmsimagecomponentsList=cmsimagecomponentsList;
	}
	
	
	/**
	 * @return the cmsimagecomponents
	 */
	@XmlElement(name = "cmsimagecomponent")
	public List<CMSImageComponentDTO> getCMSImageComponents()
	{
		return	cmsimagecomponentsList;
	}
	
	/**
	 * @param cmsimagecomponentsList 
	 *  the cmsimagecomponentsList to set   
	 */
	public void setCMSImageComponents(final List<CMSImageComponentDTO> cmsimagecomponentsList)
	{
		this.cmsimagecomponentsList=cmsimagecomponentsList;
	}
	
}
