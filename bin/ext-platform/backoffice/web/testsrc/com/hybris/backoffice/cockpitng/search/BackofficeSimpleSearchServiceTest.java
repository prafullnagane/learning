/**
 * 
 */
package com.hybris.backoffice.cockpitng.search;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.genericsearch.GenericSearchService;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

import com.hybris.backoffice.search.SimpleCockpitSearchService;
import com.hybris.backoffice.search.data.SearchQueryData;
import com.hybris.cockpitng.widgets.common.simplelist.Pageable;



/**
 * @author krzysztof.kwiatosz
 * 
 */
@IntegrationTest
public class BackofficeSimpleSearchServiceTest extends ServicelayerBaseTest
{
	private static final String TEST_CATALOG_ID = "testCatalog";
	private static final String TEST_VERSION = "summer";
	private static final int PRODUCT_COUNT = 30;
	private static final String TEST_PRODUCT_CODE = "testProductCode_";
	private static final String TEST_PRODUCT_EAN = "testProductEAN_";
	private static final String TEST_MANUFACTURER = "XYZ";

	@Resource
	private GenericSearchService genericSearchService;

	private SimpleCockpitSearchService<ItemModel> backofficeSimpleSearchService;
	@Resource
	private ModelService modelService;


	@Before
	public void setUpTestData()
	{
		backofficeSimpleSearchService = new BackofficeSimpleSearchService<ItemModel>();
		((BackofficeSimpleSearchService) backofficeSimpleSearchService).setGenericSearchService(genericSearchService);

		final CatalogModel testCatalog = createTestCatalog();
		final CatalogVersionModel testCatalogVersion = createTestCatalogVersion(testCatalog);
		for (int i = 0; i < PRODUCT_COUNT; i++)
		{
			createTestProduct(i, testCatalogVersion);
		}
		modelService.saveAll();
	}

	private void createTestProduct(final int index, final CatalogVersionModel testCatalogVersion)
	{
		final ProductModel product = modelService.create(ProductModel.class);
		product.setCode(TEST_PRODUCT_CODE + index);
		product.setEan(TEST_PRODUCT_EAN + index);
		product.setManufacturerAID(TEST_MANUFACTURER);
		product.setManufacturerName(TEST_MANUFACTURER);
		product.setCatalogVersion(testCatalogVersion);
	}


	private CatalogVersionModel createTestCatalogVersion(final CatalogModel testCatalog)
	{
		final CatalogVersionModel catalogVersion = modelService.create(CatalogVersionModel.class);
		catalogVersion.setCatalog(testCatalog);
		catalogVersion.setVersion(TEST_VERSION);
		return catalogVersion;
	}

	private CatalogModel createTestCatalog()
	{
		final CatalogModel catalog = modelService.create(CatalogModel.class);
		catalog.setId(TEST_CATALOG_ID);
		return catalog;
	}

	@Test
	public void testFetchAllProducts() // NOPMD
	{
		final SearchQueryData sqd = new SearchQueryData("Product");

		Pageable<ItemModel> pageable = backofficeSimpleSearchService.search(sqd);
		Assertions.assertThat(pageable).isNotNull();
		Assertions.assertThat(pageable.getCurrentPage()).hasSize(PRODUCT_COUNT);
		Assertions.assertThat(pageable.hasNextPage()).isFalse();

		sqd.setPageSize(0);
		pageable = backofficeSimpleSearchService.search(sqd);
		Assertions.assertThat(pageable.getCurrentPage()).hasSize(PRODUCT_COUNT);
		Assertions.assertThat(pageable.hasNextPage()).isFalse();

		sqd.setPageSize(31);
		pageable = backofficeSimpleSearchService.search(sqd);
		Assertions.assertThat(pageable.getCurrentPage()).hasSize(PRODUCT_COUNT);
		Assertions.assertThat(pageable.hasNextPage()).isFalse();
	}

	@Test
	public void testFetchProductsPaging() // NOPMD
	{
		final SearchQueryData sqd = new SearchQueryData("Product");
		sqd.setPageSize(5);

		//take first 5
		final Pageable<ItemModel> pageable = backofficeSimpleSearchService.search(sqd);
		Assertions.assertThat(pageable).isNotNull();
		Assertions.assertThat(pageable.getCurrentPage()).hasSize(5);
		Assertions.assertThat(pageable.hasNextPage()).isTrue();
		Assertions.assertThat(pageable.hasPreviousPage()).isFalse();
		Assertions.assertThat(pageable.getPreviousPage()).isEmpty();

		//10
		Assertions.assertThat(pageable.getNextPage()).hasSize(5);
		Assertions.assertThat(pageable.hasNextPage()).isTrue();

		//15
		Assertions.assertThat(pageable.getNextPage()).hasSize(5);
		Assertions.assertThat(pageable.hasNextPage()).isTrue();

		//20
		Assertions.assertThat(pageable.getNextPage()).hasSize(5);
		Assertions.assertThat(pageable.hasNextPage()).isTrue();

		//25
		final List<ItemModel> page25_1 = pageable.getNextPage();
		Assertions.assertThat(page25_1).hasSize(5);
		Assertions.assertThat(pageable.hasNextPage()).isTrue();

		//25 again
		final List<ItemModel> page25_2 = pageable.getCurrentPage();
		Assertions.assertThat(page25_2).hasSize(5);
		Assertions.assertThat(pageable.hasNextPage()).isTrue();
		Assertions.assertThat(page25_1).isSameAs(page25_2);

		//30
		Assertions.assertThat(pageable.getNextPage()).hasSize(5);
		Assertions.assertThat(pageable.hasNextPage()).isFalse();
		Assertions.assertThat(pageable.getNextPage()).isEmpty();

		Assertions.assertThat(pageable.getPage(10)).isEmpty();

	}

	@Test
	public void testFetchProductsPaging2() // NOPMD
	{
		final SearchQueryData sqd = new SearchQueryData("Product");
		sqd.setPageSize(20);

		//take first 20
		final Pageable<ItemModel> pageable = backofficeSimpleSearchService.search(sqd);
		Assertions.assertThat(pageable).isNotNull();
		Assertions.assertThat(pageable.getCurrentPage()).hasSize(20);
		Assertions.assertThat(pageable.hasNextPage()).isTrue();

		// remaining 10
		Assertions.assertThat(pageable.getNextPage()).hasSize(10);
		Assertions.assertThat(pageable.hasNextPage()).isFalse();
	}

	@Test
	public void testFetchProductsGetPageByNumber() // NOPMD
	{
		final SearchQueryData sqd = new SearchQueryData("Product");
		sqd.setPageSize(11);

		//take last 8 (page no 2)
		final Pageable<ItemModel> pageable = backofficeSimpleSearchService.search(sqd);
		Assertions.assertThat(pageable).isNotNull();
		final List<ItemModel> lastpage = pageable.getPage(2);
		Assertions.assertThat(lastpage).hasSize(8);
		Assertions.assertThat(pageable.hasNextPage()).isFalse();
		Assertions.assertThat(pageable.hasPreviousPage()).isTrue();
		Assertions.assertThat(pageable.getNextPage()).isEmpty();

		final List<ItemModel> lastpage2 = pageable.getCurrentPage();
		Assertions.assertThat(lastpage).isSameAs(lastpage2);
		Assertions.assertThat(pageable.hasNextPage()).isFalse();
		Assertions.assertThat(pageable.hasPreviousPage()).isTrue();

		final List<ItemModel> middlepage = pageable.getPreviousPage();
		Assertions.assertThat(middlepage).hasSize(11);
		Assertions.assertThat(pageable.hasNextPage()).isTrue();
		Assertions.assertThat(pageable.hasPreviousPage()).isTrue();

		final List<ItemModel> middlepage2 = pageable.getCurrentPage();
		Assertions.assertThat(middlepage).isSameAs(middlepage2);
		Assertions.assertThat(pageable.hasNextPage()).isTrue();
		Assertions.assertThat(pageable.hasPreviousPage()).isTrue();

		final List<ItemModel> firstPage = pageable.getPreviousPage();
		Assertions.assertThat(firstPage).hasSize(11);
		Assertions.assertThat(pageable.hasNextPage()).isTrue();
		Assertions.assertThat(pageable.hasPreviousPage()).isFalse();

		final List<ItemModel> firstPage2 = pageable.getCurrentPage();
		Assertions.assertThat(firstPage).isSameAs(firstPage2);
		Assertions.assertThat(pageable.hasNextPage()).isTrue();
		Assertions.assertThat(pageable.hasPreviousPage()).isFalse();

		Assertions.assertThat(pageable.getPreviousPage()).isEmpty();

	}

	@Test
	public void testFetchProductsGetPageByTooHighNumber() // NOPMD
	{
		final SearchQueryData sqd = new SearchQueryData("Product");
		sqd.setPageSize(10);

		final Pageable<ItemModel> pageable = backofficeSimpleSearchService.search(sqd);

		final List<ItemModel> firstPage = pageable.getCurrentPage();
		//we only have 3 pages
		Assertions.assertThat(pageable.getPage(100)).isEmpty();

		final List<ItemModel> firstPageAgain = pageable.getCurrentPage();
		Assertions.assertThat(firstPage).isSameAs(firstPageAgain);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFetchProductsGetPageByNegative() // NOPMD
	{
		final SearchQueryData sqd = new SearchQueryData("Product");
		sqd.setPageSize(10);
		final Pageable<ItemModel> pageable = backofficeSimpleSearchService.search(sqd);
		//O-o!
		pageable.getPage(-1);
	}

	@Test
	public void testFetchProductsByCodeEqual() // NOPMD
	{
		final String code = "testProductCode_10";

		final SearchQueryData sqd = new SearchQueryData("Product");
		sqd.setPageSize(10);
		sqd.setAttributes(Collections.singletonList("code"));
		sqd.setSearchQueryText(code);

		final Pageable<ItemModel> pageable = backofficeSimpleSearchService.search(sqd);
		Assertions.assertThat(pageable.getCurrentPage()).hasSize(1);
		final ProductModel testProduct10 = (ProductModel) (pageable.getCurrentPage().get(0));
		Assertions.assertThat(testProduct10.getCode()).isEqualTo(code);
	}

	@Test
	public void testFetchProductsByCodeOREanContains() // NOPMD
	{
		final String text = "EAN";

		final SearchQueryData sqd = new SearchQueryData("Product");
		sqd.setAttributes(Arrays.asList("code", "ean"));
		sqd.setSearchQueryText(text);
		sqd.setValueComparisonOperator("contains");

		final Pageable<ItemModel> pageable = backofficeSimpleSearchService.search(sqd);
		Assertions.assertThat(pageable.getCurrentPage()).hasSize(30);
	}

	@Test
	public void testChangePageSize()
	{
		final SearchQueryData sqd = new SearchQueryData("Product");
		sqd.setValueComparisonOperator("contains");
		sqd.setPageSize(14);

		final Pageable<ItemModel> pageable = backofficeSimpleSearchService.search(sqd);

		// we have 30 items , initial page size = 14 (3 pages)

		Assertions.assertThat(pageable.getCurrentPage()).hasSize(14);
		Assert.assertEquals(PRODUCT_COUNT, pageable.getTotalCount());
		Assertions.assertThat(pageable.hasNextPage()).isTrue();
		Assertions.assertThat(pageable.getNextPage()).hasSize(14);

		//has last page (2 items)
		Assertions.assertThat(pageable.hasNextPage()).isTrue();
		//lets change page size
		final List<ItemModel> afterPageSizeChanged = pageable.setPageSize(16);
		Assertions.assertThat(afterPageSizeChanged).hasSize(16);
		Assertions.assertThat(pageable.getCurrentPage()).isSameAs(afterPageSizeChanged);

		//no items left
		Assertions.assertThat(pageable.hasNextPage()).isFalse();
		Assertions.assertThat(pageable.hasPreviousPage()).isTrue();

		//prev page = first page
		Assertions.assertThat(pageable.getPreviousPage()).hasSize(16);
		Assertions.assertThat(pageable.hasPreviousPage()).isFalse();

	}
}
