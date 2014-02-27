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
package de.hybris.platform.solrfacetsearch.resource.indexer;

import de.hybris.platform.solrfacetsearch.dto.indexer.SolrIndexedCoresRecordsDTO;
import de.hybris.platform.solrfacetsearch.model.indexer.SolrIndexedCoresRecordModel;
import de.hybris.platform.solrfacetsearch.resource.indexer.SolrIndexedCoresRecordResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrIndexedCoresRecord defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrindexedcoresrecords")
public class SolrIndexedCoresRecordsResource extends AbstractCollectionResource <Collection<SolrIndexedCoresRecordModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedCoresRecordsResource()
	{
		super("SolrIndexedCoresRecord");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrIndexedCoresRecords()
	{
		return createGetResponse().build(SolrIndexedCoresRecordsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrIndexedCoresRecordResource} for current root resource 
	 */
	@Path("{solrindexedcoresrecord}")
	public AbstractYResource getSolrIndexedCoresRecordResource(@PathParam("solrindexedcoresrecord")  final String resourceKey)
	{
		final SolrIndexedCoresRecordResource  resource  = resourceCtx.getResource(SolrIndexedCoresRecordResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrIndexedCoresRecordModel> getSolrIndexedCoresRecordsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrIndexedCoresRecordsCollection(final Collection<SolrIndexedCoresRecordModel> value)
	{
		super.setResourceValue(value);
	}
	
}
