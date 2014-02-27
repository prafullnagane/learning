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

import de.hybris.platform.solrfacetsearch.dto.config.SolrValueRangeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrValueRange first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrvalueranges")
public class SolrValueRangesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrValueRangeDTO*/
	private List<SolrValueRangeDTO>  solrvaluerangesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrValueRangesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrValueRangesDTO(final List<SolrValueRangeDTO> solrvaluerangesList)
	{
		super();
		this.solrvaluerangesList=solrvaluerangesList;
	}
	
	
	/**
	 * @return the solrvalueranges
	 */
	@XmlElement(name = "solrvaluerange")
	public List<SolrValueRangeDTO> getSolrValueRanges()
	{
		return	solrvaluerangesList;
	}
	
	/**
	 * @param solrvaluerangesList 
	 *  the solrvaluerangesList to set   
	 */
	public void setSolrValueRanges(final List<SolrValueRangeDTO> solrvaluerangesList)
	{
		this.solrvaluerangesList=solrvaluerangesList;
	}
	
}
