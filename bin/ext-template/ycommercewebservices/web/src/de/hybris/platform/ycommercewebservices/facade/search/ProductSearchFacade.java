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
package de.hybris.platform.ycommercewebservices.facade.search;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.facetdata.FacetSearchPageData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryData;


/**
 * Search facade interface. Its main purpose is to retrieve product search results.
 */
public interface ProductSearchFacade
{
	/**
	 * Initiate a new search using simple free text query.
	 * 
	 * @param text
	 *           the search text
	 * @return the search results
	 */
	FacetSearchPageData<SolrSearchQueryData, ProductData> textSearch(String text);

	/**
	 * Initiate a new search in category.
	 * 
	 * @param categoryCode
	 *           the category to search in
	 * @return the search results
	 */
	FacetSearchPageData<SolrSearchQueryData, ProductData> categorySearch(String categoryCode);

	/**
	 * Refine an exiting search. The query object allows more complex queries using facet selection. The SearchQueryData
	 * must have been obtained from the results of a call to either {@link #textSearch(String)} or
	 * {@link #categorySearch(String)}.
	 * 
	 * @param searchQueryData
	 *           the search query object
	 * @param pageableData
	 *           the page to return
	 * @return the search results
	 */
	FacetSearchPageData<SolrSearchQueryData, ProductData> searchAgain(SolrSearchQueryData searchQueryData,
			PageableData pageableData);
}
