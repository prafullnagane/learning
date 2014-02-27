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

import de.hybris.platform.core.dto.util.CatalogOverviewDTO;
import de.hybris.platform.core.dto.util.CatalogOverviewsDTO;
import de.hybris.platform.core.model.util.CatalogOverviewModel;
import de.hybris.platform.core.resource.util.CatalogOverviewResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CatalogOverview defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/catalogoverviews")
public class CatalogOverviewsResource extends AbstractCollectionResource <Collection<CatalogOverviewModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogOverviewsResource()
	{
		super("CatalogOverview");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCatalogOverviews()
	{
		return createGetResponse().build(CatalogOverviewsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogOverviewResource} for current root resource 
	 */
	@Path("{catalogoverview}")
	public AbstractYResource getCatalogOverviewResource(@PathParam("catalogoverview")  final String resourceKey)
	{
		final CatalogOverviewResource  resource  = resourceCtx.getResource(CatalogOverviewResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CatalogOverviewModel> getCatalogOverviewsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCatalogOverview(final CatalogOverviewDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCatalogOverviewsCollection(final Collection<CatalogOverviewModel> value)
	{
		super.setResourceValue(value);
	}
	
}
