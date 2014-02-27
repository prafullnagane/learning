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

import de.hybris.platform.ticket.events.dto.CsTicketChangeEventStringEntriesDTO;
import de.hybris.platform.ticket.events.dto.CsTicketChangeEventStringEntryDTO;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventStringEntryModel;
import de.hybris.platform.ticket.events.resource.CsTicketChangeEventStringEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CsTicketChangeEventStringEntry defined at extension ticketsystem Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/csticketchangeeventstringentries")
public class CsTicketChangeEventStringEntriesResource extends AbstractCollectionResource <Collection<CsTicketChangeEventStringEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventStringEntriesResource()
	{
		super("CsTicketChangeEventStringEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCsTicketChangeEventStringEntries()
	{
		return createGetResponse().build(CsTicketChangeEventStringEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CsTicketChangeEventStringEntryModel> getCsTicketChangeEventStringEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CsTicketChangeEventStringEntryResource} for current root resource 
	 */
	@Path("{csticketchangeeventstringentry}")
	public AbstractYResource getCsTicketChangeEventStringEntryResource(@PathParam("csticketchangeeventstringentry")  final String resourceKey)
	{
		final CsTicketChangeEventStringEntryResource  resource  = resourceCtx.getResource(CsTicketChangeEventStringEntryResource.class);
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
	public Response postCsTicketChangeEventStringEntry(final CsTicketChangeEventStringEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCsTicketChangeEventStringEntriesCollection(final Collection<CsTicketChangeEventStringEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
