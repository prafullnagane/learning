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
package de.hybris.platform.servicelayer.interceptor;

import static org.junit.Assert.assertEquals;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.RegionModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalBaseTest;
import de.hybris.platform.servicelayer.i18n.I18NService;
import de.hybris.platform.servicelayer.interceptor.impl.DefaultInterceptorRegistry;
import de.hybris.platform.servicelayer.internal.converter.ConverterRegistry;
import de.hybris.platform.servicelayer.internal.converter.ModelConverter;
import de.hybris.platform.servicelayer.internal.model.ModelContext;
import de.hybris.platform.servicelayer.internal.model.impl.DefaultModelService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.session.SessionService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * This junit test tests the Partof remove interceptor and the partof save interceptor
 */
@IntegrationTest
public class RemoveInterceptorTest extends ServicelayerTransactionalBaseTest
{

	@Resource
	private ModelService modelService;

	@Resource
	private I18NService i18nService;

	@Resource
	private SessionService sessionService;

	private DefaultInterceptorRegistry reg = null;

	private final List<ItemModel> gotRegionInterceptors = new ArrayList<ItemModel>();

	@Before
	public void setUp() throws Exception
	{
		CountryModel country = modelService.create(CountryModel.class);
		country.setIsocode("DE");
		country.setActive(Boolean.TRUE);
		modelService.save(country);

		final RegionModel region = modelService.create(RegionModel.class);
		region.setIsocode("DE-BW");
		region.setCountry(country);
		modelService.save(region);

		country = modelService.create(CountryModel.class);
		country.setIsocode("US");
		country.setActive(Boolean.TRUE);
		modelService.save(country);

		reg = (DefaultInterceptorRegistry) ((DefaultModelService) modelService).getInterceptorRegistry();

		gotRegionInterceptors.clear();
		reg.registerInterceptor("Region", new RegionRemoveInterceptor(), Collections.EMPTY_SET);
	}

	@Test
	public void testRemovePartOfAttributes()
	{
		final CountryModel germany = i18nService.getCountry("DE");
		Assert.assertNotNull(germany);

		final CountryModel usa = i18nService.getCountry("US");
		Assert.assertNotNull(usa);

		final Collection<RegionModel> beforeCollection = new HashSet<RegionModel>(germany.getRegions());
		beforeCollection.addAll(usa.getRegions());
		Assert.assertFalse(beforeCollection.isEmpty());

		for (final RegionModel reg : beforeCollection)
		{
			Assert.assertFalse(modelService.isRemoved(reg));
		}

		modelService.removeAll(Arrays.asList(germany, usa));

		for (final RegionModel reg : beforeCollection)
		{
			Assert.assertTrue(modelService.isRemoved(reg));
		}
		Assert.assertTrue(modelService.isRemoved(germany));
		Assert.assertTrue(modelService.isRemoved(usa));
		Assert.assertEquals(gotRegionInterceptors.size(), beforeCollection.size());
	}


	//	/*
	//	 * Test scenario:
	//	 * m1 -> m11
	//	 *    -> m12 -> m121
	//	 *           -> m122
	//	 *    -> m13 -> m131
	//	 * m2 ->
	//	 * m3 -> m31 -> m311
	//	 *           -> m312
	//	 *           
	//	 * expected: [m11, m121, m122, m12, m131, m13, m1, m2, m311, m312, m31, m3]
	//	 */
	@Test
	public void testRemovalScheduling()
	{
		final Object m1 = "m1";
		final Object m11 = "m11";
		final Object m12 = "m12";
		final Object m121 = "m121";
		final Object m122 = "m122";
		final Object m13 = "m13";
		final Object m131 = "m131";
		final Object m2 = "m2";
		final Object m3 = "m3";
		final Object m31 = "m31";
		final Object m311 = "m311";
		final Object m312 = "m312";

		final Map<Object, Object[]> containments = new HashMap<Object, Object[]>();
		containments.put(m1, new Object[]
		{ m11, m12, m13 });
		containments.put(m12, new Object[]
		{ m121, m122 });
		containments.put(m13, new Object[]
		{ m131 });
		containments.put(m3, new Object[]
		{ m31 });
		containments.put(m31, new Object[]
		{ m311, m312 });

		final List<Object> expectedRemovalSchedule = Arrays.asList(//
				m11, m121, m122, m12, m131, m13, m1, m2, m311, m312, m31, m3//
				);

		final List<Object> removed = new ArrayList<Object>();

		final List<Object> expectedNotifySchedule = Arrays.asList(//
				m1, m11, m12, m121, m122, m13, m131, m2, m3, m31, m311, m312//
				);

		final List<Object> notified = new ArrayList<Object>();

		final ModelConverter mockConverter = new TestModelConverter()
		{
			@Override
			public void remove(final Object model)
			{
				removed.add(model);
			}

			@Override
			public boolean isRemoved(final Object model)
			{
				// all are not removed
				return false;
			}

			@Override
			public Object getSource(final Object model)
			{
				// use same instance
				return model;
			}
		};

		final ModelService mockService = new DefaultModelService()
		{
			// mock sub models
			@Override
			protected Set<Object> notifyRemoveInterceptors(final Object model, final InterceptorContext ctx)
			{
				notified.add(model);
				final Object[] subElements = containments.get(model);
				return subElements != null ? new LinkedHashSet<Object>(Arrays.asList(subElements)) : Collections.EMPTY_SET;
			}

			@Override
			protected void doDetach(final Object model, final Object source, final ModelConverter conv, final ModelContext ctx)
			{
				// do nothing
			}

			@Override
			protected ModelConverter getModelConverterByModel(final Object model)
			{
				return mockConverter;
			}

			@Override
			public SessionService lookupSessionService()
			{
				return sessionService;
			}
		};

		mockService.removeAll(Arrays.asList(m1, m2, m3));
		assertEquals(expectedRemovalSchedule, removed);
		assertEquals(expectedNotifySchedule, notified);

		removed.clear();
		notified.clear();
		mockService.remove(m2);
		assertEquals(Arrays.asList(m2), removed);
		assertEquals(Arrays.asList(m2), notified);

		removed.clear();
		notified.clear();
		mockService.remove(m1);
		assertEquals(Arrays.asList(m11, m121, m122, m12, m131, m13, m1), removed);
		assertEquals(Arrays.asList(m1, m11, m12, m121, m122, m13, m131), notified);
	}

	//	/*
	//	 * Test scenario 2:
	//	 * m1 -> m11 -> m111
	//	 *    -> m12 -> m121
	//	 *           -> m3
	//	 * m2 -> m4
	//	 * m3 -> m111
	//	 * m4 -> m2
	//	 * m5 -> m51 -> m5 //actually illegal
	//	 * expected: [m111, m11, m121, m3, m12, m1, m4, m2, m5, m51]
	//	 * 
	//	 */
	@Test
	public void testRemovalScheduling2()
	{
		final Object m1 = "m1";
		final Object m11 = "m11";
		final Object m111 = "m111";
		final Object m121 = "m121";
		final Object m3 = "m3";
		final Object m12 = "m12";
		final Object m2 = "m2";
		final Object m4 = "m4";
		final Object m5 = "m5";
		final Object m51 = "m51";

		final Map<Object, Object[]> containments = new HashMap<Object, Object[]>();
		containments.put(m1, new Object[]
		{ m11, m12 });
		containments.put(m11, new Object[]
		{ m111 });
		containments.put(m12, new Object[]
		{ m121, m3 });
		containments.put(m2, new Object[]
		{ m4 });
		containments.put(m3, new Object[]
		{ m111 });
		containments.put(m4, new Object[]
		{ m2 });
		containments.put(m5, new Object[]
		{ m51 });
		containments.put(m51, new Object[]
		{ m5 });

		final List<Object> expectedRemovalSchedule = Arrays.asList(//
				m111, m11, m121, m3, m12, m1, m4, m2, m51, m5//
				);

		final List<Object> removed = new ArrayList<Object>();

		final List<Object> expectedNotifySchedule = Arrays.asList(//
				m1, m11, m111, m12, m121, m3, m2, m4, m5, m51//
				);

		final List<Object> notified = new ArrayList<Object>();

		final ModelConverter mockConverter = new TestModelConverter()
		{
			@Override
			public void remove(final Object model)
			{
				removed.add(model);
			}

			@Override
			public boolean isRemoved(final Object model)
			{
				// all are not removed
				return false;
			}

			@Override
			public Object getSource(final Object model)
			{
				// use same instance
				return model;
			}
		};

		final ModelService mockService = new DefaultModelService()
		{
			// mock sub models
			@Override
			protected Set<Object> notifyRemoveInterceptors(final Object model, final InterceptorContext ctx)
			{
				notified.add(model);
				final Object[] subElements = containments.get(model);
				return subElements != null ? new LinkedHashSet<Object>(Arrays.asList(subElements)) : Collections.EMPTY_SET;
			}

			@Override
			protected void doDetach(final Object model, final Object source, final ModelConverter conv, final ModelContext ctx)
			{
				// do nothing
			}

			@Override
			protected ModelConverter getModelConverterByModel(final Object model)
			{
				return mockConverter;
			}

			@Override
			public SessionService lookupSessionService()
			{
				return sessionService;
			}
		};

		mockService.removeAll(Arrays.asList(m1, m2, m3, m4, m5));
		assertEquals(expectedRemovalSchedule, removed);
		assertEquals(expectedNotifySchedule, notified);

		removed.clear();
		notified.clear();
		mockService.remove(m2);
		assertEquals(Arrays.asList(m4, m2), removed);
		assertEquals(Arrays.asList(m2, m4), notified);

		removed.clear();
		notified.clear();
		mockService.remove(m1);
		assertEquals(Arrays.asList(m111, m11, m121, m3, m12, m1), removed);
		assertEquals(Arrays.asList(m1, m11, m111, m12, m121, m3), notified);
	}

	public class RegionRemoveInterceptor implements RemoveInterceptor
	{
		@Override
		public void onRemove(final Object model, final InterceptorContext ctx) throws InterceptorException
		{
			if (model instanceof RegionModel)
			{
				gotRegionInterceptors.add((RegionModel) model);
			}
		}

	}


	private class TestModelConverter implements ModelConverter
	{
		@Override
		public void setAttributeValue(final Object model, final String attributeQualifier, final Object value)
		{
			throw new RuntimeException();
		}

		@Override
		public void save(final Object model, final Collection<String> exclude)
		{
			throw new RuntimeException();
		}

		@Override
		public void remove(final Object model)
		{
			throw new RuntimeException();
		}

		@Override
		public void reload(final Object model)
		{
			throw new RuntimeException();
		}

		@Override
		public Object load(final Object source)
		{
			throw new RuntimeException();
		}

		@Override
		public boolean isUpToDate(final Object model)
		{
			throw new RuntimeException();
		}

		@Override
		public boolean isRemoved(final Object model)
		{
			throw new RuntimeException();
		}

		@Override
		public boolean isNew(final Object model)
		{
			throw new RuntimeException();
		}

		@Override
		public boolean isModified(final Object model, final String attribute, final Locale loc)
		{
			throw new RuntimeException();
		}

		@Override
		public boolean isModified(final Object model, final String attribute)
		{
			throw new RuntimeException();
		}

		@Override
		public boolean isModified(final Object model)
		{
			throw new RuntimeException();
		}

		@Override
		public void init(final ConverterRegistry registry)
		{
			throw new RuntimeException();
		}

		@Override
		public String getType(final Object model)
		{
			throw new RuntimeException();
		}

		@Override
		public Object getSource(final Object model)
		{
			throw new RuntimeException();
		}

		@Override
		public Map<String, Set<Locale>> getDirtyAttributes(final Object model)
		{
			throw new RuntimeException();
		}

		@Override
		public Object getAttributeValue(final Object model, final String attributeQualifier)
		{
			throw new RuntimeException();
		}

		@Override
		public boolean exists(final Object model)
		{
			throw new RuntimeException();
		}

		@Override
		public Object create(final String type)
		{
			throw new RuntimeException();
		}

		@Override
		public void beforeAttach(final Object model, final ModelContext ctx)
		{
			throw new RuntimeException();
		}

		@Override
		public void afterDetach(final Object model, final ModelContext ctx)
		{
			throw new RuntimeException();
		}
	}

}
