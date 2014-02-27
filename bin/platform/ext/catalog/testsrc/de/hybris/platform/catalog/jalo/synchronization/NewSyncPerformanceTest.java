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

import de.hybris.bootstrap.annotations.PerformanceTest;
import de.hybris.platform.catalog.constants.CatalogConstants;
import de.hybris.platform.catalog.jalo.Catalog;
import de.hybris.platform.catalog.jalo.CatalogManager;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.catalog.jalo.ItemSyncTimestamp;
import de.hybris.platform.catalog.jalo.ProductReference;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.category.jalo.CategoryManager;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloAbstractTypeException;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.testframework.HybrisJUnit4Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;


@PerformanceTest
public class NewSyncPerformanceTest extends HybrisJUnit4Test
{
	private static final Logger LOG = Logger.getLogger(NewSyncPerformanceTest.class.getName());

	private static final int level1Count = 10;
	private static final int level2Count = 50;
	private static final int level3Count = 100;
	private static final int productsCount = 100;

	private CatalogVersion src;
	private CatalogVersion tgt;
	private List<Category> level1;
	private List<Category> level2;
	private List<Category> level3;
	private List<Product> products;

	private final Catalog cat = null;
	private Product product1, product2;

	final Product product3 = null;
	private final Category category = null;
	private final ProductReference reference = null;

	private final CatalogVersionSyncJob job = null;
	private final CatalogVersionSyncCronJob cron = null;

	@After
	public void tearDown()
	{
		try
		{
			if (cat != null)
			{
				cat.remove();
			}
			if (product1 != null)
			{
				product1.remove();
			}
			if (product2 != null)
			{
				product2.remove();
			}
			if (product3 != null)
			{
				product3.remove();
			}
			if (job != null)
			{
				job.remove();
			}
			if (cron != null)
			{
				cron.remove();
			}
			if (category != null)
			{
				category.remove();
			}
			if (reference != null)
			{
				reference.remove();
			}
			if (src != null)
			{
				src.remove();
			}
			if (tgt != null)
			{
				tgt.remove();
			}
		}
		catch (final Exception e)
		{
			LOG.info(e.getMessage());
		}

	}

	protected void fillCatalog() throws JaloGenericCreationException, JaloAbstractTypeException
	{
		final CategoryManager categoryManager = CategoryManager.getInstance();

		final Catalog catalog = CatalogManager.getInstance().createCatalog("foo");
		src = CatalogManager.getInstance().createCatalogVersion(catalog, "bar", null);
		src.setLanguages(Collections.singletonList(getOrCreateLanguage("de")));
		tgt = CatalogManager.getInstance().createCatalogVersion(catalog, "ba2r", null);
		tgt.setLanguages(Collections.singletonList(getOrCreateLanguage("de")));

		level1 = new ArrayList<Category>(level1Count);
		level2 = new ArrayList<Category>(level2Count);
		level3 = new ArrayList<Category>(level3Count);

		final Map args = new HashMap();
		args.put(CatalogConstants.Attributes.Category.CATALOGVERSION, src);
		for (int i = 0; i < level1Count + level2Count + level3Count; i++)
		{
			// alternate between 3, 2 and 1 to generate a more shuffled schedule
			final int level;
			if (level1.size() < level1Count)
			{
				level = 3 - (i % 3);
			}
			else if (level2.size() < level2Count)
			{
				level = 3 - (i % 2);
			}
			else
			{
				level = 3;
			}
			switch (level)
			{
				case 1:
					args.put(Category.CODE, "Level1-" + (level1.size() + 1));
					level1.add(categoryManager.createCategory(args));
					break;
				case 2:
					args.put(Category.CODE, "Level2-" + (level2.size() + 1));
					level2.add(categoryManager.createCategory(args));
					break;
				case 3:
					args.put(Category.CODE, "Level3-" + (level3.size() + 1));
					level3.add(categoryManager.createCategory(args));
					break;
			}
		}

		for (int i = level1Count - 1; i >= 0; i--)
		{
			final Category level1Cat = level1.get(i);
			level1Cat.setSubcategories(level2);
		}

		for (int i = level2Count - 1; i >= 0; i--)
		{
			final Category level2Cat = level2.get(i);
			level2Cat.setSubcategories(level3);
		}

		products = new ArrayList<Product>(productsCount);

		final ComposedType composedType = TypeManager.getInstance().getComposedType(Product.class);
		Product prod;
		args.clear();

		for (int i = 0; i < productsCount; i++)
		{
			args.put(Product.CODE, "Product-" + i);
			args.put(CatalogConstants.Attributes.Product.CATALOGVERSION, src);
			prod = (Product) composedType.newInstance(args);
			products.add(prod);
		}

		for (int i = level3Count - 1; i >= 0; i--)
		{
			final Category level3Cat = level3.get(i);
			level3Cat.setProducts(products);
		}
	}

	@Test
	public void testFullSync() throws InterruptedException, JaloGenericCreationException, JaloAbstractTypeException
	{
		fillCatalog();

		final CatalogManager categoryManager = CatalogManager.getInstance();

		final Map args = new HashMap();
		args.put(CatalogVersionSyncJob.CODE, "foo");
		args.put(CatalogVersionSyncJob.SOURCEVERSION, src);
		args.put(CatalogVersionSyncJob.TARGETVERSION, tgt);
		final int threads = CatalogVersionSyncJob.getDefaultMaxThreads(jaloSession.getTenant()) * 2;

		args.put(CatalogVersionSyncJob.MAXTHREADS, Integer.valueOf(threads));
		final CatalogVersionSyncJob job = categoryManager.createCatalogVersionSyncJob(args);
		final CatalogVersionSyncCronJob cronJob = (CatalogVersionSyncCronJob) job.newExecution();

		job.configureFullVersionSync(cronJob);

		job.perform(cronJob, false);

		Thread.sleep(2000);

		while (cronJob.isRunning())
		{
			Thread.sleep(1000);
		}

		Assert.assertFalse("cronjob is still running", cronJob.isRunning());

		final EnumerationValue success = cronJob.getSuccessResult();
		Assert.assertEquals(success, cronJob.getResult());

		Assert.assertEquals(level1.size() + level2.size() + level3.size(), tgt.getAllCategoryCount());
		Assert.assertEquals(products.size(), tgt.getAllProductCount());

		// test level1
		final List<Category> level1Tgt = new ArrayList<Category>(level1Count);
		for (int i = 0; i < level1Count; i++)
		{
			final Category srcCat = level1.get(i);
			final Category tgtCat = tgt.getCategory(srcCat.getCode());
			final List<ItemSyncTimestamp> itemSyncTimestampList = categoryManager.getSynchronizedCopies(srcCat);
			Assert.assertNotNull(srcCat);
			Assert.assertNotNull(tgtCat);
			Assert.assertEquals(srcCat.getCode(), tgtCat.getCode());
			Assert.assertEquals(1, itemSyncTimestampList.size());
			final ItemSyncTimestamp itemSyncTimestamp = itemSyncTimestampList.get(0);
			Assert.assertFalse(itemSyncTimestamp.isOutdatedAsPrimitive());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributeQualifiers());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributesOwnerJob());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributesScheduledTurn());
			Assert.assertEquals(srcCat.getModificationTime(), itemSyncTimestamp.getLastSyncSourceModifiedTime());
			level1Tgt.add(tgtCat);
		}

		// test level2
		final List<Category> level2Tgt = new ArrayList<Category>(level2Count);
		for (int i = 0; i < level2Count; i++)
		{
			final Category srcCat = level2.get(i);
			final Category tgtCat = tgt.getCategory(srcCat.getCode());
			final List<ItemSyncTimestamp> itemSyncTimestampList = categoryManager.getSynchronizedCopies(srcCat);
			Assert.assertNotNull(srcCat);
			Assert.assertNotNull(tgtCat);
			Assert.assertEquals(srcCat.getCode(), tgtCat.getCode());
			Assert.assertEquals(1, itemSyncTimestampList.size());
			final ItemSyncTimestamp itemSyncTimestamp = itemSyncTimestampList.get(0);
			Assert.assertFalse(itemSyncTimestamp.isOutdatedAsPrimitive());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributeQualifiers());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributesOwnerJob());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributesScheduledTurn());
			Assert.assertEquals(srcCat.getModificationTime(), itemSyncTimestamp.getLastSyncSourceModifiedTime());
			level2Tgt.add(tgtCat);
		}

		// test level3
		final List<Category> level3Tgt = new ArrayList<Category>(level3Count);
		for (int i = 0; i < level3Count; i++)
		{
			final Category srcCat = level3.get(i);
			final Category tgtCat = tgt.getCategory(srcCat.getCode());
			final List<ItemSyncTimestamp> itemSyncTimestampList = categoryManager.getSynchronizedCopies(srcCat);
			Assert.assertNotNull(srcCat);
			Assert.assertNotNull(tgtCat);
			Assert.assertEquals(srcCat.getCode(), tgtCat.getCode());
			Assert.assertEquals(1, itemSyncTimestampList.size());
			final ItemSyncTimestamp itemSyncTimestamp = itemSyncTimestampList.get(0);
			Assert.assertFalse(itemSyncTimestamp.isOutdatedAsPrimitive());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributeQualifiers());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributesOwnerJob());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributesScheduledTurn());
			Assert.assertEquals(srcCat.getModificationTime(), itemSyncTimestamp.getLastSyncSourceModifiedTime());
			level3Tgt.add(tgtCat);
		}

		// test level3
		final List<Product> productTgt = new ArrayList<Product>(productsCount);
		for (int i = 0; i < productsCount; i++)
		{
			final Product srcProd = products.get(i);
			final Product tgtProd = tgt.getProduct(srcProd.getCode());
			final List<ItemSyncTimestamp> itemSyncTimestampList = categoryManager.getSynchronizedCopies(srcProd);
			Assert.assertNotNull(srcProd);
			Assert.assertNotNull(tgtProd);
			Assert.assertEquals(tgtProd.getCode(), tgtProd.getCode());
			Assert.assertEquals(1, itemSyncTimestampList.size());
			final ItemSyncTimestamp itemSyncTimestamp = itemSyncTimestampList.get(0);
			Assert.assertFalse(itemSyncTimestamp.isOutdatedAsPrimitive());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributeQualifiers());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributesOwnerJob());
			Assert.assertNull(itemSyncTimestamp.getPendingAttributesScheduledTurn());
			Assert.assertEquals(srcProd.getModificationTime(), itemSyncTimestamp.getLastSyncSourceModifiedTime());

			productTgt.add(tgtProd);
		}

		// test relations
		for (int i = 0; i < level1Count; i++)
		{
			final Category tgtCat1 = level1Tgt.get(i);
			Assert.assertEquals(level2Tgt, tgtCat1.getSubcategories());
		}

		for (int i = 0; i < level2Count; i++)
		{
			final Category tgtCat2 = level2Tgt.get(i);
			Assert.assertEquals(level3Tgt, tgtCat2.getSubcategories());
		}

		for (int i = 0; i < level3Count; i++)
		{
			final Category tgtCat3 = level3Tgt.get(i);
			Assert.assertEquals(productTgt, tgtCat3.getProducts());
		}
	}


}
