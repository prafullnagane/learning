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
package de.hybris.platform.returns.resource;

import de.hybris.platform.returns.dto.OrderReturnRecordsDTO;
import de.hybris.platform.returns.model.OrderReturnRecordModel;
import de.hybris.platform.returns.resource.OrderReturnRecordResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderReturnRecord defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderreturnrecords")
public class OrderReturnRecordsResource extends AbstractCollectionResource <Collection<OrderReturnRecordModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderReturnRecordsResource()
	{
		super("OrderReturnRecord");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderReturnRecords()
	{
		return createGetResponse().build(OrderReturnRecordsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderReturnRecordResource} for current root resource 
	 */
	@Path("{orderreturnrecord}")
	public AbstractYResource getOrderReturnRecordResource(@PathParam("orderreturnrecord")  final String resourceKey)
	{
		final OrderReturnRecordResource  resource  = resourceCtx.getResource(OrderReturnRecordResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderReturnRecordModel> getOrderReturnRecordsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderReturnRecordsCollection(final Collection<OrderReturnRecordModel> value)
	{
		super.setResourceValue(value);
	}
	
}
