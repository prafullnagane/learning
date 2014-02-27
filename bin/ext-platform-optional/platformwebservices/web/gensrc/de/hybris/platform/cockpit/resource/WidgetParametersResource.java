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
package de.hybris.platform.cockpit.resource;

import de.hybris.platform.cockpit.dto.WidgetParameterDTO;
import de.hybris.platform.cockpit.dto.WidgetParametersDTO;
import de.hybris.platform.cockpit.model.WidgetParameterModel;
import de.hybris.platform.cockpit.resource.WidgetParameterResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type WidgetParameter defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/widgetparameters")
public class WidgetParametersResource extends AbstractCollectionResource <Collection<WidgetParameterModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WidgetParametersResource()
	{
		super("WidgetParameter");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllWidgetParameters()
	{
		return createGetResponse().build(WidgetParametersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link WidgetParameterResource} for current root resource 
	 */
	@Path("{widgetparameter}")
	public AbstractYResource getWidgetParameterResource(@PathParam("widgetparameter")  final String resourceKey)
	{
		final WidgetParameterResource  resource  = resourceCtx.getResource(WidgetParameterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<WidgetParameterModel> getWidgetParametersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postWidgetParameter(final WidgetParameterDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setWidgetParametersCollection(final Collection<WidgetParameterModel> value)
	{
		super.setResourceValue(value);
	}
	
}
