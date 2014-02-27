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

import de.hybris.platform.solrfacetsearch.dto.redirect.SolrProductRedirectDTO;
import de.hybris.platform.solrfacetsearch.dto.redirect.SolrProductRedirectsDTO;
import de.hybris.platform.solrfacetsearch.model.redirect.SolrProductRedirectModel;
import de.hybris.platform.solrfacetsearch.resource.redirect.SolrProductRedirectResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrProductRedirect defined at extension solrfacetsearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrproductredirects")
public class SolrProductRedirectsResource extends AbstractCollectionResource <Collection<SolrProductRedirectModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrProductRedirectsResource()
	{
		super("SolrProductRedirect");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrProductRedirects()
	{
		return createGetResponse().build(SolrProductRedirectsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrProductRedirectResource} for current root resource 
	 */
	@Path("{solrproductredirect}")
	public AbstractYResource getSolrProductRedirectResource(@PathParam("solrproductredirect")  final String resourceKey)
	{
		final SolrProductRedirectResource  resource  = resourceCtx.getResource(SolrProductRedirectResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrProductRedirectModel> getSolrProductRedirectsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrProductRedirect(final SolrProductRedirectDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrProductRedirectsCollection(final Collection<SolrProductRedirectModel> value)
	{
		super.setResourceValue(value);
	}
	
}
