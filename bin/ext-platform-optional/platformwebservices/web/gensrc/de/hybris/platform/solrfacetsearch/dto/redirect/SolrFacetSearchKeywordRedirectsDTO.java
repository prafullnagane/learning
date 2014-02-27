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

import de.hybris.platform.solrfacetsearch.dto.redirect.SolrFacetSearchKeywordRedirectDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrFacetSearchKeywordRedirect first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrfacetsearchkeywordredirects")
public class SolrFacetSearchKeywordRedirectsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrFacetSearchKeywordRedirectDTO*/
	private List<SolrFacetSearchKeywordRedirectDTO>  solrfacetsearchkeywordredirectsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrFacetSearchKeywordRedirectsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrFacetSearchKeywordRedirectsDTO(final List<SolrFacetSearchKeywordRedirectDTO> solrfacetsearchkeywordredirectsList)
	{
		super();
		this.solrfacetsearchkeywordredirectsList=solrfacetsearchkeywordredirectsList;
	}
	
	
	/**
	 * @return the solrfacetsearchkeywordredirects
	 */
	@XmlElement(name = "solrfacetsearchkeywordredirect")
	public List<SolrFacetSearchKeywordRedirectDTO> getSolrFacetSearchKeywordRedirects()
	{
		return	solrfacetsearchkeywordredirectsList;
	}
	
	/**
	 * @param solrfacetsearchkeywordredirectsList 
	 *  the solrfacetsearchkeywordredirectsList to set   
	 */
	public void setSolrFacetSearchKeywordRedirects(final List<SolrFacetSearchKeywordRedirectDTO> solrfacetsearchkeywordredirectsList)
	{
		this.solrfacetsearchkeywordredirectsList=solrfacetsearchkeywordredirectsList;
	}
	
}
