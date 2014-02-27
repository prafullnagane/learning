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

import de.hybris.platform.returns.dto.ReplacementEntriesDTO;
import de.hybris.platform.returns.dto.ReplacementEntryDTO;
import de.hybris.platform.returns.model.ReplacementEntryModel;
import de.hybris.platform.returns.resource.ReplacementEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ReplacementEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/replacemententries")
public class ReplacementEntriesResource extends AbstractCollectionResource <Collection<ReplacementEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReplacementEntriesResource()
	{
		super("ReplacementEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllReplacementEntries()
	{
		return createGetResponse().build(ReplacementEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ReplacementEntryModel> getReplacementEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ReplacementEntryResource} for current root resource 
	 */
	@Path("{replacemententry}")
	public AbstractYResource getReplacementEntryResource(@PathParam("replacemententry")  final String resourceKey)
	{
		final ReplacementEntryResource  resource  = resourceCtx.getResource(ReplacementEntryResource.class);
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
	public Response postReplacementEntry(final ReplacementEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setReplacementEntriesCollection(final Collection<ReplacementEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
