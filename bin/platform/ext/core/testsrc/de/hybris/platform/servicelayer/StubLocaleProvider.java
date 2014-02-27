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
package de.hybris.platform.servicelayer;

import de.hybris.platform.servicelayer.internal.model.impl.LocaleProvider;

import java.util.List;
import java.util.Locale;


public class StubLocaleProvider implements LocaleProvider
{
	private final Locale locale;

	public StubLocaleProvider(final Locale locale)
	{
		this.locale = locale;
	}

	@Override
	public Locale getCurrentDataLocale()
	{
		return this.locale;
	}

	@Override
	public List<Locale> getFallbacks(final Locale requestedLocale)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isFallbackEnabled()
	{
		return false;
	}

	@Override
	public Locale toDataLocale(final Locale external)
	{
		return this.locale;
	}
}
