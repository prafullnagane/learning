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

import de.hybris.platform.cockpit.dto.CockpitUIComponentConfigurationDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitUIComponentConfiguration first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpituicomponentconfigurations")
public class CockpitUIComponentConfigurationsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitUIComponentConfigurationDTO*/
	private List<CockpitUIComponentConfigurationDTO>  cockpituicomponentconfigurationsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIComponentConfigurationsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIComponentConfigurationsDTO(final List<CockpitUIComponentConfigurationDTO> cockpituicomponentconfigurationsList)
	{
		super();
		this.cockpituicomponentconfigurationsList=cockpituicomponentconfigurationsList;
	}
	
	
	/**
	 * @return the cockpituicomponentconfigurations
	 */
	@XmlElement(name = "cockpituicomponentconfiguration")
	public List<CockpitUIComponentConfigurationDTO> getCockpitUIComponentConfigurations()
	{
		return	cockpituicomponentconfigurationsList;
	}
	
	/**
	 * @param cockpituicomponentconfigurationsList 
	 *  the cockpituicomponentconfigurationsList to set   
	 */
	public void setCockpitUIComponentConfigurations(final List<CockpitUIComponentConfigurationDTO> cockpituicomponentconfigurationsList)
	{
		this.cockpituicomponentconfigurationsList=cockpituicomponentconfigurationsList;
	}
	
}
