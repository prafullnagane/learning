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
package de.hybris.platform.lucenesearch.resource;

import de.hybris.platform.lucenesearch.dto.LuceneIndexsDTO;
import de.hybris.platform.lucenesearch.model.LuceneIndexModel;
import de.hybris.platform.lucenesearch.resource.LuceneIndexResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type LuceneIndex defined at extension lucenesearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/luceneindexs")
public class LuceneIndexsResource extends AbstractCollectionResource <Collection<LuceneIndexModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LuceneIndexsResource()
	{
		super("LuceneIndex");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllLuceneIndexs()
	{
		return createGetResponse().build(LuceneIndexsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LuceneIndexResource} for current root resource 
	 */
	@Path("{luceneindex}")
	public AbstractYResource getLuceneIndexResource(@PathParam("luceneindex")  final String resourceKey)
	{
		final LuceneIndexResource  resource  = resourceCtx.getResource(LuceneIndexResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<LuceneIndexModel> getLuceneIndexsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setLuceneIndexsCollection(final Collection<LuceneIndexModel> value)
	{
		super.setResourceValue(value);
	}
	
}
