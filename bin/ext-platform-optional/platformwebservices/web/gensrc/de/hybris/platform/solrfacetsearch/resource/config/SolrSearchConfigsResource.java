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

import de.hybris.platform.solrfacetsearch.dto.config.SolrSearchConfigDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrSearchConfigsDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrSearchConfigModel;
import de.hybris.platform.solrfacetsearch.resource.config.SolrSearchConfigResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrSearchConfig defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrsearchconfigs")
public class SolrSearchConfigsResource extends AbstractCollectionResource <Collection<SolrSearchConfigModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSearchConfigsResource()
	{
		super("SolrSearchConfig");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrSearchConfigs()
	{
		return createGetResponse().build(SolrSearchConfigsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrSearchConfigResource} for current root resource 
	 */
	@Path("{solrsearchconfig}")
	public AbstractYResource getSolrSearchConfigResource(@PathParam("solrsearchconfig")  final String resourceKey)
	{
		final SolrSearchConfigResource  resource  = resourceCtx.getResource(SolrSearchConfigResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrSearchConfigModel> getSolrSearchConfigsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrSearchConfig(final SolrSearchConfigDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrSearchConfigsCollection(final Collection<SolrSearchConfigModel> value)
	{
		super.setResourceValue(value);
	}
	
}
