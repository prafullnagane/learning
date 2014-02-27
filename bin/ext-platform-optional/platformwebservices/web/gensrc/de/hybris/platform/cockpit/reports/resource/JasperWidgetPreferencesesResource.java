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
package de.hybris.platform.cockpit.reports.resource;

import de.hybris.platform.cockpit.reports.dto.JasperWidgetPreferencesDTO;
import de.hybris.platform.cockpit.reports.dto.JasperWidgetPreferencesesDTO;
import de.hybris.platform.cockpit.reports.model.JasperWidgetPreferencesModel;
import de.hybris.platform.cockpit.reports.resource.JasperWidgetPreferencesResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type JasperWidgetPreferences defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/jasperwidgetpreferenceses")
public class JasperWidgetPreferencesesResource extends AbstractCollectionResource <Collection<JasperWidgetPreferencesModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JasperWidgetPreferencesesResource()
	{
		super("JasperWidgetPreferences");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllJasperWidgetPreferenceses()
	{
		return createGetResponse().build(JasperWidgetPreferencesesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<JasperWidgetPreferencesModel> getJasperWidgetPreferencesesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link JasperWidgetPreferencesResource} for current root resource 
	 */
	@Path("{jasperwidgetpreferences}")
	public AbstractYResource getJasperWidgetPreferencesResource(@PathParam("jasperwidgetpreferences")  final String resourceKey)
	{
		final JasperWidgetPreferencesResource  resource  = resourceCtx.getResource(JasperWidgetPreferencesResource.class);
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
	public Response postJasperWidgetPreferences(final JasperWidgetPreferencesDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setJasperWidgetPreferencesesCollection(final Collection<JasperWidgetPreferencesModel> value)
	{
		super.setResourceValue(value);
	}
	
}
