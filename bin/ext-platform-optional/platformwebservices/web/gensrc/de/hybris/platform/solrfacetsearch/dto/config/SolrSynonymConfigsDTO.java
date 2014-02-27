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

import de.hybris.platform.solrfacetsearch.dto.config.SolrSynonymConfigDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrSynonymConfig first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrsynonymconfigs")
public class SolrSynonymConfigsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrSynonymConfigDTO*/
	private List<SolrSynonymConfigDTO>  solrsynonymconfigsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSynonymConfigsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSynonymConfigsDTO(final List<SolrSynonymConfigDTO> solrsynonymconfigsList)
	{
		super();
		this.solrsynonymconfigsList=solrsynonymconfigsList;
	}
	
	
	/**
	 * @return the solrsynonymconfigs
	 */
	@XmlElement(name = "solrsynonymconfig")
	public List<SolrSynonymConfigDTO> getSolrSynonymConfigs()
	{
		return	solrsynonymconfigsList;
	}
	
	/**
	 * @param solrsynonymconfigsList 
	 *  the solrsynonymconfigsList to set   
	 */
	public void setSolrSynonymConfigs(final List<SolrSynonymConfigDTO> solrsynonymconfigsList)
	{
		this.solrsynonymconfigsList=solrsynonymconfigsList;
	}
	
}
