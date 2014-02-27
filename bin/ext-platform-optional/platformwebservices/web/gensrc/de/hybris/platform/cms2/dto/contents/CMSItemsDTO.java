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

import de.hybris.platform.cms2.dto.contents.CMSItemDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSItem first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmsitems")
public class CMSItemsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSItemDTO*/
	private List<CMSItemDTO>  cmsitemsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSItemsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSItemsDTO(final List<CMSItemDTO> cmsitemsList)
	{
		super();
		this.cmsitemsList=cmsitemsList;
	}
	
	
	/**
	 * @return the cmsitems
	 */
	@XmlElement(name = "cmsitem")
	public List<CMSItemDTO> getCMSItems()
	{
		return	cmsitemsList;
	}
	
	/**
	 * @param cmsitemsList 
	 *  the cmsitemsList to set   
	 */
	public void setCMSItems(final List<CMSItemDTO> cmsitemsList)
	{
		this.cmsitemsList=cmsitemsList;
	}
	
}
