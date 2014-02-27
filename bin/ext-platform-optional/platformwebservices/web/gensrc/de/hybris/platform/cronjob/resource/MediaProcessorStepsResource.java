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

import de.hybris.platform.cronjob.dto.MediaProcessorStepsDTO;
import de.hybris.platform.cronjob.model.MediaProcessorStepModel;
import de.hybris.platform.cronjob.resource.MediaProcessorStepResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type MediaProcessorStep defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/mediaprocessorsteps")
public class MediaProcessorStepsResource extends AbstractCollectionResource <Collection<MediaProcessorStepModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaProcessorStepsResource()
	{
		super("MediaProcessorStep");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllMediaProcessorSteps()
	{
		return createGetResponse().build(MediaProcessorStepsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MediaProcessorStepResource} for current root resource 
	 */
	@Path("{mediaprocessorstep}")
	public AbstractYResource getMediaProcessorStepResource(@PathParam("mediaprocessorstep")  final String resourceKey)
	{
		final MediaProcessorStepResource  resource  = resourceCtx.getResource(MediaProcessorStepResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<MediaProcessorStepModel> getMediaProcessorStepsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setMediaProcessorStepsCollection(final Collection<MediaProcessorStepModel> value)
	{
		super.setResourceValue(value);
	}
	
}