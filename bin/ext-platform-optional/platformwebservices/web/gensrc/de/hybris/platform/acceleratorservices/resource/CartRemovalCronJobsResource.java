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
package de.hybris.platform.acceleratorservices.resource;

import de.hybris.platform.acceleratorservices.dto.CartRemovalCronJobsDTO;
import de.hybris.platform.acceleratorservices.model.CartRemovalCronJobModel;
import de.hybris.platform.acceleratorservices.resource.CartRemovalCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CartRemovalCronJob defined at extension acceleratorservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cartremovalcronjobs")
public class CartRemovalCronJobsResource extends AbstractCollectionResource <Collection<CartRemovalCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartRemovalCronJobsResource()
	{
		super("CartRemovalCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCartRemovalCronJobs()
	{
		return createGetResponse().build(CartRemovalCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CartRemovalCronJobResource} for current root resource 
	 */
	@Path("{cartremovalcronjob}")
	public AbstractYResource getCartRemovalCronJobResource(@PathParam("cartremovalcronjob")  final String resourceKey)
	{
		final CartRemovalCronJobResource  resource  = resourceCtx.getResource(CartRemovalCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CartRemovalCronJobModel> getCartRemovalCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCartRemovalCronJobsCollection(final Collection<CartRemovalCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
