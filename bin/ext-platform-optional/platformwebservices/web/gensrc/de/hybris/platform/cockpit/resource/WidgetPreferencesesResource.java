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

import de.hybris.platform.cockpit.dto.WidgetPreferencesDTO;
import de.hybris.platform.cockpit.dto.WidgetPreferencesesDTO;
import de.hybris.platform.cockpit.model.WidgetPreferencesModel;
import de.hybris.platform.cockpit.resource.WidgetPreferencesResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type WidgetPreferences defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/widgetpreferenceses")
public class WidgetPreferencesesResource extends AbstractCollectionResource <Collection<WidgetPreferencesModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WidgetPreferencesesResource()
	{
		super("WidgetPreferences");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllWidgetPreferenceses()
	{
		return createGetResponse().build(WidgetPreferencesesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<WidgetPreferencesModel> getWidgetPreferencesesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link WidgetPreferencesResource} for current root resource 
	 */
	@Path("{widgetpreferences}")
	public AbstractYResource getWidgetPreferencesResource(@PathParam("widgetpreferences")  final String resourceKey)
	{
		final WidgetPreferencesResource  resource  = resourceCtx.getResource(WidgetPreferencesResource.class);
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
	public Response postWidgetPreferences(final WidgetPreferencesDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setWidgetPreferencesesCollection(final Collection<WidgetPreferencesModel> value)
	{
		super.setResourceValue(value);
	}
	
}
