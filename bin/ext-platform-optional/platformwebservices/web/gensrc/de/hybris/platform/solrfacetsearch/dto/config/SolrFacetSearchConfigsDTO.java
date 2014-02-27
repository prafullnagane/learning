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

import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrFacetSearchConfig first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrfacetsearchconfigs")
public class SolrFacetSearchConfigsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrFacetSearchConfigDTO*/
	private List<SolrFacetSearchConfigDTO>  solrfacetsearchconfigsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrFacetSearchConfigsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrFacetSearchConfigsDTO(final List<SolrFacetSearchConfigDTO> solrfacetsearchconfigsList)
	{
		super();
		this.solrfacetsearchconfigsList=solrfacetsearchconfigsList;
	}
	
	
	/**
	 * @return the solrfacetsearchconfigs
	 */
	@XmlElement(name = "solrfacetsearchconfig")
	public List<SolrFacetSearchConfigDTO> getSolrFacetSearchConfigs()
	{
		return	solrfacetsearchconfigsList;
	}
	
	/**
	 * @param solrfacetsearchconfigsList 
	 *  the solrfacetsearchconfigsList to set   
	 */
	public void setSolrFacetSearchConfigs(final List<SolrFacetSearchConfigDTO> solrfacetsearchconfigsList)
	{
		this.solrfacetsearchconfigsList=solrfacetsearchconfigsList;
	}
	
}
