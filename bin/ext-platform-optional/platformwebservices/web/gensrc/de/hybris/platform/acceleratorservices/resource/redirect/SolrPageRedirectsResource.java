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
package de.hybris.platform.acceleratorservices.resource.redirect;

import de.hybris.platform.acceleratorservices.dto.redirect.SolrPageRedirectDTO;
import de.hybris.platform.acceleratorservices.dto.redirect.SolrPageRedirectsDTO;
import de.hybris.platform.acceleratorservices.model.redirect.SolrPageRedirectModel;
import de.hybris.platform.acceleratorservices.resource.redirect.SolrPageRedirectResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrPageRedirect defined at extension acceleratorservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrpageredirects")
public class SolrPageRedirectsResource extends AbstractCollectionResource <Collection<SolrPageRedirectModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrPageRedirectsResource()
	{
		super("SolrPageRedirect");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrPageRedirects()
	{
		return createGetResponse().build(SolrPageRedirectsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrPageRedirectResource} for current root resource 
	 */
	@Path("{solrpageredirect}")
	public AbstractYResource getSolrPageRedirectResource(@PathParam("solrpageredirect")  final String resourceKey)
	{
		final SolrPageRedirectResource  resource  = resourceCtx.getResource(SolrPageRedirectResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrPageRedirectModel> getSolrPageRedirectsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSolrPageRedirect(final SolrPageRedirectDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrPageRedirectsCollection(final Collection<SolrPageRedirectModel> value)
	{
		super.setResourceValue(value);
	}
	
}
