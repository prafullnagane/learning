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

import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexerQueriesDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexerQueryModel;
import de.hybris.platform.solrfacetsearch.resource.config.SolrIndexerQueryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrIndexerQuery defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrindexerqueries")
public class SolrIndexerQueriesResource extends AbstractCollectionResource <Collection<SolrIndexerQueryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerQueriesResource()
	{
		super("SolrIndexerQuery");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrIndexerQueries()
	{
		return createGetResponse().build(SolrIndexerQueriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrIndexerQueryModel> getSolrIndexerQueriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrIndexerQueryResource} for current root resource 
	 */
	@Path("{solrindexerquery}")
	public AbstractYResource getSolrIndexerQueryResource(@PathParam("solrindexerquery")  final String resourceKey)
	{
		final SolrIndexerQueryResource  resource  = resourceCtx.getResource(SolrIndexerQueryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrIndexerQueriesCollection(final Collection<SolrIndexerQueryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
