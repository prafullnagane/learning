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

import de.hybris.platform.core.dto.media.DerivedMediaDTO;
import de.hybris.platform.core.dto.media.DerivedMediasDTO;
import de.hybris.platform.core.model.media.DerivedMediaModel;
import de.hybris.platform.core.resource.media.DerivedMediaResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type DerivedMedia defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/derivedmedias")
public class DerivedMediasResource extends AbstractCollectionResource <Collection<DerivedMediaModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DerivedMediasResource()
	{
		super("DerivedMedia");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDerivedMedias()
	{
		return createGetResponse().build(DerivedMediasDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DerivedMediaResource} for current root resource 
	 */
	@Path("{derivedmedia}")
	public AbstractYResource getDerivedMediaResource(@PathParam("derivedmedia")  final String resourceKey)
	{
		final DerivedMediaResource  resource  = resourceCtx.getResource(DerivedMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DerivedMediaModel> getDerivedMediasCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postDerivedMedia(final DerivedMediaDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDerivedMediasCollection(final Collection<DerivedMediaModel> value)
	{
		super.setResourceValue(value);
	}
	
}
