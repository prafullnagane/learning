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
package de.hybris.platform.solrfacetsearch.resource.indexer.cron;

import de.hybris.platform.solrfacetsearch.dto.indexer.cron.SolrIndexOptimizationCronJobsDTO;
import de.hybris.platform.solrfacetsearch.model.indexer.cron.SolrIndexOptimizationCronJobModel;
import de.hybris.platform.solrfacetsearch.resource.indexer.cron.SolrIndexOptimizationCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrIndexOptimizationCronJob defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrindexoptimizationcronjobs")
public class SolrIndexOptimizationCronJobsResource extends AbstractCollectionResource <Collection<SolrIndexOptimizationCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexOptimizationCronJobsResource()
	{
		super("SolrIndexOptimizationCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrIndexOptimizationCronJobs()
	{
		return createGetResponse().build(SolrIndexOptimizationCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrIndexOptimizationCronJobResource} for current root resource 
	 */
	@Path("{solrindexoptimizationcronjob}")
	public AbstractYResource getSolrIndexOptimizationCronJobResource(@PathParam("solrindexoptimizationcronjob")  final String resourceKey)
	{
		final SolrIndexOptimizationCronJobResource  resource  = resourceCtx.getResource(SolrIndexOptimizationCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrIndexOptimizationCronJobModel> getSolrIndexOptimizationCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrIndexOptimizationCronJobsCollection(final Collection<SolrIndexOptimizationCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
