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

import de.hybris.platform.advancedsavedquery.dto.SimpleAdvancedSavedQuerySearchParameterDTO;
import de.hybris.platform.advancedsavedquery.dto.SimpleAdvancedSavedQuerySearchParametersDTO;
import de.hybris.platform.advancedsavedquery.model.SimpleAdvancedSavedQuerySearchParameterModel;
import de.hybris.platform.advancedsavedquery.resource.SimpleAdvancedSavedQuerySearchParameterResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SimpleAdvancedSavedQuerySearchParameter defined at extension advancedsavedquery Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/simpleadvancedsavedquerysearchparameters")
public class SimpleAdvancedSavedQuerySearchParametersResource extends AbstractCollectionResource <Collection<SimpleAdvancedSavedQuerySearchParameterModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleAdvancedSavedQuerySearchParametersResource()
	{
		super("SimpleAdvancedSavedQuerySearchParameter");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSimpleAdvancedSavedQuerySearchParameters()
	{
		return createGetResponse().build(SimpleAdvancedSavedQuerySearchParametersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SimpleAdvancedSavedQuerySearchParameterResource} for current root resource 
	 */
	@Path("{simpleadvancedsavedquerysearchparameter}")
	public AbstractYResource getSimpleAdvancedSavedQuerySearchParameterResource(@PathParam("simpleadvancedsavedquerysearchparameter")  final String resourceKey)
	{
		final SimpleAdvancedSavedQuerySearchParameterResource  resource  = resourceCtx.getResource(SimpleAdvancedSavedQuerySearchParameterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SimpleAdvancedSavedQuerySearchParameterModel> getSimpleAdvancedSavedQuerySearchParametersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSimpleAdvancedSavedQuerySearchParameter(final SimpleAdvancedSavedQuerySearchParameterDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSimpleAdvancedSavedQuerySearchParametersCollection(final Collection<SimpleAdvancedSavedQuerySearchParameterModel> value)
	{
		super.setResourceValue(value);
	}
	
}
