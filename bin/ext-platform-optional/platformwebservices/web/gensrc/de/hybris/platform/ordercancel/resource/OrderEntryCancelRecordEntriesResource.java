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
package de.hybris.platform.ordercancel.resource;

import de.hybris.platform.ordercancel.dto.OrderEntryCancelRecordEntriesDTO;
import de.hybris.platform.ordercancel.dto.OrderEntryCancelRecordEntryDTO;
import de.hybris.platform.ordercancel.model.OrderEntryCancelRecordEntryModel;
import de.hybris.platform.ordercancel.resource.OrderEntryCancelRecordEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderEntryCancelRecordEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderentrycancelrecordentries")
public class OrderEntryCancelRecordEntriesResource extends AbstractCollectionResource <Collection<OrderEntryCancelRecordEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryCancelRecordEntriesResource()
	{
		super("OrderEntryCancelRecordEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderEntryCancelRecordEntries()
	{
		return createGetResponse().build(OrderEntryCancelRecordEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderEntryCancelRecordEntryModel> getOrderEntryCancelRecordEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderEntryCancelRecordEntryResource} for current root resource 
	 */
	@Path("{orderentrycancelrecordentry}")
	public AbstractYResource getOrderEntryCancelRecordEntryResource(@PathParam("orderentrycancelrecordentry")  final String resourceKey)
	{
		final OrderEntryCancelRecordEntryResource  resource  = resourceCtx.getResource(OrderEntryCancelRecordEntryResource.class);
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
	public Response postOrderEntryCancelRecordEntry(final OrderEntryCancelRecordEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderEntryCancelRecordEntriesCollection(final Collection<OrderEntryCancelRecordEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
