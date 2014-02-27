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
package de.hybris.platform.lucenesearch.jalo;

import static de.hybris.platform.testframework.Assert.assertCollection;
import static de.hybris.platform.testframework.Assert.assertCollectionElements;
import static de.hybris.platform.testframework.Assert.list;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.product.ProductManager;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.testframework.HybrisJUnit4TransactionalTest;

import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class PostQueryFilterTest extends HybrisJUnit4TransactionalTest
{
	LuceneIndex index;
	IndexConfiguration indexConfig;
	Product product;
	Language langDe;
	SessionContext ctxDe;

	@Before
	public void setUp() throws Exception
	{
		assertNotNull(langDe = jaloSession.getC2LManager().createLanguage("test-de2"));
		ctxDe = jaloSession.createSessionContext();
		ctxDe.setLanguage(langDe);
		assertNotNull(index = LucenesearchManager.getInstance().createLuceneIndex("PostQueryFilterTest"));
		index.setPostQueryFilterClassName(TestPostQueryFilter.class.getName());
		index.createLanguageConfiguration(langDe);
		final ComposedType productType = jaloSession.getTypeManager().getComposedType(Product.class);
		indexConfig = index.createIndexConfiguration(productType, list(productType.getAttributeDescriptor(Product.CODE)));
		assertNotNull(product = ProductManager.getInstance().createProduct("product"));
	}

	@Test
	public void test()
	{
		index.rebuildIndex();
		assertCollectionElements(index.searchItems(ctxDe, "\"product\"", 0, -1).getResult(), product);
		product.setCode("qroduct");
		index.rebuildIndex();
		assertCollection(list(), index.searchItems(ctxDe, "\"product\"", 0, -1).getResult());
		assertCollection(list(), index.searchItems(ctxDe, "\"qroduct\"", 0, -1).getResult());
		index.setPostQueryFilterClassName(null);
		assertCollectionElements(index.searchItems(ctxDe, "\"qroduct\"", 0, -1).getResult(), product);
	}

	@Test
	public void testRange()
	{
		product.setCode("product text");
		final Product p2 = ProductManager.getInstance().createProduct("product 2 and text");
		assertNotNull(p2);
		final Product p3 = ProductManager.getInstance().createProduct("product 3 and even more text");
		assertNotNull(p3);
		index.rebuildIndex();
		SearchResult sr = index.searchItems(ctxDe, "text", 0, -1);
		assertEquals(list(product, p2, p3), sr.getResult());
		assertEquals(3, sr.getTotalCount());
		p2.setCode("qroduct 2 and text");
		index.updateIndexForItem(p2);
		sr = index.searchItems(ctxDe, "text", 0, -1);
		assertEquals(list(product, p3), sr.getResult());
		assertEquals(3, sr.getTotalCount());
		// Pagination is different in 3.3 than in 2.9.1
		//sr = index.searchItems(ctxDe, "text", 1, 2);
		//assertEquals(list(p3), sr.getResult());
		//assertEquals(2, sr.getTotalCount());
	}
}
