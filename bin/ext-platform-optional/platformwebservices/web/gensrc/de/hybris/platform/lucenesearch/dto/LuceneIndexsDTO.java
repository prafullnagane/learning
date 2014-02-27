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

import de.hybris.platform.lucenesearch.dto.LuceneIndexDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type LuceneIndex first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "luceneindexs")
public class LuceneIndexsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>LuceneIndexDTO*/
	private List<LuceneIndexDTO>  luceneindexsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LuceneIndexsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LuceneIndexsDTO(final List<LuceneIndexDTO> luceneindexsList)
	{
		super();
		this.luceneindexsList=luceneindexsList;
	}
	
	
	/**
	 * @return the luceneindexs
	 */
	@XmlElement(name = "luceneindex")
	public List<LuceneIndexDTO> getLuceneIndexs()
	{
		return	luceneindexsList;
	}
	
	/**
	 * @param luceneindexsList 
	 *  the luceneindexsList to set   
	 */
	public void setLuceneIndexs(final List<LuceneIndexDTO> luceneindexsList)
	{
		this.luceneindexsList=luceneindexsList;
	}
	
}
