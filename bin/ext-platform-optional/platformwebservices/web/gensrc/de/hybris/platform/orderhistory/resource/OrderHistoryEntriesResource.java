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
package de.hybris.platform.orderhistory.resource;

import de.hybris.platform.orderhistory.dto.OrderHistoryEntriesDTO;
import de.hybris.platform.orderhistory.dto.OrderHistoryEntryDTO;
import de.hybris.platform.orderhistory.model.OrderHistoryEntryModel;
import de.hybris.platform.orderhistory.resource.OrderHistoryEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderHistoryEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderhistoryentries")
public class OrderHistoryEntriesResource extends AbstractCollectionResource <Collection<OrderHistoryEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderHistoryEntriesResource()
	{
		super("OrderHistoryEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderHistoryEntries()
	{
		return createGetResponse().build(OrderHistoryEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderHistoryEntryModel> getOrderHistoryEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderHistoryEntryResource} for current root resource 
	 */
	@Path("{orderhistoryentry}")
	public AbstractYResource getOrderHistoryEntryResource(@PathParam("orderhistoryentry")  final String resourceKey)
	{
		final OrderHistoryEntryResource  resource  = resourceCtx.getResource(OrderHistoryEntryResource.class);
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
	public Response postOrderHistoryEntry(final OrderHistoryEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderHistoryEntriesCollection(final Collection<OrderHistoryEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
