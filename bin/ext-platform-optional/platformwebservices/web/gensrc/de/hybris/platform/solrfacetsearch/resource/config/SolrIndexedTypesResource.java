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

import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedTypesDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import de.hybris.platform.solrfacetsearch.resource.config.SolrIndexedTypeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrIndexedType defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrindexedtypes")
public class SolrIndexedTypesResource extends AbstractCollectionResource <Collection<SolrIndexedTypeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedTypesResource()
	{
		super("SolrIndexedType");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrIndexedTypes()
	{
		return createGetResponse().build(SolrIndexedTypesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrIndexedTypeResource} for current root resource 
	 */
	@Path("{solrindexedtype}")
	public AbstractYResource getSolrIndexedTypeResource(@PathParam("solrindexedtype")  final String resourceKey)
	{
		final SolrIndexedTypeResource  resource  = resourceCtx.getResource(SolrIndexedTypeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrIndexedTypeModel> getSolrIndexedTypesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrIndexedTypesCollection(final Collection<SolrIndexedTypeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
