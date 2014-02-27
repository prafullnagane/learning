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

import de.hybris.platform.testframework.Transactional;
import de.hybris.platform.tx.Transaction;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;


/**
 * Listener which will start a transaction before each test and will rollback it when test is finished. Transactional
 * support will only be enabled if the test class or method is annotated with {@link Transactional}.
 * 
 * @see Transactional
 * @since 3.0-u3
 * 
 */
public class TransactionRunListener extends RunListener
{
	/** Used logger instance. */
	private static final Logger log = Logger.getLogger(TransactionRunListener.class.getName());
	/** Transaction of currently running test. */
	private Transaction curTrans;

	@Override
	public void testStarted(final Description description) throws Exception
	{
		final Transactional anno = description.getAnnotation(Transactional.class);
		if (anno != null)
		{
			transactionalTestStarted(description, anno);
		}
		else
		{
			nonTransactionalTestStarted(description);
		}
	}

	@Override
	public void testFinished(final Description description) throws Exception
	{
		final Transactional anno = description.getAnnotation(Transactional.class);
		if (anno != null)
		{
			transactionalTestFinished(description, anno);
		}
		else
		{
			nonTransactionalTestFinished(description);
		}
	}

	private void nonTransactionalTestFinished(final Description description)
	{
		assertNoTransactionRunning(description, false);
	}


	private void transactionalTestFinished(final Description description, final Transactional anno)
	{
		if (curTrans.isRunning())
		{
			rollbackTestTx(description, curTrans, anno);
			curTrans = null;
		}
		else
		{
			log.error("Can not rollback transaction after test " + description.getDisplayName() + " - it is not running anymore",
					new Exception("Illegal Test Tx Outcome of " + description.getDisplayName()));
		}
	}

	private void nonTransactionalTestStarted(final Description description)
	{
		assertNoTransactionRunning(description, true);

		if (log.isDebugEnabled())
		{
			log.debug("Transactional support is not enabled for test " + description.getDisplayName());
		}
	}

	private void transactionalTestStarted(final Description description, final Transactional anno)
	{
		assertNoTransactionRunning(description, true);

		curTrans = startTestTransaction(description, anno);

		if (log.isDebugEnabled())
		{
			log.debug("Transactional support enabled for test " + description.getDisplayName() + " with "
					+ (anno.enableDelayedStore() ? "enabled" : "disabled") + " delayed store");
		}
	}

	private Transaction startTestTransaction(final Description description, final Transactional anno)
	{
		try
		{
			final Transaction tx = Transaction.current();
			tx.begin();
			tx.enableDelayedStore(anno.enableDelayedStore());

			return tx;
		}
		catch (final Exception e)
		{
			log.error("Error starting test transaction before test " + description.getDisplayName(), e);
			return null;
		}
	}

	private void rollbackTestTx(final Description description, final Transaction tx, final Transactional anno)
	{
		final boolean commit = anno.noRollback();
		try
		{
			int counter = 0;
			do
			{
				if (commit)
				{
					tx.commit();
				}
				else
				{
					tx.rollback();
				}
				counter++;
			}
			while (tx.isRunning()); // we must expect that more than one nested transaction has been left open

			if (counter > 1)
			{
				log.error("Found transaction open after performing test " + description.getDisplayName() + " - required " + counter
						+ " attempts to finish transaction", new Exception("Illegal Test Tx Outcome: " + description.getDisplayName()));
			}
		}
		catch (final Exception e)
		{
			log.error("Error committing transaction after test " + description.getDisplayName(), e);
		}
	}

	private void assertNoTransactionRunning(final Description description, final boolean before)
	{
		final String when = before ? "before" : "after";
		final Transaction tx = Transaction.current();
		if (tx.isRunning())
		{
			final String msg = "Found running transaction " + tx + " " + when + "starting " + description.getDisplayName()
					+ " - trying to rollback..";
			if (before)
			{
				log.error(msg);
			}
			else
			{
				log.error(msg, new Exception("Illegal Test Tx Outcome: " + description.getDisplayName()));
			}
			rollbackLeftoverTx(tx);
		}
	}

	private void rollbackLeftoverTx(final Transaction tx)
	{
		try
		{
			do
			{
				tx.rollback();
			}
			while (tx.isRunning());
		}
		catch (final Exception e)
		{
			log.error("Error rolling back leftover transaction " + tx, e);
		}
	}
}
