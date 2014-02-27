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
package de.hybris.platform.core.resource;

import de.hybris.platform.core.dto.GenericTestItemDTO;
import de.hybris.platform.core.dto.GenericTestItemsDTO;
import de.hybris.platform.core.model.GenericTestItemModel;
import de.hybris.platform.core.resource.GenericTestItemResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type GenericTestItem defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/generictestitems")
public class GenericTestItemsResource extends AbstractCollectionResource <Collection<GenericTestItemModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GenericTestItemsResource()
	{
		super("GenericTestItem");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllGenericTestItems()
	{
		return createGetResponse().build(GenericTestItemsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link GenericTestItemResource} for current root resource 
	 */
	@Path("{generictestitem}")
	public AbstractYResource getGenericTestItemResource(@PathParam("generictestitem")  final String resourceKey)
	{
		final GenericTestItemResource  resource  = resourceCtx.getResource(GenericTestItemResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<GenericTestItemModel> getGenericTestItemsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postGenericTestItem(final GenericTestItemDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setGenericTestItemsCollection(final Collection<GenericTestItemModel> value)
	{
		super.setResourceValue(value);
	}
	
}
