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

import de.hybris.platform.ticket.events.dto.CsTicketChangeEventCsAgentGroupEntriesDTO;
import de.hybris.platform.ticket.events.dto.CsTicketChangeEventCsAgentGroupEntryDTO;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventCsAgentGroupEntryModel;
import de.hybris.platform.ticket.events.resource.CsTicketChangeEventCsAgentGroupEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CsTicketChangeEventCsAgentGroupEntry defined at extension ticketsystem Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/csticketchangeeventcsagentgroupentries")
public class CsTicketChangeEventCsAgentGroupEntriesResource extends AbstractCollectionResource <Collection<CsTicketChangeEventCsAgentGroupEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventCsAgentGroupEntriesResource()
	{
		super("CsTicketChangeEventCsAgentGroupEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCsTicketChangeEventCsAgentGroupEntries()
	{
		return createGetResponse().build(CsTicketChangeEventCsAgentGroupEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CsTicketChangeEventCsAgentGroupEntryModel> getCsTicketChangeEventCsAgentGroupEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CsTicketChangeEventCsAgentGroupEntryResource} for current root resource 
	 */
	@Path("{csticketchangeeventcsagentgroupentry}")
	public AbstractYResource getCsTicketChangeEventCsAgentGroupEntryResource(@PathParam("csticketchangeeventcsagentgroupentry")  final String resourceKey)
	{
		final CsTicketChangeEventCsAgentGroupEntryResource  resource  = resourceCtx.getResource(CsTicketChangeEventCsAgentGroupEntryResource.class);
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
	public Response postCsTicketChangeEventCsAgentGroupEntry(final CsTicketChangeEventCsAgentGroupEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCsTicketChangeEventCsAgentGroupEntriesCollection(final Collection<CsTicketChangeEventCsAgentGroupEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
