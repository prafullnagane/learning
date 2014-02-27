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

import de.hybris.platform.ticket.events.dto.CsTicketChangeEventCsTicketStateEntriesDTO;
import de.hybris.platform.ticket.events.dto.CsTicketChangeEventCsTicketStateEntryDTO;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventCsTicketStateEntryModel;
import de.hybris.platform.ticket.events.resource.CsTicketChangeEventCsTicketStateEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CsTicketChangeEventCsTicketStateEntry defined at extension ticketsystem Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/csticketchangeeventcsticketstateentries")
public class CsTicketChangeEventCsTicketStateEntriesResource extends AbstractCollectionResource <Collection<CsTicketChangeEventCsTicketStateEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventCsTicketStateEntriesResource()
	{
		super("CsTicketChangeEventCsTicketStateEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCsTicketChangeEventCsTicketStateEntries()
	{
		return createGetResponse().build(CsTicketChangeEventCsTicketStateEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CsTicketChangeEventCsTicketStateEntryModel> getCsTicketChangeEventCsTicketStateEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CsTicketChangeEventCsTicketStateEntryResource} for current root resource 
	 */
	@Path("{csticketchangeeventcsticketstateentry}")
	public AbstractYResource getCsTicketChangeEventCsTicketStateEntryResource(@PathParam("csticketchangeeventcsticketstateentry")  final String resourceKey)
	{
		final CsTicketChangeEventCsTicketStateEntryResource  resource  = resourceCtx.getResource(CsTicketChangeEventCsTicketStateEntryResource.class);
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
	public Response postCsTicketChangeEventCsTicketStateEntry(final CsTicketChangeEventCsTicketStateEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCsTicketChangeEventCsTicketStateEntriesCollection(final Collection<CsTicketChangeEventCsTicketStateEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
