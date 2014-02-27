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

import de.hybris.platform.returns.dto.RefundEntriesDTO;
import de.hybris.platform.returns.dto.RefundEntryDTO;
import de.hybris.platform.returns.model.RefundEntryModel;
import de.hybris.platform.returns.resource.RefundEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type RefundEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/refundentries")
public class RefundEntriesResource extends AbstractCollectionResource <Collection<RefundEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RefundEntriesResource()
	{
		super("RefundEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllRefundEntries()
	{
		return createGetResponse().build(RefundEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<RefundEntryModel> getRefundEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link RefundEntryResource} for current root resource 
	 */
	@Path("{refundentry}")
	public AbstractYResource getRefundEntryResource(@PathParam("refundentry")  final String resourceKey)
	{
		final RefundEntryResource  resource  = resourceCtx.getResource(RefundEntryResource.class);
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
	public Response postRefundEntry(final RefundEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setRefundEntriesCollection(final Collection<RefundEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
