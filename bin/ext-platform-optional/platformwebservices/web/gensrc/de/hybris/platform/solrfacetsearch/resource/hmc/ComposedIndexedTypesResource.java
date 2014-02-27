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
package de.hybris.platform.solrfacetsearch.resource.hmc;

import de.hybris.platform.solrfacetsearch.dto.hmc.ComposedIndexedTypeDTO;
import de.hybris.platform.solrfacetsearch.dto.hmc.ComposedIndexedTypesDTO;
import de.hybris.platform.solrfacetsearch.model.hmc.ComposedIndexedTypeModel;
import de.hybris.platform.solrfacetsearch.resource.hmc.ComposedIndexedTypeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ComposedIndexedType defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/composedindexedtypes")
public class ComposedIndexedTypesResource extends AbstractCollectionResource <Collection<ComposedIndexedTypeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComposedIndexedTypesResource()
	{
		super("ComposedIndexedType");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllComposedIndexedTypes()
	{
		return createGetResponse().build(ComposedIndexedTypesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ComposedIndexedTypeResource} for current root resource 
	 */
	@Path("{composedindexedtype}")
	public AbstractYResource getComposedIndexedTypeResource(@PathParam("composedindexedtype")  final String resourceKey)
	{
		final ComposedIndexedTypeResource  resource  = resourceCtx.getResource(ComposedIndexedTypeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ComposedIndexedTypeModel> getComposedIndexedTypesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postComposedIndexedType(final ComposedIndexedTypeDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setComposedIndexedTypesCollection(final Collection<ComposedIndexedTypeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
