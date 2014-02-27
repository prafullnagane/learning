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
package de.hybris.platform.europe1.jalo;

import static de.hybris.platform.testframework.Assert.assertCollection;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.europe1.constants.Europe1Constants;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationManager;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.price.JaloPriceFactoryException;
import de.hybris.platform.jalo.order.price.PriceInformation;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.product.ProductManager;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.jalo.user.UserManager;
import de.hybris.platform.testframework.HybrisJUnit4TransactionalTest;
import de.hybris.platform.util.StopWatch;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class PriceInfoTest extends HybrisJUnit4TransactionalTest
{
	private static final Logger log = Logger.getLogger(PriceInfoTest.class.getName());

	Europe1PriceFactory pf;
	ProductManager pm;
	UserManager um;
	C2LManager cm;
	EnumerationManager em;
	TypeManager tm;

	Product p1, p2, p3, p4;
	Customer c1, c2;
	Currency cr1, cr2;
	Unit u1, u2, u3, u4;
	EnumerationValue ppg2, ppg3, ppg4, cpg2;
	ComposedType unitType1, unitType2;

	PriceRow pr1, pr2, pr3, pr4, pr5, pr6;

	private static final int COUNT = 100;

	User prevUser;
	Currency prevCurr;
	Language prevLang;

	@Before
	public void setUp() throws Exception
	{
		// get PriceFactory
		pf = (Europe1PriceFactory) jaloSession.getExtensionManager().getExtension(
				de.hybris.platform.europe1.constants.Europe1Constants.EXTENSIONNAME);
		// get other managers
		pm = jaloSession.getProductManager();
		um = jaloSession.getUserManager();
		cm = jaloSession.getC2LManager();
		em = jaloSession.getEnumerationManager();
		tm = jaloSession.getTypeManager();
		// backup customer
		prevUser = jaloSession.getUser();
		prevCurr = jaloSession.getSessionContext().getCurrency();
		prevLang = jaloSession.getSessionContext().getLanguage();
		// create pricing groups
		assertNotNull(ppg2 = em.createEnumerationValue(em.getEnumerationType(Europe1Constants.TYPES.PRICE_PRODUCT_GROUP), "PPG2"));
		assertNotNull(ppg3 = em.createEnumerationValue(em.getEnumerationType(Europe1Constants.TYPES.PRICE_PRODUCT_GROUP), "PPG3"));
		assertNotNull(ppg4 = em.createEnumerationValue(em.getEnumerationType(Europe1Constants.TYPES.PRICE_PRODUCT_GROUP), "PPG4"));
		assertNotNull(cpg2 = em.createEnumerationValue(em.getEnumerationType(Europe1Constants.TYPES.PRICE_USER_GROUP), "CPG2"));
		// create sample units
		assertNotNull(unitType1 = tm.createComposedType(tm.getRootComposedTypeForJaloClass(Unit.class), "UnitType1"));
		assertNotNull(unitType2 = tm.createComposedType(tm.getRootComposedTypeForJaloClass(Unit.class), "UnitType2"));

		assertNotNull(u1 = pm.createUnit("u1", "unit1"));
		u1.setComposedType(unitType1);

		assertNotNull(u2 = pm.createUnit("u2", "unit2"));
		u2.setComposedType(unitType2);
		u2.setConversionFactor(1.5);

		assertNotNull(u3 = pm.createUnit("u3", "unit3"));
		u3.setComposedType(unitType2);
		u3.setConversionFactor(10.0);
		assertNotNull(u4 = pm.createUnit("u4", "unit4"));
		u4.setComposedType(unitType2);
		u4.setConversionFactor(100.0);
		// create sample products: p1,  PPG2( p2 ),  PPG3( p3 )
		assertNotNull(p1 = pm.createProduct("p1"));
		assertNotNull(p2 = pm.createProduct("p2"));
		p2.setProperty(Europe1Constants.PARAMS.PPG, ppg2);
		assertNotNull(p3 = pm.createProduct("p3"));
		p3.setProperty(Europe1Constants.PARAMS.PPG, ppg3);
		assertNotNull(p4 = pm.createProduct("p4"));
		p4.setProperty(Europe1Constants.PARAMS.PPG, ppg4);
		p4.setUnit(u2);
		// create sample customers: c1 , CPG2( c2 )
		assertNotNull(c1 = um.createCustomer("c1"));
		assertNotNull(c2 = um.createCustomer("c2"));
		c2.setProperty(Europe1Constants.PARAMS.UPG, cpg2);
		// create sample Currencies
		assertNotNull(cr1 = cm.createCurrency("curr1"));
		assertNotNull(cr2 = cm.createCurrency("curr2"));
		//
		// create sample prices
		//
		//    P PPG C CPG MQTD CURR UNIT UF NET DR PRICE
		//pr1 *  *  *  *   1    cr1  u1   1  f  *   100.0
		//pr2 p2 *  c2 *   3    cr1  u1   1  f  *    50.0
		//pr3 * PPG2* CPG2 2    cr1  u2   1  f  *    45.0
		//pr4 p3PPG3c2CPG2 10   cr1  u2   1  f  *    10.0
		//    (illegal since either p or ppg is valid but never both)
		assertNotNull(pr1 = pf.createPriceRow(null, null, null, null, 1, cr1, u1, 1, false, null, 100.0));
		assertNotNull(pr2 = pf.createPriceRow(p2, null, c2, null, 3, cr1, u1, 1, false, null, 50.0));
		assertNotNull(pr3 = pf.createPriceRow(null, ppg3, null, cpg2, 2, cr2, u2, 1, false, null, 45.0));

		assertNotNull(pr5 = pf.createPriceRow(null, ppg4, null, null, 20, cr1, u3, 1, false, null, 105.0));
		assertNotNull(pr6 = pf.createPriceRow(null, ppg4, null, null, 2, cr1, u4, 1, false, null, 106.0));
	}

	private void restoreSessionSettings()
	{
		jaloSession.setUser(prevUser);
		jaloSession.getSessionContext().setCurrency(prevCurr);
		jaloSession.getSessionContext().setLanguage(prevLang);
	}

	private static void print(final PriceInformation row)
	{
		System.out.print("PriceInfoRow[ ");
		final Collection qualis = row.getQualifierKeys();
		for (final Iterator it = qualis.iterator(); it.hasNext();)
		{
			final Object q = it.next();
			System.out.print(q);
			System.out.print("=");
			System.out.print(row.getQualifierValue(q));
			System.out.print(" ");
		}
		/* conv-log */log.debug("price: " + row.getPriceValue());
		/* conv-log */log.debug(" ]");
	}

	@Test
	public void testAll()
	{
		try
		{
			pr4 = pf.createPriceRow(p3, null, c2, cpg2, 10, cr2, u2, 1, false, null, 10.0);
			fail("illegal row did not cause exception");
		}
		catch (final JaloPriceFactoryException e)
		{
			// fine here
		}

		try
		{
			// get PriceInfos
			//
			// query p1 for cr1 and c1: expecting pr1 matching -> 100.0
			jaloSession.getSessionContext().setCurrency(cr1);
			jaloSession.setUser(c1);
			final Date date = new Date();
			checkPriceInfos(pf.getAllPriceInformations(jaloSession.getSessionContext(), p1, date, false).getPrices(),
					Collections.singleton(pr1));
			// query p2 for cr1 and c1: expecting pr1 , pr2 and pr3 matching
			jaloSession.getSessionContext().setCurrency(cr1);
			jaloSession.setUser(c2);
			checkPriceInfos(pf.getAllPriceInformations(jaloSession.getSessionContext(), p2, date, false).getPrices(),
					Arrays.asList(new Object[]
					{ pr1, pr2 }));
			// query p3 for cr2 and c2 : expecting pr3 matching
			jaloSession.getSessionContext().setCurrency(cr2);
			jaloSession.setUser(c2);
			checkPriceInfos(pf.getAllPriceInformations(jaloSession.getSessionContext(), p3, date, false).getPrices(),
					Collections.singleton(pr3));
			// query p4         
			jaloSession.getSessionContext().setCurrency(cr1);
			checkPriceInfos(pf.getAllPriceInformations(jaloSession.getSessionContext(), p4, date, false).getPrices(),
					Arrays.asList(new Object[]
					{ pr1, pr5, pr6 }));
			// test performance
			jaloSession.getSessionContext().setCurrency(cr1);
			jaloSession.setUser(c1);
			//ProductPriceInformations i1,i2,i3; 
			final StopWatch sw = new StopWatch("getting price infos 3x" + COUNT + " times");
			for (int i = 0; i < COUNT; i++)
			{
				/* i1 = */pf.getAllPriceInformations(jaloSession.getSessionContext(), p1, date, false);
				/* i2 = */pf.getAllPriceInformations(jaloSession.getSessionContext(), p2, date, true);
				/* i3 = */pf.getAllPriceInformations(jaloSession.getSessionContext(), p3, date, true);
			}
			sw.stop();
		}
		catch (final JaloPriceFactoryException e)
		{
			fail(e.getMessage());
		}
		finally
		{
			restoreSessionSettings();
		}
	}

	private void checkPriceInfos(final Collection<PriceInformation> priceInfos, final Collection priceRows)
	{
		for (final PriceInformation pi : priceInfos)
		{
			print(pi);
		}
		assertEquals(priceRows.size(), priceInfos.size());

		final Map checkMap = new HashMap();
		for (final Iterator iter = priceRows.iterator(); iter.hasNext();)
		{
			final PriceRow row = (PriceRow) iter.next();
			checkMap.put(row.getUnit() + ":" + row.getMinQuantity(), row);
		}
		for (final Iterator iter = priceInfos.iterator(); iter.hasNext();)
		{
			final PriceInformation pir = (PriceInformation) iter.next();
			assertCollection(Arrays.asList(new Object[]
			{ PriceRow.MINQTD, PriceRow.UNIT, PriceRow.PRICEROW }), pir.getQualifierKeys());
			final Unit u = (Unit) pir.getQualifierValue(PriceRow.UNIT);
			final long min = ((Long) pir.getQualifierValue(PriceRow.MINQTD)).longValue();
			assertNotNull(u);
			final PriceRow row = (PriceRow) checkMap.get(u + ":" + min);
			if (row == null)
			{
				fail("unexpected price info " + u + ":" + min + " = " + pir.getPriceValue());
			}
			assertEquals(row.getPrice().doubleValue(), pir.getPriceValue().getValue(), 0.00001);
		}
	}
}
