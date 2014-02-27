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

import de.hybris.platform.core.dto.util.ModifiedCatalogItemsViewDTO;
import de.hybris.platform.core.dto.util.ModifiedCatalogItemsViewsDTO;
import de.hybris.platform.core.model.util.ModifiedCatalogItemsViewModel;
import de.hybris.platform.core.resource.util.ModifiedCatalogItemsViewResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ModifiedCatalogItemsView defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/modifiedcatalogitemsviews")
public class ModifiedCatalogItemsViewsResource extends AbstractCollectionResource <Collection<ModifiedCatalogItemsViewModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ModifiedCatalogItemsViewsResource()
	{
		super("ModifiedCatalogItemsView");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllModifiedCatalogItemsViews()
	{
		return createGetResponse().build(ModifiedCatalogItemsViewsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ModifiedCatalogItemsViewResource} for current root resource 
	 */
	@Path("{modifiedcatalogitemsview}")
	public AbstractYResource getModifiedCatalogItemsViewResource(@PathParam("modifiedcatalogitemsview")  final String resourceKey)
	{
		final ModifiedCatalogItemsViewResource  resource  = resourceCtx.getResource(ModifiedCatalogItemsViewResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ModifiedCatalogItemsViewModel> getModifiedCatalogItemsViewsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postModifiedCatalogItemsView(final ModifiedCatalogItemsViewDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setModifiedCatalogItemsViewsCollection(final Collection<ModifiedCatalogItemsViewModel> value)
	{
		super.setResourceValue(value);
	}
	
}
