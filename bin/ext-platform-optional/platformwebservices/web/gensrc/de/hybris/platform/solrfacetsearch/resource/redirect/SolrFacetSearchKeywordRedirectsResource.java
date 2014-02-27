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
package de.hybris.platform.solrfacetsearch.resource.redirect;

import de.hybris.platform.solrfacetsearch.dto.redirect.SolrFacetSearchKeywordRedirectDTO;
import de.hybris.platform.solrfacetsearch.dto.redirect.SolrFacetSearchKeywordRedirectsDTO;
import de.hybris.platform.solrfacetsearch.model.redirect.SolrFacetSearchKeywordRedirectModel;
import de.hybris.platform.solrfacetsearch.resource.redirect.SolrFacetSearchKeywordRedirectResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrFacetSearchKeywordRedirect defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrfacetsearchkeywordredirects")
public class SolrFacetSearchKeywordRedirectsResource extends AbstractCollectionResource <Collection<SolrFacetSearchKeywordRedirectModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrFacetSearchKeywordRedirectsResource()
	{
		super("SolrFacetSearchKeywordRedirect");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrFacetSearchKeywordRedirects()
	{
		return createGetResponse().build(SolrFacetSearchKeywordRedirectsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrFacetSearchKeywordRedirectResource} for current root resource 
	 */
	@Path("{solrfacetsearchkeywordredirect}")
	public AbstractYResource getSolrFacetSearchKeywordRedirectResource(@PathParam("solrfacetsearchkeywordredirect")  final String resourceKey)
	{
		final SolrFacetSearchKeywordRedirectResource  resource  = resourceCtx.getResource(SolrFacetSearchKeywordRedirectResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrFacetSearchKeywordRedirectModel> getSolrFacetSearchKeywordRedirectsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrFacetSearchKeywordRedirect(final SolrFacetSearchKeywordRedirectDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrFacetSearchKeywordRedirectsCollection(final Collection<SolrFacetSearchKeywordRedirectModel> value)
	{
		super.setResourceValue(value);
	}
	
}
