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
package de.hybris.platform.orderprocessing.resource;

import de.hybris.platform.orderprocessing.dto.OrderProcessesDTO;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.orderprocessing.resource.OrderProcessResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderProcess defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderprocesses")
public class OrderProcessesResource extends AbstractCollectionResource <Collection<OrderProcessModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderProcessesResource()
	{
		super("OrderProcess");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderProcesses()
	{
		return createGetResponse().build(OrderProcessesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderProcessModel> getOrderProcessesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderProcessResource} for current root resource 
	 */
	@Path("{orderprocess}")
	public AbstractYResource getOrderProcessResource(@PathParam("orderprocess")  final String resourceKey)
	{
		final OrderProcessResource  resource  = resourceCtx.getResource(OrderProcessResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderProcessesCollection(final Collection<OrderProcessModel> value)
	{
		super.setResourceValue(value);
	}
	
}
