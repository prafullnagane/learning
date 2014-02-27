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

import de.hybris.platform.core.dto.util.DuplicateCatalogItemCodesViewDTO;
import de.hybris.platform.core.dto.util.DuplicateCatalogItemCodesViewsDTO;
import de.hybris.platform.core.model.util.DuplicateCatalogItemCodesViewModel;
import de.hybris.platform.core.resource.util.DuplicateCatalogItemCodesViewResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type DuplicateCatalogItemCodesView defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/duplicatecatalogitemcodesviews")
public class DuplicateCatalogItemCodesViewsResource extends AbstractCollectionResource <Collection<DuplicateCatalogItemCodesViewModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DuplicateCatalogItemCodesViewsResource()
	{
		super("DuplicateCatalogItemCodesView");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDuplicateCatalogItemCodesViews()
	{
		return createGetResponse().build(DuplicateCatalogItemCodesViewsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DuplicateCatalogItemCodesViewResource} for current root resource 
	 */
	@Path("{duplicatecatalogitemcodesview}")
	public AbstractYResource getDuplicateCatalogItemCodesViewResource(@PathParam("duplicatecatalogitemcodesview")  final String resourceKey)
	{
		final DuplicateCatalogItemCodesViewResource  resource  = resourceCtx.getResource(DuplicateCatalogItemCodesViewResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DuplicateCatalogItemCodesViewModel> getDuplicateCatalogItemCodesViewsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postDuplicateCatalogItemCodesView(final DuplicateCatalogItemCodesViewDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDuplicateCatalogItemCodesViewsCollection(final Collection<DuplicateCatalogItemCodesViewModel> value)
	{
		super.setResourceValue(value);
	}
	
}
