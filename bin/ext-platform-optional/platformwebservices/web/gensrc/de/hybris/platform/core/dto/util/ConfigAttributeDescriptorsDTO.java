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
package de.hybris.platform.core.dto.util;

import de.hybris.platform.core.dto.util.ConfigAttributeDescriptorDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ConfigAttributeDescriptor first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "configattributedescriptors")
public class ConfigAttributeDescriptorsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ConfigAttributeDescriptorDTO*/
	private List<ConfigAttributeDescriptorDTO>  configattributedescriptorsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConfigAttributeDescriptorsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConfigAttributeDescriptorsDTO(final List<ConfigAttributeDescriptorDTO> configattributedescriptorsList)
	{
		super();
		this.configattributedescriptorsList=configattributedescriptorsList;
	}
	
	
	/**
	 * @return the configattributedescriptors
	 */
	@XmlElement(name = "configattributedescriptor")
	public List<ConfigAttributeDescriptorDTO> getConfigAttributeDescriptors()
	{
		return	configattributedescriptorsList;
	}
	
	/**
	 * @param configattributedescriptorsList 
	 *  the configattributedescriptorsList to set   
	 */
	public void setConfigAttributeDescriptors(final List<ConfigAttributeDescriptorDTO> configattributedescriptorsList)
	{
		this.configattributedescriptorsList=configattributedescriptorsList;
	}
	
}