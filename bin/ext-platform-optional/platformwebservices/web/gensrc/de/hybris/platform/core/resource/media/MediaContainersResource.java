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
package de.hybris.platform.core.resource.media;

import de.hybris.platform.core.dto.media.MediaContainersDTO;
import de.hybris.platform.core.model.media.MediaContainerModel;
import de.hybris.platform.core.resource.media.MediaContainerResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type MediaContainer defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/mediacontainers")
public class MediaContainersResource extends AbstractCollectionResource <Collection<MediaContainerModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaContainersResource()
	{
		super("MediaContainer");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllMediaContainers()
	{
		return createGetResponse().build(MediaContainersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MediaContainerResource} for current root resource 
	 */
	@Path("{mediacontainer}")
	public AbstractYResource getMediaContainerResource(@PathParam("mediacontainer")  final String resourceKey)
	{
		final MediaContainerResource  resource  = resourceCtx.getResource(MediaContainerResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<MediaContainerModel> getMediaContainersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setMediaContainersCollection(final Collection<MediaContainerModel> value)
	{
		super.setResourceValue(value);
	}
	
}
