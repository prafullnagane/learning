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

import de.hybris.platform.ticket.events.dto.CsTicketEventsDTO;
import de.hybris.platform.ticket.events.model.CsTicketEventModel;
import de.hybris.platform.ticket.events.resource.CsTicketEventResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CsTicketEvent defined at extension ticketsystem Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/csticketevents")
public class CsTicketEventsResource extends AbstractCollectionResource <Collection<CsTicketEventModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketEventsResource()
	{
		super("CsTicketEvent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCsTicketEvents()
	{
		return createGetResponse().build(CsTicketEventsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CsTicketEventResource} for current root resource 
	 */
	@Path("{csticketevent}")
	public AbstractYResource getCsTicketEventResource(@PathParam("csticketevent")  final String resourceKey)
	{
		final CsTicketEventResource  resource  = resourceCtx.getResource(CsTicketEventResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CsTicketEventModel> getCsTicketEventsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCsTicketEventsCollection(final Collection<CsTicketEventModel> value)
	{
		super.setResourceValue(value);
	}
	
}
