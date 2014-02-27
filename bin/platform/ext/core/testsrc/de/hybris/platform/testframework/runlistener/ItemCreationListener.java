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

import de.hybris.platform.core.Constants;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.Tenant;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloItemNotFoundException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.AttributeDescriptor;
import de.hybris.platform.jalo.user.UserManager;
import de.hybris.platform.persistence.framework.PersistencePool;
import de.hybris.platform.persistence.hjmp.HJMPUtils;
import de.hybris.platform.testframework.Transactional;
import de.hybris.platform.util.Config;
import de.hybris.platform.util.jeeapi.YNoSuchEntityException;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;


/**
 * <code>RunListener<code> assuring each created Item will be removed after finish of test.
 * Similar to {@link TransactionRunListener}, but does not depend on used database. Will be
 * disabled automatically for junit thread if transactional support is enabled by using
 * annotation {@link Transactional}. Items created inside other threads are still logged and
 * removed at the end of test!
 */
public class ItemCreationListener extends RunListener implements PersistencePool.PersistenceListener
{
	/** Used logger instance. */
	private static final Logger log = Logger.getLogger(ItemCreationListener.class);
	/** List of PK's the current test has created. */
	private final Set<PK> createdPKs = Collections.synchronizedSet(new LinkedHashSet<PK>());
	/** remember is transaction is enabled */
	private volatile boolean taEnabled;
	/** remember junit thread -> we always have to capture PKs outside of this thread */
	private volatile Thread junitThread;

	@Override
	public void testStarted(final Description description) throws Exception
	{
		this.junitThread = Thread.currentThread();
		this.createdPKs.clear(); // clear pk list
		Registry.getCurrentTenant().getPersistencePool().registerPersistenceListener(this); // always register for other threads

		final Transactional anno = description != null ? description.getAnnotation(Transactional.class) : null;
		this.taEnabled = anno != null && transactionsSupported();
		if (log.isDebugEnabled())
		{
			if (taEnabled)
			{
				log.debug("Disabling item registration in junit thread for " + description + " since transaction is enabled");
			}
			else
			{
				log.debug("Enabling item registration for " + description + " since transaction is not enabled");
			}
		}
	}

	/**
	 * Removes all items registered at the item registry. Will be called automatically at end of each test.
	 */
	@Override
	public void testFinished(final Description description) throws Exception
	{
		Registry.getCurrentTenant().getPersistencePool().unregisterPersistenceListener(this);

		// Switch off PK lookup retry since many removed PKs could take ages with that !!!
		final Object pkLookupRestoreToken = HJMPUtils.disablePKLookupRetry();

		try
		{
			if (!createdPKs.isEmpty())
			{
				// if transaction is enabled we must remove items outside of this thread
				// since any changes inside this thread are rollback'ed via transaction later on !!!
				if (taEnabled)
				{
					final Tenant t = Registry.getCurrentTenant();
					final JaloSession js = JaloSession.getCurrentSession();
					final Set<PK> toRemove = createdPKs;
					final Runnable outside = new Runnable()
					{
						@Override
						public void run()
						{
							try
							{
								Registry.setCurrentTenant(t);
								js.activate();
								removeItems(toRemove);
							}
							finally
							{
								JaloSession.deactivate();
								Registry.unsetCurrentTenant();
							}
						}
					};
					final Thread removalThread = new Thread(outside, "HybrisJunit4RemovalThread");
					removalThread.start();
					removalThread.join();
				}
				else
				{
					try
					{
						final SessionContext localctx = JaloSession.getCurrentSession().createLocalSessionContext();
						localctx.setUser(UserManager.getInstance().getAdminEmployee());
						removeItems(createdPKs);
					}
					finally
					{
						JaloSession.getCurrentSession().removeLocalSessionContext();
					}
				}
			}
		}
		catch (final Exception e)
		{
			log.error("unexpected error removing items: " + e.getMessage(), e);
		}
		finally
		{
			createdPKs.clear();
			junitThread = null; // don't need it any longer
			taEnabled = false; // reset

			HJMPUtils.restorPKLookupRetry(pkLookupRestoreToken);
		}
	}

	protected void removeItems(final Collection<PK> pks)
	{
		final JaloSession js = JaloSession.getCurrentSession();
		if (log.isDebugEnabled())
		{
			log.debug("starting to remove test " + pks.size() + " items ");
		}
		final List<PK> toBeRemoved = new LinkedList(pks);
		final Map<PK, Exception> itemRemovalErrors = new HashMap<PK, Exception>();
		Collections.reverse(toBeRemoved);
		if (log.isDebugEnabled())
		{
			log.debug("reversed to remove collection  " + toBeRemoved.size());
		}
		boolean removedAtLeastOne = false;
		int counter = 1;
		final long start = System.currentTimeMillis();
		do
		{
			if (log.isDebugEnabled())
			{
				log.debug("removing test  items  (turn " + counter + ")...");
			}
			try
			{
				final SessionContext ctx = JaloSession.getCurrentSession().createLocalSessionContext();
				ctx.setAttribute(Item.DISABLE_ITEMCHECK_BEFORE_REMOVABLE, Boolean.TRUE);
				// change flag
				removedAtLeastOne = false;
				for (final ListIterator<PK> iter = toBeRemoved.listIterator(); iter.hasNext();)
				{
					Item item = null;
					final PK pk = iter.next();
					try
					{
						if (pk != null && Constants.TC.MetaInformation != pk.getTypeCode())
						{
							try
							{
								item = js.getItem(pk);
							}
							catch (final JaloItemNotFoundException e1) // PK is ok but item does not exist any more
							{
								log.debug("Can't remove " + pk + " reason (missing jalo item), ", e1);
								iter.remove();
								continue;
							}
							catch (final YNoSuchEntityException e) // PK is ok but item does not exist any more
							{
								log.debug("Can't remove " + pk + " reason (no entity), ", e);
								iter.remove();
								continue;
							}
							catch (final Exception e) // other errors : PK invalid etc.
							{
								log.warn("unexpected error resolving pk " + pk + " for item to be removed : " + e.getMessage(), e);
								iter.remove();
								continue;
							}
							if (!item.isAlive())
							{
								iter.remove();
								continue;
							}
							else
							{
								// adjust some items to make them removable
								prepareItem(item);
								item.remove(ctx);
								removedAtLeastOne = true;
							}
						}
						iter.remove();
					}
					catch (final Exception e)
					{
						// remove item silently if it is no longer alive
						if (item != null && !item.isAlive())
						{
							iter.remove();
						}
						else
						{
							itemRemovalErrors.put(pk, e);
						}
					}
				}
			}
			finally
			{
				JaloSession.getCurrentSession().removeLocalSessionContext();
			}
			if (log.isDebugEnabled())
			{
				log.debug("done removing test items (turn " + counter + ") in (" + (System.currentTimeMillis() - start) + " ms).");
			}
			counter++;
		}
		while (!toBeRemoved.isEmpty() && removedAtLeastOne);

		if (!toBeRemoved.isEmpty())
		{
			log.error("--------------------------------------");
			for (final PK pk : toBeRemoved)
			{
				final Exception exception = itemRemovalErrors.get(pk);
				log.error("item " + pk + " has not been removed due to " + exception.getMessage(), exception);
			}
			log.error("--------------------------------------");
		}
	}

	protected void prepareItem(final Item item) throws ConsistencyCheckException
	{
		if (item instanceof C2LItem)
		{
			if (item instanceof Currency)
			{
				checkAndFixLastCurrencyRemoving((Currency) item);
			}

			setInactive((C2LItem) item);

			if (item instanceof Language)
			{
				checkAndFixSessionLanguageRemoving((Language) item);
			}
		}
		else if (item instanceof AttributeDescriptor)
		{
			setRemovable((AttributeDescriptor) item);
		}
	}

	private void setRemovable(final AttributeDescriptor item)
	{
		item.setRemovable(true);
	}

	private void setInactive(final C2LItem item) throws ConsistencyCheckException
	{
		item.setActive(false);
	}

	private void checkAndFixSessionLanguageRemoving(final Language item)
	{
		final SessionContext ctx = JaloSession.getCurrentSession().getSessionContext();
		if (item.equals(ctx.getLanguage()))
		{
			try
			{
				ctx.setLanguage(C2LManager.getInstance().getLanguageByIsoCode("---"));
			}
			catch (final JaloItemNotFoundException e)
			{
				final Collection<Language> all = C2LManager.getInstance().getAllLanguages();
				if (all.isEmpty() || (all.size() == 1 && all.contains(item)))
				{
					ctx.setLanguage(null);
				}
				else
				{
					for (final Language l : all)
					{
						if (l.equals(item))
						{
							continue;
						}
						else
						{
							ctx.setLanguage(l);
							break;
						}
					}
				}
			}
		}
	}

	private void checkAndFixLastCurrencyRemoving(final Currency item) throws ConsistencyCheckException
	{
		final Collection<Currency> allCurs = C2LManager.getInstance().getAllCurrencies();
		if (allCurs.size() == 1 && allCurs.contains(item))
		{
			createDefaultCurrencyAsBase();
		}
		else if (item.isBase().booleanValue())
		{
			try
			{
				final Currency defaultCurr = C2LManager.getInstance().getCurrencyByIsoCode("---");
				defaultCurr.setBase();
			}
			catch (final JaloItemNotFoundException e)
			{
				createDefaultCurrencyAsBase();
			}
		}
	}

	/**
	 *
	 */
	private void createDefaultCurrencyAsBase() throws ConsistencyCheckException
	{
		final Currency defCur = C2LManager.getInstance().createCurrency("---");
		defCur.setActive(true);
		defCur.setBase();
	}

	@Override
	public void entityCreated(final PK pk)
	{
		if (!taEnabled || !Thread.currentThread().equals(junitThread))
		{
			createdPKs.add(pk);
		}
	}

	protected boolean transactionsSupported()
	{
		return !(Config.isMySQLUsed() && "myisam".equalsIgnoreCase(Config.getString("mysql.tabletype", "innodb")));
	}
}
