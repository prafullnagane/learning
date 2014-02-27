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
package de.hybris.platform.deliveryzone;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.deliveryzone.constants.ZoneDeliveryModeConstants;
import de.hybris.platform.deliveryzone.jalo.Zone;
import de.hybris.platform.deliveryzone.jalo.ZoneDeliveryMode;
import de.hybris.platform.deliveryzone.jalo.ZoneDeliveryModeManager;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.order.OrderManager;
import de.hybris.platform.jalo.order.price.Tax;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.product.ProductManager;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.jalo.user.UserManager;
import de.hybris.platform.testframework.HybrisJUnit4TransactionalTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class CalculationTest extends HybrisJUnit4TransactionalTest
{
	// managers
	ZoneDeliveryModeManager zdm;
	C2LManager cm;
	OrderManager om;
	UserManager um;
	ProductManager pm;
	TypeManager tm;
	// items
	Tax t;
	ZoneDeliveryMode dm;
	Currency cu1, cu2, oldBase;
	Country co1, co2, co3;
	Zone z1, z2;
	User c;
	Address addr;
	Product p;
	Unit u;
	Order o1, o2;

	@Before
	public void setUp() throws Exception
	{
		// get extension
		zdm = ZoneDeliveryModeManager.getInstance();
		// get C2L-Manager
		cm = C2LManager.getInstance();
		// create some currencies
		assertNotNull(cu1 = cm.createCurrency("cu1"));
		cu1.setConversionFactor(2.0);
		assertNotNull(cu2 = cm.createCurrency("cu2"));
		cu2.setConversionFactor(1.0);
		oldBase = cm.getBaseCurrency();
		cm.setBaseCurrency(cu2);
		// create some countries
		assertNotNull(co1 = cm.createCountry(null, "co1"));
		assertNotNull(co2 = cm.createCountry(null, "co2"));
		assertNotNull(co3 = cm.createCountry(null, "co3"));
		// get OrderManager
		om = OrderManager.getInstance();
		tm = TypeManager.getInstance();
		// create DM
		assertNotNull(dm = (ZoneDeliveryMode) om.createDeliveryMode(
				tm.getComposedType(ZoneDeliveryModeConstants.ComposedTypes.ZoneDeliveryMode), "zoneDM1"));
		dm.setPropertyName("weight");
		// create tax
		assertNotNull(t = om.createTax("tax"));
		t.setValue(16);
		dm.setNet(true);
		// create some zones
		// z1 = { co1, co2 } , z2 = { co3 }		
		assertNotNull(z1 = zdm.createZone("zone1"));
		assertNotNull(z2 = zdm.createZone("zone2"));
		// add countries to zones
		z1.setCountries(new LinkedHashSet(Arrays.asList(new Country[]
		{ co1, co2 })));
		z2.addToCountries(co3);
		// set some prices
		// z1 -> cu1 -> { 0 => 10.00 , 5 => 8.00 , 10 => 5.00 }
		//    -> cu2 -> { 0 => 100.00 , 100 => 77.00 }
		// z2 -> cu2 -> { 0 => 50.0 10 => 20.00 }
		dm.setCost(cu1, 0, 10.00, z1);
		dm.setCost(cu1, 5, 8.00, z1);
		dm.setCost(cu1, 10, 5.00, z1);
		dm.setCost(cu2, 0, 100.00, z1);
		dm.setCost(cu2, 100, 77.00, z1);
		dm.setCost(cu2, 0, 50.00, z2);
		dm.setCost(cu2, 10, 20.00, z2);
		// get UserManager
		um = UserManager.getInstance();
		// create user
		assertNotNull(c = um.createCustomer("c"));
		// create address
		assertNotNull(addr = um.createAddress(c));
		addr.setCountry(co1);
		// get ProductManager
		pm = ProductManager.getInstance();
		// create product
		assertNotNull(p = pm.createProduct("p"));
		p.setProperty("weight", new Double(1.0));
		// create unit
		assertNotNull(u = pm.createUnit(null, "weight", "test_kg"));
		p.setUnit(u);
		// create an order
		assertNotNull(o1 = om.createOrder("order1", c, cu1, new Date(), true));
		o1.setDeliveryAddress(addr);
		assertNotNull(o2 = om.createOrder("order2", c, cu1, new Date(), true));
		o2.setDeliveryAddress(addr);
	}

	@Test
	public void testDeliveryCostCalculation() throws Exception
	{
		// check property name
		assertTrue("property name was not 'weight' but " + dm.getPropertyName(), dm.getPropertyName().equals("weight"));
		// check zones
		Collection coll = z1.getCountries();
		assertTrue("expected [ co1, co2 ] but got " + coll,
				coll != null && coll.size() == 2 && coll.contains(co1) && coll.contains(co2));
		coll = z2.getCountries();
		assertTrue("expected [ co3 ] but got " + coll, coll != null && coll.size() == 1 && coll.contains(co3));
		// z1, cu1, 1kg -> 10.0
		// add entry to order
		o1.addNewEntry(p, 1, u);
		double costs = dm.getCost(o1).getValue();
		assertTrue("expected 10.0 as cost but got " + costs, costs == 10.0);
		// z1, cu1 11kg -> 5.0 
		o1.addNewEntry(p, 10, u);
		costs = dm.getCost(o1).getValue();
		assertTrue("expected 5.0 as cost but got " + costs, costs == 5.0);
		// z2 , cu1 , 100 kg -> ( 20.0 * 2/1 [conversion] ) 40.0
		o2.getDeliveryAddress().setCountry(co3); // for getting z2 !!!
		o2.addNewEntry(p, 100, u);
		costs = dm.getCost(o2).getValue();
		assertTrue("expected 40.0 as cost but got " + costs, costs == 40.0);
		// test getValues(...)
		// z1 -> cu1 -> { 0 => 10.00 , 5 => 8.00 , 10 => 5.00 }
		//    -> cu2 -> { 0 => 100.00 , 100 => 77.00 }
		// z2 -> cu2 -> { 0 => 50.0 10 => 20.00 }
		Map map = dm.getValues(cu1, z1);
		assertTrue(
				" expected z1 -> cu1 -> { 0 => 10.00 , 5 => 8.00 , 10 => 5.00 } but got " + map,
				map != null && map.containsKey(new Double(0)) && map.get(new Double(0)).equals(new Double(10.0))
						&& map.containsKey(new Double(5)) && map.get(new Double(5.0)).equals(new Double(8.0))
						&& map.containsKey(new Double(10)) && map.get(new Double(10.0)).equals(new Double(5.0)));
		map = dm.getValues(cu2, z1);
		assertTrue(
				" expected z1 -> cu2 -> { 0 => 100.00 , 100 => 77.00 } but got " + map,
				map != null && map.containsKey(new Double(0)) && map.get(new Double(0)).equals(new Double(100.0))
						&& map.containsKey(new Double(100)) && map.get(new Double(100.0)).equals(new Double(77.0)));
		map = dm.getValues(cu2, z2);
		assertTrue(" expected z2 -> cu2 -> { 0 => 50.0 10 => 20.00 } but got " + map, map != null && map.containsKey(new Double(0))
				&& map.get(new Double(0)).equals(new Double(50.0)) && map.containsKey(new Double(10))
				&& map.get(new Double(10.0)).equals(new Double(20.0)));
	}

	@After
	public void tearDown() throws Exception
	{
		if (oldBase != null)
		{
			cm.setBaseCurrency(oldBase);
		}
	}
}
