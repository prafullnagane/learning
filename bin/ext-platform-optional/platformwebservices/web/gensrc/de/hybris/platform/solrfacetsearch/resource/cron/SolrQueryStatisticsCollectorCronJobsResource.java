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
package de.hybris.platform.solrfacetsearch.resource.cron;

import de.hybris.platform.solrfacetsearch.dto.cron.SolrQueryStatisticsCollectorCronJobsDTO;
import de.hybris.platform.solrfacetsearch.model.cron.SolrQueryStatisticsCollectorCronJobModel;
import de.hybris.platform.solrfacetsearch.resource.cron.SolrQueryStatisticsCollectorCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrQueryStatisticsCollectorCronJob defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrquerystatisticscollectorcronjobs")
public class SolrQueryStatisticsCollectorCronJobsResource extends AbstractCollectionResource <Collection<SolrQueryStatisticsCollectorCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrQueryStatisticsCollectorCronJobsResource()
	{
		super("SolrQueryStatisticsCollectorCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrQueryStatisticsCollectorCronJobs()
	{
		return createGetResponse().build(SolrQueryStatisticsCollectorCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrQueryStatisticsCollectorCronJobResource} for current root resource 
	 */
	@Path("{solrquerystatisticscollectorcronjob}")
	public AbstractYResource getSolrQueryStatisticsCollectorCronJobResource(@PathParam("solrquerystatisticscollectorcronjob")  final String resourceKey)
	{
		final SolrQueryStatisticsCollectorCronJobResource  resource  = resourceCtx.getResource(SolrQueryStatisticsCollectorCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrQueryStatisticsCollectorCronJobModel> getSolrQueryStatisticsCollectorCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrQueryStatisticsCollectorCronJobsCollection(final Collection<SolrQueryStatisticsCollectorCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
