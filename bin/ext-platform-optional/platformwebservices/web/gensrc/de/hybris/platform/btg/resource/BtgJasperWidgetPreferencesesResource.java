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
package de.hybris.platform.btg.resource;

import de.hybris.platform.btg.dto.BtgJasperWidgetPreferencesDTO;
import de.hybris.platform.btg.dto.BtgJasperWidgetPreferencesesDTO;
import de.hybris.platform.btg.model.BtgJasperWidgetPreferencesModel;
import de.hybris.platform.btg.resource.BtgJasperWidgetPreferencesResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BtgJasperWidgetPreferences defined at extension btgcockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgjasperwidgetpreferenceses")
public class BtgJasperWidgetPreferencesesResource extends AbstractCollectionResource <Collection<BtgJasperWidgetPreferencesModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BtgJasperWidgetPreferencesesResource()
	{
		super("BtgJasperWidgetPreferences");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBtgJasperWidgetPreferenceses()
	{
		return createGetResponse().build(BtgJasperWidgetPreferencesesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BtgJasperWidgetPreferencesModel> getBtgJasperWidgetPreferencesesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BtgJasperWidgetPreferencesResource} for current root resource 
	 */
	@Path("{btgjasperwidgetpreferences}")
	public AbstractYResource getBtgJasperWidgetPreferencesResource(@PathParam("btgjasperwidgetpreferences")  final String resourceKey)
	{
		final BtgJasperWidgetPreferencesResource  resource  = resourceCtx.getResource(BtgJasperWidgetPreferencesResource.class);
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
	public Response postBtgJasperWidgetPreferences(final BtgJasperWidgetPreferencesDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBtgJasperWidgetPreferencesesCollection(final Collection<BtgJasperWidgetPreferencesModel> value)
	{
		super.setResourceValue(value);
	}
	
}
