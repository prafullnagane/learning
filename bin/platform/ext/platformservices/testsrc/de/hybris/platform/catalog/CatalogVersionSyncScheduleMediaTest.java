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
package de.hybris.platform.catalog;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.catalog.jalo.CatalogManager;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.catalog.model.synchronization.CatalogVersionSyncScheduleMediaModel;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.security.JaloSecurityException;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;


@IntegrationTest
public class CatalogVersionSyncScheduleMediaTest extends ServicelayerTransactionalTest
{
	@Resource
	private ModelService modelService;

	//mandatory attributtes interceptor should handle lack of cronJob
	@Test(expected = de.hybris.platform.servicelayer.exceptions.ModelSavingException.class)
	public void testCreateCatalogNoJob() throws JaloInvalidParameterException, JaloSecurityException, JaloBusinessException
	{
		final CatalogVersionSyncScheduleMediaModel modelItem = modelService.create("CatalogVersionSyncScheduleMedia");
		modelItem.setCode("deo meo");

		final CatalogModel catalogModel = new CatalogModel();
		catalogModel.setId("cm1" + System.currentTimeMillis());

		modelService.save(catalogModel);

		final CatalogVersionModel cvm = new CatalogVersionModel();
		cvm.setCatalog(catalogModel);
		cvm.setVersion("v1.0");
		modelService.save(cvm);

		modelItem.setCatalogVersion(cvm);
		modelService.save(modelItem);

		Assert.assertEquals(modelItem.getFolder(), CatalogManager.getInstance().getCatalogSyncMediaFolder());
	}
}
