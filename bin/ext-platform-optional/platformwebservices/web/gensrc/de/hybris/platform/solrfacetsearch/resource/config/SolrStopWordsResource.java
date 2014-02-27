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

import de.hybris.platform.solrfacetsearch.dto.config.SolrStopWordDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrStopWordsDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrStopWordModel;
import de.hybris.platform.solrfacetsearch.resource.config.SolrStopWordResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrStopWord defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrstopwords")
public class SolrStopWordsResource extends AbstractCollectionResource <Collection<SolrStopWordModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrStopWordsResource()
	{
		super("SolrStopWord");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrStopWords()
	{
		return createGetResponse().build(SolrStopWordsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrStopWordResource} for current root resource 
	 */
	@Path("{solrstopword}")
	public AbstractYResource getSolrStopWordResource(@PathParam("solrstopword")  final String resourceKey)
	{
		final SolrStopWordResource  resource  = resourceCtx.getResource(SolrStopWordResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrStopWordModel> getSolrStopWordsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrStopWord(final SolrStopWordDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrStopWordsCollection(final Collection<SolrStopWordModel> value)
	{
		super.setResourceValue(value);
	}
	
}
