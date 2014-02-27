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

import de.hybris.platform.ticket.events.dto.CsTicketChangeEventEmployeeEntriesDTO;
import de.hybris.platform.ticket.events.dto.CsTicketChangeEventEmployeeEntryDTO;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventEmployeeEntryModel;
import de.hybris.platform.ticket.events.resource.CsTicketChangeEventEmployeeEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CsTicketChangeEventEmployeeEntry defined at extension ticketsystem Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/csticketchangeeventemployeeentries")
public class CsTicketChangeEventEmployeeEntriesResource extends AbstractCollectionResource <Collection<CsTicketChangeEventEmployeeEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventEmployeeEntriesResource()
	{
		super("CsTicketChangeEventEmployeeEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCsTicketChangeEventEmployeeEntries()
	{
		return createGetResponse().build(CsTicketChangeEventEmployeeEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CsTicketChangeEventEmployeeEntryModel> getCsTicketChangeEventEmployeeEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CsTicketChangeEventEmployeeEntryResource} for current root resource 
	 */
	@Path("{csticketchangeeventemployeeentry}")
	public AbstractYResource getCsTicketChangeEventEmployeeEntryResource(@PathParam("csticketchangeeventemployeeentry")  final String resourceKey)
	{
		final CsTicketChangeEventEmployeeEntryResource  resource  = resourceCtx.getResource(CsTicketChangeEventEmployeeEntryResource.class);
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
	public Response postCsTicketChangeEventEmployeeEntry(final CsTicketChangeEventEmployeeEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCsTicketChangeEventEmployeeEntriesCollection(final Collection<CsTicketChangeEventEmployeeEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
