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
package de.hybris.platform.solrfacetsearch.resource.reporting;

import de.hybris.platform.solrfacetsearch.dto.reporting.SolrQueryAggregatedStatsDTO;
import de.hybris.platform.solrfacetsearch.dto.reporting.SolrQueryAggregatedStatsesDTO;
import de.hybris.platform.solrfacetsearch.model.reporting.SolrQueryAggregatedStatsModel;
import de.hybris.platform.solrfacetsearch.resource.reporting.SolrQueryAggregatedStatsResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrQueryAggregatedStats defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrqueryaggregatedstatses")
public class SolrQueryAggregatedStatsesResource extends AbstractCollectionResource <Collection<SolrQueryAggregatedStatsModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrQueryAggregatedStatsesResource()
	{
		super("SolrQueryAggregatedStats");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrQueryAggregatedStatses()
	{
		return createGetResponse().build(SolrQueryAggregatedStatsesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrQueryAggregatedStatsModel> getSolrQueryAggregatedStatsesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrQueryAggregatedStatsResource} for current root resource 
	 */
	@Path("{solrqueryaggregatedstats}")
	public AbstractYResource getSolrQueryAggregatedStatsResource(@PathParam("solrqueryaggregatedstats")  final String resourceKey)
	{
		final SolrQueryAggregatedStatsResource  resource  = resourceCtx.getResource(SolrQueryAggregatedStatsResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrQueryAggregatedStats(final SolrQueryAggregatedStatsDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrQueryAggregatedStatsesCollection(final Collection<SolrQueryAggregatedStatsModel> value)
	{
		super.setResourceValue(value);
	}
	
}
