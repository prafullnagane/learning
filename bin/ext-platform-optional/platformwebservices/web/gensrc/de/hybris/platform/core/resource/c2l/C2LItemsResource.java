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
package de.hybris.platform.core.resource.c2l;

import de.hybris.platform.core.dto.c2l.C2LItemDTO;
import de.hybris.platform.core.dto.c2l.C2LItemsDTO;
import de.hybris.platform.core.model.c2l.C2LItemModel;
import de.hybris.platform.core.resource.c2l.C2LItemResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type C2LItem defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/c2litems")
public class C2LItemsResource extends AbstractCollectionResource <Collection<C2LItemModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public C2LItemsResource()
	{
		super("C2LItem");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllC2LItems()
	{
		return createGetResponse().build(C2LItemsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link C2LItemResource} for current root resource 
	 */
	@Path("{c2litem}")
	public AbstractYResource getC2LItemResource(@PathParam("c2litem")  final String resourceKey)
	{
		final C2LItemResource  resource  = resourceCtx.getResource(C2LItemResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<C2LItemModel> getC2LItemsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postC2LItem(final C2LItemDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setC2LItemsCollection(final Collection<C2LItemModel> value)
	{
		super.setResourceValue(value);
	}
	
}
