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
package de.hybris.platform.acceleratorservices.email.strategy.impl;

import de.hybris.platform.acceleratorservices.email.dao.EmailAddressDao;
import de.hybris.platform.acceleratorservices.email.strategy.EmailAddressFetchStrategy;
import de.hybris.platform.acceleratorservices.model.email.EmailAddressModel;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.exceptions.SystemException;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.internal.model.impl.DefaultModelService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import de.hybris.platform.tx.DefaultTransaction;
import de.hybris.platform.tx.Transaction;
import de.hybris.platform.tx.TransactionBody;
import de.hybris.platform.util.Utilities;

import java.sql.Connection;
import java.sql.SQLIntegrityConstraintViolationException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;


/**
 * Default strategy for fetching EmailAddressModel for given address. The implementation executes in a transaction which
 * uses fetch-create if needed-fetch approach which is important in multi threaded environment.
 * 
 * @see de.hybris.platform.acceleratorservices.model.email.EmailAddressModel
 */
public class DefaultEmailAddressFetchStrategy implements EmailAddressFetchStrategy
{

	/**
	 * In case of SQL Server and unique index constraint violation an exception of the type will be thrown.
	 */
	private static final String COM_MICROSOFT_SQLSERVER_JDBC_SQL_SERVER_EXCEPTION = "com.microsoft.sqlserver.jdbc.SQLServerException";

	private static final Logger LOG = Logger.getLogger(DefaultEmailAddressFetchStrategy.class);

	private EmailAddressDao emailAddressDao;

	private ModelService modelService;

	@Override
	public EmailAddressModel fetch(final String emailAddress, final String displayName)
	{
		ServicesUtil.validateParameterNotNull(emailAddress, "emailAddress must not be null");
		try
		{
			final Transaction tx = Transaction.current();
			tx.setTransactionIsolationLevel(Connection.TRANSACTION_READ_COMMITTED);
			final boolean txRollbackOnlyBefore = tx.isRollbackOnly();

			return (EmailAddressModel) tx.execute(new TransactionBody()
			{
				@Override
				public Object execute()
				{
					final JaloSession session = JaloSession.getCurrentSession();
					try
					{
						disableNestedTransactions(session.createLocalSessionContext());

						EmailAddressModel emailAddressModel = loadEmailAddressFromDatabase(emailAddress, displayName);
						if (emailAddressModel == null)
						{
							try
							{
								emailAddressModel = getModelService().create(EmailAddressModel.class);
								emailAddressModel.setEmailAddress(emailAddress);
								emailAddressModel.setDisplayName(displayName);
								getModelService().save(emailAddressModel);
							}
							catch (final ModelSavingException e)
							{
								if (isIgnorableConstraintViolationException(e))
								{
									emailAddressModel = loadEmailAddressFromDatabase(emailAddress, displayName);
									if (emailAddressModel == null)
									{
										if (LOG.isDebugEnabled())
										{
											LOG.debug("Could neither create nor load email address. Ignorable exception was:", e);
										}
										throw new IllegalStateException("Could neither create nor load email address");
									}
									// PLA-11093
									// reset rollback-only here in case it had not been set before ( otherwise our successful retry would be lost! ) 
									if (!txRollbackOnlyBefore && tx.isRollbackOnly())
									{
										((DefaultTransaction) tx).clearRollbackOnly();
									}
								}
								else
								{
									throw new IllegalStateException(
											ModelSavingException.class.getName() + " recognized as unrecoverable.", e);
								}
							}
						}
						return emailAddressModel;
					}
					finally
					{
						session.removeLocalSessionContext();
					}
				}

			});
		}
		catch (final Exception e)
		{
			throw new SystemException("Could not find email address for email: " + emailAddress + " and name: " + displayName, e);
		}
	}

	protected EmailAddressModel loadEmailAddressFromDatabase(final String emailAddress, final String displayName)
	{
		return getEmailAddressDao().findEmailAddressByEmailAndDisplayName(emailAddress, displayName);
	}

	private boolean isIgnorableConstraintViolationException(final Exception e)
	{
		if (isInsertConditionException(e))
		{
			if (LOG.isDebugEnabled())
			{
				LOG.debug("Could not schedule task! The " + e.getClass().getSimpleName() + " has occurred with message: '"
						+ e.getMessage() + "'. Now attempting to run the transaction again!");
			}
			return true;
		}
		else if (e instanceof RuntimeException)
		{
			throw (RuntimeException) e;
		}
		else
		{
			throw new SystemException(e);
		}
	}

	private boolean isInsertConditionException(final Exception e)
	{
		return Utilities.getRootCauseOfType(e, InterceptorException.class) != null
				|| Utilities.getRootCauseOfType(e, SQLIntegrityConstraintViolationException.class) != null
				|| isSQLServerConstraintViolation(e);
	}

	private boolean isSQLServerConstraintViolation(final Exception e)
	{
		final Throwable root = Utilities.getRootCauseOfName(e, COM_MICROSOFT_SQLSERVER_JDBC_SQL_SERVER_EXCEPTION);
		final boolean isSQLServerUniqueConstrainViolation = root != null && root.getMessage().toLowerCase().contains("unique");
		if (!isSQLServerUniqueConstrainViolation && root != null)
		{
			LOG.warn("Could not recover from SQLServerException: " + e.getMessage());
		}
		return isSQLServerUniqueConstrainViolation;
	}

	private void disableNestedTransactions(final SessionContext loclCtx)
	{
		loclCtx.setAttribute(SessionContext.TRANSACTION_IN_CREATE_DISABLED, Boolean.TRUE);
		loclCtx.setAttribute(DefaultModelService.ENABLE_TRANSACTIONAL_SAVES, Boolean.FALSE);
	}

	public EmailAddressDao getEmailAddressDao()
	{
		return emailAddressDao;
	}

	@Required
	public void setEmailAddressDao(final EmailAddressDao emailAddressDao)
	{
		this.emailAddressDao = emailAddressDao;
	}

	public ModelService getModelService()
	{
		return modelService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

}
