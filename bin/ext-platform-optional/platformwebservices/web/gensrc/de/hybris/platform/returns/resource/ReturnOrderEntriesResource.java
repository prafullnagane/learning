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
package de.hybris.platform.returns.resource;

import de.hybris.platform.returns.dto.ReturnOrderEntriesDTO;
import de.hybris.platform.returns.dto.ReturnOrderEntryDTO;
import de.hybris.platform.returns.model.ReturnOrderEntryModel;
import de.hybris.platform.returns.resource.ReturnOrderEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ReturnOrderEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/returnorderentries")
public class ReturnOrderEntriesResource extends AbstractCollectionResource <Collection<ReturnOrderEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnOrderEntriesResource()
	{
		super("ReturnOrderEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllReturnOrderEntries()
	{
		return createGetResponse().build(ReturnOrderEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ReturnOrderEntryModel> getReturnOrderEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ReturnOrderEntryResource} for current root resource 
	 */
	@Path("{returnorderentry}")
	public AbstractYResource getReturnOrderEntryResource(@PathParam("returnorderentry")  final String resourceKey)
	{
		final ReturnOrderEntryResource  resource  = resourceCtx.getResource(ReturnOrderEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postReturnOrderEntry(final ReturnOrderEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setReturnOrderEntriesCollection(final Collection<ReturnOrderEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
