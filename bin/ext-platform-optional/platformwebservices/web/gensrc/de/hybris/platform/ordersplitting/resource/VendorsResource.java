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
package de.hybris.platform.ordersplitting.resource;

import de.hybris.platform.ordersplitting.dto.VendorDTO;
import de.hybris.platform.ordersplitting.dto.VendorsDTO;
import de.hybris.platform.ordersplitting.model.VendorModel;
import de.hybris.platform.ordersplitting.resource.VendorResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Vendor defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/vendors")
public class VendorsResource extends AbstractCollectionResource <Collection<VendorModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VendorsResource()
	{
		super("Vendor");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllVendors()
	{
		return createGetResponse().build(VendorsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link VendorResource} for current root resource 
	 */
	@Path("{vendor}")
	public AbstractYResource getVendorResource(@PathParam("vendor")  final String resourceKey)
	{
		final VendorResource  resource  = resourceCtx.getResource(VendorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<VendorModel> getVendorsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postVendor(final VendorDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setVendorsCollection(final Collection<VendorModel> value)
	{
		super.setResourceValue(value);
	}
	
}
