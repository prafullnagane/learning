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
package de.hybris.platform.externaltax;

import static org.junit.Assert.assertEquals;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.externaltax.impl.DefaultApplyExternalTaxesStrategy;
import de.hybris.platform.util.TaxValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


@UnitTest
public class DefaultApplyExternalTaxesStrategyUnitTest
{
	CurrencyModel eur, usd;

	DefaultApplyExternalTaxesStrategy applyExternalTaxesStrategy;

	@Before
	public void setUp()
	{
		applyExternalTaxesStrategy = new DefaultApplyExternalTaxesStrategy();

		eur = new CurrencyModel();
		eur.setIsocode("EUR");
		eur.setDigits(Integer.valueOf(2));

		usd = new CurrencyModel();
		usd.setIsocode("USD");
		usd.setDigits(Integer.valueOf(2));
	}

	@Test
	public void testEmptyDoc()
	{
		final CartModel cart = prepareCart(3, usd);
		// set some dummy data to check whether it's cleared correctly
		cart.setTotalTax(Double.valueOf(123.45));
		cart.getEntries().get(1).setTaxValues(Arrays.asList(new TaxValue("DUMMY", 12, true, 99.99, "USD")));

		final ExternalTaxDocument document = new ExternalTaxDocument();

		applyExternalTaxesStrategy.applyExternalTaxes(cart, document);

		assertEquals(Double.valueOf(0.0), cart.getTotalTax());
		assertEquals(Collections.EMPTY_LIST, cart.getTotalTaxValues());
		for (final AbstractOrderEntryModel e : cart.getEntries())
		{
			assertEquals(Collections.EMPTY_LIST, e.getTaxValues());
		}
	}

	@Test
	public void testLegalDoc()
	{
		final CartModel cart = prepareCart(2, usd);

		final ExternalTaxDocument document = new ExternalTaxDocument();
		final TaxValue tv_0_0 = new TaxValue("STA", 10, true, 9.99, "usd");
		final TaxValue tv_0_1 = new TaxValue("GOV", 20, true, 19.99, "usd");
		final TaxValue tv_0_2 = new TaxValue("LOC", 30, true, 29.99, "usd");
		document.setTaxesForOrderEntry(0, tv_0_0, tv_0_1, tv_0_2);

		final TaxValue tv_1_0 = new TaxValue("STA", 3, true, 12.34, "usd");
		final TaxValue tv_1_1 = new TaxValue("GOV", 4, true, 45.98, "usd");
		document.setTaxesForOrderEntry(1, tv_1_0, tv_1_1);

		final TaxValue tv_s_0 = new TaxValue("STA", 12, true, 0.99, "usd");
		final TaxValue tv_s_1 = new TaxValue("GOV", 34, true, 0.01, "usd");
		document.setShippingCostTaxes(tv_s_0, tv_s_1);

		applyExternalTaxesStrategy.applyExternalTaxes(cart, document);

		assertEquals(Double.valueOf(119.29), cart.getTotalTax());
		assertEquals(Arrays.asList(tv_s_0, tv_s_1), cart.getTotalTaxValues());
		assertEquals(Arrays.asList(tv_0_0, tv_0_1, tv_0_2), cart.getEntries().get(0).getTaxValues());
		assertEquals(Arrays.asList(tv_1_0, tv_1_1), cart.getEntries().get(1).getTaxValues());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWrongCurrency()
	{
		final CartModel cart = prepareCart(1, usd);
		final ExternalTaxDocument document = new ExternalTaxDocument();
		final TaxValue tv_0_0 = new TaxValue("STA", 10, true, 9.99, "usd");
		final TaxValue tv_0_1 = new TaxValue("GOV", 20, true, 19.99, "eur");
		final TaxValue tv_0_2 = new TaxValue("LOC", 30, true, 29.99, "usd");
		document.setTaxesForOrderEntry(0, tv_0_0, tv_0_1, tv_0_2);

		applyExternalTaxesStrategy.applyExternalTaxes(cart, document);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNotAbsoluteValue()
	{
		final CartModel cart = prepareCart(1, usd);
		final ExternalTaxDocument document = new ExternalTaxDocument();
		document.setShippingCostTaxes(new TaxValue("STA", 10, false, null));

		applyExternalTaxesStrategy.applyExternalTaxes(cart, document);
	}

	@Test(expected = IllegalStateException.class)
	public void testOrderNotNet()
	{
		final CartModel cart = prepareCart(1, usd);
		cart.setNet(Boolean.FALSE);
		final ExternalTaxDocument document = new ExternalTaxDocument();
		applyExternalTaxesStrategy.applyExternalTaxes(cart, document);
	}

	@Test(expected = IllegalStateException.class)
	public void testOrderNotNetAgain()
	{
		final CartModel cart = prepareCart(1, usd);
		cart.setNet(null);
		final ExternalTaxDocument document = new ExternalTaxDocument();
		applyExternalTaxesStrategy.applyExternalTaxes(cart, document);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMoreTaxesThanEntries()
	{
		final CartModel cart = prepareCart(1, usd); // just entry '0'
		final ExternalTaxDocument document = new ExternalTaxDocument();
		// now add taxes for '0' and '10' -> this should cause a exception
		document.setTaxesForOrderEntry(0, new TaxValue("STA", 10, true, 9.99, "usd"));
		document.setTaxesForOrderEntry(10, new TaxValue("STA", 10, true, 9.99, "usd"));

		applyExternalTaxesStrategy.applyExternalTaxes(cart, document);
	}

	CartModel prepareCart(final int entriesCount, final CurrencyModel curr)
	{
		final CartModel cart = new CartModel();
		cart.setCurrency(curr);
		cart.setNet(Boolean.TRUE);

		final List<AbstractOrderEntryModel> entries = new ArrayList<AbstractOrderEntryModel>();
		for (int i = 0; i < entriesCount; i++)
		{
			final CartEntryModel entry = new CartEntryModel();
			entry.setOrder(cart);
			entry.setEntryNumber(Integer.valueOf(i));
			entries.add(entry);
		}
		cart.setEntries(entries);

		return cart;
	}
}
