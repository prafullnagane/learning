/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 13, 2013 6:34:48 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.catalog.resource.synchronization;

import de.hybris.platform.catalog.dto.synchronization.CatalogVersionSyncCronJobsDTO;
import de.hybris.platform.catalog.model.synchronization.CatalogVersionSyncCronJobModel;
import de.hybris.platform.catalog.resource.synchronization.CatalogVersionSyncCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CatalogVersionSyncCronJob defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/catalogversionsynccronjobs")
public class CatalogVersionSyncCronJobsResource extends AbstractCollectionResource <Collection<CatalogVersionSyncCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionSyncCronJobsResource()
	{
		super("CatalogVersionSyncCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCatalogVersionSyncCronJobs()
	{
		return createGetResponse().build(CatalogVersionSyncCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogVersionSyncCronJobResource} for current root resource 
	 */
	@Path("{catalogversionsynccronjob}")
	public AbstractYResource getCatalogVersionSyncCronJobResource(@PathParam("catalogversionsynccronjob")  final String resourceKey)
	{
		final CatalogVersionSyncCronJobResource  resource  = resourceCtx.getResource(CatalogVersionSyncCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CatalogVersionSyncCronJobModel> getCatalogVersionSyncCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCatalogVersionSyncCronJobsCollection(final Collection<CatalogVersionSyncCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
