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
package de.hybris.platform.servicelayer.model;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.constants.ServicelayerConstants;
import de.hybris.platform.servicelayer.internal.converter.util.ModelUtils;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;


@IntegrationTest
public class ItemModelFetchLiteralTest extends ItemModelTest
{
	private static final Logger LOG = Logger.getLogger(ItemModelFetchLiteralTest.class); //NOPMD

	@Override
	@Test
	public void testLoadingNormalAttribute()
	{

		final String expectedCode = defaultProduct.getCode();
		final ProductModel model = modelService.get(defaultProduct);

		assertTrue(ModelUtils.existsMethod(model.getClass(), "setCode"));
		assertTrue(ModelUtils.existsMethod(model.getClass(), "getCode"));
		assertTrue(ModelUtils.existsField(model.getClass(), "_code"));


		assertEquals(expectedCode, getLoadedValue(model, "code"));
		assertEquals(expectedCode, ModelUtils.getFieldValue(model, "_code"));


		assertEquals(expectedCode, model.getCode());

		modelService.save(model);


		assertEquals(expectedCode, getLoadedValue(model, "code"));
		assertEquals(expectedCode, ModelUtils.getFieldValue(model, "_code"));

		assertEquals(expectedCode, model.getCode());

		model.setCode("test");

		assertEquals(expectedCode, getLoadedValue(model, "code"));
		assertEquals("test", ModelUtils.getFieldValue(model, "_code"));
		assertEquals("test", model.getCode());

		assertEquals(expectedCode, defaultProduct.getCode());

		modelService.refresh(model);

		assertEquals(expectedCode, getLoadedValue(model, "code"));
		assertEquals(expectedCode, ModelUtils.getFieldValue(model, "_code"));

		assertEquals(expectedCode, model.getCode());

		assertEquals(expectedCode, defaultProduct.getCode());

		model.setCode("test");

		assertEquals(expectedCode, getLoadedValue(model, "code"));
		assertEquals("test", ModelUtils.getFieldValue(model, "_code"));
		assertEquals("test", model.getCode());

		assertEquals(expectedCode, defaultProduct.getCode());

		modelService.save(model);

		assertEquals("test", getLoadedValue(model, "code"));
		assertEquals("test", ModelUtils.getFieldValue(model, "_code"));

		assertEquals("test", model.getCode());

		assertEquals("test", defaultProduct.getCode());

	}


	@Override
	@Test
	public void testLoadingPrimitiveAttribute()
	{

		final String QUALIFIER = "loginDisabled";
		final Boolean value = Boolean.TRUE;

		UserModel model = modelService.create(CustomerModel.class);
		model.setUid("C" + System.nanoTime());
		model.setLoginDisabled(value.booleanValue());
		modelService.save(model);
		final PK pk = model.getPk();
		modelService.detach(model);

		// get fresh copy
		model = modelService.get(pk);

		assertTrue(ModelUtils.existsMethod(model.getClass(), "setLoginDisabled"));
		assertTrue(ModelUtils.existsMethod(model.getClass(), "isLoginDisabled"));
		assertTrue(ModelUtils.existsField(model.getClass(), "_" + QUALIFIER));


		assertEquals(value, getLoadedValue(model, QUALIFIER));
		assertEquals(value, ModelUtils.getFieldValue(model, "_" + QUALIFIER));

		assertEquals(value.booleanValue(), model.isLoginDisabled());

		modelService.save(model);

		assertEquals(value, getLoadedValue(model, QUALIFIER));
		assertEquals(value, ModelUtils.getFieldValue(model, "_" + QUALIFIER));

		assertEquals(value.booleanValue(), model.isLoginDisabled());

		final Boolean newValue = Boolean.valueOf(!value.booleanValue());
		model.setLoginDisabled(newValue.booleanValue());

		assertEquals(value, getLoadedValue(model, QUALIFIER));
		assertEquals(newValue, ModelUtils.getFieldValue(model, "_" + QUALIFIER));
		assertEquals(newValue.booleanValue(), model.isLoginDisabled());

		modelService.refresh(model);


		assertEquals(value, getLoadedValue(model, QUALIFIER));
		assertEquals(value, ModelUtils.getFieldValue(model, "_" + QUALIFIER));

		assertEquals(value.booleanValue(), model.isLoginDisabled());

		model.setLoginDisabled(newValue.booleanValue());

		assertEquals(value, getLoadedValue(model, QUALIFIER));
		assertEquals(newValue, ModelUtils.getFieldValue(model, "_" + QUALIFIER));
		assertEquals(newValue.booleanValue(), model.isLoginDisabled());

		modelService.save(model);

		assertEquals(newValue, getLoadedValue(model, QUALIFIER));
		assertEquals(newValue, ModelUtils.getFieldValue(model, "_" + QUALIFIER));

		assertEquals(newValue.booleanValue(), model.isLoginDisabled());

	}

	@Override
	protected String getPrefetchMode()
	{
		return ServicelayerConstants.VALUE_PREFETCH_LITERAL;
	}

	@Override
	protected Map<String, Class<? extends ItemModel>> getModelConvertersToReload()
	{
		final Map<String, Class<? extends ItemModel>> map = new HashMap<String, Class<? extends ItemModel>>();
		map.put("Product", ProductModel.class);
		map.put("Customer", CustomerModel.class);
		return map;
	}

}
