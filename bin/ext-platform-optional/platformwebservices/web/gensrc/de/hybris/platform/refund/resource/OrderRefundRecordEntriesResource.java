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
package de.hybris.platform.refund.resource;

import de.hybris.platform.refund.dto.OrderRefundRecordEntriesDTO;
import de.hybris.platform.refund.model.OrderRefundRecordEntryModel;
import de.hybris.platform.refund.resource.OrderRefundRecordEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderRefundRecordEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderrefundrecordentries")
public class OrderRefundRecordEntriesResource extends AbstractCollectionResource <Collection<OrderRefundRecordEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderRefundRecordEntriesResource()
	{
		super("OrderRefundRecordEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderRefundRecordEntries()
	{
		return createGetResponse().build(OrderRefundRecordEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderRefundRecordEntryModel> getOrderRefundRecordEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderRefundRecordEntryResource} for current root resource 
	 */
	@Path("{orderrefundrecordentry}")
	public AbstractYResource getOrderRefundRecordEntryResource(@PathParam("orderrefundrecordentry")  final String resourceKey)
	{
		final OrderRefundRecordEntryResource  resource  = resourceCtx.getResource(OrderRefundRecordEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderRefundRecordEntriesCollection(final Collection<OrderRefundRecordEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
