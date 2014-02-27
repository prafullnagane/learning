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

import de.hybris.platform.orderscheduling.dto.CartToOrderCronJobsDTO;
import de.hybris.platform.orderscheduling.model.CartToOrderCronJobModel;
import de.hybris.platform.orderscheduling.resource.CartToOrderCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CartToOrderCronJob defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/carttoordercronjobs")
public class CartToOrderCronJobsResource extends AbstractCollectionResource <Collection<CartToOrderCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartToOrderCronJobsResource()
	{
		super("CartToOrderCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCartToOrderCronJobs()
	{
		return createGetResponse().build(CartToOrderCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CartToOrderCronJobResource} for current root resource 
	 */
	@Path("{carttoordercronjob}")
	public AbstractYResource getCartToOrderCronJobResource(@PathParam("carttoordercronjob")  final String resourceKey)
	{
		final CartToOrderCronJobResource  resource  = resourceCtx.getResource(CartToOrderCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CartToOrderCronJobModel> getCartToOrderCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCartToOrderCronJobsCollection(final Collection<CartToOrderCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
