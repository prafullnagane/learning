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

import de.hybris.platform.solrfacetsearch.dto.cron.SolrUpdateSynonymsCronJobsDTO;
import de.hybris.platform.solrfacetsearch.model.cron.SolrUpdateSynonymsCronJobModel;
import de.hybris.platform.solrfacetsearch.resource.cron.SolrUpdateSynonymsCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrUpdateSynonymsCronJob defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrupdatesynonymscronjobs")
public class SolrUpdateSynonymsCronJobsResource extends AbstractCollectionResource <Collection<SolrUpdateSynonymsCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrUpdateSynonymsCronJobsResource()
	{
		super("SolrUpdateSynonymsCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrUpdateSynonymsCronJobs()
	{
		return createGetResponse().build(SolrUpdateSynonymsCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrUpdateSynonymsCronJobResource} for current root resource 
	 */
	@Path("{solrupdatesynonymscronjob}")
	public AbstractYResource getSolrUpdateSynonymsCronJobResource(@PathParam("solrupdatesynonymscronjob")  final String resourceKey)
	{
		final SolrUpdateSynonymsCronJobResource  resource  = resourceCtx.getResource(SolrUpdateSynonymsCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrUpdateSynonymsCronJobModel> getSolrUpdateSynonymsCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrUpdateSynonymsCronJobsCollection(final Collection<SolrUpdateSynonymsCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
