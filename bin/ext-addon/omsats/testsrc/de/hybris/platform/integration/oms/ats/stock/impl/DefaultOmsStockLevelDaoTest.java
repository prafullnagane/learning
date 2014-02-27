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
 */
package de.hybris.platform.integration.oms.ats.stock.impl;

import com.hybris.commons.tenant.TenantContextService;
import de.hybris.bootstrap.annotations.ManualTest;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.integration.commons.model.OndemandTenantBaseStorePreferenceModel;
import de.hybris.platform.integration.commons.model.OndemandTenantPreferenceModel;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Resource;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.MockitoAnnotations;


@ManualTest
public class DefaultOmsStockLevelDaoTest extends ServicelayerTest
{
	private static final String SITE_NAME = "testSite";
	private static final String PRODUCT_CODE = "1934793";
	private static final String WAREHOUSE_CODE = "warehouse_s";
	private static final String ATS_FORMULA = "ON_HAND";

	@Resource
	private DefaultOmsStockLevelDao defaultOmsStockLevelDao;
	@Resource
	private ModelService modelService;
	@Resource
	private BaseSiteService baseSiteService;
	@Resource
	private BaseStoreService baseStoreService;
	@Resource
	private TenantContextService tenantContextService;

	@BeforeClass
	public static void beforeClass() throws Exception
	{
		importCsv("/omsats/test/testStockLevels.csv", "UTF-8");
	}

	@Before
	public void prepare() throws Exception
	{
		MockitoAnnotations.initMocks(this);
		importCsv("/omsats/test/testStockLevels.csv", "UTF-8");

		final BaseSiteModel site = baseSiteService.getBaseSiteForUID(SITE_NAME);
		Assert.assertNotNull(String.format("no baseSite with uid: %s", SITE_NAME), site);
		site.setChannel(SiteChannel.B2C);
		baseSiteService.setCurrentBaseSite(site, false);

		createTenantPreference();
	}

	protected void createTenantPreference()
	{
		final BaseStoreModel baseStoreModel = baseStoreService.getCurrentBaseStore();
		final String tenantId = tenantContextService.getCurrentTenant();

		final OndemandTenantPreferenceModel tenantPreferenceModel = modelService.create(OndemandTenantPreferenceModel.class);
		tenantPreferenceModel.setTenantId(tenantId);
		modelService.save(tenantPreferenceModel);

		final OndemandTenantBaseStorePreferenceModel tenantBaseStorePreferenceModel = modelService
				.create(OndemandTenantBaseStorePreferenceModel.class);
		tenantBaseStorePreferenceModel.setBaseStore(baseStoreModel);
		tenantBaseStorePreferenceModel.setOndemandTenantPreference(tenantPreferenceModel);
		tenantBaseStorePreferenceModel.setAtsFormula(ATS_FORMULA);
		modelService.save(tenantBaseStorePreferenceModel);

		baseStoreModel.setOndemandTenantBaseStorePreferences(Arrays.asList(tenantBaseStorePreferenceModel));
		modelService.save(baseStoreModel);
	}

	@Test
	public void verifyProductHasStockLevels()
	{
		final String productCode = PRODUCT_CODE;
		final WarehouseModel warehouse = modelService.create(WarehouseModel.class);
		warehouse.setCode(WAREHOUSE_CODE);

		final Collection<StockLevelModel> stockLevels = defaultOmsStockLevelDao.findStockLevels(productCode,
				Arrays.asList(warehouse));
		Assert.assertNotNull(stockLevels);
		Assert.assertNotSame(Integer.valueOf(stockLevels.size()), Integer.valueOf(0));
	}
}
