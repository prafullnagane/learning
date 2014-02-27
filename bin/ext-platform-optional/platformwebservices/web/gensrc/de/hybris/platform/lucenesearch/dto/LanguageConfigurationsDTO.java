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

import de.hybris.platform.lucenesearch.dto.LanguageConfigurationDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type LanguageConfiguration first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "languageconfigurations")
public class LanguageConfigurationsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>LanguageConfigurationDTO*/
	private List<LanguageConfigurationDTO>  languageconfigurationsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LanguageConfigurationsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LanguageConfigurationsDTO(final List<LanguageConfigurationDTO> languageconfigurationsList)
	{
		super();
		this.languageconfigurationsList=languageconfigurationsList;
	}
	
	
	/**
	 * @return the languageconfigurations
	 */
	@XmlElement(name = "languageconfiguration")
	public List<LanguageConfigurationDTO> getLanguageConfigurations()
	{
		return	languageconfigurationsList;
	}
	
	/**
	 * @param languageconfigurationsList 
	 *  the languageconfigurationsList to set   
	 */
	public void setLanguageConfigurations(final List<LanguageConfigurationDTO> languageconfigurationsList)
	{
		this.languageconfigurationsList=languageconfigurationsList;
	}
	
}
