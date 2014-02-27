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

import de.hybris.platform.cockpit.dto.CockpitUIScriptConfigMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitUIScriptConfigMedia first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpituiscriptconfigmedias")
public class CockpitUIScriptConfigMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitUIScriptConfigMediaDTO*/
	private List<CockpitUIScriptConfigMediaDTO>  cockpituiscriptconfigmediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIScriptConfigMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIScriptConfigMediasDTO(final List<CockpitUIScriptConfigMediaDTO> cockpituiscriptconfigmediasList)
	{
		super();
		this.cockpituiscriptconfigmediasList=cockpituiscriptconfigmediasList;
	}
	
	
	/**
	 * @return the cockpituiscriptconfigmedias
	 */
	@XmlElement(name = "cockpituiscriptconfigmedia")
	public List<CockpitUIScriptConfigMediaDTO> getCockpitUIScriptConfigMedias()
	{
		return	cockpituiscriptconfigmediasList;
	}
	
	/**
	 * @param cockpituiscriptconfigmediasList 
	 *  the cockpituiscriptconfigmediasList to set   
	 */
	public void setCockpitUIScriptConfigMedias(final List<CockpitUIScriptConfigMediaDTO> cockpituiscriptconfigmediasList)
	{
		this.cockpituiscriptconfigmediasList=cockpituiscriptconfigmediasList;
	}
	
}
