/**
 * 
 */
package com.hybris.backoffice.spring.security;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.user.impl.DefaultUserService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;


@UnitTest
public class BackofficeAuthenticationProviderTest
{
	@Mock
	private DefaultUserService userService;

	@Mock
	private Authentication mockedAuthentication;

	private BackofficeAuthenticationProvider backofficeAuthenticationProvider;


	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		backofficeAuthenticationProvider = new BackofficeAuthenticationProvider()
		{
			@Override
			protected Authentication coreAuthenticate(final Authentication authentication)
			{
				return mockedAuthentication;
			}
		};
		backofficeAuthenticationProvider.setUserService(userService);
	}

	@Test
	public void testAuthenticate()
	{
		// Make sure only employees can login to the backoffice
		Mockito.when(userService.getUserForUID("employee")).thenReturn(new EmployeeModel());
		Mockito.when(userService.getUserForUID("customer")).thenReturn(new CustomerModel());
		Mockito.when(userService.getUserForUID(Mockito.anyString(), Mockito.any(Class.class))).thenCallRealMethod();

		final Authentication employeeAuth = Mockito.mock(Authentication.class);
		Mockito.when(employeeAuth.getName()).thenReturn("employee");
		final Authentication customerAuth = Mockito.mock(Authentication.class);
		Mockito.when(customerAuth.getName()).thenReturn("customer");

		// should not throw an AuthenticationException
		final Authentication authenticate = backofficeAuthenticationProvider.authenticate(employeeAuth);
		Assert.assertNotNull(authenticate);


		// should throw an AuthenticationException
		boolean exceptionCaught = false;
		try
		{
			backofficeAuthenticationProvider.authenticate(customerAuth);
		}
		catch (final AuthenticationException e)
		{
			exceptionCaught = true;
		}
		Assert.assertTrue(exceptionCaught);
	}
}
