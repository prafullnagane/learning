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
package de.hybris.platform.lucenesearch.dto;

import de.hybris.platform.lucenesearch.dto.IndexConfigurationDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type IndexConfiguration first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "indexconfigurations")
public class IndexConfigurationsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>IndexConfigurationDTO*/
	private List<IndexConfigurationDTO>  indexconfigurationsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public IndexConfigurationsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public IndexConfigurationsDTO(final List<IndexConfigurationDTO> indexconfigurationsList)
	{
		super();
		this.indexconfigurationsList=indexconfigurationsList;
	}
	
	
	/**
	 * @return the indexconfigurations
	 */
	@XmlElement(name = "indexconfiguration")
	public List<IndexConfigurationDTO> getIndexConfigurations()
	{
		return	indexconfigurationsList;
	}
	
	/**
	 * @param indexconfigurationsList 
	 *  the indexconfigurationsList to set   
	 */
	public void setIndexConfigurations(final List<IndexConfigurationDTO> indexconfigurationsList)
	{
		this.indexconfigurationsList=indexconfigurationsList;
	}
	
}
