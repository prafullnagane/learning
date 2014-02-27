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
 */
package de.hybris.platform.integration.oms.sampledata.event;

import de.hybris.platform.acceleratorservices.setup.AbstractSystemSetup;
import de.hybris.platform.acceleratorservices.setup.data.ImportData;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;

import java.util.List;


/**
 * This class imports the OMS sample data. It does not hook into the normal system setup processing but instead is
 * triggered by the SampleDataImportedEventListener
 */
public class OmsSampleDataSystemSetup extends AbstractSystemSetup
{
	public void importSampleData(final SystemSetupContext context, final List<ImportData> importData)
	{
		final String importDirectory = "omssampledata";
		importCommonIntegrationData(context, importDirectory);
		for (final ImportData data : importData)
		{
			final List<String> storeNames = data.getStoreNames();
			for (final String storeName : storeNames)
			{
				importIntegrationData(context, importDirectory, storeName);
			}
		}
	}

	protected void importIntegrationData(final SystemSetupContext context, final String importDirectory, final String storeName)
	{
		logInfo(context, "Begin importing " + importDirectory + " sampledata for store [" + storeName + "]");

		final String importRoot = "/" + importDirectory + "/import";
		importImpexFile(context, importRoot + "/stores/" + storeName + "/integration-data.impex", false);

		logInfo(context, "Done importing " + importDirectory + " sampledata for store [" + storeName + "]");
	}

	protected void importCommonIntegrationData(final SystemSetupContext context, final String importDirectory)
	{
		final String importRoot = "/" + importDirectory + "/import";
		importImpexFile(context, importRoot + "/common/common-integration-data.impex", false);
	}

	@Override
	public List<SystemSetupParameter> getInitializationOptions()
	{
		return null;
	}
}
