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

import de.hybris.platform.ticket.events.dto.CsTicketChangeEventCsTicketPriorityEntriesDTO;
import de.hybris.platform.ticket.events.dto.CsTicketChangeEventCsTicketPriorityEntryDTO;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventCsTicketPriorityEntryModel;
import de.hybris.platform.ticket.events.resource.CsTicketChangeEventCsTicketPriorityEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CsTicketChangeEventCsTicketPriorityEntry defined at extension ticketsystem Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/csticketchangeeventcsticketpriorityentries")
public class CsTicketChangeEventCsTicketPriorityEntriesResource extends AbstractCollectionResource <Collection<CsTicketChangeEventCsTicketPriorityEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventCsTicketPriorityEntriesResource()
	{
		super("CsTicketChangeEventCsTicketPriorityEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCsTicketChangeEventCsTicketPriorityEntries()
	{
		return createGetResponse().build(CsTicketChangeEventCsTicketPriorityEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CsTicketChangeEventCsTicketPriorityEntryModel> getCsTicketChangeEventCsTicketPriorityEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CsTicketChangeEventCsTicketPriorityEntryResource} for current root resource 
	 */
	@Path("{csticketchangeeventcsticketpriorityentry}")
	public AbstractYResource getCsTicketChangeEventCsTicketPriorityEntryResource(@PathParam("csticketchangeeventcsticketpriorityentry")  final String resourceKey)
	{
		final CsTicketChangeEventCsTicketPriorityEntryResource  resource  = resourceCtx.getResource(CsTicketChangeEventCsTicketPriorityEntryResource.class);
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
	public Response postCsTicketChangeEventCsTicketPriorityEntry(final CsTicketChangeEventCsTicketPriorityEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCsTicketChangeEventCsTicketPriorityEntriesCollection(final Collection<CsTicketChangeEventCsTicketPriorityEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
