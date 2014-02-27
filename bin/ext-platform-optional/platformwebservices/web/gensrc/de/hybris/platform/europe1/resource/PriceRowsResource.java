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

import de.hybris.platform.europe1.dto.PriceRowDTO;
import de.hybris.platform.europe1.dto.PriceRowsDTO;
import de.hybris.platform.europe1.model.PriceRowModel;
import de.hybris.platform.europe1.resource.PriceRowResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PriceRow defined at extension europe1 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/pricerows")
public class PriceRowsResource extends AbstractCollectionResource <Collection<PriceRowModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PriceRowsResource()
	{
		super("PriceRow");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPriceRows()
	{
		return createGetResponse().build(PriceRowsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PriceRowResource} for current root resource 
	 */
	@Path("{pricerow}")
	public AbstractYResource getPriceRowResource(@PathParam("pricerow")  final String resourceKey)
	{
		final PriceRowResource  resource  = resourceCtx.getResource(PriceRowResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PriceRowModel> getPriceRowsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postPriceRow(final PriceRowDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPriceRowsCollection(final Collection<PriceRowModel> value)
	{
		super.setResourceValue(value);
	}
	
}
