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

import de.hybris.platform.advancedsavedquery.dto.ComposedTypeAdvancedSavedQuerySearchParameterDTO;
import de.hybris.platform.advancedsavedquery.dto.ComposedTypeAdvancedSavedQuerySearchParametersDTO;
import de.hybris.platform.advancedsavedquery.model.ComposedTypeAdvancedSavedQuerySearchParameterModel;
import de.hybris.platform.advancedsavedquery.resource.ComposedTypeAdvancedSavedQuerySearchParameterResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ComposedTypeAdvancedSavedQuerySearchParameter defined at extension advancedsavedquery Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/composedtypeadvancedsavedquerysearchparameters")
public class ComposedTypeAdvancedSavedQuerySearchParametersResource extends AbstractCollectionResource <Collection<ComposedTypeAdvancedSavedQuerySearchParameterModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComposedTypeAdvancedSavedQuerySearchParametersResource()
	{
		super("ComposedTypeAdvancedSavedQuerySearchParameter");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllComposedTypeAdvancedSavedQuerySearchParameters()
	{
		return createGetResponse().build(ComposedTypeAdvancedSavedQuerySearchParametersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ComposedTypeAdvancedSavedQuerySearchParameterResource} for current root resource 
	 */
	@Path("{composedtypeadvancedsavedquerysearchparameter}")
	public AbstractYResource getComposedTypeAdvancedSavedQuerySearchParameterResource(@PathParam("composedtypeadvancedsavedquerysearchparameter")  final String resourceKey)
	{
		final ComposedTypeAdvancedSavedQuerySearchParameterResource  resource  = resourceCtx.getResource(ComposedTypeAdvancedSavedQuerySearchParameterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ComposedTypeAdvancedSavedQuerySearchParameterModel> getComposedTypeAdvancedSavedQuerySearchParametersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postComposedTypeAdvancedSavedQuerySearchParameter(final ComposedTypeAdvancedSavedQuerySearchParameterDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setComposedTypeAdvancedSavedQuerySearchParametersCollection(final Collection<ComposedTypeAdvancedSavedQuerySearchParameterModel> value)
	{
		super.setResourceValue(value);
	}
	
}