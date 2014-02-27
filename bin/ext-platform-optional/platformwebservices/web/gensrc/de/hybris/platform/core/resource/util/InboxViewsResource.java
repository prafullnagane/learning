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
package de.hybris.platform.core.resource.util;

import de.hybris.platform.core.dto.util.InboxViewDTO;
import de.hybris.platform.core.dto.util.InboxViewsDTO;
import de.hybris.platform.core.model.util.InboxViewModel;
import de.hybris.platform.core.resource.util.InboxViewResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type InboxView defined at extension workflow Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/inboxviews")
public class InboxViewsResource extends AbstractCollectionResource <Collection<InboxViewModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public InboxViewsResource()
	{
		super("InboxView");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllInboxViews()
	{
		return createGetResponse().build(InboxViewsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link InboxViewResource} for current root resource 
	 */
	@Path("{inboxview}")
	public AbstractYResource getInboxViewResource(@PathParam("inboxview")  final String resourceKey)
	{
		final InboxViewResource  resource  = resourceCtx.getResource(InboxViewResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<InboxViewModel> getInboxViewsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postInboxView(final InboxViewDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setInboxViewsCollection(final Collection<InboxViewModel> value)
	{
		super.setResourceValue(value);
	}
	
}
