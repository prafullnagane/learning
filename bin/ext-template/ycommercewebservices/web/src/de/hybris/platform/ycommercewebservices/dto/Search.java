/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package de.hybris.platform.ycommercewebservices.dto;


import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryData;


/**
 * Wrapper class for SearchQuery and Pageable - used by REST client to POST to search method for a detailed search.
 */
public class Search
{
	private SolrSearchQueryData searchQuery = null;
	private PageableData pageableData = null;

	public SolrSearchQueryData getSearchQuery()
	{
		return searchQuery;
	}

	public void setSearchQuery(final SolrSearchQueryData searchQuery)
	{
		this.searchQuery = searchQuery;
	}

	public PageableData getPageableData()
	{
		return pageableData;
	}

	public void setPageableData(final PageableData pageableData)
	{
		this.pageableData = pageableData;
	}



}
