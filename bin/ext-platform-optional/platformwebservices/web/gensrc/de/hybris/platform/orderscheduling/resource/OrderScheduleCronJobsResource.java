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
package de.hybris.platform.orderscheduling.resource;

import de.hybris.platform.orderscheduling.dto.OrderScheduleCronJobsDTO;
import de.hybris.platform.orderscheduling.model.OrderScheduleCronJobModel;
import de.hybris.platform.orderscheduling.resource.OrderScheduleCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderScheduleCronJob defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderschedulecronjobs")
public class OrderScheduleCronJobsResource extends AbstractCollectionResource <Collection<OrderScheduleCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderScheduleCronJobsResource()
	{
		super("OrderScheduleCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderScheduleCronJobs()
	{
		return createGetResponse().build(OrderScheduleCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderScheduleCronJobResource} for current root resource 
	 */
	@Path("{orderschedulecronjob}")
	public AbstractYResource getOrderScheduleCronJobResource(@PathParam("orderschedulecronjob")  final String resourceKey)
	{
		final OrderScheduleCronJobResource  resource  = resourceCtx.getResource(OrderScheduleCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderScheduleCronJobModel> getOrderScheduleCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderScheduleCronJobsCollection(final Collection<OrderScheduleCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
