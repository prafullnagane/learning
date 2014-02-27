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

import de.hybris.platform.solrfacetsearch.dto.config.SolrValueRangeSetDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrValueRangeSet first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrvaluerangesets")
public class SolrValueRangeSetsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrValueRangeSetDTO*/
	private List<SolrValueRangeSetDTO>  solrvaluerangesetsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrValueRangeSetsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrValueRangeSetsDTO(final List<SolrValueRangeSetDTO> solrvaluerangesetsList)
	{
		super();
		this.solrvaluerangesetsList=solrvaluerangesetsList;
	}
	
	
	/**
	 * @return the solrvaluerangesets
	 */
	@XmlElement(name = "solrvaluerangeset")
	public List<SolrValueRangeSetDTO> getSolrValueRangeSets()
	{
		return	solrvaluerangesetsList;
	}
	
	/**
	 * @param solrvaluerangesetsList 
	 *  the solrvaluerangesetsList to set   
	 */
	public void setSolrValueRangeSets(final List<SolrValueRangeSetDTO> solrvaluerangesetsList)
	{
		this.solrvaluerangesetsList=solrvaluerangesetsList;
	}
	
}
