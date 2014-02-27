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

import de.hybris.platform.ordermodify.dto.OrderModificationRecordsDTO;
import de.hybris.platform.ordermodify.model.OrderModificationRecordModel;
import de.hybris.platform.ordermodify.resource.OrderModificationRecordResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderModificationRecord defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/ordermodificationrecords")
public class OrderModificationRecordsResource extends AbstractCollectionResource <Collection<OrderModificationRecordModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderModificationRecordsResource()
	{
		super("OrderModificationRecord");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderModificationRecords()
	{
		return createGetResponse().build(OrderModificationRecordsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderModificationRecordResource} for current root resource 
	 */
	@Path("{ordermodificationrecord}")
	public AbstractYResource getOrderModificationRecordResource(@PathParam("ordermodificationrecord")  final String resourceKey)
	{
		final OrderModificationRecordResource  resource  = resourceCtx.getResource(OrderModificationRecordResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderModificationRecordModel> getOrderModificationRecordsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderModificationRecordsCollection(final Collection<OrderModificationRecordModel> value)
	{
		super.setResourceValue(value);
	}
	
}
