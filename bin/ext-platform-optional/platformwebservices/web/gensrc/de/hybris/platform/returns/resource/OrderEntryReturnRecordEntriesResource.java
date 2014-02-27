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
package de.hybris.platform.returns.resource;

import de.hybris.platform.returns.dto.OrderEntryReturnRecordEntriesDTO;
import de.hybris.platform.returns.dto.OrderEntryReturnRecordEntryDTO;
import de.hybris.platform.returns.model.OrderEntryReturnRecordEntryModel;
import de.hybris.platform.returns.resource.OrderEntryReturnRecordEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderEntryReturnRecordEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderentryreturnrecordentries")
public class OrderEntryReturnRecordEntriesResource extends AbstractCollectionResource <Collection<OrderEntryReturnRecordEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryReturnRecordEntriesResource()
	{
		super("OrderEntryReturnRecordEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderEntryReturnRecordEntries()
	{
		return createGetResponse().build(OrderEntryReturnRecordEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderEntryReturnRecordEntryModel> getOrderEntryReturnRecordEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderEntryReturnRecordEntryResource} for current root resource 
	 */
	@Path("{orderentryreturnrecordentry}")
	public AbstractYResource getOrderEntryReturnRecordEntryResource(@PathParam("orderentryreturnrecordentry")  final String resourceKey)
	{
		final OrderEntryReturnRecordEntryResource  resource  = resourceCtx.getResource(OrderEntryReturnRecordEntryResource.class);
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
	public Response postOrderEntryReturnRecordEntry(final OrderEntryReturnRecordEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderEntryReturnRecordEntriesCollection(final Collection<OrderEntryReturnRecordEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}