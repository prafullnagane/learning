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
package de.hybris.platform.ticket.events.resource;

import de.hybris.platform.ticket.events.dto.CsTicketEmailDTO;
import de.hybris.platform.ticket.events.dto.CsTicketEmailsDTO;
import de.hybris.platform.ticket.events.model.CsTicketEmailModel;
import de.hybris.platform.ticket.events.resource.CsTicketEmailResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CsTicketEmail defined at extension ticketsystem Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/csticketemails")
public class CsTicketEmailsResource extends AbstractCollectionResource <Collection<CsTicketEmailModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketEmailsResource()
	{
		super("CsTicketEmail");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCsTicketEmails()
	{
		return createGetResponse().build(CsTicketEmailsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CsTicketEmailResource} for current root resource 
	 */
	@Path("{csticketemail}")
	public AbstractYResource getCsTicketEmailResource(@PathParam("csticketemail")  final String resourceKey)
	{
		final CsTicketEmailResource  resource  = resourceCtx.getResource(CsTicketEmailResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CsTicketEmailModel> getCsTicketEmailsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCsTicketEmail(final CsTicketEmailDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCsTicketEmailsCollection(final Collection<CsTicketEmailModel> value)
	{
		super.setResourceValue(value);
	}
	
}
