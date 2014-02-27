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
package de.hybris.platform.ticket.resource;

import de.hybris.platform.ticket.dto.CsTicketEventEmailConfigurationsDTO;
import de.hybris.platform.ticket.model.CsTicketEventEmailConfigurationModel;
import de.hybris.platform.ticket.resource.CsTicketEventEmailConfigurationResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CsTicketEventEmailConfiguration defined at extension ticketsystem Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/csticketeventemailconfigurations")
public class CsTicketEventEmailConfigurationsResource extends AbstractCollectionResource <Collection<CsTicketEventEmailConfigurationModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketEventEmailConfigurationsResource()
	{
		super("CsTicketEventEmailConfiguration");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCsTicketEventEmailConfigurations()
	{
		return createGetResponse().build(CsTicketEventEmailConfigurationsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CsTicketEventEmailConfigurationResource} for current root resource 
	 */
	@Path("{csticketeventemailconfiguration}")
	public AbstractYResource getCsTicketEventEmailConfigurationResource(@PathParam("csticketeventemailconfiguration")  final String resourceKey)
	{
		final CsTicketEventEmailConfigurationResource  resource  = resourceCtx.getResource(CsTicketEventEmailConfigurationResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CsTicketEventEmailConfigurationModel> getCsTicketEventEmailConfigurationsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCsTicketEventEmailConfigurationsCollection(final Collection<CsTicketEventEmailConfigurationModel> value)
	{
		super.setResourceValue(value);
	}
	
}
