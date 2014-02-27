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
package de.hybris.platform.catalog.jalo.synchronization;

import static org.junit.Assert.assertEquals;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.catalog.constants.CatalogConstants;
import de.hybris.platform.catalog.jalo.Catalog;
import de.hybris.platform.catalog.jalo.CatalogManager;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.europe1.jalo.Europe1PriceFactory;
import de.hybris.platform.europe1.jalo.PriceRow;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.order.price.JaloPriceFactoryException;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.product.ProductManager;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.JaloAbstractTypeException;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.testframework.HybrisJUnit4Test;
import de.hybris.platform.variants.jalo.VariantProduct;
import de.hybris.platform.variants.jalo.VariantType;
import de.hybris.platform.variants.jalo.VariantsManager;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class NewSyncPartOfRemovalTest extends HybrisJUnit4Test
{
	Currency eur;
	Unit unit;
	VariantType variantType;

	Catalog catalog;
	CatalogVersion srcVersion;
	Product base1, base2;

	@Before
	public void setUp() throws JaloGenericCreationException, JaloAbstractTypeException, JaloPriceFactoryException
	{
		catalog = CatalogManager.getInstance().createCatalog("testCat");
		srcVersion = createCatalogVersion("src");

		eur = getOrCreateCurrency("eur");
		unit = ProductManager.getInstance().createUnit("p", "piece");

		variantType = VariantsManager.getInstance().createVariantType("VarType");

		base1 = createBase(srcVersion, "base1", variantType);
		base2 = createBase(srcVersion, "base2", variantType);
	}

	@Test
	public void testPartOfRemovalSync() throws JaloGenericCreationException, JaloAbstractTypeException, JaloPriceFactoryException
	{
		for (int i = 0; i < 10; i++)
		{
			final CatalogVersionSyncCronJob sync = createAndConfigureNewSync("tgt" + i);
			sync.getJob().perform(sync, true);
			assertEquals(sync.getSuccessResult(), sync.getResult());
		}
	}

	private CatalogVersionSyncCronJob createAndConfigureNewSync(final String tgtVersion) throws JaloGenericCreationException,
			JaloAbstractTypeException, JaloPriceFactoryException
	{
		final CatalogVersionSyncJob sync = createNewSync(tgtVersion);
		final CatalogVersion tgt = sync.getTargetVersion();

		final Product baseToRemove = createBase(tgt, "toRemove", variantType);

		final CatalogVersionSyncCronJob cronJob = (CatalogVersionSyncCronJob) sync.newExecution();

		// add base1 then base1 variants
		cronJob.addPendingItem(base1.getPK(), null);
		for (final VariantProduct base1Var : VariantsManager.getInstance().getVariants(base1))
		{
			cronJob.addPendingItem(base1Var.getPK(), null);
		}

		// add base to remove
		cronJob.addPendingItem(null, baseToRemove.getPK());
		for (final VariantProduct removeVar : VariantsManager.getInstance().getVariants(baseToRemove))
		{
			cronJob.addPendingItem(null, removeVar.getPK());
		}


		// add base2 variants then base2
		for (final VariantProduct base2Var : VariantsManager.getInstance().getVariants(base2))
		{
			cronJob.addPendingItem(base2Var.getPK(), null);
		}
		cronJob.addPendingItem(base2.getPK(), null);

		return cronJob;

	}

	private CatalogVersionSyncJob createNewSync(final String version)
	{
		final Map args = new HashMap();
		args.put(CatalogVersionSyncJob.CODE, srcVersion.getVersion() + "->" + version);
		args.put(CatalogVersionSyncJob.SOURCEVERSION, srcVersion);
		args.put(CatalogVersionSyncJob.TARGETVERSION, createCatalogVersion(version));
		args.put(CatalogVersionSyncJob.MAXTHREADS, Integer.valueOf(10));

		return CatalogManager.getInstance().createCatalogVersionSyncJob(args);
	}

	private CatalogVersion createCatalogVersion(final String version)
	{
		return CatalogManager.getInstance().createCatalogVersion(catalog, version, getOrCreateLanguage("de"));
	}

	private Product createBase(final CatalogVersion catalogVersion, final String code, final VariantType variantType)
			throws JaloGenericCreationException, JaloAbstractTypeException, JaloPriceFactoryException
	{
		final CatalogManager catalogManager = CatalogManager.getInstance();
		final ProductManager productManager = ProductManager.getInstance();

		final Product base = productManager.createProduct(code);
		catalogManager.setCatalogVersion(base, catalogVersion);
		VariantsManager.getInstance().setVariantType(base, variantType);

		for (int i = 0; i < 3; i++)
		{
			createVariant(catalogVersion, base, code + "Var" + i, variantType);
		}
		return base;
	}

	private VariantProduct createVariant(final CatalogVersion catalogVersion, final Product base, final String code,
			final VariantType variantType) throws JaloGenericCreationException, JaloAbstractTypeException, JaloPriceFactoryException
	{
		final Map<String, Object> params = new HashMap<String, Object>();
		params.put(Product.CODE, code);
		params.put(VariantProduct.BASEPRODUCT, base);
		params.put(CatalogConstants.Attributes.Product.CATALOGVERSION, catalogVersion);

		final VariantProduct ret = (VariantProduct) variantType.newInstance(params);

		for (int i = 0; i < 3; i++)
		{
			createPriceRow(ret, (10.5 * i) + 1);
		}

		return ret;
	}

	private PriceRow createPriceRow(final VariantProduct var, final double price) throws JaloPriceFactoryException
	{
		return Europe1PriceFactory.getInstance().createPriceRow(var, null, null, null, 0, eur, unit, 1, false, null, price);
	}
}
