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

import de.hybris.platform.solrfacetsearch.dto.indexer.cron.SolrIndexerHotUpdateCronJobsDTO;
import de.hybris.platform.solrfacetsearch.model.indexer.cron.SolrIndexerHotUpdateCronJobModel;
import de.hybris.platform.solrfacetsearch.resource.indexer.cron.SolrIndexerHotUpdateCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrIndexerHotUpdateCronJob defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrindexerhotupdatecronjobs")
public class SolrIndexerHotUpdateCronJobsResource extends AbstractCollectionResource <Collection<SolrIndexerHotUpdateCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerHotUpdateCronJobsResource()
	{
		super("SolrIndexerHotUpdateCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrIndexerHotUpdateCronJobs()
	{
		return createGetResponse().build(SolrIndexerHotUpdateCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrIndexerHotUpdateCronJobResource} for current root resource 
	 */
	@Path("{solrindexerhotupdatecronjob}")
	public AbstractYResource getSolrIndexerHotUpdateCronJobResource(@PathParam("solrindexerhotupdatecronjob")  final String resourceKey)
	{
		final SolrIndexerHotUpdateCronJobResource  resource  = resourceCtx.getResource(SolrIndexerHotUpdateCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrIndexerHotUpdateCronJobModel> getSolrIndexerHotUpdateCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrIndexerHotUpdateCronJobsCollection(final Collection<SolrIndexerHotUpdateCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
