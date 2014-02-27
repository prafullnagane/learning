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

import de.hybris.platform.ordersplitting.dto.ConsignmentEntriesDTO;
import de.hybris.platform.ordersplitting.dto.ConsignmentEntryDTO;
import de.hybris.platform.ordersplitting.model.ConsignmentEntryModel;
import de.hybris.platform.ordersplitting.resource.ConsignmentEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ConsignmentEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/consignmententries")
public class ConsignmentEntriesResource extends AbstractCollectionResource <Collection<ConsignmentEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConsignmentEntriesResource()
	{
		super("ConsignmentEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllConsignmentEntries()
	{
		return createGetResponse().build(ConsignmentEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ConsignmentEntryModel> getConsignmentEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ConsignmentEntryResource} for current root resource 
	 */
	@Path("{consignmententry}")
	public AbstractYResource getConsignmentEntryResource(@PathParam("consignmententry")  final String resourceKey)
	{
		final ConsignmentEntryResource  resource  = resourceCtx.getResource(ConsignmentEntryResource.class);
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
	public Response postConsignmentEntry(final ConsignmentEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setConsignmentEntriesCollection(final Collection<ConsignmentEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
