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
package de.hybris.platform.solrfacetsearch.resource.config;

import de.hybris.platform.solrfacetsearch.dto.config.SolrEndpointUrlDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrEndpointUrlsDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrEndpointUrlModel;
import de.hybris.platform.solrfacetsearch.resource.config.SolrEndpointUrlResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrEndpointUrl defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrendpointurls")
public class SolrEndpointUrlsResource extends AbstractCollectionResource <Collection<SolrEndpointUrlModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrEndpointUrlsResource()
	{
		super("SolrEndpointUrl");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrEndpointUrls()
	{
		return createGetResponse().build(SolrEndpointUrlsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrEndpointUrlResource} for current root resource 
	 */
	@Path("{solrendpointurl}")
	public AbstractYResource getSolrEndpointUrlResource(@PathParam("solrendpointurl")  final String resourceKey)
	{
		final SolrEndpointUrlResource  resource  = resourceCtx.getResource(SolrEndpointUrlResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrEndpointUrlModel> getSolrEndpointUrlsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrEndpointUrl(final SolrEndpointUrlDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrEndpointUrlsCollection(final Collection<SolrEndpointUrlModel> value)
	{
		super.setResourceValue(value);
	}
	
}
