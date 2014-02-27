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

import de.hybris.platform.solrfacetsearch.dto.redirect.SolrAbstractKeywordRedirectDTO;
import de.hybris.platform.solrfacetsearch.dto.redirect.SolrAbstractKeywordRedirectsDTO;
import de.hybris.platform.solrfacetsearch.model.redirect.SolrAbstractKeywordRedirectModel;
import de.hybris.platform.solrfacetsearch.resource.redirect.SolrAbstractKeywordRedirectResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrAbstractKeywordRedirect defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrabstractkeywordredirects")
public class SolrAbstractKeywordRedirectsResource extends AbstractCollectionResource <Collection<SolrAbstractKeywordRedirectModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrAbstractKeywordRedirectsResource()
	{
		super("SolrAbstractKeywordRedirect");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrAbstractKeywordRedirects()
	{
		return createGetResponse().build(SolrAbstractKeywordRedirectsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrAbstractKeywordRedirectResource} for current root resource 
	 */
	@Path("{solrabstractkeywordredirect}")
	public AbstractYResource getSolrAbstractKeywordRedirectResource(@PathParam("solrabstractkeywordredirect")  final String resourceKey)
	{
		final SolrAbstractKeywordRedirectResource  resource  = resourceCtx.getResource(SolrAbstractKeywordRedirectResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrAbstractKeywordRedirectModel> getSolrAbstractKeywordRedirectsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrAbstractKeywordRedirect(final SolrAbstractKeywordRedirectDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrAbstractKeywordRedirectsCollection(final Collection<SolrAbstractKeywordRedirectModel> value)
	{
		super.setResourceValue(value);
	}
	
}
