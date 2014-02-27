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
package de.hybris.platform.ycommercewebservices.controller;

import static org.fest.assertions.Assertions.assertThat;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.commercefacades.product.ProductExportFacade;
import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.product.data.ProductResultData;
import de.hybris.platform.commerceservices.search.facetdata.FacetSearchPageData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryTermData;
import de.hybris.platform.ycommercewebservices.dto.ProductDataList;
import de.hybris.platform.ycommercewebservices.exceptions.InconsistentUseridException;
import de.hybris.platform.ycommercewebservices.facade.search.ProductSearchFacade;
import de.hybris.platform.ycommercewebservices.formatters.WsDateFormatter;
import de.hybris.platform.ycommercewebservices.util.ws.SearchQueryCodec;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.httpclient.util.DateParseException;
import org.apache.commons.httpclient.util.DateUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.google.common.collect.Sets;


/**
 * Unit test for {@link CustomersController}
 */
@UnitTest
public class ProductsControllerUnitTest
{

	private static final String PRODUCT_ID = "12156";

	@Mock
	private ProductFacade productFacade;

	@Mock
	private ProductExportFacade productExportFacade;

	@Mock
	private ProductSearchFacade searchFacade;

	@Mock
	private WsDateFormatter wsDateFormatter;

	@Mock
	private SearchQueryCodec<SolrSearchQueryData> searchQueryCodec;

	private final ProductsController productsController = new ProductsController();

	@Before
	public void prepareController()
	{
		MockitoAnnotations.initMocks(this);
		productsController.setProductFacade(productFacade);
		productsController.setSearchFacade(searchFacade);
		productsController.setSearchQueryCodec(searchQueryCodec);
		productsController.setProductExportFacade(productExportFacade);
		productsController.setWsDateFormatter(wsDateFormatter);
	}

	@Test
	public void testGetProductByCode() throws InconsistentUseridException
	{
		productsController.getProductByCode(PRODUCT_ID, ProductOption.BASIC + "," + ProductOption.DESCRIPTION);

		BDDMockito.verify(productFacade).getProductForCodeAndOptions(PRODUCT_ID,
				new HashSet<ProductOption>(Arrays.asList(ProductOption.DESCRIPTION, ProductOption.BASIC)));
	}

	protected SolrSearchQueryTermData buildTerm(final String key, final String value)
	{
		final SolrSearchQueryTermData term = new SolrSearchQueryTermData();
		term.setKey(key);
		term.setValue(value);
		return term;
	}

	@Test
	public void testSearchProducts() throws InconsistentUseridException
	{
		final Integer currentPage = Integer.valueOf(2);
		final Integer pageSize = Integer.valueOf(10);
		final FacetSearchPageData<SolrSearchQueryData, ProductData> expectedSearchData = Mockito.mock(FacetSearchPageData.class);
		final HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		final SolrSearchQueryData solrSearchQueryData = new SolrSearchQueryData();
		solrSearchQueryData.setFreeTextSearch("freeTextSearch");
		solrSearchQueryData.setSort("sort");
		solrSearchQueryData.setFilterTerms(Arrays.asList(buildTerm("facetKey1", "facetValue1"),
				buildTerm("facetKey2", "facetValue2")));

		BDDMockito.when(request.getParameter("query")).thenReturn("encoded-query");
		BDDMockito.when(request.getParameter("currentPage")).thenReturn(currentPage.toString());
		BDDMockito.when(request.getParameter("pageSize")).thenReturn(pageSize.toString());
		BDDMockito.when(request.getParameter("sort")).thenReturn("ASC");
		BDDMockito.when(searchQueryCodec.decodeQuery("encoded-query")).thenReturn(solrSearchQueryData);

		BDDMockito.when(searchFacade.searchAgain(Mockito.any(SolrSearchQueryData.class), Mockito.any(PageableData.class)))
				.thenReturn(expectedSearchData);

		final FacetSearchPageData<SolrSearchQueryData, ProductData> searchData = productsController.searchProducts(request);

		Assert.assertSame(searchData, expectedSearchData);

		final ArgumentMatcher<SolrSearchQueryData> searchQueryArgumentMatcher = new ArgumentMatcher<SolrSearchQueryData>()
		{
			@Override
			public boolean matches(final Object argument)
			{
				final SolrSearchQueryData data = (SolrSearchQueryData) argument;
				Assert.assertEquals("sort", data.getSort());
				Assert.assertEquals("freeTextSearch", data.getFreeTextSearch());
				Assert.assertEquals(2, data.getFilterTerms().size());
				Assert.assertEquals("facetKey1", data.getFilterTerms().get(0).getKey());
				Assert.assertEquals("facetValue1", data.getFilterTerms().get(0).getValue());
				Assert.assertEquals("facetKey2", data.getFilterTerms().get(1).getKey());
				Assert.assertEquals("facetValue2", data.getFilterTerms().get(1).getValue());
				return true;
			}
		};

		final ArgumentMatcher<PageableData> pageableArgumentMatcher = new ArgumentMatcher<PageableData>()
		{
			@Override
			public boolean matches(final Object argument)
			{
				final PageableData data = (PageableData) argument;
				Assert.assertEquals(currentPage.intValue(), data.getCurrentPage());
				Assert.assertEquals(pageSize.intValue(), data.getPageSize());
				Assert.assertEquals("ASC", data.getSort());
				return true;
			}
		};

		BDDMockito.verify(searchFacade).searchAgain(Mockito.argThat(searchQueryArgumentMatcher),
				Mockito.argThat(pageableArgumentMatcher));//
	}


	@Test
	public void testExportProducts() throws DateParseException
	{
		//given
		final Date parsedDate = DateUtil.parseDate("Thu, 23 Feb 2012 11:54:11 GMT");

		final ProductData product = new ProductData();
		product.setCategories(Collections.EMPTY_LIST);
		final ProductResultData productResultData = new ProductResultData();
		productResultData.setTotalCount(2);
		productResultData.setProducts(Arrays.asList(product, product));
		BDDMockito.when(
				productExportFacade.getOnlyModifiedProductsForOptions(Mockito.eq("hwcatalog"), Mockito.eq("Online"),
						Mockito.eq(parsedDate), Mockito.eq(Sets.newHashSet(ProductOption.BASIC)), Mockito.eq(0), Mockito.eq(10)))
				.thenReturn(productResultData);
		BDDMockito.when(wsDateFormatter.toDate("Thu, 23 Feb 2012 11:54:11 GMT")).thenReturn(parsedDate);

		//when
		final ProductDataList result = productsController.exportProducts(0, 10, "BASIC", "hwcatalog", "Online",
				"Thu, 23 Feb 2012 11:54:11 GMT");

		//then
		assertThat(result).isNotNull();
		assertThat(result.getProducts()).hasSize(2);
		assertThat(result.getCurrentPage()).isEqualTo(0);
		assertThat(result.getCatalog()).isEqualTo("hwcatalog");
		assertThat(result.getVersion()).isEqualTo("Online");
		assertThat(result.getTotalPageCount()).isEqualTo(1);
		assertThat(result.getTotalProductCount()).isEqualTo(2);
	}
}
