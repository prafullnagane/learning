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

import de.hybris.platform.ordercancel.dto.OrderCancelRecordsDTO;
import de.hybris.platform.ordercancel.model.OrderCancelRecordModel;
import de.hybris.platform.ordercancel.resource.OrderCancelRecordResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderCancelRecord defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/ordercancelrecords")
public class OrderCancelRecordsResource extends AbstractCollectionResource <Collection<OrderCancelRecordModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderCancelRecordsResource()
	{
		super("OrderCancelRecord");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderCancelRecords()
	{
		return createGetResponse().build(OrderCancelRecordsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderCancelRecordResource} for current root resource 
	 */
	@Path("{ordercancelrecord}")
	public AbstractYResource getOrderCancelRecordResource(@PathParam("ordercancelrecord")  final String resourceKey)
	{
		final OrderCancelRecordResource  resource  = resourceCtx.getResource(OrderCancelRecordResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderCancelRecordModel> getOrderCancelRecordsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderCancelRecordsCollection(final Collection<OrderCancelRecordModel> value)
	{
		super.setResourceValue(value);
	}
	
}
