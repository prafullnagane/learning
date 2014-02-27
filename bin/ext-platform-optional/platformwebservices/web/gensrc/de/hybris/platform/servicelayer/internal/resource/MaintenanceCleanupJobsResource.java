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
package de.hybris.platform.servicelayer.internal.resource;

import de.hybris.platform.servicelayer.internal.dto.MaintenanceCleanupJobsDTO;
import de.hybris.platform.servicelayer.internal.model.MaintenanceCleanupJobModel;
import de.hybris.platform.servicelayer.internal.resource.MaintenanceCleanupJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type MaintenanceCleanupJob defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/maintenancecleanupjobs")
public class MaintenanceCleanupJobsResource extends AbstractCollectionResource <Collection<MaintenanceCleanupJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MaintenanceCleanupJobsResource()
	{
		super("MaintenanceCleanupJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllMaintenanceCleanupJobs()
	{
		return createGetResponse().build(MaintenanceCleanupJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MaintenanceCleanupJobResource} for current root resource 
	 */
	@Path("{maintenancecleanupjob}")
	public AbstractYResource getMaintenanceCleanupJobResource(@PathParam("maintenancecleanupjob")  final String resourceKey)
	{
		final MaintenanceCleanupJobResource  resource  = resourceCtx.getResource(MaintenanceCleanupJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<MaintenanceCleanupJobModel> getMaintenanceCleanupJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setMaintenanceCleanupJobsCollection(final Collection<MaintenanceCleanupJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
