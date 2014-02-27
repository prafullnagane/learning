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

import de.hybris.platform.solrfacetsearch.dto.redirect.SolrCategoryRedirectDTO;
import de.hybris.platform.solrfacetsearch.dto.redirect.SolrCategoryRedirectsDTO;
import de.hybris.platform.solrfacetsearch.model.redirect.SolrCategoryRedirectModel;
import de.hybris.platform.solrfacetsearch.resource.redirect.SolrCategoryRedirectResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrCategoryRedirect defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrcategoryredirects")
public class SolrCategoryRedirectsResource extends AbstractCollectionResource <Collection<SolrCategoryRedirectModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrCategoryRedirectsResource()
	{
		super("SolrCategoryRedirect");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrCategoryRedirects()
	{
		return createGetResponse().build(SolrCategoryRedirectsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrCategoryRedirectResource} for current root resource 
	 */
	@Path("{solrcategoryredirect}")
	public AbstractYResource getSolrCategoryRedirectResource(@PathParam("solrcategoryredirect")  final String resourceKey)
	{
		final SolrCategoryRedirectResource  resource  = resourceCtx.getResource(SolrCategoryRedirectResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrCategoryRedirectModel> getSolrCategoryRedirectsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrCategoryRedirect(final SolrCategoryRedirectDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrCategoryRedirectsCollection(final Collection<SolrCategoryRedirectModel> value)
	{
		super.setResourceValue(value);
	}
	
}
