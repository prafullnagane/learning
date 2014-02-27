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
package de.hybris.platform.ycommercewebservices.setup;

import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.servicelayer.impex.ImportService;
import de.hybris.platform.servicelayer.impex.impl.StreamBasedImpExResource;
import de.hybris.platform.util.CSVConstants;
import de.hybris.platform.ycommercewebservices.constants.YcommercewebservicesConstants;

import org.springframework.beans.factory.annotation.Required;


/**
 * Data setup class used at the time of initialization and update
 */
@SystemSetup(extension = YcommercewebservicesConstants.EXTENSIONNAME)
public class YCommerceWebServicesDataSetup
{
	private ImportService importService;

	@SystemSetup(process = Process.ALL, type = Type.ESSENTIAL)
	public void createEssentialData(final SystemSetupContext context)
	{
		importService.importData(new StreamBasedImpExResource(YCommerceWebServicesDataSetup.class
				.getResourceAsStream("/import/yCommerceWebServicesEssentialData.csv"), CSVConstants.HYBRIS_ENCODING, Character
				.valueOf(';')));
	}

	@Required
	public void setImportService(final ImportService importService)
	{
		this.importService = importService;
	}
}
