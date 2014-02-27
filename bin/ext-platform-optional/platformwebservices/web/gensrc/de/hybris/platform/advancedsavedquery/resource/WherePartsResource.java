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

import de.hybris.platform.advancedsavedquery.dto.WherePartDTO;
import de.hybris.platform.advancedsavedquery.dto.WherePartsDTO;
import de.hybris.platform.advancedsavedquery.model.WherePartModel;
import de.hybris.platform.advancedsavedquery.resource.WherePartResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type WherePart defined at extension advancedsavedquery Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/whereparts")
public class WherePartsResource extends AbstractCollectionResource <Collection<WherePartModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WherePartsResource()
	{
		super("WherePart");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllWhereParts()
	{
		return createGetResponse().build(WherePartsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link WherePartResource} for current root resource 
	 */
	@Path("{wherepart}")
	public AbstractYResource getWherePartResource(@PathParam("wherepart")  final String resourceKey)
	{
		final WherePartResource  resource  = resourceCtx.getResource(WherePartResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<WherePartModel> getWherePartsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postWherePart(final WherePartDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setWherePartsCollection(final Collection<WherePartModel> value)
	{
		super.setResourceValue(value);
	}
	
}
