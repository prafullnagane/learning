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
package de.hybris.platform.cms2.resource.contents.contentslot;

import de.hybris.platform.cms2.dto.contents.contentslot.ContentSlotsDTO;
import de.hybris.platform.cms2.model.contents.contentslot.ContentSlotModel;
import de.hybris.platform.cms2.resource.contents.contentslot.ContentSlotResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ContentSlot defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/contentslots")
public class ContentSlotsResource extends AbstractCollectionResource <Collection<ContentSlotModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotsResource()
	{
		super("ContentSlot");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllContentSlots()
	{
		return createGetResponse().build(ContentSlotsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ContentSlotResource} for current root resource 
	 */
	@Path("{contentslot}")
	public AbstractYResource getContentSlotResource(@PathParam("contentslot")  final String resourceKey)
	{
		final ContentSlotResource  resource  = resourceCtx.getResource(ContentSlotResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ContentSlotModel> getContentSlotsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setContentSlotsCollection(final Collection<ContentSlotModel> value)
	{
		super.setResourceValue(value);
	}
	
}
