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
package de.hybris.platform.core.resource.order;

import de.hybris.platform.core.dto.order.OrderEntriesDTO;
import de.hybris.platform.core.dto.order.OrderEntryDTO;
import de.hybris.platform.core.model.order.OrderEntryModel;
import de.hybris.platform.core.resource.order.OrderEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderEntry defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderentries")
public class OrderEntriesResource extends AbstractCollectionResource <Collection<OrderEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntriesResource()
	{
		super("OrderEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderEntries()
	{
		return createGetResponse().build(OrderEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderEntryModel> getOrderEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderEntryResource} for current root resource 
	 */
	@Path("{orderentry}")
	public AbstractYResource getOrderEntryResource(@PathParam("orderentry")  final String resourceKey)
	{
		final OrderEntryResource  resource  = resourceCtx.getResource(OrderEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postOrderEntry(final OrderEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderEntriesCollection(final Collection<OrderEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
