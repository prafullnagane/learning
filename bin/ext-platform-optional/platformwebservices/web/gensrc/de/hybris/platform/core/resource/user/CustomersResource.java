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
package de.hybris.platform.core.resource.user;

import de.hybris.platform.core.dto.user.CustomersDTO;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.resource.user.CustomerResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Customer defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/customers")
public class CustomersResource extends AbstractCollectionResource <Collection<CustomerModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomersResource()
	{
		super("Customer");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCustomers()
	{
		return createGetResponse().build(CustomersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CustomerResource} for current root resource 
	 */
	@Path("{customer}")
	public AbstractYResource getCustomerResource(@PathParam("customer")  final String resourceKey)
	{
		final CustomerResource  resource  = resourceCtx.getResource(CustomerResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CustomerModel> getCustomersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCustomersCollection(final Collection<CustomerModel> value)
	{
		super.setResourceValue(value);
	}
	
}
