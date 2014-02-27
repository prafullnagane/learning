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

import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedPropertyDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrIndexedProperty first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrindexedproperties")
public class SolrIndexedPropertiesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrIndexedPropertyDTO*/
	private List<SolrIndexedPropertyDTO>  solrindexedpropertiesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedPropertiesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedPropertiesDTO(final List<SolrIndexedPropertyDTO> solrindexedpropertiesList)
	{
		super();
		this.solrindexedpropertiesList=solrindexedpropertiesList;
	}
	
	
	/**
	 * @return the solrindexedproperties
	 */
	@XmlElement(name = "solrindexedproperty")
	public List<SolrIndexedPropertyDTO> getSolrIndexedProperties()
	{
		return	solrindexedpropertiesList;
	}
	
	/**
	 * @param solrindexedpropertiesList 
	 *  the solrindexedpropertiesList to set   
	 */
	public void setSolrIndexedProperties(final List<SolrIndexedPropertyDTO> solrindexedpropertiesList)
	{
		this.solrindexedpropertiesList=solrindexedpropertiesList;
	}
	
}
