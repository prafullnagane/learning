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

import de.hybris.platform.core.dto.media.MediaFormatMappingDTO;
import de.hybris.platform.core.dto.media.MediaFormatMappingsDTO;
import de.hybris.platform.core.model.media.MediaFormatMappingModel;
import de.hybris.platform.core.resource.media.MediaFormatMappingResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type MediaFormatMapping defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/mediaformatmappings")
public class MediaFormatMappingsResource extends AbstractCollectionResource <Collection<MediaFormatMappingModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaFormatMappingsResource()
	{
		super("MediaFormatMapping");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllMediaFormatMappings()
	{
		return createGetResponse().build(MediaFormatMappingsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MediaFormatMappingResource} for current root resource 
	 */
	@Path("{mediaformatmapping}")
	public AbstractYResource getMediaFormatMappingResource(@PathParam("mediaformatmapping")  final String resourceKey)
	{
		final MediaFormatMappingResource  resource  = resourceCtx.getResource(MediaFormatMappingResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<MediaFormatMappingModel> getMediaFormatMappingsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postMediaFormatMapping(final MediaFormatMappingDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setMediaFormatMappingsCollection(final Collection<MediaFormatMappingModel> value)
	{
		super.setResourceValue(value);
	}
	
}
