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

import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.commercefacades.product.ProductExportFacade;
import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.product.data.ProductReferenceData;
import de.hybris.platform.commercefacades.product.data.ProductReferencesData;
import de.hybris.platform.commercefacades.product.data.ProductResultData;
import de.hybris.platform.commercefacades.product.data.ReviewData;
import de.hybris.platform.commercefacades.product.data.SuggestionData;
import de.hybris.platform.commercefacades.search.data.AutocompleteSuggestionData;
import de.hybris.platform.commerceservices.search.facetdata.FacetSearchPageData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.ycommercewebservices.constants.YcommercewebservicesConstants;
import de.hybris.platform.ycommercewebservices.dto.ProductDataList;
import de.hybris.platform.ycommercewebservices.dto.SuggestionDataList;
import de.hybris.platform.ycommercewebservices.facade.search.ProductSearchFacade;
import de.hybris.platform.ycommercewebservices.formatters.WsDateFormatter;
import de.hybris.platform.ycommercewebservices.util.ws.SearchQueryCodec;
import de.hybris.platform.ycommercewebservices.validator.CustomValidationException;
import de.hybris.platform.ycommercewebservices.validator.ReviewDataValidator;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.httpclient.util.DateParseException;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;


/**
 * Web Services Controller to expose the functionality of the {@link ProductFacade} and SearchFacade.
 */
@Controller
@RequestMapping(value = "/v1/{baseSiteId}/products")
public class ProductsController extends BaseController
{
	private static final String BASIC_OPTION = "BASIC";
	private static final String MAX_INTEGER = "2147483647";
	private static final String DEFAULT_PAGE_VALUE = "0";

	private static final Logger LOG = Logger.getLogger(ProductsController.class);

	@Resource(name = "cwsProductFacade")
	private ProductFacade productFacade;

	@Resource(name = "cwsProductExportFacade")
	private ProductExportFacade productExportFacade;

	@Resource(name = "cwsProductSearchFacade")
	private ProductSearchFacade searchFacade;

	@Resource(name = "cwsSearchQueryCodec")
	private SearchQueryCodec<SolrSearchQueryData> searchQueryCodec;

	@Resource(name = "wsDateFormatter")
	private WsDateFormatter wsDateFormatter;

	@Resource(name = "productSearchFacade")
	private de.hybris.platform.commercefacades.search.ProductSearchFacade<ProductData> productSearchFacade;

	@Resource(name = "httpRequestReviewDataPopulator")
	private Populator<HttpServletRequest, ReviewData> httpRequestReviewDataPopulator;

	@Resource(name = "reviewValidator")
	private Validator reviewValidator;

	/**
	 * Web service handler for search. Implementation has to catch up once the SearchFacade exists.
	 * 
	 * @param request
	 *           - incoming HttpServletRequest. As there are many potential query parameters to handle they are not
	 *           mapped using annotations. The handler body will extract the parameters and pass them on to the
	 *           SearchFacade.
	 * @return {@link FacetSearchPageData}
	 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public FacetSearchPageData<SolrSearchQueryData, ProductData> searchProducts(final HttpServletRequest request)
	{
		final String query = request.getParameter("query");
		final SolrSearchQueryData searchQuery = searchQueryCodec.decodeQuery(query);

		final PageableData pageable = new PageableData();
		final String currentPage = request.getParameter("currentPage");
		pageable.setCurrentPage((currentPage == null) ? 0 : Integer.parseInt(currentPage));

		final String pageSize = request.getParameter("pageSize");
		pageable.setPageSize((pageSize == null) ? 20 : Integer.parseInt(pageSize));

		final String sort = request.getParameter("sort");
		pageable.setSort((sort == null) ? null : sort);

		final FacetSearchPageData<SolrSearchQueryData, ProductData> data = searchFacade.searchAgain(searchQuery, pageable);

		if (data != null && data.getResults() != null && !data.getResults().isEmpty())
		{
			for (final ProductData p : data.getResults())
			{
				//todo this in converter
				final String desc = (p.getDescription() == null) ? null : p.getDescription().replaceAll("\\<.*?\\>", "");
				p.setDescription(StringUtils.abbreviate(desc, 500));
			}
		}

		return data;
	}

	/**
	 * Web service handler for product export. If no 'options' query parameter is defined, it will assume BASIC. The
	 * options are turned into a Set<ProductOption> and passed on to the facade. <br>
	 * Sample Call: http://localhost:9001/rest/v1/{SITE}/products/export/full
	 * 
	 * @param currentPage
	 *           - index position of the first Product, which will be included in the returned List
	 * @param pageSize
	 *           - number of Products which will be returned in each page
	 * @param options
	 *           - a String enumerating the detail level, values are BASIC, PROMOTIONS, STOCK, REVIEW, CLASSIFICATION,
	 *           REFERENCES. Combine by using a ',', which needs to be encoded as part of a URI using URLEncoding: %2C
	 * @return {@link ProductDataList}
	 */
	@RequestMapping(value = "/export/full", method = RequestMethod.GET)
	@ResponseBody
	public ProductDataList exportProducts(
			@RequestParam(required = false, defaultValue = DEFAULT_PAGE_VALUE) final int currentPage,
			@RequestParam(required = false, defaultValue = MAX_INTEGER) final int pageSize,
			@RequestParam(required = false, defaultValue = BASIC_OPTION) final String options,
			@RequestParam(required = false) final String catalog, @RequestParam(required = false) final String version)
	{
		final Set<ProductOption> opts = extractOptions(options);

		final ProductResultData products = productExportFacade.getAllProductsForOptions(catalog, version, opts, currentPage,
				pageSize);

		//addUrlsToResult(catalog, version, products);
		final ProductDataList result = convertResultset(currentPage, pageSize, catalog, version, products);

		return result;
	}

	/**
	 * Web service handler for incremental product export. Timestamp specifies which product to export. If no 'options'
	 * query parameter is defined, it will assume BASIC. The options are turned into a Set<ProductOption> and passed on
	 * to the facade. <br>
	 * Sample Call: http://localhost:9001/rest/v1/{SITE}/products/export/incremental
	 * 
	 * @param currentPage
	 *           - index position of the first Product, which will be included in the returned List
	 * @param pageSize
	 *           - number of Products which will be returned in each page
	 * @param options
	 *           - a String enumerating the detail level, values are BASIC, PROMOTIONS, STOCK, REVIEW, CLASSIFICATION,
	 *           REFERENCES. Combine by using a ',', which needs to be encoded as part of a URI using URLEncoding: %2C
	 * @param catalog
	 *           catalog from which get products
	 * @param version
	 *           version of catalog
	 * @param timestamp
	 *           time in ISO-8601 format
	 * @return {@link ProductDataList}
	 */
	@RequestMapping(value = "/export/incremental", method = RequestMethod.GET)
	@ResponseBody
	public ProductDataList exportProducts(
			@RequestParam(required = false, defaultValue = DEFAULT_PAGE_VALUE) final int currentPage,
			@RequestParam(required = false, defaultValue = MAX_INTEGER) final int pageSize,
			@RequestParam(required = false, defaultValue = BASIC_OPTION) final String options,
			@RequestParam(required = false) final String catalog, @RequestParam(required = false) final String version,
			@RequestParam final String timestamp) throws DateParseException
	{
		final Set<ProductOption> opts = extractOptions(options);
		final Date timestampDate = wsDateFormatter.toDate(timestamp);

		final ProductResultData modifiedProducts = productExportFacade.getOnlyModifiedProductsForOptions(catalog, version,
				timestampDate, opts, currentPage, pageSize);

		return convertResultset(currentPage, pageSize, catalog, version, modifiedProducts);
	}

	/**
	 * Web service handler for export product references. Reference type specifies which references to return. If no
	 * 'options' query parameter is defined, it will assume BASIC. The options are turned into a Set<ProductOption> and
	 * passed on to the facade. Sample Call:
	 * http://localhost:9001/rest/v1/{SITE}/products/export/references/{code}?referenceType
	 * =CROSSELLING&catalog=hwcatalog&version=Online
	 * 
	 * @param code
	 *           - product code
	 * @param referenceType
	 *           - reference type according to enum ProductReferenceTypeEnum
	 * @param pageSize
	 *           - number of Products which will be returned in each page
	 * @param options
	 *           - a String enumerating the detail level, values are BASIC, PROMOTIONS, STOCK, REVIEW, CLASSIFICATION,
	 *           REFERENCES. Combine by using a ',', which needs to be encoded as part of a URI using URLEncoding: %2C
	 * @return collection of {@link ProductReferenceData}
	 */
	@RequestMapping(value = "/export/references/{code}", method = RequestMethod.GET)
	@ResponseBody
	public ProductReferencesData exportProductReferences(@PathVariable final String code,
			@RequestParam(required = false, defaultValue = MAX_INTEGER) final int pageSize,
			@RequestParam(required = false, defaultValue = BASIC_OPTION) final String options,
			@RequestParam final String referenceType) throws DateParseException
	{
		final List<ProductOption> opts = Lists.newArrayList(extractOptions(options));
		final ProductReferenceTypeEnum referenceTypeEnum = ProductReferenceTypeEnum.valueOf(referenceType);

		final List<ProductReferenceData> productReferences = productFacade.getProductReferencesForCode(code, referenceTypeEnum,
				opts, Integer.valueOf(pageSize));

		final ProductReferencesData productReferencesData = new ProductReferencesData();
		productReferencesData.setReferences(productReferences);

		return productReferencesData;
	}

	private ProductDataList convertResultset(final int page, final int pageSize, final String catalog, final String version,
			final ProductResultData modifiedProducts)
	{
		final ProductDataList result = new ProductDataList();
		result.setProducts(modifiedProducts.getProducts());
		if (pageSize > 0)
		{
			result.setTotalPageCount((modifiedProducts.getTotalCount() % pageSize == 0) ? modifiedProducts.getTotalCount()
					/ pageSize : modifiedProducts.getTotalCount() / pageSize + 1);
		}
		result.setCurrentPage(page);
		result.setTotalProductCount(modifiedProducts.getTotalCount());
		result.setCatalog(catalog);
		result.setVersion(version);
		return result;
	}

	protected Set<ProductOption> extractOptions(final String options)
	{
		final String optionsStrings[] = options.split(YcommercewebservicesConstants.OPTIONS_SEPARATOR);

		final Set<ProductOption> opts = new HashSet<ProductOption>();
		for (final String option : optionsStrings)
		{
			opts.add(ProductOption.valueOf(option));
		}
		return opts;
	}

	/**
	 * Web service handler for the getProductByCode call. If no 'options' query parameter is defined, it will assume
	 * BASIC. The options are turned into a Set<ProductOption> and passed on to the facade. Sample Call:
	 * http://localhost:9001/rest/v1/{SITE}/products/{CODE}?options=BASIC%2CPROMOTIONS Keep in mind ',' needs to be
	 * encoded as %2C
	 * 
	 * @param code
	 *           - the unique code used to identify a product
	 * @param options
	 *           - a String enumerating the detail level, values are BASIC, PROMOTIONS, STOCK, REVIEW, CLASSIFICATION,
	 *           REFERENCES. Combine by using a ',', which needs to be encoded as part of a URI using URLEncoding: %2C
	 * @return the ProdcutData DTO which will be marshaled to JSON or XML based on Accept-Header
	 */
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	@ResponseBody
	public ProductData getProductByCode(@PathVariable final String code,
			@RequestParam(required = false, defaultValue = BASIC_OPTION) final String options)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("getProductByCode: code=" + code + " | options=" + options);
		}

		final Set<ProductOption> opts = extractOptions(options);

		return productFacade.getProductForCodeAndOptions(code, opts);
	}

	/**
	 * Web service handler for giving the auto complete suggestions as List<String>
	 * 
	 * @param term
	 *           - the term that user inputs for search
	 * @param max
	 *           - the limit of the suggestions
	 * @return the list of auto suggestions
	 */
	@RequestMapping(value = "/suggest", method = RequestMethod.GET)
	@ResponseBody
	public SuggestionDataList getSuggestions(@RequestParam(required = true, defaultValue = " ") final String term,
			@RequestParam(required = true, defaultValue = "10") final int max)
	{
		final SuggestionDataList result = new SuggestionDataList();
		List<AutocompleteSuggestionData> autoSuggestions;
		if (max < productSearchFacade.getAutocompleteSuggestions(term).size())
		{
			autoSuggestions = productSearchFacade.getAutocompleteSuggestions(term).subList(0, max);
		}
		else
		{
			autoSuggestions = productSearchFacade.getAutocompleteSuggestions(term);
		}
		for (final AutocompleteSuggestionData autoSuggestion : autoSuggestions)
		{
			final SuggestionData suggestionData = new SuggestionData();
			suggestionData.setValue(autoSuggestion.getTerm());
			result.addSuggestions(suggestionData);
		}
		return result;
	}

	/**
	 * Web service handler for the postReview call. Review will be posted as anonymous principal. Method uses
	 * {@link de.hybris.platform.ycommercewebservices.populator.HttpRequestReviewDataPopulator} to populate review data
	 * from request parameters.
	 * 
	 * There is no default validation for the posted value!
	 * 
	 * Request Method: <code>POST<code>
	 * Sample Call: http://localhost:9001/rest/v1/{SITE}/products/{CODE}/review
	 * Request parameters:
	 * <ul>
	 * <li>rating (required)</li>
	 * <li>headline</li>
	 * <li>comment</li>
	 * <li>alias</li>
	 * </ul>
	 * 
	 * @param code
	 *           - the unique code used to identify a product
	 * @param request
	 * @return the ReviewData DTO which will be marshaled to JSON or XML based on Accept-Header
	 */
	@RequestMapping(value = "/{code}/reviews", method = RequestMethod.POST)
	@ResponseBody
	public ReviewData createReview(@PathVariable final String code, final HttpServletRequest request)
			throws CustomValidationException
	{
		final ReviewData reviewData = new ReviewData();
		httpRequestReviewDataPopulator.populate(request, reviewData);
		final Errors errors = new BeanPropertyBindingResult(reviewData, "reviewData");

		reviewValidator.validate(reviewData, errors);

		if (errors.hasErrors())
		{
			throw new CustomValidationException("Review validation error", errors);
		}

		return productFacade.postReview(code, reviewData);
	}

	public void setProductFacade(final ProductFacade productFacade)
	{
		this.productFacade = productFacade;
	}

	public void setSearchFacade(final ProductSearchFacade searchFacade)
	{
		this.searchFacade = searchFacade;
	}

	public void setSearchQueryCodec(final SearchQueryCodec<SolrSearchQueryData> searchQueryCodec)
	{
		this.searchQueryCodec = searchQueryCodec;
	}

	public void setProductExportFacade(final ProductExportFacade productExportFacade)
	{
		this.productExportFacade = productExportFacade;
	}

	public void setProductSearchFacade(
			final de.hybris.platform.commercefacades.search.ProductSearchFacade<ProductData> productSearchFacade)
	{
		this.productSearchFacade = productSearchFacade;
	}

	public void setWsDateFormatter(final WsDateFormatter wsDateFormatter)
	{
		this.wsDateFormatter = wsDateFormatter;
	}

	public void setReviewValidator(final ReviewDataValidator reviewValidator)
	{
		this.reviewValidator = reviewValidator;
	}

}
