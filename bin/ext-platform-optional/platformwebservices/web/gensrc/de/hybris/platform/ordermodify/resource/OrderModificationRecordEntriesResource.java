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
package de.hybris.platform.ordermodify.resource;

import de.hybris.platform.ordermodify.dto.OrderModificationRecordEntriesDTO;
import de.hybris.platform.ordermodify.model.OrderModificationRecordEntryModel;
import de.hybris.platform.ordermodify.resource.OrderModificationRecordEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderModificationRecordEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/ordermodificationrecordentries")
public class OrderModificationRecordEntriesResource extends AbstractCollectionResource <Collection<OrderModificationRecordEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderModificationRecordEntriesResource()
	{
		super("OrderModificationRecordEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderModificationRecordEntries()
	{
		return createGetResponse().build(OrderModificationRecordEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderModificationRecordEntryModel> getOrderModificationRecordEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderModificationRecordEntryResource} for current root resource 
	 */
	@Path("{ordermodificationrecordentry}")
	public AbstractYResource getOrderModificationRecordEntryResource(@PathParam("ordermodificationrecordentry")  final String resourceKey)
	{
		final OrderModificationRecordEntryResource  resource  = resourceCtx.getResource(OrderModificationRecordEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderModificationRecordEntriesCollection(final Collection<OrderModificationRecordEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
