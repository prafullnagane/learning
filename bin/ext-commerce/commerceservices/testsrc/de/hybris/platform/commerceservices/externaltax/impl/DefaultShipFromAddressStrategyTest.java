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
package de.hybris.platform.commerceservices.externaltax.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;
import de.hybris.platform.storelocator.model.PointOfServiceModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.BDDMockito.given;

@UnitTest
public class DefaultShipFromAddressStrategyTest
{
	private DefaultShipFromAddressStrategy defaultShipFromAddressStrategy;

	@Mock
	private BaseStoreService baseStoreService;

	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		defaultShipFromAddressStrategy = new DefaultShipFromAddressStrategy();
		defaultShipFromAddressStrategy.setBaseStoreService(baseStoreService);
	}

	@Test
	public void shouldGetShipFromAddressesForOrder()
	{
		final AbstractOrderModel abstractOrder = Mockito.mock(AbstractOrderModel.class);
		final BaseStoreModel baseStoreModel = Mockito.mock(BaseStoreModel.class);
		final PointOfServiceModel ps1 = Mockito.mock(PointOfServiceModel.class);
		final PointOfServiceModel ps2 = Mockito.mock(PointOfServiceModel.class);
		final AddressModel address1 = Mockito.mock(AddressModel.class);
		final AddressModel address2 = Mockito.mock(AddressModel.class);
		final AbstractOrderEntryModel entry1 = Mockito.mock(AbstractOrderEntryModel.class);
		final AbstractOrderEntryModel entry2 = Mockito.mock(AbstractOrderEntryModel.class);

		given(baseStoreService.getCurrentBaseStore()).willReturn(baseStoreModel);
		given(abstractOrder.getStore()).willReturn(baseStoreModel);
		// default point of service if entry does not have one set
		given(baseStoreModel.getPointsOfService()).willReturn(Arrays.asList(ps2));
		given(abstractOrder.getEntries()).willReturn(Arrays.asList(entry1, entry2));

		given(entry1.getDeliveryPointOfService()).willReturn(null);
		given(entry2.getDeliveryPointOfService()).willReturn(ps1);
		given(ps1.getAddress()).willReturn(address1);
		given(ps2.getAddress()).willReturn(address2);

		final Map<AbstractOrderEntryModel, AddressModel> shipFromAddressesForOrder = defaultShipFromAddressStrategy.getShipFromAddressesForOrder(abstractOrder);
		Assert.assertNotNull(shipFromAddressesForOrder);
		// should default to ps2 address
		Assert.assertEquals(address2, shipFromAddressesForOrder.get(entry1));
		// should be address that was assigned to entry2 which is ps1
		Assert.assertEquals(address1, shipFromAddressesForOrder.get(entry2));
	}

	@Test
	public void shouldGetShipFromAddressForOrder()
	{
		final AbstractOrderModel abstractOrder = Mockito.mock(AbstractOrderModel.class);
		final BaseStoreModel baseStoreModel = Mockito.mock(BaseStoreModel.class);
		final PointOfServiceModel pointOfServiceModel = Mockito.mock(PointOfServiceModel.class);
		final AddressModel addressModel = Mockito.mock(AddressModel.class);
		final AbstractOrderEntryModel entryModel = Mockito.mock(AbstractOrderEntryModel.class);

		given(baseStoreService.getCurrentBaseStore()).willReturn(baseStoreModel);
		given(abstractOrder.getStore()).willReturn(baseStoreModel);
		given(baseStoreModel.getPointsOfService()).willReturn(Collections.singletonList(pointOfServiceModel));
		given(pointOfServiceModel.getAddress()).willReturn(addressModel);
		given(abstractOrder.getEntries()).willReturn(Collections.singletonList(entryModel));
		given(entryModel.getDeliveryPointOfService()).willReturn(pointOfServiceModel);

		Assert.assertEquals(addressModel, defaultShipFromAddressStrategy.getShipFromAddressForOrder(abstractOrder));
	}

	@Test
	public void shouldGetShipFromAddressForOrderEntriesWithoutPointOfService()
	{
		final AbstractOrderModel abstractOrder = Mockito.mock(AbstractOrderModel.class);
		final BaseStoreModel baseStoreModel = Mockito.mock(BaseStoreModel.class);
		final PointOfServiceModel pointOfServiceModel = Mockito.mock(PointOfServiceModel.class);
		final AddressModel addressModel = Mockito.mock(AddressModel.class);
		final AbstractOrderEntryModel entryModel = Mockito.mock(AbstractOrderEntryModel.class);

		given(baseStoreService.getCurrentBaseStore()).willReturn(baseStoreModel);
		given(abstractOrder.getStore()).willReturn(baseStoreModel);
		given(baseStoreModel.getPointsOfService()).willReturn(Collections.singletonList(pointOfServiceModel));
		given(pointOfServiceModel.getAddress()).willReturn(addressModel);
		given(abstractOrder.getEntries()).willReturn(Collections.singletonList(entryModel));

		Assert.assertEquals(addressModel, defaultShipFromAddressStrategy.getShipFromAddressForOrder(abstractOrder));
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldFailIfBaseSiteIsMissing()
	{
		final AbstractOrderModel abstractOrder = Mockito.mock(AbstractOrderModel.class);
		final AbstractOrderEntryModel entry = Mockito.mock(AbstractOrderEntryModel.class);
		given(abstractOrder.getEntries()).willReturn(Collections.singletonList(entry));
		defaultShipFromAddressStrategy.getShipFromAddressForOrder(abstractOrder);
	}

}
