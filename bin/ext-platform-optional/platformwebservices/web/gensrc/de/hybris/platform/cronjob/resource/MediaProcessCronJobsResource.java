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

import de.hybris.platform.cronjob.dto.MediaProcessCronJobsDTO;
import de.hybris.platform.cronjob.model.MediaProcessCronJobModel;
import de.hybris.platform.cronjob.resource.MediaProcessCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type MediaProcessCronJob defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/mediaprocesscronjobs")
public class MediaProcessCronJobsResource extends AbstractCollectionResource <Collection<MediaProcessCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaProcessCronJobsResource()
	{
		super("MediaProcessCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllMediaProcessCronJobs()
	{
		return createGetResponse().build(MediaProcessCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MediaProcessCronJobResource} for current root resource 
	 */
	@Path("{mediaprocesscronjob}")
	public AbstractYResource getMediaProcessCronJobResource(@PathParam("mediaprocesscronjob")  final String resourceKey)
	{
		final MediaProcessCronJobResource  resource  = resourceCtx.getResource(MediaProcessCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<MediaProcessCronJobModel> getMediaProcessCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setMediaProcessCronJobsCollection(final Collection<MediaProcessCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
