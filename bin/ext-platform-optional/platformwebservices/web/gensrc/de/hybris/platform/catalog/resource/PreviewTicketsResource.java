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
package de.hybris.platform.catalog.resource;

import de.hybris.platform.catalog.dto.PreviewTicketDTO;
import de.hybris.platform.catalog.dto.PreviewTicketsDTO;
import de.hybris.platform.catalog.model.PreviewTicketModel;
import de.hybris.platform.catalog.resource.PreviewTicketResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PreviewTicket defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/previewtickets")
public class PreviewTicketsResource extends AbstractCollectionResource <Collection<PreviewTicketModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PreviewTicketsResource()
	{
		super("PreviewTicket");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPreviewTickets()
	{
		return createGetResponse().build(PreviewTicketsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PreviewTicketResource} for current root resource 
	 */
	@Path("{previewticket}")
	public AbstractYResource getPreviewTicketResource(@PathParam("previewticket")  final String resourceKey)
	{
		final PreviewTicketResource  resource  = resourceCtx.getResource(PreviewTicketResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PreviewTicketModel> getPreviewTicketsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postPreviewTicket(final PreviewTicketDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPreviewTicketsCollection(final Collection<PreviewTicketModel> value)
	{
		super.setResourceValue(value);
	}
	
}
