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
package de.hybris.platform.cms2.dto;

import de.hybris.platform.cms2.dto.CMSComponentTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSComponentType first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmscomponenttypes")
public class CMSComponentTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSComponentTypeDTO*/
	private List<CMSComponentTypeDTO>  cmscomponenttypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSComponentTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSComponentTypesDTO(final List<CMSComponentTypeDTO> cmscomponenttypesList)
	{
		super();
		this.cmscomponenttypesList=cmscomponenttypesList;
	}
	
	
	/**
	 * @return the cmscomponenttypes
	 */
	@XmlElement(name = "cmscomponenttype")
	public List<CMSComponentTypeDTO> getCMSComponentTypes()
	{
		return	cmscomponenttypesList;
	}
	
	/**
	 * @param cmscomponenttypesList 
	 *  the cmscomponenttypesList to set   
	 */
	public void setCMSComponentTypes(final List<CMSComponentTypeDTO> cmscomponenttypesList)
	{
		this.cmscomponenttypesList=cmscomponenttypesList;
	}
	
}