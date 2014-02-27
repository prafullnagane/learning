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
package de.hybris.platform.masterserver.impl;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.PK;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

import org.apache.commons.lang.math.RandomUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.google.common.collect.Sets;
import com.hybris.encryption.symmetric.SymmetricEncryptor;
import com.hybris.statistics.collector.BusinessStatisticsCollector;
import com.hybris.statistics.collector.SystemStatisticsCollector;


@UnitTest
public class DefaultStatisticsGatewayTest
{
	private DefaultStatisticsGateway statGateway, statGateway2;
	private SymmetricEncryptor payloadEncryptor;
	@Mock
	private BusinessStatisticsCollector businessCollector;
	@Mock
	private SystemStatisticsCollector systemCollector;

	private boolean generateStats = false;

	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
		final Set<BusinessStatisticsCollector> businessCollectors = Sets.newHashSet(businessCollector);
		final Set<SystemStatisticsCollector> systemCollectors = Sets.newHashSet(systemCollector);
		final Map<String, String> existingWebModules = new HashMap<String, String>();
		existingWebModules.put("/hac", "hac");
		existingWebModules.put("/productcockpit", "productcockpit");

		payloadEncryptor = new SymmetricEncryptor()
		{

			@Override
			public String encrypt(final String plainText, final String key)
			{
				// pass text (encryptor is tested separately)
				return plainText;
			}

			@Override
			public String decrypt(final String cryptedText, final String key)
			{
				return null;
			}
		};

		statGateway = new DefaultStatisticsGateway(businessCollectors, systemCollectors, existingWebModules, payloadEncryptor)
		{
			@Override
			protected boolean isGenerateStatsRequired()
			{
				return generateStats;
			}

			@Override
			protected PK getCurrentUserPk()
			{
				return PK.createFixedUUIDPK(0, RandomUtils.nextLong());
			}

			@Override
			protected boolean isNotDevelopmentLicense()
			{
				return true;
			}
		};

		statGateway2 = new DefaultStatisticsGateway(businessCollectors, systemCollectors, existingWebModules, payloadEncryptor)
		{
			@Override
			protected boolean isGenerateStatsRequired()
			{
				return generateStats;
			}

			@Override
			protected PK getCurrentUserPk()
			{
				return null;
			}

			@Override
			protected boolean isNotDevelopmentLicense()
			{
				return true;
			}
		};

	}

	@Test
	public void shouldDontReturnPayloadIfItIsNotATime()
	{
		// given
		generateStats = false;

		// when
		final StatisticsPayload encodedStatistics = statGateway.getStatisticsPayload();

		// then
		assertThat(encodedStatistics).isNull();
	}

	@Test
	public void shouldDontReturnPayloadIfNonOfStatisticCollectorsReturnsDataAndItIsTimeToGenerateData()
	{
		// given
		generateStats = true;
		given(businessCollector.collectStatistics()).willReturn(null);
		given(systemCollector.collectStatistics()).willReturn(null);

		// when
		final StatisticsPayload encodedStatistics1 = statGateway2.getStatisticsPayload();

		// then
		assertThat(encodedStatistics1).isNull();
	}

	@Test
	public void shouldReturnPayloadWhenAtLeastOneOfStatisticCollectorsReturnDataAndItIsTimeToGenerateData()
	{
		// given
		final Map<String, Map<String, Object>> businessStats = new HashMap<String, Map<String, Object>>();
		businessStats.put("backOfficeUsers", new HashMap<String, Object>());
		businessStats.get("backOfficeUsers").put("employees", Integer.valueOf(5));
		businessStats.get("backOfficeUsers").put("customers", Integer.valueOf(10));

		final Map<String, Map<String, Object>> systemStats = new HashMap<String, Map<String, Object>>();
		systemStats.put("cpu", new HashMap<String, Object>());
		systemStats.get("cpu").put("numCPU", Integer.valueOf(8));

		generateStats = true;
		given(businessCollector.collectStatistics()).willReturn(businessStats);
		given(systemCollector.collectStatistics()).willReturn(systemStats);

		// when
		final StatisticsPayload encodedStatistics1 = statGateway2.getStatisticsPayload();

		// then
		assertThat(encodedStatistics1).isNotNull();
		assertThat(encodedStatistics1.getEncodedData()).isEqualTo(
				"{\"system\":{\"cpu\":{\"numCPU\":8}},\"business\":{\"backOfficeUsers\":{\"customers\":10,\"employees\":5}}}");
	}

	@Test
	public void shouldUpdateLoggedInBackOfficeUsersConcurrently() throws InterruptedException
	{
		// given
		generateStats = true;
		given(businessCollector.collectStatistics()).willReturn(null);
		given(systemCollector.collectStatistics()).willReturn(null);
		final CountDownLatch latch = new CountDownLatch(500);

		// when
		for (int i = 0; i < 500; i++)
		{
			new Thread(new Runnable()
			{

				@Override
				public void run()
				{
					try
					{
						statGateway.updateLoggedInUsersStats("/hac");
					}
					finally
					{
						latch.countDown();
					}
				}
			}).start();
		}
		latch.await();
		final StatisticsPayload encodedStatistics = statGateway.getStatisticsPayload();

		// then
		assertThat(encodedStatistics).isNotNull();
		assertThat(encodedStatistics.getEncodedData()).contains("\"hac\":500");
	}
}
