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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.ItemsDTO;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.resource.ItemResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Item defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/items")
public class ItemsResource extends AbstractCollectionResource <Collection<ItemModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemsResource()
	{
		super("Item");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllItems()
	{
		return createGetResponse().build(ItemsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ItemResource} for current root resource 
	 */
	@Path("{item}")
	public AbstractYResource getItemResource(@PathParam("item")  final String resourceKey)
	{
		final ItemResource  resource  = resourceCtx.getResource(ItemResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ItemModel> getItemsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postItem(final ItemDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setItemsCollection(final Collection<ItemModel> value)
	{
		super.setResourceValue(value);
	}
	
}
