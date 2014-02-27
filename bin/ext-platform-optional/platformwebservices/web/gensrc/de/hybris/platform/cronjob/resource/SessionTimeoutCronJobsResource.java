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

import de.hybris.platform.cronjob.dto.SessionTimeoutCronJobsDTO;
import de.hybris.platform.cronjob.model.SessionTimeoutCronJobModel;
import de.hybris.platform.cronjob.resource.SessionTimeoutCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SessionTimeoutCronJob defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/sessiontimeoutcronjobs")
public class SessionTimeoutCronJobsResource extends AbstractCollectionResource <Collection<SessionTimeoutCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SessionTimeoutCronJobsResource()
	{
		super("SessionTimeoutCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSessionTimeoutCronJobs()
	{
		return createGetResponse().build(SessionTimeoutCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SessionTimeoutCronJobResource} for current root resource 
	 */
	@Path("{sessiontimeoutcronjob}")
	public AbstractYResource getSessionTimeoutCronJobResource(@PathParam("sessiontimeoutcronjob")  final String resourceKey)
	{
		final SessionTimeoutCronJobResource  resource  = resourceCtx.getResource(SessionTimeoutCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SessionTimeoutCronJobModel> getSessionTimeoutCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSessionTimeoutCronJobsCollection(final Collection<SessionTimeoutCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
