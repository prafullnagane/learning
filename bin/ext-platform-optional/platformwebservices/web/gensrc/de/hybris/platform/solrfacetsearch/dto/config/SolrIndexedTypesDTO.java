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

import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrIndexedType first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrindexedtypes")
public class SolrIndexedTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrIndexedTypeDTO*/
	private List<SolrIndexedTypeDTO>  solrindexedtypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedTypesDTO(final List<SolrIndexedTypeDTO> solrindexedtypesList)
	{
		super();
		this.solrindexedtypesList=solrindexedtypesList;
	}
	
	
	/**
	 * @return the solrindexedtypes
	 */
	@XmlElement(name = "solrindexedtype")
	public List<SolrIndexedTypeDTO> getSolrIndexedTypes()
	{
		return	solrindexedtypesList;
	}
	
	/**
	 * @param solrindexedtypesList 
	 *  the solrindexedtypesList to set   
	 */
	public void setSolrIndexedTypes(final List<SolrIndexedTypeDTO> solrindexedtypesList)
	{
		this.solrindexedtypesList=solrindexedtypesList;
	}
	
}
