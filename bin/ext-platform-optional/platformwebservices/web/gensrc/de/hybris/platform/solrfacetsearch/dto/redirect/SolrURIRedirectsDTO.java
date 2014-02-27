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
package de.hybris.platform.solrfacetsearch.dto.redirect;

import de.hybris.platform.solrfacetsearch.dto.redirect.SolrURIRedirectDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrURIRedirect first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solruriredirects")
public class SolrURIRedirectsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrURIRedirectDTO*/
	private List<SolrURIRedirectDTO>  solruriredirectsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrURIRedirectsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrURIRedirectsDTO(final List<SolrURIRedirectDTO> solruriredirectsList)
	{
		super();
		this.solruriredirectsList=solruriredirectsList;
	}
	
	
	/**
	 * @return the solruriredirects
	 */
	@XmlElement(name = "solruriredirect")
	public List<SolrURIRedirectDTO> getSolrURIRedirects()
	{
		return	solruriredirectsList;
	}
	
	/**
	 * @param solruriredirectsList 
	 *  the solruriredirectsList to set   
	 */
	public void setSolrURIRedirects(final List<SolrURIRedirectDTO> solruriredirectsList)
	{
		this.solruriredirectsList=solruriredirectsList;
	}
	
}
