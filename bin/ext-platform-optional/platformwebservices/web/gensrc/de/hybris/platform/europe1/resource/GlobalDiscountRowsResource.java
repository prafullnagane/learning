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
package de.hybris.platform.europe1.resource;

import de.hybris.platform.europe1.dto.GlobalDiscountRowDTO;
import de.hybris.platform.europe1.dto.GlobalDiscountRowsDTO;
import de.hybris.platform.europe1.model.GlobalDiscountRowModel;
import de.hybris.platform.europe1.resource.GlobalDiscountRowResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type GlobalDiscountRow defined at extension europe1 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/globaldiscountrows")
public class GlobalDiscountRowsResource extends AbstractCollectionResource <Collection<GlobalDiscountRowModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GlobalDiscountRowsResource()
	{
		super("GlobalDiscountRow");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllGlobalDiscountRows()
	{
		return createGetResponse().build(GlobalDiscountRowsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link GlobalDiscountRowResource} for current root resource 
	 */
	@Path("{globaldiscountrow}")
	public AbstractYResource getGlobalDiscountRowResource(@PathParam("globaldiscountrow")  final String resourceKey)
	{
		final GlobalDiscountRowResource  resource  = resourceCtx.getResource(GlobalDiscountRowResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<GlobalDiscountRowModel> getGlobalDiscountRowsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postGlobalDiscountRow(final GlobalDiscountRowDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setGlobalDiscountRowsCollection(final Collection<GlobalDiscountRowModel> value)
	{
		super.setResourceValue(value);
	}
	
}
