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
package de.hybris.platform.testframework;

import de.hybris.platform.testframework.runlistener.TransactionRunListener;


/**
 * Base class for all tests with transaction support using the platform. All platform changes performed within tests
 * will be rolled back at end of each test method. You do not have to extend this class, you also can register the
 * {@link TransactionRunListener} at the {@link HybrisJUnit4ClassRunner} (see {@link HybrisJUnit4Test} and mark each
 * method or your whole class as {@link Transactional}.
 * 
 * <pre>
 * &#064;RunWith(HybrisJUnit4ClassRunner.class)
 * &#064;RunListeners(
 * { TransactionRunListener.class, PlatformRunListener.class })
 * &#064;Transactional
 * public class MyHybrisJUnit4Test
 * {
 * 	&#064;Test
 * 	public void myTest()
 * 	{
 * 		assertNotNull(C2LManager.getInstance().getBaseCurrency());
 * 	}
 * }
 * </pre>
 * 
 * 
 * @since 3.0-u3
 */
@Transactional
public abstract class HybrisJUnit4TransactionalTest extends HybrisJUnit4Test
{
	// 
}
