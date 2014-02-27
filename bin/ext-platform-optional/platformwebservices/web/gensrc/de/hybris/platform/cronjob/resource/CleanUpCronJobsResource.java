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
package de.hybris.platform.cronjob.resource;

import de.hybris.platform.cronjob.dto.CleanUpCronJobsDTO;
import de.hybris.platform.cronjob.model.CleanUpCronJobModel;
import de.hybris.platform.cronjob.resource.CleanUpCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CleanUpCronJob defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cleanupcronjobs")
public class CleanUpCronJobsResource extends AbstractCollectionResource <Collection<CleanUpCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CleanUpCronJobsResource()
	{
		super("CleanUpCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCleanUpCronJobs()
	{
		return createGetResponse().build(CleanUpCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CleanUpCronJobResource} for current root resource 
	 */
	@Path("{cleanupcronjob}")
	public AbstractYResource getCleanUpCronJobResource(@PathParam("cleanupcronjob")  final String resourceKey)
	{
		final CleanUpCronJobResource  resource  = resourceCtx.getResource(CleanUpCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CleanUpCronJobModel> getCleanUpCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCleanUpCronJobsCollection(final Collection<CleanUpCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
