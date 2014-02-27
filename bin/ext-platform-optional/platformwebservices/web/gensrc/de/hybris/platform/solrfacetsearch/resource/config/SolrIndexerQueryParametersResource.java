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

import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexerQueryParameterDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexerQueryParametersDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexerQueryParameterModel;
import de.hybris.platform.solrfacetsearch.resource.config.SolrIndexerQueryParameterResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrIndexerQueryParameter defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrindexerqueryparameters")
public class SolrIndexerQueryParametersResource extends AbstractCollectionResource <Collection<SolrIndexerQueryParameterModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerQueryParametersResource()
	{
		super("SolrIndexerQueryParameter");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrIndexerQueryParameters()
	{
		return createGetResponse().build(SolrIndexerQueryParametersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrIndexerQueryParameterResource} for current root resource 
	 */
	@Path("{solrindexerqueryparameter}")
	public AbstractYResource getSolrIndexerQueryParameterResource(@PathParam("solrindexerqueryparameter")  final String resourceKey)
	{
		final SolrIndexerQueryParameterResource  resource  = resourceCtx.getResource(SolrIndexerQueryParameterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrIndexerQueryParameterModel> getSolrIndexerQueryParametersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrIndexerQueryParameter(final SolrIndexerQueryParameterDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrIndexerQueryParametersCollection(final Collection<SolrIndexerQueryParameterModel> value)
	{
		super.setResourceValue(value);
	}
	
}
