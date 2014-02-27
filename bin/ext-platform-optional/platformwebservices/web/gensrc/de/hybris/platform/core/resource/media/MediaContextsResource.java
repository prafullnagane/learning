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

import de.hybris.platform.core.dto.media.MediaContextsDTO;
import de.hybris.platform.core.model.media.MediaContextModel;
import de.hybris.platform.core.resource.media.MediaContextResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type MediaContext defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/mediacontexts")
public class MediaContextsResource extends AbstractCollectionResource <Collection<MediaContextModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaContextsResource()
	{
		super("MediaContext");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllMediaContexts()
	{
		return createGetResponse().build(MediaContextsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MediaContextResource} for current root resource 
	 */
	@Path("{mediacontext}")
	public AbstractYResource getMediaContextResource(@PathParam("mediacontext")  final String resourceKey)
	{
		final MediaContextResource  resource  = resourceCtx.getResource(MediaContextResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<MediaContextModel> getMediaContextsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setMediaContextsCollection(final Collection<MediaContextModel> value)
	{
		super.setResourceValue(value);
	}
	
}
