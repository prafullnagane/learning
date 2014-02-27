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
package de.hybris.platform.ycommercewebservices.controller;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.customergroups.CustomerGroupFacade;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.ycommercewebservices.exceptions.InconsistentUseridException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


/**
 * Unit test for {@link CustomersController}
 */
@UnitTest
public class CustomersControllerUnitTest
{

	@Mock
	private CustomerFacade customerFacade;

	@Mock
	private UserFacade userFacade;

	@Mock
	private CustomerGroupFacade customerGroupFacade;

	private final CustomersController customerController = new CustomersController();


	@Before
	public void prepareController()
	{
		MockitoAnnotations.initMocks(this);
		customerController.setUserFacade(userFacade);
		customerController.setCustomerFacade(customerFacade);
		customerController.setCustomerGroupFacade(customerGroupFacade);
	}

	@Test
	public void testChangePasswordForMe() throws InconsistentUseridException
	{
		final CustomerData customerData = Mockito.mock(CustomerData.class);
		BDDMockito.given(customerData.getUid()).willReturn("me");

		BDDMockito.given(customerFacade.getCurrentCustomer()).willReturn(customerData);
		try
		{
			customerController.changePassword(/* "me", */"oldPasswd", "newPassword");
		}
		catch (final InconsistentUseridException ie)
		{
			Assert.fail("Should  be successfull in case users match");
		}
		BDDMockito.verify(customerFacade).changePassword("oldPasswd", "newPassword");

	}


	@Test
	public void testRegisterUser() throws InconsistentUseridException, UnknownIdentifierException, IllegalArgumentException,
			DuplicateUidException
	{
		final RegisterData registerData = new RegisterData();
		registerData.setLogin("aheartz@hybris.de");
		registerData.setFirstName("Anna");
		registerData.setLastName("Heartz");
		registerData.setTitleCode("abc");
		registerData.setPassword("1234");

		customerController.registerUser(registerData.getLogin(), registerData.getPassword(), registerData.getTitleCode(),
				registerData.getFirstName(), registerData.getLastName());

		BDDMockito.verify(customerFacade).register((RegisterData) Mockito.any());
	}

	@Test
	public void testGetAllCustomerGroups()
	{
		customerController.getAllCustomerGroupsForCustomer("testUserUid");
		BDDMockito.verify(customerGroupFacade).getCustomerGroupsForUser("testUserUid");
	}
}
