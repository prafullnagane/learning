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

import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigsDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.solrfacetsearch.resource.config.SolrFacetSearchConfigResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrFacetSearchConfig defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrfacetsearchconfigs")
public class SolrFacetSearchConfigsResource extends AbstractCollectionResource <Collection<SolrFacetSearchConfigModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrFacetSearchConfigsResource()
	{
		super("SolrFacetSearchConfig");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrFacetSearchConfigs()
	{
		return createGetResponse().build(SolrFacetSearchConfigsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrFacetSearchConfigResource} for current root resource 
	 */
	@Path("{solrfacetsearchconfig}")
	public AbstractYResource getSolrFacetSearchConfigResource(@PathParam("solrfacetsearchconfig")  final String resourceKey)
	{
		final SolrFacetSearchConfigResource  resource  = resourceCtx.getResource(SolrFacetSearchConfigResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrFacetSearchConfigModel> getSolrFacetSearchConfigsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrFacetSearchConfigsCollection(final Collection<SolrFacetSearchConfigModel> value)
	{
		super.setResourceValue(value);
	}
	
}
