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
package de.hybris.platform.core.resource.util;

import de.hybris.platform.core.dto.util.ExecutedPublicationsViewDTO;
import de.hybris.platform.core.dto.util.ExecutedPublicationsViewsDTO;
import de.hybris.platform.core.model.util.ExecutedPublicationsViewModel;
import de.hybris.platform.core.resource.util.ExecutedPublicationsViewResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ExecutedPublicationsView defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/executedpublicationsviews")
public class ExecutedPublicationsViewsResource extends AbstractCollectionResource <Collection<ExecutedPublicationsViewModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExecutedPublicationsViewsResource()
	{
		super("ExecutedPublicationsView");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllExecutedPublicationsViews()
	{
		return createGetResponse().build(ExecutedPublicationsViewsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ExecutedPublicationsViewResource} for current root resource 
	 */
	@Path("{executedpublicationsview}")
	public AbstractYResource getExecutedPublicationsViewResource(@PathParam("executedpublicationsview")  final String resourceKey)
	{
		final ExecutedPublicationsViewResource  resource  = resourceCtx.getResource(ExecutedPublicationsViewResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ExecutedPublicationsViewModel> getExecutedPublicationsViewsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postExecutedPublicationsView(final ExecutedPublicationsViewDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setExecutedPublicationsViewsCollection(final Collection<ExecutedPublicationsViewModel> value)
	{
		super.setResourceValue(value);
	}
	
}
