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

import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.solrfacetsearch.dto.redirect.SolrAbstractKeywordRedirectDTO;
import de.hybris.platform.solrfacetsearch.model.redirect.SolrCategoryRedirectModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrCategoryRedirect first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrCategoryRedirectModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "solrcategoryredirect")
public class SolrCategoryRedirectDTO extends SolrAbstractKeywordRedirectDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrCategoryRedirect.redirectItem</code> attribute defined at extension <code> */
	private de.hybris.platform.category.dto.CategoryDTO _redirectItem;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrCategoryRedirectDTO()
	{
		super();
	}
	
	
	public CategoryDTO getRedirectItem()
	{
		return this._redirectItem;
	}
	
	public void setRedirectItem(final CategoryDTO value)
	{
		this.modifiedPropsSet.add("redirectItem");
		this._redirectItem = value;
	}
	
}
