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

import de.hybris.platform.ordercancel.dto.OrderCancelConfigDTO;
import de.hybris.platform.ordercancel.dto.OrderCancelConfigsDTO;
import de.hybris.platform.ordercancel.model.OrderCancelConfigModel;
import de.hybris.platform.ordercancel.resource.OrderCancelConfigResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderCancelConfig defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/ordercancelconfigs")
public class OrderCancelConfigsResource extends AbstractCollectionResource <Collection<OrderCancelConfigModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderCancelConfigsResource()
	{
		super("OrderCancelConfig");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderCancelConfigs()
	{
		return createGetResponse().build(OrderCancelConfigsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderCancelConfigResource} for current root resource 
	 */
	@Path("{ordercancelconfig}")
	public AbstractYResource getOrderCancelConfigResource(@PathParam("ordercancelconfig")  final String resourceKey)
	{
		final OrderCancelConfigResource  resource  = resourceCtx.getResource(OrderCancelConfigResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderCancelConfigModel> getOrderCancelConfigsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postOrderCancelConfig(final OrderCancelConfigDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderCancelConfigsCollection(final Collection<OrderCancelConfigModel> value)
	{
		super.setResourceValue(value);
	}
	
}
