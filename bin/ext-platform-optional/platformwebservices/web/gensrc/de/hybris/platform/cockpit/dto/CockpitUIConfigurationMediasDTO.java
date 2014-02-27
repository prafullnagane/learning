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

import de.hybris.platform.cockpit.dto.CockpitUIConfigurationMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitUIConfigurationMedia first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpituiconfigurationmedias")
public class CockpitUIConfigurationMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitUIConfigurationMediaDTO*/
	private List<CockpitUIConfigurationMediaDTO>  cockpituiconfigurationmediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIConfigurationMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIConfigurationMediasDTO(final List<CockpitUIConfigurationMediaDTO> cockpituiconfigurationmediasList)
	{
		super();
		this.cockpituiconfigurationmediasList=cockpituiconfigurationmediasList;
	}
	
	
	/**
	 * @return the cockpituiconfigurationmedias
	 */
	@XmlElement(name = "cockpituiconfigurationmedia")
	public List<CockpitUIConfigurationMediaDTO> getCockpitUIConfigurationMedias()
	{
		return	cockpituiconfigurationmediasList;
	}
	
	/**
	 * @param cockpituiconfigurationmediasList 
	 *  the cockpituiconfigurationmediasList to set   
	 */
	public void setCockpitUIConfigurationMedias(final List<CockpitUIConfigurationMediaDTO> cockpituiconfigurationmediasList)
	{
		this.cockpituiconfigurationmediasList=cockpituiconfigurationmediasList;
	}
	
}
