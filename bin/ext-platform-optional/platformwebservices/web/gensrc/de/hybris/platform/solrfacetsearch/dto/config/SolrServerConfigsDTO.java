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

import de.hybris.platform.solrfacetsearch.dto.config.SolrServerConfigDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrServerConfig first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrserverconfigs")
public class SolrServerConfigsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrServerConfigDTO*/
	private List<SolrServerConfigDTO>  solrserverconfigsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrServerConfigsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrServerConfigsDTO(final List<SolrServerConfigDTO> solrserverconfigsList)
	{
		super();
		this.solrserverconfigsList=solrserverconfigsList;
	}
	
	
	/**
	 * @return the solrserverconfigs
	 */
	@XmlElement(name = "solrserverconfig")
	public List<SolrServerConfigDTO> getSolrServerConfigs()
	{
		return	solrserverconfigsList;
	}
	
	/**
	 * @param solrserverconfigsList 
	 *  the solrserverconfigsList to set   
	 */
	public void setSolrServerConfigs(final List<SolrServerConfigDTO> solrserverconfigsList)
	{
		this.solrserverconfigsList=solrserverconfigsList;
	}
	
}
