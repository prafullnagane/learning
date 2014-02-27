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

import de.hybris.platform.advancedsavedquery.dto.TypedAdvancedSavedQuerySearchParameterDTO;
import de.hybris.platform.advancedsavedquery.dto.TypedAdvancedSavedQuerySearchParametersDTO;
import de.hybris.platform.advancedsavedquery.model.TypedAdvancedSavedQuerySearchParameterModel;
import de.hybris.platform.advancedsavedquery.resource.TypedAdvancedSavedQuerySearchParameterResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type TypedAdvancedSavedQuerySearchParameter defined at extension advancedsavedquery Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/typedadvancedsavedquerysearchparameters")
public class TypedAdvancedSavedQuerySearchParametersResource extends AbstractCollectionResource <Collection<TypedAdvancedSavedQuerySearchParameterModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypedAdvancedSavedQuerySearchParametersResource()
	{
		super("TypedAdvancedSavedQuerySearchParameter");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllTypedAdvancedSavedQuerySearchParameters()
	{
		return createGetResponse().build(TypedAdvancedSavedQuerySearchParametersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link TypedAdvancedSavedQuerySearchParameterResource} for current root resource 
	 */
	@Path("{typedadvancedsavedquerysearchparameter}")
	public AbstractYResource getTypedAdvancedSavedQuerySearchParameterResource(@PathParam("typedadvancedsavedquerysearchparameter")  final String resourceKey)
	{
		final TypedAdvancedSavedQuerySearchParameterResource  resource  = resourceCtx.getResource(TypedAdvancedSavedQuerySearchParameterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<TypedAdvancedSavedQuerySearchParameterModel> getTypedAdvancedSavedQuerySearchParametersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postTypedAdvancedSavedQuerySearchParameter(final TypedAdvancedSavedQuerySearchParameterDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setTypedAdvancedSavedQuerySearchParametersCollection(final Collection<TypedAdvancedSavedQuerySearchParameterModel> value)
	{
		super.setResourceValue(value);
	}
	
}