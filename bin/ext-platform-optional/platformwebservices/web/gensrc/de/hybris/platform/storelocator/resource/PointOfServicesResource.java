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
package de.hybris.platform.storelocator.resource;

import de.hybris.platform.storelocator.dto.PointOfServicesDTO;
import de.hybris.platform.storelocator.model.PointOfServiceModel;
import de.hybris.platform.storelocator.resource.PointOfServiceResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PointOfService defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/pointofservices")
public class PointOfServicesResource extends AbstractCollectionResource <Collection<PointOfServiceModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PointOfServicesResource()
	{
		super("PointOfService");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPointOfServices()
	{
		return createGetResponse().build(PointOfServicesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PointOfServiceResource} for current root resource 
	 */
	@Path("{pointofservice}")
	public AbstractYResource getPointOfServiceResource(@PathParam("pointofservice")  final String resourceKey)
	{
		final PointOfServiceResource  resource  = resourceCtx.getResource(PointOfServiceResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PointOfServiceModel> getPointOfServicesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPointOfServicesCollection(final Collection<PointOfServiceModel> value)
	{
		super.setResourceValue(value);
	}
	
}
