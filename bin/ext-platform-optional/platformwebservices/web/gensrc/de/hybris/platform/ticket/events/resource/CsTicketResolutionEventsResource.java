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

import de.hybris.platform.ticket.events.dto.CsTicketResolutionEventsDTO;
import de.hybris.platform.ticket.events.model.CsTicketResolutionEventModel;
import de.hybris.platform.ticket.events.resource.CsTicketResolutionEventResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CsTicketResolutionEvent defined at extension ticketsystem Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/csticketresolutionevents")
public class CsTicketResolutionEventsResource extends AbstractCollectionResource <Collection<CsTicketResolutionEventModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketResolutionEventsResource()
	{
		super("CsTicketResolutionEvent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCsTicketResolutionEvents()
	{
		return createGetResponse().build(CsTicketResolutionEventsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CsTicketResolutionEventResource} for current root resource 
	 */
	@Path("{csticketresolutionevent}")
	public AbstractYResource getCsTicketResolutionEventResource(@PathParam("csticketresolutionevent")  final String resourceKey)
	{
		final CsTicketResolutionEventResource  resource  = resourceCtx.getResource(CsTicketResolutionEventResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CsTicketResolutionEventModel> getCsTicketResolutionEventsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCsTicketResolutionEventsCollection(final Collection<CsTicketResolutionEventModel> value)
	{
		super.setResourceValue(value);
	}
	
}
