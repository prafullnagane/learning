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


import de.hybris.platform.util.Config;
import de.hybris.platform.util.Utilities;

import java.io.File;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;


/**
 * If used for a testclass all log informations are written to file(s) in the log folder. For each atomic test a single
 * file is written (classname_methodname_starttimeinmillis.log)
 */
public class DBLogRunListener extends RunListener
{
	private static final Logger LOG = Logger.getLogger(DBLogRunListener.class);

	private DBLogConfig logConfig;

	@Override
	public void testStarted(final Description description) throws Exception
	{
		final String className = description.getClassName();
		final String methodName = description.getMethodName();
		final String id = String.valueOf(System.currentTimeMillis());
		final File logDir = new File(Utilities.getPlatformConfig().getSystemConfig().getLogDir().getAbsolutePath() + "s");
		logDir.mkdirs();

		final String logFile = new File(logDir, className + "_" + methodName + "_" + id + ".log").getAbsolutePath();
		LOG.info(">>>> " + logFile);

		this.logConfig = new DBLogConfig(//
				Config.getString("db.log.file.path", null), //
				Config.getBoolean("db.log.active", false), //
				Config.getBoolean("db.log.appendStackTrace", false),//
				Config.getString("db.log.excludecategories", null),//
				Config.getString("db.log.includecategories", null));

		Config.setParameter("db.log.file.path", logFile);
		Config.setParameter("db.log.active", "true");
		Config.setParameter("db.log.appendStackTrace", "true");
		Config.setParameter("db.log.excludecategories", null);
		Config.setParameter("db.log.includecategories", null);

	}

	@Override
	public void testFinished(final Description description) throws Exception
	{
		Config.setParameter("db.log.file.path", logConfig.getLogFile());
		Config.setParameter("db.log.active", Boolean.toString(logConfig.isDbLogActive()));
		Config.setParameter("db.log.appendStackTrace", Boolean.toString(logConfig.isDbAppendStackTrace()));
		Config.setParameter("db.log.excludecategories", logConfig.getExcludedCategories());
		Config.setParameter("db.log.includecategories", logConfig.getIncludedCategories());
	}

	private static class DBLogConfig
	{
		private final String logFile;
		private final String excluded;
		private final String included;
		private final boolean dbLogActive;
		private final boolean dbAppendStackTrace;

		public DBLogConfig(final String logFile, final boolean dbLogActive, final boolean dbAppendStackTrace,
				final String excluded, final String included)
		{
			this.logFile = logFile;
			this.dbLogActive = dbLogActive;
			this.dbAppendStackTrace = dbAppendStackTrace;
			this.excluded = excluded;
			this.included = included;
		}

		public String getLogFile()
		{
			return logFile;
		}

		public boolean isDbLogActive()
		{
			return dbLogActive;
		}

		public boolean isDbAppendStackTrace()
		{
			return dbAppendStackTrace;
		}

		public String getExcludedCategories()
		{
			return excluded;
		}

		public String getIncludedCategories()
		{
			return included;
		}
	}
}
