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

import de.hybris.platform.cockpit.dto.CockpitSavedQueriesDTO;
import de.hybris.platform.cockpit.model.CockpitSavedQueryModel;
import de.hybris.platform.cockpit.resource.CockpitSavedQueryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CockpitSavedQuery defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cockpitsavedqueries")
public class CockpitSavedQueriesResource extends AbstractCollectionResource <Collection<CockpitSavedQueryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedQueriesResource()
	{
		super("CockpitSavedQuery");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCockpitSavedQueries()
	{
		return createGetResponse().build(CockpitSavedQueriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CockpitSavedQueryModel> getCockpitSavedQueriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CockpitSavedQueryResource} for current root resource 
	 */
	@Path("{cockpitsavedquery}")
	public AbstractYResource getCockpitSavedQueryResource(@PathParam("cockpitsavedquery")  final String resourceKey)
	{
		final CockpitSavedQueryResource  resource  = resourceCtx.getResource(CockpitSavedQueryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCockpitSavedQueriesCollection(final Collection<CockpitSavedQueryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
