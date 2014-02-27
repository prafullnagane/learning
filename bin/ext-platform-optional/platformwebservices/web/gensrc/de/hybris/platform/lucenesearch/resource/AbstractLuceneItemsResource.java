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

import de.hybris.platform.lucenesearch.dto.AbstractLuceneItemDTO;
import de.hybris.platform.lucenesearch.dto.AbstractLuceneItemsDTO;
import de.hybris.platform.lucenesearch.model.AbstractLuceneItemModel;
import de.hybris.platform.lucenesearch.resource.AbstractLuceneItemResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractLuceneItem defined at extension lucenesearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractluceneitems")
public class AbstractLuceneItemsResource extends AbstractCollectionResource <Collection<AbstractLuceneItemModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractLuceneItemsResource()
	{
		super("AbstractLuceneItem");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractLuceneItemResource} for current root resource 
	 */
	@Path("{abstractluceneitem}")
	public AbstractYResource getAbstractLuceneItemResource(@PathParam("abstractluceneitem")  final String resourceKey)
	{
		final AbstractLuceneItemResource  resource  = resourceCtx.getResource(AbstractLuceneItemResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractLuceneItemModel> getAbstractLuceneItemsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractLuceneItems()
	{
		return createGetResponse().build(AbstractLuceneItemsDTO.class);
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postAbstractLuceneItem(final AbstractLuceneItemDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractLuceneItemsCollection(final Collection<AbstractLuceneItemModel> value)
	{
		super.setResourceValue(value);
	}
	
}
