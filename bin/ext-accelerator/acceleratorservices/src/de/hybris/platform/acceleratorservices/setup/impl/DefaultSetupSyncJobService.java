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
package de.hybris.platform.acceleratorservices.setup.impl;

import de.hybris.platform.acceleratorservices.setup.SetupSyncJobService;
import de.hybris.platform.catalog.jalo.Catalog;
import de.hybris.platform.catalog.jalo.CatalogManager;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.catalog.jalo.SyncAttributeDescriptorConfig;
import de.hybris.platform.catalog.jalo.SyncItemCronJob;
import de.hybris.platform.catalog.jalo.SyncItemJob;
import de.hybris.platform.catalog.jalo.synchronization.CatalogVersionSyncJob;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.europe1.jalo.PriceRow;
import de.hybris.platform.europe1.model.PriceRowModel;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloItemNotFoundException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.AttributeDescriptor;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.Type;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;


/**
 * Default implementation for {@link SetupSyncJobService}
 */
public class DefaultSetupSyncJobService implements SetupSyncJobService
{
	private static final Logger LOG = Logger.getLogger(DefaultSetupSyncJobService.class);

	private ModelService modelService;

	@Override
	public void createProductCatalogSyncJob(final String catalogId)
	{
		// Check if the sync job already exists
		if (getCatalogSyncJob(catalogId) == null)
		{
			LOG.info("Creating product sync item job for [" + catalogId + "]");

			// Lookup the catalog name
			final Catalog catalog = CatalogManager.getInstance().getCatalog(catalogId);

			// Create the sync job name
			final String jobName = createJobIdentifier(catalogId);
			final SyncItemJob syncItemJob = CatalogManager.getInstance().configureSynchronizationJob(jobName, catalog,
					CatalogManager.OFFLINE_VERSION, CatalogManager.ONLINE_VERSION, true, false);

			removeAttributeFromSync(syncItemJob, Item.class, ItemModel.COMMENTS);
			removeAttributeFromSync(syncItemJob, Item.class, "assignedCockpitItemTemplates");

			removeAttributeFromSync(syncItemJob, Product.class, ProductModel.SEQUENCEID);
			removeAttributeFromSync(syncItemJob, Product.class, ProductModel.PRODUCTREVIEWS);
			removeAttributeFromSync(syncItemJob, PriceRow.class, PriceRowModel.SEQUENCEID);

			// Remove CMS attributes from Product Sync
			removeAttributeFromSync(syncItemJob, Category.class, CategoryModel.LINKCOMPONENTS);
			removeAttributeFromSync(syncItemJob, Category.class, "productCarouselComponents");
			removeAttributeFromSync(syncItemJob, Category.class, CategoryModel.RESTRICTIONS);
			removeAttributeFromSync(syncItemJob, Category.class, "productListComponents");
			removeAttributeFromSync(syncItemJob, Category.class, "categoryFeatureComponents");
			removeAttributeFromSync(syncItemJob, Product.class, ProductModel.LINKCOMPONENTS);
			removeAttributeFromSync(syncItemJob, Product.class, ProductModel.RESTRICTIONS);
			removeAttributeFromSync(syncItemJob, Product.class, "productCarouselComponents");
			removeAttributeFromSync(syncItemJob, Product.class, "productListComponents");
			removeAttributeFromSync(syncItemJob, Product.class, "productDetailComponents");
			removeAttributeFromSync(syncItemJob, Product.class, "productFeatureComponents");


			// Set copy by value for synchronization of Product.galleryImages
			final ComposedType productType = TypeManager.getInstance().getComposedType(Product.class);
			final AttributeDescriptor galleryImagesDescriptor = productType
					.getAttributeDescriptorIncludingPrivate(ProductModel.GALLERYIMAGES);

			final SyncAttributeDescriptorConfig attributeDescriptorConfig = syncItemJob.getConfigFor(galleryImagesDescriptor, true);
			attributeDescriptorConfig.setCopyByValue(true);

			LOG.info("Created product sync item job [" + syncItemJob.getCode() + "]");
		}
	}


	@Override
	public void assignDependentSyncJobs(final String catalogId, final Set<String> dependentCatalogIds)
	{
		final SyncItemJob masterSyncJob = getSyncJobForCatalog(catalogId);
		if (masterSyncJob instanceof CatalogVersionSyncJob)
		{
			final CatalogVersionSyncJob masterCatSyncJob = (CatalogVersionSyncJob) masterSyncJob;

			final Set<CatalogVersionSyncJob> dependentSyncJobs = new LinkedHashSet<CatalogVersionSyncJob>();

			// Get the existing dependent sync jobs
			final Set<CatalogVersionSyncJob> existingDependentSyncJobs = masterCatSyncJob.getDependentSyncJobs();
			if (existingDependentSyncJobs != null)
			{
				dependentSyncJobs.addAll(existingDependentSyncJobs);
			}

			// Add the new dependent sync jobs for the catalog Ids
			for (final String dependantCatalogId : dependentCatalogIds)
			{
				final SyncItemJob dependantSyncJob = getSyncJobForCatalog(dependantCatalogId);
				if (dependantSyncJob instanceof CatalogVersionSyncJob)
				{
					dependentSyncJobs.add((CatalogVersionSyncJob) dependantSyncJob);
				}
			}

			// Set the new dependent sync jobs set
			masterCatSyncJob.setDependentSyncJobs(dependentSyncJobs);

			if (LOG.isInfoEnabled())
			{
				LOG.info("Set DependentSyncJobs on CatalogVersionSyncJob [" + masterCatSyncJob.getCode() + "] to ["
						+ catalogVersionSyncJobsToString(dependentSyncJobs) + "]");
			}
		}
	}

	protected String catalogVersionSyncJobsToString(final Collection<CatalogVersionSyncJob> catalogVersionSyncJobs)
	{
		final StringBuilder buf = new StringBuilder();
		for (final CatalogVersionSyncJob catalogVersionSyncJob : catalogVersionSyncJobs)
		{
			if (buf.length() > 0)
			{
				buf.append(", ");
			}

			buf.append(catalogVersionSyncJob.getCode());
		}
		return buf.toString();
	}


	@Override
	public void createContentCatalogSyncJob(final String catalogId)
	{
		// Check if the sync job already exists
		final SyncItemJob existingSyncItemJob = getCatalogSyncJob(catalogId);
		if (existingSyncItemJob == null)
		{
			LOG.info("Creating content sync item job for [" + catalogId + "]");

			// Lookup the catalog name
			final Catalog catalog = CatalogManager.getInstance().getCatalog(catalogId);

			// Create the sync job name
			final String jobName = createJobIdentifier(catalogId);
			final SyncItemJob syncItemJob = CatalogManager.getInstance().configureSynchronizationJob(jobName, catalog,
					CatalogManager.OFFLINE_VERSION, CatalogManager.ONLINE_VERSION, true, true);

			syncItemJob.setRootTypes(JaloSession.getCurrentSession().getSessionContext(), getContentSyncRootTypes());

			final ComposedType cmsItemType = TypeManager.getInstance().getComposedType("CMSItem");

			final Collection<SyncAttributeDescriptorConfig> syncAttributeConfigurations = syncItemJob
					.getSyncAttributeConfigurations();
			for (final SyncAttributeDescriptorConfig syncAttributeDescriptorConfig : syncAttributeConfigurations)
			{
				final Type attributeType = syncAttributeDescriptorConfig.getAttributeDescriptor().getAttributeType();
				if (syncAttributeDescriptorConfig.getAttributeDescriptor().getEnclosingType().isAssignableFrom(cmsItemType)
						&& cmsItemType.isAssignableFrom(attributeType)
						|| (attributeType instanceof CollectionType && cmsItemType.isAssignableFrom(((CollectionType) attributeType)
								.getElementType())))
				{
					syncAttributeDescriptorConfig.setCopyByValue(true);
				}
			}

			LOG.info("Created content sync item job [" + syncItemJob.getCode() + "]");
		}

	}

	protected String createJobIdentifier(final String catalogId)
	{
		return "sync " + catalogId + ":" + CatalogManager.OFFLINE_VERSION + "->" + CatalogManager.ONLINE_VERSION;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.acceleratorservices.setup.SetupSyncJobService#executeCatalogSyncJob(de.hybris.platform.core
	 * .initialization.SystemSetupContext, java.lang.String)
	 */
	@Override
	public PerformResult executeCatalogSyncJob(final String catalogId)
	{
		final SyncItemJob catalogSyncJob = getCatalogSyncJob(catalogId);
		if (catalogSyncJob == null)
		{
			LOG.error("Couldn't find 'SyncItemJob' for catalog [" + catalogId + "]", null);
			return new PerformResult(CronJobResult.UNKNOWN, CronJobStatus.UNKNOWN);
		}
		else
		{
			final SyncItemCronJob syncJob = getLastFailedSyncCronJob(catalogSyncJob);
			syncJob.setLogToDatabase(false);
			syncJob.setLogToFile(false);
			syncJob.setForceUpdate(false);

			LOG.info("Created cronjob [" + syncJob.getCode() + "] to synchronize catalog [" + catalogId
					+ "] staged to online version.");
			LOG.info("Configuring full version sync");

			catalogSyncJob.configureFullVersionSync(syncJob);

			LOG.info("Starting synchronization, this may take a while ...");

			catalogSyncJob.perform(syncJob, true);

			LOG.info("Synchronization complete for catalog [" + catalogId + "]");

			final CronJobResult result = modelService.get(syncJob.getResult());
			final CronJobStatus status = modelService.get(syncJob.getStatus());
			return new PerformResult(result, status);
		}

	}


	/**
	 * Returns the last cronjob if exists and failed or the new one otherwise
	 * 
	 * @param syncItemJob
	 * @return synchronization cronjob - new one or the last one if failed
	 */
	protected SyncItemCronJob getLastFailedSyncCronJob(final SyncItemJob syncItemJob)
	{
		SyncItemCronJob syncCronJob = null;
		if (CollectionUtils.isNotEmpty(syncItemJob.getCronJobs()))
		{
			final List<CronJob> cronjobs = new ArrayList<CronJob>(syncItemJob.getCronJobs());
			Collections.sort(cronjobs, new Comparator<CronJob>()
			{
				@Override
				public int compare(final CronJob cronJob1, final CronJob cronJob2)
				{

					if (cronJob1 == null || cronJob1.getEndTime() == null || cronJob2 == null || cronJob2.getEndTime() == null)
					{
						return 0;
					}
					else
					{
						return cronJob1.getEndTime().compareTo(cronJob2.getEndTime());
					}
				}
			});
			final SyncItemCronJob latestCronJob = (SyncItemCronJob) cronjobs.get(cronjobs.size() - 1);
			final CronJobResult result = modelService.get(latestCronJob.getResult());
			final CronJobStatus status = modelService.get(latestCronJob.getStatus());
			if (CronJobStatus.FINISHED.equals(status) && !CronJobResult.SUCCESS.equals(result))
			{
				syncCronJob = latestCronJob;
			}
		}
		if (syncCronJob == null)
		{
			syncCronJob = syncItemJob.newExecution();
		}
		return syncCronJob;
	}

	/**
	 * Removes an attribute from synchronization
	 * 
	 * @param syncJob
	 *           the synchronization job
	 * @param clazz
	 *           the class
	 * @param attribute
	 *           the attribute, that should be removed
	 */
	protected void removeAttributeFromSync(final SyncItemJob syncJob, final Class clazz, final String attribute)
	{
		final ComposedType composedType = TypeManager.getInstance().getComposedType(clazz);
		final AttributeDescriptor attributeDesc = composedType.getDeclaredAttributeDescriptor(attribute);
		final SyncAttributeDescriptorConfig cfg = syncJob.getConfigFor(attributeDesc, true);
		if (cfg != null && Boolean.TRUE.equals(cfg.isIncludedInSync()))
		{
			LOG.info("Removing [" + composedType.getCode() + "] attribute [" + attributeDesc.getQualifier() + "] from sync job ["
					+ syncJob.getCode() + "]");
			cfg.setIncludedInSync(false);
		}
	}


	protected SyncItemJob getCatalogSyncJob(final String catalogId)
	{
		// Lookup the catalog name
		final Catalog catalog = CatalogManager.getInstance().getCatalog(catalogId);
		if (catalog != null)
		{
			final CatalogVersion source = catalog.getCatalogVersion(CatalogManager.OFFLINE_VERSION);
			final CatalogVersion target = catalog.getCatalogVersion(CatalogManager.ONLINE_VERSION);

			if (source != null && target != null)
			{
				return CatalogManager.getInstance().getSyncJob(source, target);
			}
		}
		return null;
	}


	protected SyncItemJob getSyncJobForCatalog(final String catalogId)
	{
		return getSyncJobForCatalogAndQualifier(catalogId, createJobIdentifier(catalogId));
	}


	protected SyncItemJob getSyncJobForCatalogAndQualifier(final String catalogId, final String qualifier)
	{
		// Lookup the catalog name
		final Catalog catalog = CatalogManager.getInstance().getCatalog(catalogId);
		if (catalog != null)
		{
			final CatalogVersion source = catalog.getCatalogVersion(CatalogManager.OFFLINE_VERSION);
			final CatalogVersion target = catalog.getCatalogVersion(CatalogManager.ONLINE_VERSION);

			if (source != null && target != null)
			{
				return CatalogManager.getInstance().getSyncJob(source, target, qualifier);
			}
		}
		return null;
	}


	protected List<ComposedType> getContentSyncRootTypes()
	{
		final TypeManager typeManager = TypeManager.getInstance();

		final List<ComposedType> rootTypes = new ArrayList<ComposedType>();

		rootTypes.add(typeManager.getComposedType("CMSItem"));
		rootTypes.add(typeManager.getComposedType("CMSRelation"));
		rootTypes.add(typeManager.getComposedType("Media"));
		rootTypes.add(typeManager.getComposedType("MediaContainer"));

		// Optionally add the BTGItem if BTG is loaded
		try
		{
			rootTypes.add(typeManager.getComposedType("BTGItem"));
		}
		catch (final JaloItemNotFoundException ignore)
		{
			// ignore
		}

		return rootTypes;
	}


	protected ModelService getModelService()
	{
		return modelService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

}
