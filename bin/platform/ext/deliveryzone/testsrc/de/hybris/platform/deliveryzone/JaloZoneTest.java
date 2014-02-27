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


import static de.hybris.platform.testframework.Assert.assertCollection;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.deliveryzone.constants.ZoneDeliveryModeConstants;
import de.hybris.platform.deliveryzone.jalo.Zone;
import de.hybris.platform.deliveryzone.jalo.ZoneDeliveryModeManager;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.testframework.HybrisJUnit4TransactionalTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class JaloZoneTest extends HybrisJUnit4TransactionalTest
{
	ZoneDeliveryModeManager zm = null;

	@Before
	public void setUp() throws Exception
	{
		zm = (ZoneDeliveryModeManager) jaloSession.getExtensionManager().getExtension(ZoneDeliveryModeConstants.EXTENSIONNAME);
	}

	@Test
	public void testUniqueCode() throws Exception
	{
		assertNotNull(zm.createZone("test"));
		try
		{
			assertNotNull(zm.createZone("test"));
			fail("expected ConsistencyCheckException but second 'test' zone could be created");
		}
		catch (final ConsistencyCheckException e)
		{
			// fine here
		}
	}

	@Test
	public void testBug1844() throws Exception
	{
		Zone z;
		Country c1, c2;
		assertNotNull(z = zm.createZone("test"));
		assertNotNull(c1 = jaloSession.getC2LManager().createCountry("c1"));
		assertNotNull(c2 = jaloSession.getC2LManager().createCountry("c2"));
		// z -> { c1 }
		z.addToCountries(c1);
		assertCollection(Collections.singleton(c1), z.getCountries());
		// z -> { c1, c2 }
		z.addToCountries(c2);
		assertCollection(Arrays.asList(new Object[]
		{ c1, c2 }), z.getCountries());
		// z -> { c1, c2 }
		z.addToCountries(c1);
		// z -> { c1, c2 }
		z.addToCountries(c2);
		assertCollection(Arrays.asList(new Object[]
		{ c1, c2 }), z.getCountries());
		z.setCountries(new LinkedHashSet(Arrays.asList(new Object[]
		{ c1, c1, c1, c1 })));
		assertCollection(Collections.singleton(c1), z.getCountries());
	}
}
