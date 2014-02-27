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
package de.hybris.platform.core;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.HybrisContextFactory.ApplicationContextFactory;
import de.hybris.platform.core.HybrisContextFactory.GlobalContextFactory;
import de.hybris.platform.spring.ctx.CloseAwareApplicationContext;
import de.hybris.platform.spring.ctx.TestBean;
import de.hybris.platform.spring.ctx.annot.TestComponent;

import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.collection.IsCollectionContaining;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 *
 */
@UnitTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test/dummy-test-spring.xml")
//just for sake to run an autowiring
public class HybrisContextFactoryTest
{


	private static final String FOO_CTX_ID = "foo id";
	private static final String EXT_ONE = "one";
	private static final String EXT_TWO = "two";

	private static final String GLOBAL_BEAN = "globalBean";
	private static final String BEAN_ONE = "beanOne";
	private static final String BEAN_TWO = "beanTwo";
	private static final String COMPONENT_SCAN_BEAN = "testComponent";

	@Value("classpath:test/global-test-spring.xml")
	private org.springframework.core.io.Resource globalContextResource;

	@Value("classpath:test/app-one-test-spring.xml")
	private org.springframework.core.io.Resource appOneContextResource;

	@Value("classpath:test/app-two-test-spring.xml")
	private org.springframework.core.io.Resource appTwoContextResource;


	@Value("classpath:test/app-annot-test-spring.xml")
	private org.springframework.core.io.Resource appAnnotContextResource;


	@Mock
	private Tenant tenantMock;

	@Before
	public void inject()
	{
		MockitoAnnotations.initMocks(this);

		Mockito.doReturn(FOO_CTX_ID).when(tenantMock).getTenantID();
	}


	@Test
	public void testHasAGlobalBean() throws Exception
	{
		final GenericApplicationContext mooContext = new TestGlobalContextFactory().build();

		Assert.assertThat(mooContext, not(nullValue()));

		Assert.assertThat(mooContext.getBean(GLOBAL_BEAN), not(nullValue()));
		Assert.assertThat(mooContext.getBean(GLOBAL_BEAN), instanceOf(de.hybris.platform.spring.ctx.TestBean.class));
	}


	@Test
	public void testApplicationContextHasGlobalContextAsAParent() throws Exception
	{
		final CloseAwareApplicationContext superContext = Mockito.mock(CloseAwareApplicationContext.class);


		final GenericApplicationContext mooContext = new TestApplicationContextFactory(superContext)
		{
			@Override
			protected void refreshContext(final GenericApplicationContext ctx)
			{
				//nop
			}
		}.build();

		Assert.assertThat(mooContext.getParent(), is((ApplicationContext) superContext));
	}

	@Test
	public void testHasALocallBean() throws Exception
	{



		final GenericApplicationContext mooContext = new TestApplicationContextFactory(new TestGlobalContextFactory().build())
				.build();

		Assert.assertThat(mooContext, not(nullValue()));

		Assert.assertThat(mooContext.getBean(BEAN_ONE), not(nullValue()));
		Assert.assertThat(mooContext.getBean(BEAN_ONE), IsInstanceOf.instanceOf(de.hybris.platform.spring.ctx.TestBean.class));

		Assert.assertThat(mooContext.getBean(BEAN_TWO), not(nullValue()));
		Assert.assertThat(mooContext.getBean(BEAN_TWO), IsInstanceOf.instanceOf(de.hybris.platform.spring.ctx.TestBean.class));

		Assert.assertThat(mooContext.getBean(BEAN_TWO), not(nullValue()));
		Assert.assertThat(mooContext.getBean(BEAN_TWO), IsInstanceOf.instanceOf(de.hybris.platform.spring.ctx.TestBean.class));

		//check inject beans

		final TestBean beanOne = mooContext.getBean(BEAN_ONE, TestBean.class);

		Assert.assertThat(beanOne.getMapping(), not(nullValue()));
		Assert.assertThat(Integer.valueOf(beanOne.getMapping().size()), Is.is(Integer.valueOf(2)));

		Assert.assertThat(beanOne.getMapping().keySet(), IsCollectionContaining.hasItems("subBeanOne", "subBeanTwo"));

		final TestBean beanTwo = mooContext.getBean(BEAN_TWO, TestBean.class);

		Assert.assertThat(beanTwo.getMapping(), not(nullValue()));
		Assert.assertThat(Integer.valueOf(beanTwo.getMapping().size()), Is.is(Integer.valueOf(2)));

		Assert.assertThat(beanTwo.getMapping().keySet(), IsCollectionContaining.hasItems("keyOne", "keyTwo"));

	}

	@Test
	public void testAssureHasAGlobalBean() throws Exception
	{
		final GenericApplicationContext mooContext = new TestGlobalContextFactory().build();

		Assert.assertThat(mooContext, not(nullValue()));

		Assert.assertThat(mooContext.getBean(GLOBAL_BEAN), not(nullValue()));
		Assert.assertThat(mooContext.getBean(GLOBAL_BEAN), instanceOf(de.hybris.platform.spring.ctx.TestBean.class));
	}

	@Test
	public void testAssureComponentScanIgnoresTenantAnnotation() throws Exception
	{
		final GenericApplicationContext annotContext = new TestApplicationContextFactory(new TestGlobalContextFactory().build())
		{
			@Override
			protected Resource getResource(final String extension, final String location)
			{
				return appAnnotContextResource;
			}
		}.build();

		Assert.assertThat(annotContext.getBean(COMPONENT_SCAN_BEAN), not(nullValue()));
		Assert.assertThat(annotContext.getBean(COMPONENT_SCAN_BEAN),
				instanceOf(de.hybris.platform.spring.ctx.annot.TestComponent.class));

		final TestComponent component = annotContext.getBean(COMPONENT_SCAN_BEAN, TestComponent.class);

		Assert.assertThat(component.getTestBean(), not(nullValue()));
	}


	class TestGlobalContextFactory extends GlobalContextFactory
	{

		@Override
		protected Collection<String> getPlatformExtensions()
		{
			return Arrays.asList(EXT_ONE);
		}

		@Override
		protected Resource getResource(final String extension, final String location)
		{
			return globalContextResource;
		}

	}


	class TestApplicationContextFactory extends ApplicationContextFactory
	{

		TestApplicationContextFactory(final GenericApplicationContext globalContext)
		{
			super(FOO_CTX_ID, globalContext);
		}


		@Override
		protected Collection<String> getPlatformExtensions()
		{
			return Arrays.asList(EXT_ONE, EXT_TWO);
		}

		@Override
		protected Resource getResource(final String extension, final String location)
		{
			if (EXT_ONE.equalsIgnoreCase(extension))
			{
				return appOneContextResource;
			}
			else if (EXT_TWO.equalsIgnoreCase(extension))
			{
				return appTwoContextResource;
			}
			return super.getResource(extension, location);
		}

	}




}
