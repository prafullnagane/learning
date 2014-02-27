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

import de.hybris.platform.europe1.dto.AbstractDiscountRowDTO;
import de.hybris.platform.europe1.dto.AbstractDiscountRowsDTO;
import de.hybris.platform.europe1.model.AbstractDiscountRowModel;
import de.hybris.platform.europe1.resource.AbstractDiscountRowResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractDiscountRow defined at extension europe1 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractdiscountrows")
public class AbstractDiscountRowsResource extends AbstractCollectionResource <Collection<AbstractDiscountRowModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractDiscountRowsResource()
	{
		super("AbstractDiscountRow");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractDiscountRowResource} for current root resource 
	 */
	@Path("{abstractdiscountrow}")
	public AbstractYResource getAbstractDiscountRowResource(@PathParam("abstractdiscountrow")  final String resourceKey)
	{
		final AbstractDiscountRowResource  resource  = resourceCtx.getResource(AbstractDiscountRowResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractDiscountRowModel> getAbstractDiscountRowsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractDiscountRows()
	{
		return createGetResponse().build(AbstractDiscountRowsDTO.class);
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postAbstractDiscountRow(final AbstractDiscountRowDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractDiscountRowsCollection(final Collection<AbstractDiscountRowModel> value)
	{
		super.setResourceValue(value);
	}
	
}
