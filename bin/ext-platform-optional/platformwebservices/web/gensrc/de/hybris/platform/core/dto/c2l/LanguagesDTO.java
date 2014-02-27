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
package de.hybris.platform.core.dto.c2l;

import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Language first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "languages")
public class LanguagesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>LanguageDTO*/
	private List<LanguageDTO>  languagesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LanguagesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LanguagesDTO(final List<LanguageDTO> languagesList)
	{
		super();
		this.languagesList=languagesList;
	}
	
	
	/**
	 * @return the languages
	 */
	@XmlElement(name = "language")
	public List<LanguageDTO> getLanguages()
	{
		return	languagesList;
	}
	
	/**
	 * @param languagesList 
	 *  the languagesList to set   
	 */
	public void setLanguages(final List<LanguageDTO> languagesList)
	{
		this.languagesList=languagesList;
	}
	
}
