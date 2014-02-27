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
package de.hybris.platform.ycommercewebservices.facade.search.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.ProductSearchService;
import de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryData;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.ycommercewebservices.facade.search.ProductSearchFacade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;


/**
 */
public class DefaultProductSearchFacade implements ProductSearchFacade
{
	// Spring services
	private ProductSearchService<SolrSearchQueryData, SearchResultValueData, ProductSearchPageData<SolrSearchQueryData, SearchResultValueData>> productSearchService;
	private Converter<SearchResultValueData, ProductData> searchResultProductConverter;

	protected ProductSearchService<SolrSearchQueryData, SearchResultValueData, ProductSearchPageData<SolrSearchQueryData, SearchResultValueData>> getProductSearchService()
	{
		return productSearchService;
	}

	@Required
	public void setProductSearchService(
			final ProductSearchService<SolrSearchQueryData, SearchResultValueData, ProductSearchPageData<SolrSearchQueryData, SearchResultValueData>> productSearchService)
	{
		this.productSearchService = productSearchService;
	}

	protected Converter<SearchResultValueData, ProductData> getSearchResultProductConverter()
	{
		return searchResultProductConverter;
	}

	@Required
	public void setSearchResultProductConverter(final Converter<SearchResultValueData, ProductData> searchResultProductConverter)
	{
		this.searchResultProductConverter = searchResultProductConverter;
	}

	// End spring inject methods

	@Override
	public ProductSearchPageData<SolrSearchQueryData, ProductData> textSearch(final String text)
	{
		final ProductSearchPageData<SolrSearchQueryData, SearchResultValueData> searchResult = getProductSearchService()
				.textSearch(text, null);
		final ProductSearchPageData<SolrSearchQueryData, ProductData> productResults = createSearchPageData();
		productResults.setResults(buildProducts(searchResult.getResults()));
		populateSearchPageData(searchResult, productResults);
		return productResults;
	}

	@Override
	public ProductSearchPageData<SolrSearchQueryData, ProductData> categorySearch(final String categoryCode)
	{
		final ProductSearchPageData<SolrSearchQueryData, SearchResultValueData> searchResult = getProductSearchService()
				.categorySearch(categoryCode, null);
		final ProductSearchPageData<SolrSearchQueryData, ProductData> productResults = createSearchPageData();
		productResults.setResults(buildProducts(searchResult.getResults()));
		populateSearchPageData(searchResult, productResults);
		return productResults;
	}

	@Override
	public ProductSearchPageData<SolrSearchQueryData, ProductData> searchAgain(final SolrSearchQueryData searchQueryData,
			final PageableData pageableData)
	{
		validateParameterNotNull(searchQueryData, "SearchQueryData cannot be null");

		final ProductSearchPageData<SolrSearchQueryData, SearchResultValueData> searchResult = getProductSearchService()
				.searchAgain(searchQueryData, pageableData);
		final ProductSearchPageData<SolrSearchQueryData, ProductData> productResults = createSearchPageData();
		productResults.setResults(buildProducts(searchResult.getResults()));
		populateSearchPageData(searchResult, productResults);
		return productResults;
	}

	protected List<ProductData> buildProducts(final List<SearchResultValueData> results)
	{
		final List<ProductData> products = new ArrayList<ProductData>(results.size());

		for (final SearchResultValueData result : results)
		{
			products.add(getSearchResultProductConverter().convert(result));
		}

		return products;
	}

	protected void populateSearchPageData(final ProductSearchPageData<SolrSearchQueryData, SearchResultValueData> source,
			final ProductSearchPageData<SolrSearchQueryData, ProductData> target)
	{
		target.setCurrentQuery(source.getCurrentQuery());
		target.setPagination(source.getPagination());
		target.setFacets(source.getFacets());
		target.setBreadcrumbs(source.getBreadcrumbs());
		target.setSorts(source.getSorts());
		target.setSpellingSuggestion(source.getSpellingSuggestion());
		// target.setKeywordRedirectUrl(source.getKeywordRedirectUrl()); // activate this to retrieve keyword redirect URLs with the search result
	}

	// Create methods for data object - can be overridden in spring config

	protected ProductSearchPageData<SolrSearchQueryData, ProductData> createSearchPageData()
	{
		return new ProductSearchPageData<SolrSearchQueryData, ProductData>();
	}

}
