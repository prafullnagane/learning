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
package de.hybris.platform.acceleratorservices.dto.redirect;

import de.hybris.platform.acceleratorservices.dto.redirect.SolrPageRedirectDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrPageRedirect first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrpageredirects")
public class SolrPageRedirectsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrPageRedirectDTO*/
	private List<SolrPageRedirectDTO>  solrpageredirectsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrPageRedirectsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrPageRedirectsDTO(final List<SolrPageRedirectDTO> solrpageredirectsList)
	{
		super();
		this.solrpageredirectsList=solrpageredirectsList;
	}
	
	
	/**
	 * @return the solrpageredirects
	 */
	@XmlElement(name = "solrpageredirect")
	public List<SolrPageRedirectDTO> getSolrPageRedirects()
	{
		return	solrpageredirectsList;
	}
	
	/**
	 * @param solrpageredirectsList 
	 *  the solrpageredirectsList to set   
	 */
	public void setSolrPageRedirects(final List<SolrPageRedirectDTO> solrpageredirectsList)
	{
		this.solrpageredirectsList=solrpageredirectsList;
	}
	
}