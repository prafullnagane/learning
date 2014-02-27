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

import de.hybris.platform.returns.dto.ReturnEntriesDTO;
import de.hybris.platform.returns.dto.ReturnEntryDTO;
import de.hybris.platform.returns.model.ReturnEntryModel;
import de.hybris.platform.returns.resource.ReturnEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ReturnEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/returnentries")
public class ReturnEntriesResource extends AbstractCollectionResource <Collection<ReturnEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnEntriesResource()
	{
		super("ReturnEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllReturnEntries()
	{
		return createGetResponse().build(ReturnEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ReturnEntryModel> getReturnEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ReturnEntryResource} for current root resource 
	 */
	@Path("{returnentry}")
	public AbstractYResource getReturnEntryResource(@PathParam("returnentry")  final String resourceKey)
	{
		final ReturnEntryResource  resource  = resourceCtx.getResource(ReturnEntryResource.class);
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
	public Response postReturnEntry(final ReturnEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setReturnEntriesCollection(final Collection<ReturnEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
