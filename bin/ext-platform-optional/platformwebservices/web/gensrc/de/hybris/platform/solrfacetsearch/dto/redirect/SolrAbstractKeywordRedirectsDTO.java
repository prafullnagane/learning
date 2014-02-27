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

import de.hybris.platform.solrfacetsearch.dto.redirect.SolrAbstractKeywordRedirectDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrAbstractKeywordRedirect first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrabstractkeywordredirects")
public class SolrAbstractKeywordRedirectsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrAbstractKeywordRedirectDTO*/
	private List<SolrAbstractKeywordRedirectDTO>  solrabstractkeywordredirectsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrAbstractKeywordRedirectsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrAbstractKeywordRedirectsDTO(final List<SolrAbstractKeywordRedirectDTO> solrabstractkeywordredirectsList)
	{
		super();
		this.solrabstractkeywordredirectsList=solrabstractkeywordredirectsList;
	}
	
	
	/**
	 * @return the solrabstractkeywordredirects
	 */
	@XmlElement(name = "solrabstractkeywordredirect")
	public List<SolrAbstractKeywordRedirectDTO> getSolrAbstractKeywordRedirects()
	{
		return	solrabstractkeywordredirectsList;
	}
	
	/**
	 * @param solrabstractkeywordredirectsList 
	 *  the solrabstractkeywordredirectsList to set   
	 */
	public void setSolrAbstractKeywordRedirects(final List<SolrAbstractKeywordRedirectDTO> solrabstractkeywordredirectsList)
	{
		this.solrabstractkeywordredirectsList=solrabstractkeywordredirectsList;
	}
	
}
