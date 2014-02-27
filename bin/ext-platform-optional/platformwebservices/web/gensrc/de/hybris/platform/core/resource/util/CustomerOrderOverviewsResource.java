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
package de.hybris.platform.core.resource.util;

import de.hybris.platform.core.dto.util.CustomerOrderOverviewDTO;
import de.hybris.platform.core.dto.util.CustomerOrderOverviewsDTO;
import de.hybris.platform.core.model.util.CustomerOrderOverviewModel;
import de.hybris.platform.core.resource.util.CustomerOrderOverviewResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CustomerOrderOverview defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/customerorderoverviews")
public class CustomerOrderOverviewsResource extends AbstractCollectionResource <Collection<CustomerOrderOverviewModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomerOrderOverviewsResource()
	{
		super("CustomerOrderOverview");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCustomerOrderOverviews()
	{
		return createGetResponse().build(CustomerOrderOverviewsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CustomerOrderOverviewResource} for current root resource 
	 */
	@Path("{customerorderoverview}")
	public AbstractYResource getCustomerOrderOverviewResource(@PathParam("customerorderoverview")  final String resourceKey)
	{
		final CustomerOrderOverviewResource  resource  = resourceCtx.getResource(CustomerOrderOverviewResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CustomerOrderOverviewModel> getCustomerOrderOverviewsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCustomerOrderOverview(final CustomerOrderOverviewDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCustomerOrderOverviewsCollection(final Collection<CustomerOrderOverviewModel> value)
	{
		super.setResourceValue(value);
	}
	
}
