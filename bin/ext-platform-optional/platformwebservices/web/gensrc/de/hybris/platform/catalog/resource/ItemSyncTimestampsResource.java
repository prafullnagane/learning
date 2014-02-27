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
package de.hybris.platform.catalog.resource;

import de.hybris.platform.catalog.dto.ItemSyncTimestampDTO;
import de.hybris.platform.catalog.dto.ItemSyncTimestampsDTO;
import de.hybris.platform.catalog.model.ItemSyncTimestampModel;
import de.hybris.platform.catalog.resource.ItemSyncTimestampResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ItemSyncTimestamp defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/itemsynctimestamps")
public class ItemSyncTimestampsResource extends AbstractCollectionResource <Collection<ItemSyncTimestampModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemSyncTimestampsResource()
	{
		super("ItemSyncTimestamp");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllItemSyncTimestamps()
	{
		return createGetResponse().build(ItemSyncTimestampsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ItemSyncTimestampResource} for current root resource 
	 */
	@Path("{itemsynctimestamp}")
	public AbstractYResource getItemSyncTimestampResource(@PathParam("itemsynctimestamp")  final String resourceKey)
	{
		final ItemSyncTimestampResource  resource  = resourceCtx.getResource(ItemSyncTimestampResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ItemSyncTimestampModel> getItemSyncTimestampsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postItemSyncTimestamp(final ItemSyncTimestampDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setItemSyncTimestampsCollection(final Collection<ItemSyncTimestampModel> value)
	{
		super.setResourceValue(value);
	}
	
}
