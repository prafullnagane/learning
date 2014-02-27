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
package de.hybris.platform.jobs.maintenance.impl;

import de.hybris.platform.core.model.media.MediaFolderModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.cronjob.model.MediaFolderStructureMigrationCronJobModel;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jobs.maintenance.MaintenanceCleanupStrategy;
import de.hybris.platform.servicelayer.exceptions.SystemException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.google.common.base.Preconditions;


/**
 * Strategy which migrates structure of files for <code>MediaFolder</code> configured in
 * <code>MediaFolderStructureMigrationCronJobModel</code> after changing folder configuration.
 */
public class MediaMigrationStrategy implements MaintenanceCleanupStrategy<MediaModel, MediaFolderStructureMigrationCronJobModel>
{
	private static final Logger LOG = Logger.getLogger(MediaMigrationStrategy.class);
	private ModelService modelService;

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Override
	public FlexibleSearchQuery createFetchQuery(final MediaFolderStructureMigrationCronJobModel cjm)
	{
		Preconditions.checkArgument(cjm != null, "MediaFolderStructureMigrationCronJobModel is required!");

		final MediaFolderModel mediaFolder = cjm.getMediaFolder();

		if (mediaFolder == null)
		{
			throw new SystemException("CronJob does not contain folder to migrate.");
		}
		else
		{
			final Map<String, Object> params = new HashMap<String, Object>();
			params.put(MediaModel.FOLDER, mediaFolder);

			final StringBuilder sb = new StringBuilder();
			sb.append("SELECT {").append(MediaModel.PK).append("} ");
			sb.append("FROM {").append(MediaModel._TYPECODE).append("} ");
			sb.append("WHERE {").append(MediaModel.FOLDER).append("}=?folder ");
			return new FlexibleSearchQuery(sb.toString(), params);
		}
	}

	@Override
	public void process(final List<MediaModel> elements)
	{
		for (final MediaModel mediaModel : elements)
		{
			LOG.info("Relocating media binary for: " + mediaModel);
			final Media media = (Media) modelService.getSource(mediaModel);
			media.autoRelocateDataAfterConfigChange();
		}
	}

}
