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

import de.hybris.platform.servicelayer.internal.dto.DynamicMaintenanceCleanupJobsDTO;
import de.hybris.platform.servicelayer.internal.model.DynamicMaintenanceCleanupJobModel;
import de.hybris.platform.servicelayer.internal.resource.DynamicMaintenanceCleanupJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type DynamicMaintenanceCleanupJob defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/dynamicmaintenancecleanupjobs")
public class DynamicMaintenanceCleanupJobsResource extends AbstractCollectionResource <Collection<DynamicMaintenanceCleanupJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicMaintenanceCleanupJobsResource()
	{
		super("DynamicMaintenanceCleanupJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDynamicMaintenanceCleanupJobs()
	{
		return createGetResponse().build(DynamicMaintenanceCleanupJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DynamicMaintenanceCleanupJobResource} for current root resource 
	 */
	@Path("{dynamicmaintenancecleanupjob}")
	public AbstractYResource getDynamicMaintenanceCleanupJobResource(@PathParam("dynamicmaintenancecleanupjob")  final String resourceKey)
	{
		final DynamicMaintenanceCleanupJobResource  resource  = resourceCtx.getResource(DynamicMaintenanceCleanupJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DynamicMaintenanceCleanupJobModel> getDynamicMaintenanceCleanupJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDynamicMaintenanceCleanupJobsCollection(final Collection<DynamicMaintenanceCleanupJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
