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

import static junit.framework.Assert.assertEquals;

import de.hybris.platform.core.PK;
import de.hybris.platform.core.Registry;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.JaloItemNotFoundException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.order.price.PriceFactory;
import de.hybris.platform.jalo.security.JaloSecurityException;
import de.hybris.platform.jalo.user.UserManager;
import de.hybris.platform.testframework.runlistener.ApplicationContextCheckRunListener;
import de.hybris.platform.testframework.runlistener.C2LSetupRunListener;
import de.hybris.platform.testframework.runlistener.ClassLoaderOverviewRunListener;
import de.hybris.platform.testframework.runlistener.ItemCreationListener;
import de.hybris.platform.testframework.runlistener.LangReferenceRemoverRunListener;
import de.hybris.platform.testframework.runlistener.LogRunListener;
import de.hybris.platform.testframework.runlistener.MemoryOverviewRunListener;
import de.hybris.platform.testframework.runlistener.OpenDBConnectionRunListener;
import de.hybris.platform.testframework.runlistener.PlatformRunListener;
import de.hybris.platform.testframework.runlistener.ResetMockitoRunListener;
import de.hybris.platform.testframework.runlistener.TableSizeCheckRunListener;
import de.hybris.platform.testframework.runlistener.TransactionRunListener;
import de.hybris.platform.testframework.runlistener.VMBlockTimeRunListener;
import de.hybris.platform.util.Config;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;


/**
 * Base class for all JUnit4 tests using the platform. Activates the {@link HybrisJUnit4ClassRunner} for test processing
 * and registers the {@link PlatformRunListener} for setting correct tenant and cluster of test system,
 * {@link LogRunListener} for logging all test runs and {@link ItemCreationListener} for assuring test isolation by
 * removing created items.
 * <p>
 * If you do not access the platform, you do not has to extend this class. Furthermore you can avoid extending this
 * class by activating the {@link HybrisJUnit4ClassRunner} using the {@link RunWith} annotation and by registering the
 * {@link PlatformRunListener} and at least one of {@link ItemCreationListener}/ {@link TransactionRunListener} using
 * the {@link RunListeners} annotation.
 * 
 * <pre>
 * &#064;RunWith(HybrisJUnit4ClassRunner.class)
 * &#064;RunListeners(ItemCreationListener.class, PlatformRunListener.class)
 * public class MyHybrisJUnit4Test
 * {
 * 	&#064;Test
 * 	public void myTest()
 * 	{
 * 		assertNotNull( C2LManager.getInstance().getBaseCurrency() );
 * 	}
 * }
 * </pre>
 * 
 * If you want to add transactional support to your test cases (each platform change will be rolled back automatically),
 * see {@link HybrisJUnit4TransactionalTest}.
 * <p>
 * For using assert methods not provided by JUnit see the {@link Assert} class which can be imported static like the
 * {@link org.junit.Assert} of the junit framework.
 * 
 * @since 3.0-u3
 */
@RunWith(HybrisJUnit4ClassRunner.class)
@RunListeners(
{ LangReferenceRemoverRunListener.class, ApplicationContextCheckRunListener.class, TableSizeCheckRunListener.class,
		TransactionRunListener.class, ItemCreationListener.class, C2LSetupRunListener.class, LogRunListener.class,
		ClassLoaderOverviewRunListener.class, PlatformRunListener.class, ResetMockitoRunListener.class,
		VMBlockTimeRunListener.class, OpenDBConnectionRunListener.class, MemoryOverviewRunListener.class })
//Info: list above will be inverted		
// additionals : ThreadOverviewRunListener.class
public abstract class HybrisJUnit4Test
{
	/** Used logger instance. */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(HybrisJUnit4Test.class);

	/** Reference to current session. */
	protected JaloSession jaloSession;
	/** Reference to default language. */

	@Deprecated
	protected Language defaultLanguage;

	private PriceFactory priceFactory;

	private PK userPK;
	private String userUid;
	private Date userTS;

	/**
	 * returns true if property "test.intense.checks" is activated if active, then tests like -
	 * ApplicationContextCheckRunListener (compares all beans before and after testrun) - TableSizeCheckRunListner (
	 * compares ALL table sizes (SELECT COUNT) before and after testrun) are being executed
	 */
	public static boolean intenseChecksActivated()
	{
		return Registry.hasCurrentTenant() && Config.getBoolean("junit.intense.checks", false);
	}

	/**
	 * Sets the current session and default language.
	 * 
	 * @throws JaloSystemException
	 *            there was a security problem while creating the session
	 */
	@Before
	public void init() throws JaloSystemException
	{
		// jalo session is handled by PlatformRunListener -> just grap it
		junit.framework.Assert.assertTrue(JaloSession.hasCurrentSession());
		jaloSession = JaloSession.getCurrentSession();

		userPK = jaloSession.getUser().getPK();
		userUid = jaloSession.getUser().getUid();
		userTS = jaloSession.getUser().getModificationTime();

		priceFactory = JaloSession.getCurrentSession().getPriceFactory();
	}

	@After
	public void finish() throws JaloSecurityException
	{
		if (!UserManager.getInstance().getAnonymousCustomer().equals(jaloSession.getUser()))
		{
			if (jaloSession.getUser() != null)
			{
				LOG.warn("session user(" + jaloSession.getUser() + ") has changed from "
						+ UserManager.getInstance().getAnonymousCustomer() + " to " + jaloSession.getUser());
			}
		}
		else
		{

			try
			{
				if (!userPK.equals(jaloSession.getUser().getPK()))
				{
					throw new IllegalStateException("session user(" + jaloSession.getUser() + ") PK has changed from " + userPK
							+ " to " + jaloSession.getUser().getPK());
				}
				if (!userUid.equals(jaloSession.getUser().getUid()))
				{
					throw new IllegalStateException("session user(" + jaloSession.getUser() + ") uid has changed from " + userUid
							+ " to " + jaloSession.getUser().getUid());
				}
				if (!userTS.equals(jaloSession.getUser().getModificationTime()))
				{
					LOG.warn("session user(" + jaloSession.getUser() + ") has changed from " + userTS + " to "
							+ jaloSession.getUser().getModificationTime());
				}

			}
			catch (final Exception e)
			{
				LOG.error("#####################################################################");
				LOG.error("Test " + this.getClass().getSimpleName() + " has interefered session user  , " + e.getMessage());
			}
		}



		// XXX: hack: switch back session user in case a unit test changed it
		jaloSession.setUser(UserManager.getInstance().getAnonymousCustomer());
		//
		jaloSession = null;
		// jalo session will be de-activated by PlatformRunListener

		assertEquals("If you set jaloSession.priceFactory it need to be cleaned after test was performed.", priceFactory,
				JaloSession.getCurrentSession().getPriceFactory());
	}

	/**
	 * Gets or creates (if not existent) language to given iso code.
	 * 
	 * @param isoCode
	 *           iso code of language
	 * @return language to given iso code
	 * @throws JaloSystemException
	 *            thrown if language will be created but still exists
	 */
	public static Language getOrCreateLanguage(final String isoCode) throws JaloSystemException
	{
		Language ret = null;
		try
		{
			ret = C2LManager.getInstance().getLanguageByIsoCode(isoCode);
		}
		catch (final JaloItemNotFoundException e)
		{
			try
			{
				ret = C2LManager.getInstance().createLanguage(isoCode);
			}
			catch (final ConsistencyCheckException e1)
			{
				throw new JaloSystemException(e1);
			}
		}
		return ret;
	}

	/**
	 * Gets or creates (if not existent) currency to given iso code.
	 * 
	 * @param isoCode
	 *           iso code of currency
	 * @return Currency to given iso code
	 * @throws JaloSystemException
	 *            thrown if currency will be created but still exists
	 */
	public static Currency getOrCreateCurrency(final String isoCode) throws JaloSystemException
	{
		Currency ret = null;
		try
		{
			ret = C2LManager.getInstance().getCurrencyByIsoCode(isoCode);
		}
		catch (final JaloItemNotFoundException e)
		{
			try
			{
				ret = C2LManager.getInstance().createCurrency(isoCode);
			}
			catch (final ConsistencyCheckException e1)
			{
				throw new JaloSystemException(e1);
			}
		}
		return ret;
	}
}
