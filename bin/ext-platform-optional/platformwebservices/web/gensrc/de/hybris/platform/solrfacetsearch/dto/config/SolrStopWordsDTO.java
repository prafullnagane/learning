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
package de.hybris.platform.solrfacetsearch.dto.config;

import de.hybris.platform.solrfacetsearch.dto.config.SolrStopWordDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrStopWord first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrstopwords")
public class SolrStopWordsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrStopWordDTO*/
	private List<SolrStopWordDTO>  solrstopwordsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrStopWordsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrStopWordsDTO(final List<SolrStopWordDTO> solrstopwordsList)
	{
		super();
		this.solrstopwordsList=solrstopwordsList;
	}
	
	
	/**
	 * @return the solrstopwords
	 */
	@XmlElement(name = "solrstopword")
	public List<SolrStopWordDTO> getSolrStopWords()
	{
		return	solrstopwordsList;
	}
	
	/**
	 * @param solrstopwordsList 
	 *  the solrstopwordsList to set   
	 */
	public void setSolrStopWords(final List<SolrStopWordDTO> solrstopwordsList)
	{
		this.solrstopwordsList=solrstopwordsList;
	}
	
}
