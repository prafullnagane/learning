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
package de.hybris.platform.catalog.resource;

import de.hybris.platform.catalog.dto.CatalogVersionDifferenceDTO;
import de.hybris.platform.catalog.dto.CatalogVersionDifferencesDTO;
import de.hybris.platform.catalog.model.CatalogVersionDifferenceModel;
import de.hybris.platform.catalog.resource.CatalogVersionDifferenceResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CatalogVersionDifference defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/catalogversiondifferences")
public class CatalogVersionDifferencesResource extends AbstractCollectionResource <Collection<CatalogVersionDifferenceModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionDifferencesResource()
	{
		super("CatalogVersionDifference");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCatalogVersionDifferences()
	{
		return createGetResponse().build(CatalogVersionDifferencesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogVersionDifferenceResource} for current root resource 
	 */
	@Path("{catalogversiondifference}")
	public AbstractYResource getCatalogVersionDifferenceResource(@PathParam("catalogversiondifference")  final String resourceKey)
	{
		final CatalogVersionDifferenceResource  resource  = resourceCtx.getResource(CatalogVersionDifferenceResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CatalogVersionDifferenceModel> getCatalogVersionDifferencesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCatalogVersionDifference(final CatalogVersionDifferenceDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCatalogVersionDifferencesCollection(final Collection<CatalogVersionDifferenceModel> value)
	{
		super.setResourceValue(value);
	}
	
}
