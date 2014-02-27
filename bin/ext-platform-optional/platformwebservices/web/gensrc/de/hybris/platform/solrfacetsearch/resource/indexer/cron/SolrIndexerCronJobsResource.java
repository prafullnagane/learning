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

import de.hybris.platform.solrfacetsearch.dto.indexer.cron.SolrIndexerCronJobsDTO;
import de.hybris.platform.solrfacetsearch.model.indexer.cron.SolrIndexerCronJobModel;
import de.hybris.platform.solrfacetsearch.resource.indexer.cron.SolrIndexerCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrIndexerCronJob defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrindexercronjobs")
public class SolrIndexerCronJobsResource extends AbstractCollectionResource <Collection<SolrIndexerCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerCronJobsResource()
	{
		super("SolrIndexerCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrIndexerCronJobs()
	{
		return createGetResponse().build(SolrIndexerCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrIndexerCronJobResource} for current root resource 
	 */
	@Path("{solrindexercronjob}")
	public AbstractYResource getSolrIndexerCronJobResource(@PathParam("solrindexercronjob")  final String resourceKey)
	{
		final SolrIndexerCronJobResource  resource  = resourceCtx.getResource(SolrIndexerCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrIndexerCronJobModel> getSolrIndexerCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrIndexerCronJobsCollection(final Collection<SolrIndexerCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
