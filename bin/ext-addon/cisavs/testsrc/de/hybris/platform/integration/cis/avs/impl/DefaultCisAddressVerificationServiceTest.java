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

package de.hybris.platform.integration.cis.avs.impl;

import com.hybris.cis.api.avs.model.AvsResult;
import com.hybris.cis.api.model.CisAddress;
import com.hybris.cis.api.model.CisDecision;
import com.hybris.cis.client.AvsClient;
import com.hybris.commons.client.RestResponse;
import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.commerceservices.address.AddressErrorCode;
import de.hybris.platform.commerceservices.address.AddressFieldType;
import de.hybris.platform.commerceservices.address.AddressVerificationDecision;
import de.hybris.platform.commerceservices.address.data.AddressFieldErrorData;
import de.hybris.platform.commerceservices.address.data.AddressVerificationResultData;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.integration.cis.avs.populators.CisAvsAddressMatchingPopulator;
import de.hybris.platform.integration.cis.avs.strategies.CheckVerificationRequiredStrategy;
import de.hybris.platform.integration.commons.constants.OndemandcommonConstants;
import de.hybris.platform.integration.commons.hystrix.OndemandHystrixCommandConfiguration;
import de.hybris.platform.order.CartService;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.servicelayer.tenant.TenantService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.services.BaseStoreService;
import de.hybris.platform.testframework.TestUtils;
import java.util.Collections;
import junit.framework.Assert;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.configuration.Configuration;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


@UnitTest
public class DefaultCisAddressVerificationServiceTest
{
	private DefaultCisAddressVerificationService avs;
	@Mock
	private CheckVerificationRequiredStrategy checkVerificationRequiredStrategy;
	@Mock
	private AvsClient avsClient;
	@Mock
	private BaseStoreService baseStoreService;
	@Mock
	private RestResponse<AvsResult> restResponse;
	@Mock
	private SessionService sessionService;
	@Mock
	private TenantService tenantService;
	@Mock
	private Converter<AvsResult, AddressVerificationResultData> avrConverter;
	@Mock
	private Converter<AddressModel, CisAddress> cisAddressConverter;
	@Mock
	private CartService cartService;
	@Mock
	private BaseSiteService baseSiteService;
	@Mock
	private ConfigurationService configurationService;
	@Mock
	private Configuration configuration;

	@BeforeClass
	public static void beforeTestClass() throws Exception
	{
		// this is required for OndemandHystrixCommand, unfortunately Registry and JaloSession static classes are being used which can't be mocked.
		Registry.activateMasterTenant();
	}

	@Before
	public void init()
	{
		MockitoAnnotations.initMocks(this);
		final OndemandHystrixCommandConfiguration config = new OndemandHystrixCommandConfiguration();
		config.setGroupKey("123");
		config.setThreadPoolSize(1);
		config.setThreadTimeout(100000);
		config.setSessionService(sessionService);
		config.setBaseSiteService(baseSiteService);
		config.setConfigurationService(configurationService);
		Mockito.when(configurationService.getConfiguration()).thenReturn(configuration);
		Mockito.when(configuration.getProperty(OndemandcommonConstants.HYBRIS_SYSTEM_ISINITIALIZING_PROPERTY_KEY)).thenReturn(
				"false");
		Mockito.when(tenantService.getCurrentTenantId()).thenReturn("junit");

		avs = new DefaultCisAddressVerificationService();
		avs.setCisAvsAddressMatchingPopulator(new CisAvsAddressMatchingPopulator());
		avs.setApplyVerificationStrategy(checkVerificationRequiredStrategy);
		avs.setCisAvsResultAddressVerificationResultDataConverter(avrConverter);
		avs.setCisAvsAddressConverter(cisAddressConverter);
		avs.setAvsClient(avsClient);
		avs.setHystrixCommandConfig(config);
		avs.setBaseStoreService(baseStoreService);
		avs.setCartService(cartService);
	}

	@Test
	public void shouldReturnAcceptIfNoValidationRequired()
	{
		final AddressModel address = new AddressModel();
		Mockito.when(Boolean.valueOf(checkVerificationRequiredStrategy.isVerificationRequired(address))).thenReturn(Boolean.FALSE);
		final AddressVerificationResultData<AddressVerificationDecision, AddressFieldErrorData<AddressFieldType, AddressErrorCode>> result = avs
				.verifyAddress(address);
		Assert.assertEquals(AddressVerificationDecision.ACCEPT, result.getDecision());
		Assert.assertTrue(CollectionUtils.isEmpty(result.getSuggestedAddresses()));
	}

	@Test
	public void shouldReturnUnknownIfClientFails()
	{
		final AddressModel address = new AddressModel();
		Mockito.when(Boolean.valueOf(checkVerificationRequiredStrategy.isVerificationRequired(address))).thenReturn(Boolean.TRUE);
		Mockito.when(avsClient.verifyAddress(Mockito.any(String.class), Mockito.any(CisAddress.class))).thenThrow(
				new RuntimeException("Fake error from Client"));
		try
		{
			TestUtils.disableFileAnalyzer("Expected exception from avs client.");
			final AddressVerificationResultData<AddressVerificationDecision, AddressFieldErrorData<AddressFieldType, AddressErrorCode>> result = avs
					.verifyAddress(address);
			Assert.assertEquals(AddressVerificationDecision.UNKNOWN, result.getDecision());
		}
		finally
		{
			TestUtils.enableFileAnalyzer();
		}
	}

	@Test
	public void shouldReturnAcceptIfClientReturnAccept()
	{
		final AddressModel address = new AddressModel();
		Mockito.when(Boolean.valueOf(checkVerificationRequiredStrategy.isVerificationRequired(address))).thenReturn(Boolean.TRUE);
		final AvsResult avsResult = new AvsResult();
		avsResult.setSuggestedAddresses(Collections.EMPTY_LIST);
		avsResult.setDecision(CisDecision.ACCEPT);
		final AddressVerificationResultData<AddressVerificationDecision, AddressFieldErrorData<AddressFieldType, AddressErrorCode>> avrData = new AddressVerificationResultData<AddressVerificationDecision, AddressFieldErrorData<AddressFieldType, AddressErrorCode>>();
		avrData.setDecision(AddressVerificationDecision.ACCEPT);

		Mockito.when(restResponse.getResult()).thenReturn(avsResult);
		Mockito.when(avsClient.verifyAddress(Mockito.anyString(), Mockito.any(CisAddress.class))).thenReturn(restResponse);
		Mockito.when(avrConverter.convert(avsResult)).thenReturn(avrData);

		final AddressVerificationResultData<AddressVerificationDecision, AddressFieldErrorData<AddressFieldType, AddressErrorCode>> result = avs
				.verifyAddress(address);
		Assert.assertEquals(AddressVerificationDecision.ACCEPT, result.getDecision());
		Assert.assertTrue(CollectionUtils.isEmpty(result.getSuggestedAddresses()));
	}
}
