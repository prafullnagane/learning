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

import de.hybris.platform.solrfacetsearch.dto.config.SolrSearchConfigDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrSearchConfig first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrsearchconfigs")
public class SolrSearchConfigsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrSearchConfigDTO*/
	private List<SolrSearchConfigDTO>  solrsearchconfigsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSearchConfigsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSearchConfigsDTO(final List<SolrSearchConfigDTO> solrsearchconfigsList)
	{
		super();
		this.solrsearchconfigsList=solrsearchconfigsList;
	}
	
	
	/**
	 * @return the solrsearchconfigs
	 */
	@XmlElement(name = "solrsearchconfig")
	public List<SolrSearchConfigDTO> getSolrSearchConfigs()
	{
		return	solrsearchconfigsList;
	}
	
	/**
	 * @param solrsearchconfigsList 
	 *  the solrsearchconfigsList to set   
	 */
	public void setSolrSearchConfigs(final List<SolrSearchConfigDTO> solrsearchconfigsList)
	{
		this.solrsearchconfigsList=solrsearchconfigsList;
	}
	
}
