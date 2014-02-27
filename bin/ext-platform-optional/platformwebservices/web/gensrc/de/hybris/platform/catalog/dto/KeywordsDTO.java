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

import de.hybris.platform.catalog.dto.KeywordDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Keyword first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "keywords")
public class KeywordsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>KeywordDTO*/
	private List<KeywordDTO>  keywordsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public KeywordsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public KeywordsDTO(final List<KeywordDTO> keywordsList)
	{
		super();
		this.keywordsList=keywordsList;
	}
	
	
	/**
	 * @return the keywords
	 */
	@XmlElement(name = "keyword")
	public List<KeywordDTO> getKeywords()
	{
		return	keywordsList;
	}
	
	/**
	 * @param keywordsList 
	 *  the keywordsList to set   
	 */
	public void setKeywords(final List<KeywordDTO> keywordsList)
	{
		this.keywordsList=keywordsList;
	}
	
}
