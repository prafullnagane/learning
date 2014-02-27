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

import de.hybris.platform.europe1.dto.DiscountRowDTO;
import de.hybris.platform.europe1.dto.DiscountRowsDTO;
import de.hybris.platform.europe1.model.DiscountRowModel;
import de.hybris.platform.europe1.resource.DiscountRowResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type DiscountRow defined at extension europe1 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/discountrows")
public class DiscountRowsResource extends AbstractCollectionResource <Collection<DiscountRowModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DiscountRowsResource()
	{
		super("DiscountRow");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDiscountRows()
	{
		return createGetResponse().build(DiscountRowsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DiscountRowResource} for current root resource 
	 */
	@Path("{discountrow}")
	public AbstractYResource getDiscountRowResource(@PathParam("discountrow")  final String resourceKey)
	{
		final DiscountRowResource  resource  = resourceCtx.getResource(DiscountRowResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DiscountRowModel> getDiscountRowsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postDiscountRow(final DiscountRowDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDiscountRowsCollection(final Collection<DiscountRowModel> value)
	{
		super.setResourceValue(value);
	}
	
}
