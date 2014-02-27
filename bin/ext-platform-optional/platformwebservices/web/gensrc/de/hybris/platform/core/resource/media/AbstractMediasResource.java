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

import de.hybris.platform.core.dto.media.AbstractMediaDTO;
import de.hybris.platform.core.dto.media.AbstractMediasDTO;
import de.hybris.platform.core.model.media.AbstractMediaModel;
import de.hybris.platform.core.resource.media.AbstractMediaResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractMedia defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractmedias")
public class AbstractMediasResource extends AbstractCollectionResource <Collection<AbstractMediaModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractMediasResource()
	{
		super("AbstractMedia");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractMediaResource} for current root resource 
	 */
	@Path("{abstractmedia}")
	public AbstractYResource getAbstractMediaResource(@PathParam("abstractmedia")  final String resourceKey)
	{
		final AbstractMediaResource  resource  = resourceCtx.getResource(AbstractMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractMediaModel> getAbstractMediasCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractMedias()
	{
		return createGetResponse().build(AbstractMediasDTO.class);
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postAbstractMedia(final AbstractMediaDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractMediasCollection(final Collection<AbstractMediaModel> value)
	{
		super.setResourceValue(value);
	}
	
}
