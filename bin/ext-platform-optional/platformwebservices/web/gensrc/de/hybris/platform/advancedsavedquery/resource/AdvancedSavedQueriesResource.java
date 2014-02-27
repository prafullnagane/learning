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
package de.hybris.platform.advancedsavedquery.resource;

import de.hybris.platform.advancedsavedquery.dto.AdvancedSavedQueriesDTO;
import de.hybris.platform.advancedsavedquery.model.AdvancedSavedQueryModel;
import de.hybris.platform.advancedsavedquery.resource.AdvancedSavedQueryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AdvancedSavedQuery defined at extension advancedsavedquery Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/advancedsavedqueries")
public class AdvancedSavedQueriesResource extends AbstractCollectionResource <Collection<AdvancedSavedQueryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AdvancedSavedQueriesResource()
	{
		super("AdvancedSavedQuery");
	}
	
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AdvancedSavedQueryModel> getAdvancedSavedQueriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AdvancedSavedQueryResource} for current root resource 
	 */
	@Path("{advancedsavedquery}")
	public AbstractYResource getAdvancedSavedQueryResource(@PathParam("advancedsavedquery")  final String resourceKey)
	{
		final AdvancedSavedQueryResource  resource  = resourceCtx.getResource(AdvancedSavedQueryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAdvancedSavedQueries()
	{
		return createGetResponse().build(AdvancedSavedQueriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAdvancedSavedQueriesCollection(final Collection<AdvancedSavedQueryModel> value)
	{
		super.setResourceValue(value);
	}
	
}