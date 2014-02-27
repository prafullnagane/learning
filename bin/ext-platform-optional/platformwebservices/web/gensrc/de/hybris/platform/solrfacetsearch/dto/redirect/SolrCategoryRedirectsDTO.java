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

import de.hybris.platform.solrfacetsearch.dto.redirect.SolrCategoryRedirectDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrCategoryRedirect first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrcategoryredirects")
public class SolrCategoryRedirectsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrCategoryRedirectDTO*/
	private List<SolrCategoryRedirectDTO>  solrcategoryredirectsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrCategoryRedirectsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrCategoryRedirectsDTO(final List<SolrCategoryRedirectDTO> solrcategoryredirectsList)
	{
		super();
		this.solrcategoryredirectsList=solrcategoryredirectsList;
	}
	
	
	/**
	 * @return the solrcategoryredirects
	 */
	@XmlElement(name = "solrcategoryredirect")
	public List<SolrCategoryRedirectDTO> getSolrCategoryRedirects()
	{
		return	solrcategoryredirectsList;
	}
	
	/**
	 * @param solrcategoryredirectsList 
	 *  the solrcategoryredirectsList to set   
	 */
	public void setSolrCategoryRedirects(final List<SolrCategoryRedirectDTO> solrcategoryredirectsList)
	{
		this.solrcategoryredirectsList=solrcategoryredirectsList;
	}
	
}
