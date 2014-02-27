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
package de.hybris.platform.ldap.dto;

import de.hybris.platform.ldap.dto.ConfigurationMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ConfigurationMedia first defined at extension ldap
 */
@SuppressWarnings("all")
@XmlRootElement(name = "configurationmedias")
public class ConfigurationMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ConfigurationMediaDTO*/
	private List<ConfigurationMediaDTO>  configurationmediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConfigurationMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConfigurationMediasDTO(final List<ConfigurationMediaDTO> configurationmediasList)
	{
		super();
		this.configurationmediasList=configurationmediasList;
	}
	
	
	/**
	 * @return the configurationmedias
	 */
	@XmlElement(name = "configurationmedia")
	public List<ConfigurationMediaDTO> getConfigurationMedias()
	{
		return	configurationmediasList;
	}
	
	/**
	 * @param configurationmediasList 
	 *  the configurationmediasList to set   
	 */
	public void setConfigurationMedias(final List<ConfigurationMediaDTO> configurationmediasList)
	{
		this.configurationmediasList=configurationmediasList;
	}
	
}
