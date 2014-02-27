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
package de.hybris.platform.commerceservices.resource.solrsearch.config;

import de.hybris.platform.commerceservices.dto.solrsearch.config.SolrSortsDTO;
import de.hybris.platform.commerceservices.model.solrsearch.config.SolrSortModel;
import de.hybris.platform.commerceservices.resource.solrsearch.config.SolrSortResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SolrSort defined at extension commerceservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/solrsorts")
public class SolrSortsResource extends AbstractCollectionResource <Collection<SolrSortModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSortsResource()
	{
		super("SolrSort");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSolrSorts()
	{
		return createGetResponse().build(SolrSortsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrSortResource} for current root resource 
	 */
	@Path("{solrsort}")
	public AbstractYResource getSolrSortResource(@PathParam("solrsort")  final String resourceKey)
	{
		final SolrSortResource  resource  = resourceCtx.getResource(SolrSortResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SolrSortModel> getSolrSortsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSolrSortsCollection(final Collection<SolrSortModel> value)
	{
		super.setResourceValue(value);
	}
	
}
