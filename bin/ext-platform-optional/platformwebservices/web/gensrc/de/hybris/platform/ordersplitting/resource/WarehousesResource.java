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

import de.hybris.platform.ordersplitting.dto.WarehouseDTO;
import de.hybris.platform.ordersplitting.dto.WarehousesDTO;
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.ordersplitting.resource.WarehouseResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Warehouse defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/warehouses")
public class WarehousesResource extends AbstractCollectionResource <Collection<WarehouseModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WarehousesResource()
	{
		super("Warehouse");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllWarehouses()
	{
		return createGetResponse().build(WarehousesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link WarehouseResource} for current root resource 
	 */
	@Path("{warehouse}")
	public AbstractYResource getWarehouseResource(@PathParam("warehouse")  final String resourceKey)
	{
		final WarehouseResource  resource  = resourceCtx.getResource(WarehouseResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<WarehouseModel> getWarehousesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postWarehouse(final WarehouseDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setWarehousesCollection(final Collection<WarehouseModel> value)
	{
		super.setResourceValue(value);
	}
	
}
