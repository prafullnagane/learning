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

import de.hybris.platform.orderscheduling.dto.OrderTemplateToOrderCronJobsDTO;
import de.hybris.platform.orderscheduling.model.OrderTemplateToOrderCronJobModel;
import de.hybris.platform.orderscheduling.resource.OrderTemplateToOrderCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderTemplateToOrderCronJob defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/ordertemplatetoordercronjobs")
public class OrderTemplateToOrderCronJobsResource extends AbstractCollectionResource <Collection<OrderTemplateToOrderCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderTemplateToOrderCronJobsResource()
	{
		super("OrderTemplateToOrderCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderTemplateToOrderCronJobs()
	{
		return createGetResponse().build(OrderTemplateToOrderCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderTemplateToOrderCronJobResource} for current root resource 
	 */
	@Path("{ordertemplatetoordercronjob}")
	public AbstractYResource getOrderTemplateToOrderCronJobResource(@PathParam("ordertemplatetoordercronjob")  final String resourceKey)
	{
		final OrderTemplateToOrderCronJobResource  resource  = resourceCtx.getResource(OrderTemplateToOrderCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderTemplateToOrderCronJobModel> getOrderTemplateToOrderCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderTemplateToOrderCronJobsCollection(final Collection<OrderTemplateToOrderCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
