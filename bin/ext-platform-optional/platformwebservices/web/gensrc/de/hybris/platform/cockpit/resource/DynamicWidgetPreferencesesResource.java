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

import de.hybris.platform.cockpit.dto.DynamicWidgetPreferencesDTO;
import de.hybris.platform.cockpit.dto.DynamicWidgetPreferencesesDTO;
import de.hybris.platform.cockpit.model.DynamicWidgetPreferencesModel;
import de.hybris.platform.cockpit.resource.DynamicWidgetPreferencesResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type DynamicWidgetPreferences defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/dynamicwidgetpreferenceses")
public class DynamicWidgetPreferencesesResource extends AbstractCollectionResource <Collection<DynamicWidgetPreferencesModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicWidgetPreferencesesResource()
	{
		super("DynamicWidgetPreferences");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDynamicWidgetPreferenceses()
	{
		return createGetResponse().build(DynamicWidgetPreferencesesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DynamicWidgetPreferencesModel> getDynamicWidgetPreferencesesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DynamicWidgetPreferencesResource} for current root resource 
	 */
	@Path("{dynamicwidgetpreferences}")
	public AbstractYResource getDynamicWidgetPreferencesResource(@PathParam("dynamicwidgetpreferences")  final String resourceKey)
	{
		final DynamicWidgetPreferencesResource  resource  = resourceCtx.getResource(DynamicWidgetPreferencesResource.class);
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
	public Response postDynamicWidgetPreferences(final DynamicWidgetPreferencesDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDynamicWidgetPreferencesesCollection(final Collection<DynamicWidgetPreferencesModel> value)
	{
		super.setResourceValue(value);
	}
	
}
