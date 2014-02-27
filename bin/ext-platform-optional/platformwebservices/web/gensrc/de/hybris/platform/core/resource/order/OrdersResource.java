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

import de.hybris.platform.core.dto.order.OrdersDTO;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.resource.order.OrderResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Order defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orders")
public class OrdersResource extends AbstractCollectionResource <Collection<OrderModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrdersResource()
	{
		super("Order");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrders()
	{
		return createGetResponse().build(OrdersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderResource} for current root resource 
	 */
	@Path("{order}")
	public AbstractYResource getOrderResource(@PathParam("order")  final String resourceKey)
	{
		final OrderResource  resource  = resourceCtx.getResource(OrderResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderModel> getOrdersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrdersCollection(final Collection<OrderModel> value)
	{
		super.setResourceValue(value);
	}
	
}
