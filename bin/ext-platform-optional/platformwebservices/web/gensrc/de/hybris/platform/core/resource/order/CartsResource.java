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

import de.hybris.platform.core.dto.order.CartDTO;
import de.hybris.platform.core.dto.order.CartsDTO;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.resource.order.CartResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Cart defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/carts")
public class CartsResource extends AbstractCollectionResource <Collection<CartModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartsResource()
	{
		super("Cart");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCarts()
	{
		return createGetResponse().build(CartsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CartResource} for current root resource 
	 */
	@Path("{cart}")
	public AbstractYResource getCartResource(@PathParam("cart")  final String resourceKey)
	{
		final CartResource  resource  = resourceCtx.getResource(CartResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CartModel> getCartsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCart(final CartDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCartsCollection(final Collection<CartModel> value)
	{
		super.setResourceValue(value);
	}
	
}
