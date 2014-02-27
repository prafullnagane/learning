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
package de.hybris.platform.core.dto.type;

import de.hybris.platform.core.dto.type.ConfigProxyMetaTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ConfigProxyMetaType first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "configproxymetatypes")
public class ConfigProxyMetaTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ConfigProxyMetaTypeDTO*/
	private List<ConfigProxyMetaTypeDTO>  configproxymetatypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConfigProxyMetaTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConfigProxyMetaTypesDTO(final List<ConfigProxyMetaTypeDTO> configproxymetatypesList)
	{
		super();
		this.configproxymetatypesList=configproxymetatypesList;
	}
	
	
	/**
	 * @return the configproxymetatypes
	 */
	@XmlElement(name = "configproxymetatype")
	public List<ConfigProxyMetaTypeDTO> getConfigProxyMetaTypes()
	{
		return	configproxymetatypesList;
	}
	
	/**
	 * @param configproxymetatypesList 
	 *  the configproxymetatypesList to set   
	 */
	public void setConfigProxyMetaTypes(final List<ConfigProxyMetaTypeDTO> configproxymetatypesList)
	{
		this.configproxymetatypesList=configproxymetatypesList;
	}
	
}
