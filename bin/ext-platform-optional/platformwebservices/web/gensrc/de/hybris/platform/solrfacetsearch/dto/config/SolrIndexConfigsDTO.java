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

import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexConfigDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrIndexConfig first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrindexconfigs")
public class SolrIndexConfigsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrIndexConfigDTO*/
	private List<SolrIndexConfigDTO>  solrindexconfigsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexConfigsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexConfigsDTO(final List<SolrIndexConfigDTO> solrindexconfigsList)
	{
		super();
		this.solrindexconfigsList=solrindexconfigsList;
	}
	
	
	/**
	 * @return the solrindexconfigs
	 */
	@XmlElement(name = "solrindexconfig")
	public List<SolrIndexConfigDTO> getSolrIndexConfigs()
	{
		return	solrindexconfigsList;
	}
	
	/**
	 * @param solrindexconfigsList 
	 *  the solrindexconfigsList to set   
	 */
	public void setSolrIndexConfigs(final List<SolrIndexConfigDTO> solrindexconfigsList)
	{
		this.solrindexconfigsList=solrindexconfigsList;
	}
	
}