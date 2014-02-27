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
package de.hybris.platform.ordermodify.resource;

import de.hybris.platform.ordermodify.dto.OrderEntryModificationRecordEntriesDTO;
import de.hybris.platform.ordermodify.dto.OrderEntryModificationRecordEntryDTO;
import de.hybris.platform.ordermodify.model.OrderEntryModificationRecordEntryModel;
import de.hybris.platform.ordermodify.resource.OrderEntryModificationRecordEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderEntryModificationRecordEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderentrymodificationrecordentries")
public class OrderEntryModificationRecordEntriesResource extends AbstractCollectionResource <Collection<OrderEntryModificationRecordEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryModificationRecordEntriesResource()
	{
		super("OrderEntryModificationRecordEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderEntryModificationRecordEntries()
	{
		return createGetResponse().build(OrderEntryModificationRecordEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderEntryModificationRecordEntryModel> getOrderEntryModificationRecordEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderEntryModificationRecordEntryResource} for current root resource 
	 */
	@Path("{orderentrymodificationrecordentry}")
	public AbstractYResource getOrderEntryModificationRecordEntryResource(@PathParam("orderentrymodificationrecordentry")  final String resourceKey)
	{
		final OrderEntryModificationRecordEntryResource  resource  = resourceCtx.getResource(OrderEntryModificationRecordEntryResource.class);
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
	public Response postOrderEntryModificationRecordEntry(final OrderEntryModificationRecordEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderEntryModificationRecordEntriesCollection(final Collection<OrderEntryModificationRecordEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
