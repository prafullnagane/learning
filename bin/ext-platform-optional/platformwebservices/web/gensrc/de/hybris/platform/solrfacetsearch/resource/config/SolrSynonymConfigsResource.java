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

import de.hybris.platform.solrfacetsearch.dto.config.SolrSynonymConfigDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrSynonymConfigsDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrSynonymConfigModel;
import de.hybris.platform.solrfacetsearch.resource.config.SolrSynonymConfigResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrSynonymConfig defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrsynonymconfigs")
public class SolrSynonymConfigsResource extends AbstractCollectionResource <Collection<SolrSynonymConfigModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSynonymConfigsResource()
	{
		super("SolrSynonymConfig");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrSynonymConfigs()
	{
		return createGetResponse().build(SolrSynonymConfigsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrSynonymConfigResource} for current root resource 
	 */
	@Path("{solrsynonymconfig}")
	public AbstractYResource getSolrSynonymConfigResource(@PathParam("solrsynonymconfig")  final String resourceKey)
	{
		final SolrSynonymConfigResource  resource  = resourceCtx.getResource(SolrSynonymConfigResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrSynonymConfigModel> getSolrSynonymConfigsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrSynonymConfig(final SolrSynonymConfigDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrSynonymConfigsCollection(final Collection<SolrSynonymConfigModel> value)
	{
		super.setResourceValue(value);
	}
	
}
