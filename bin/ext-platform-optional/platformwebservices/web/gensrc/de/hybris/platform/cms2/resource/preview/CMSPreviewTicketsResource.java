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
package de.hybris.platform.cms2.resource.preview;

import de.hybris.platform.cms2.dto.preview.CMSPreviewTicketDTO;
import de.hybris.platform.cms2.dto.preview.CMSPreviewTicketsDTO;
import de.hybris.platform.cms2.model.preview.CMSPreviewTicketModel;
import de.hybris.platform.cms2.resource.preview.CMSPreviewTicketResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSPreviewTicket defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmspreviewtickets")
public class CMSPreviewTicketsResource extends AbstractCollectionResource <Collection<CMSPreviewTicketModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSPreviewTicketsResource()
	{
		super("CMSPreviewTicket");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSPreviewTickets()
	{
		return createGetResponse().build(CMSPreviewTicketsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSPreviewTicketResource} for current root resource 
	 */
	@Path("{cmspreviewticket}")
	public AbstractYResource getCMSPreviewTicketResource(@PathParam("cmspreviewticket")  final String resourceKey)
	{
		final CMSPreviewTicketResource  resource  = resourceCtx.getResource(CMSPreviewTicketResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSPreviewTicketModel> getCMSPreviewTicketsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCMSPreviewTicket(final CMSPreviewTicketDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSPreviewTicketsCollection(final Collection<CMSPreviewTicketModel> value)
	{
		super.setResourceValue(value);
	}
	
}
