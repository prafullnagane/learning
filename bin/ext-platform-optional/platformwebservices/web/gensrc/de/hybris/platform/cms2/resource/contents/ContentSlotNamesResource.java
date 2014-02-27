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
package de.hybris.platform.cms2.resource.contents;

import de.hybris.platform.cms2.dto.contents.ContentSlotNameDTO;
import de.hybris.platform.cms2.dto.contents.ContentSlotNamesDTO;
import de.hybris.platform.cms2.model.contents.ContentSlotNameModel;
import de.hybris.platform.cms2.resource.contents.ContentSlotNameResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ContentSlotName defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/contentslotnames")
public class ContentSlotNamesResource extends AbstractCollectionResource <Collection<ContentSlotNameModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotNamesResource()
	{
		super("ContentSlotName");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllContentSlotNames()
	{
		return createGetResponse().build(ContentSlotNamesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ContentSlotNameResource} for current root resource 
	 */
	@Path("{contentslotname}")
	public AbstractYResource getContentSlotNameResource(@PathParam("contentslotname")  final String resourceKey)
	{
		final ContentSlotNameResource  resource  = resourceCtx.getResource(ContentSlotNameResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ContentSlotNameModel> getContentSlotNamesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postContentSlotName(final ContentSlotNameDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setContentSlotNamesCollection(final Collection<ContentSlotNameModel> value)
	{
		super.setResourceValue(value);
	}
	
}
