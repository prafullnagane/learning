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

import de.hybris.platform.europe1.dto.TaxRowDTO;
import de.hybris.platform.europe1.dto.TaxRowsDTO;
import de.hybris.platform.europe1.model.TaxRowModel;
import de.hybris.platform.europe1.resource.TaxRowResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type TaxRow defined at extension europe1 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/taxrows")
public class TaxRowsResource extends AbstractCollectionResource <Collection<TaxRowModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaxRowsResource()
	{
		super("TaxRow");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllTaxRows()
	{
		return createGetResponse().build(TaxRowsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link TaxRowResource} for current root resource 
	 */
	@Path("{taxrow}")
	public AbstractYResource getTaxRowResource(@PathParam("taxrow")  final String resourceKey)
	{
		final TaxRowResource  resource  = resourceCtx.getResource(TaxRowResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<TaxRowModel> getTaxRowsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postTaxRow(final TaxRowDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setTaxRowsCollection(final Collection<TaxRowModel> value)
	{
		super.setResourceValue(value);
	}
	
}
