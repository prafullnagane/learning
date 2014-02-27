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

import de.hybris.platform.solrfacetsearch.dto.config.SolrServerConfigsDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrServerConfigModel;
import de.hybris.platform.solrfacetsearch.resource.config.SolrServerConfigResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrServerConfig defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrserverconfigs")
public class SolrServerConfigsResource extends AbstractCollectionResource <Collection<SolrServerConfigModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrServerConfigsResource()
	{
		super("SolrServerConfig");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrServerConfigs()
	{
		return createGetResponse().build(SolrServerConfigsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrServerConfigResource} for current root resource 
	 */
	@Path("{solrserverconfig}")
	public AbstractYResource getSolrServerConfigResource(@PathParam("solrserverconfig")  final String resourceKey)
	{
		final SolrServerConfigResource  resource  = resourceCtx.getResource(SolrServerConfigResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrServerConfigModel> getSolrServerConfigsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrServerConfigsCollection(final Collection<SolrServerConfigModel> value)
	{
		super.setResourceValue(value);
	}
	
}
