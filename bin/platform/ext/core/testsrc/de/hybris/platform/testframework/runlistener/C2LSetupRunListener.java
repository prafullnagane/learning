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
package de.hybris.platform.testframework.runlistener;

import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;


/**
 * Checks for each atomic test if the baseCurrency was changed of if languages were added/removed. Print a LOG.ERROR if
 * one of them do occure.
 */
public class C2LSetupRunListener extends RunListener
{
	private static final Logger LOG = Logger.getLogger(C2LSetupRunListener.class.getName());

	@Override
	public void testStarted(final Description description) throws Exception
	{
		readBaseCurrencySetup();
		readLanguageSetup();
	}

	@Override
	public void testFinished(final Description description) throws Exception
	{
		checkBaseCurrencySetup(description);
		checkLanguageSetup(description);
	}

	// --------------------------------------------------------------------
	// --- Internal
	// --------------------------------------------------------------------

	private String baseCurrencyBefore;
	private final Set<String> languagesBefore = new HashSet<String>();
	private final Set<String> languagesAfter = new HashSet<String>();


	private void readLanguageSetup()
	{
		languagesBefore.clear();
		for (final Language l : C2LManager.getInstance().getAllLanguages())
		{
			languagesBefore.add(l.getIsoCode());
		}
	}

	private void checkLanguageSetup(final Description description)
	{
		languagesAfter.clear();
		for (final Language l : C2LManager.getInstance().getAllLanguages())
		{
			languagesAfter.add(l.getIsoCode());
		}
		if (languagesBefore.size() != languagesAfter.size() || !languagesBefore.containsAll(languagesAfter))
		{
			LOG.error("Test " + description.getDisplayName() + " changed language setup (before:" + languagesBefore + ", after:"
					+ languagesAfter + ")", new IllegalStateException("Illegal C2L setup change"));
		}
	}


	private void checkBaseCurrencySetup(final Description description)
	{
		final Currency baseCurrency = C2LManager.getInstance().getBaseCurrency();
		final String baseCurrencyAfter = baseCurrency == null ? "<NULL>" : baseCurrency.getIsoCode();

		if (!baseCurrencyBefore.equalsIgnoreCase(baseCurrencyAfter))
		{
			LOG.error("Test " + description.getDisplayName() + " changed base currency (before:" + baseCurrencyBefore + ", after:"
					+ baseCurrencyAfter + ")", new IllegalStateException("Illegal C2L setup change"));
		}
	}

	private void readBaseCurrencySetup()
	{
		final Currency baseCurrency = C2LManager.getInstance().getBaseCurrency();
		baseCurrencyBefore = baseCurrency == null ? "<NULL>" : baseCurrency.getIsoCode();
	}
}
