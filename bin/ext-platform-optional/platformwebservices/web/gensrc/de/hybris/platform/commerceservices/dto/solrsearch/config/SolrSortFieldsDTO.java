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
package de.hybris.platform.commerceservices.dto.solrsearch.config;

import de.hybris.platform.commerceservices.dto.solrsearch.config.SolrSortFieldDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrSortField first defined at extension commerceservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrsortfields")
public class SolrSortFieldsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrSortFieldDTO*/
	private List<SolrSortFieldDTO>  solrsortfieldsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSortFieldsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSortFieldsDTO(final List<SolrSortFieldDTO> solrsortfieldsList)
	{
		super();
		this.solrsortfieldsList=solrsortfieldsList;
	}
	
	
	/**
	 * @return the solrsortfields
	 */
	@XmlElement(name = "solrsortfield")
	public List<SolrSortFieldDTO> getSolrSortFields()
	{
		return	solrsortfieldsList;
	}
	
	/**
	 * @param solrsortfieldsList 
	 *  the solrsortfieldsList to set   
	 */
	public void setSolrSortFields(final List<SolrSortFieldDTO> solrsortfieldsList)
	{
		this.solrsortfieldsList=solrsortfieldsList;
	}
	
}
