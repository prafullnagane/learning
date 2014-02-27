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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.dto.CockpitUIComponentAccessRightDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitUIComponentAccessRight first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpituicomponentaccessrights")
public class CockpitUIComponentAccessRightsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitUIComponentAccessRightDTO*/
	private List<CockpitUIComponentAccessRightDTO>  cockpituicomponentaccessrightsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIComponentAccessRightsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIComponentAccessRightsDTO(final List<CockpitUIComponentAccessRightDTO> cockpituicomponentaccessrightsList)
	{
		super();
		this.cockpituicomponentaccessrightsList=cockpituicomponentaccessrightsList;
	}
	
	
	/**
	 * @return the cockpituicomponentaccessrights
	 */
	@XmlElement(name = "cockpituicomponentaccessright")
	public List<CockpitUIComponentAccessRightDTO> getCockpitUIComponentAccessRights()
	{
		return	cockpituicomponentaccessrightsList;
	}
	
	/**
	 * @param cockpituicomponentaccessrightsList 
	 *  the cockpituicomponentaccessrightsList to set   
	 */
	public void setCockpitUIComponentAccessRights(final List<CockpitUIComponentAccessRightDTO> cockpituicomponentaccessrightsList)
	{
		this.cockpituicomponentaccessrightsList=cockpituicomponentaccessrightsList;
	}
	
}
