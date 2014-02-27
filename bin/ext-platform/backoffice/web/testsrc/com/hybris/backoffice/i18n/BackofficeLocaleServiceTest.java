/**
 * 
 */
package com.hybris.backoffice.i18n;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.servicelayer.i18n.I18NService;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.zkoss.util.Locales;
import org.zkoss.web.Attributes;
import org.zkoss.zk.ui.Session;


@UnitTest
public class BackofficeLocaleServiceTest
{
	@Mock
	private I18NService i18nService;

	@Mock
	private Session session;

	private BackofficeLocaleService localeService;

	@Before
	public void setUp()
	{
		localeService = new BackofficeLocaleService()
		{
			@Override
			protected Session getZKSession()
			{
				return session;
			}
		};
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testChangeCurrentLocale()
	{
		final Locale localeEN = Locale.ENGLISH;
		localeService.setCurrentLocale(localeEN);
		Mockito.verify(session, Mockito.times(1)).setAttribute(Attributes.PREFERRED_LOCALE, localeEN);
		Mockito.verify(i18nService, Mockito.times(1)).setCurrentLocale(localeEN);
		Assert.assertEquals(Locales.getThreadLocal(), localeEN);
		Assert.assertEquals(localeService.getCurrentLocale(), localeEN);

		final Locale localeDE = Locale.GERMAN;
		localeService.setCurrentLocale(localeDE);
		Mockito.verify(session, Mockito.times(1)).setAttribute(Attributes.PREFERRED_LOCALE, localeDE);
		Mockito.verify(i18nService, Mockito.times(1)).setCurrentLocale(localeDE);
		Assert.assertEquals(Locales.getThreadLocal(), localeDE);
		Assert.assertEquals(localeService.getCurrentLocale(), localeDE);
	}
}
