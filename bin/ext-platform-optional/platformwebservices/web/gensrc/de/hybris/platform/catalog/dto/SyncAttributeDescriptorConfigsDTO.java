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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.SyncAttributeDescriptorConfigDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SyncAttributeDescriptorConfig first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "syncattributedescriptorconfigs")
public class SyncAttributeDescriptorConfigsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SyncAttributeDescriptorConfigDTO*/
	private List<SyncAttributeDescriptorConfigDTO>  syncattributedescriptorconfigsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SyncAttributeDescriptorConfigsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SyncAttributeDescriptorConfigsDTO(final List<SyncAttributeDescriptorConfigDTO> syncattributedescriptorconfigsList)
	{
		super();
		this.syncattributedescriptorconfigsList=syncattributedescriptorconfigsList;
	}
	
	
	/**
	 * @return the syncattributedescriptorconfigs
	 */
	@XmlElement(name = "syncattributedescriptorconfig")
	public List<SyncAttributeDescriptorConfigDTO> getSyncAttributeDescriptorConfigs()
	{
		return	syncattributedescriptorconfigsList;
	}
	
	/**
	 * @param syncattributedescriptorconfigsList 
	 *  the syncattributedescriptorconfigsList to set   
	 */
	public void setSyncAttributeDescriptorConfigs(final List<SyncAttributeDescriptorConfigDTO> syncattributedescriptorconfigsList)
	{
		this.syncattributedescriptorconfigsList=syncattributedescriptorconfigsList;
	}
	
}
