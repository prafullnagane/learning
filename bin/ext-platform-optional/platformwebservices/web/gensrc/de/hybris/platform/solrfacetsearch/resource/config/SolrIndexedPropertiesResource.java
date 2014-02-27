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

import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedPropertiesDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedPropertyDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;
import de.hybris.platform.solrfacetsearch.resource.config.SolrIndexedPropertyResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrIndexedProperty defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrindexedproperties")
public class SolrIndexedPropertiesResource extends AbstractCollectionResource <Collection<SolrIndexedPropertyModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedPropertiesResource()
	{
		super("SolrIndexedProperty");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrIndexedProperties()
	{
		return createGetResponse().build(SolrIndexedPropertiesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrIndexedPropertyModel> getSolrIndexedPropertiesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrIndexedPropertyResource} for current root resource 
	 */
	@Path("{solrindexedproperty}")
	public AbstractYResource getSolrIndexedPropertyResource(@PathParam("solrindexedproperty")  final String resourceKey)
	{
		final SolrIndexedPropertyResource  resource  = resourceCtx.getResource(SolrIndexedPropertyResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrIndexedProperty(final SolrIndexedPropertyDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrIndexedPropertiesCollection(final Collection<SolrIndexedPropertyModel> value)
	{
		super.setResourceValue(value);
	}
	
}
