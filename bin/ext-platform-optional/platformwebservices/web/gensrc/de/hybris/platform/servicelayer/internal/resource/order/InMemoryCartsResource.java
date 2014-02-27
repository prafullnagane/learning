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
package de.hybris.platform.servicelayer.internal.resource.order;

import de.hybris.platform.servicelayer.internal.dto.order.InMemoryCartsDTO;
import de.hybris.platform.servicelayer.internal.model.order.InMemoryCartModel;
import de.hybris.platform.servicelayer.internal.resource.order.InMemoryCartResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type InMemoryCart defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/inmemorycarts")
public class InMemoryCartsResource extends AbstractCollectionResource <Collection<InMemoryCartModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public InMemoryCartsResource()
	{
		super("InMemoryCart");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllInMemoryCarts()
	{
		return createGetResponse().build(InMemoryCartsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link InMemoryCartResource} for current root resource 
	 */
	@Path("{inmemorycart}")
	public AbstractYResource getInMemoryCartResource(@PathParam("inmemorycart")  final String resourceKey)
	{
		final InMemoryCartResource  resource  = resourceCtx.getResource(InMemoryCartResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<InMemoryCartModel> getInMemoryCartsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setInMemoryCartsCollection(final Collection<InMemoryCartModel> value)
	{
		super.setResourceValue(value);
	}
	
}
