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

import de.hybris.platform.returns.dto.OrderReturnRecordEntriesDTO;
import de.hybris.platform.returns.model.OrderReturnRecordEntryModel;
import de.hybris.platform.returns.resource.OrderReturnRecordEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderReturnRecordEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderreturnrecordentries")
public class OrderReturnRecordEntriesResource extends AbstractCollectionResource <Collection<OrderReturnRecordEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderReturnRecordEntriesResource()
	{
		super("OrderReturnRecordEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderReturnRecordEntries()
	{
		return createGetResponse().build(OrderReturnRecordEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderReturnRecordEntryModel> getOrderReturnRecordEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderReturnRecordEntryResource} for current root resource 
	 */
	@Path("{orderreturnrecordentry}")
	public AbstractYResource getOrderReturnRecordEntryResource(@PathParam("orderreturnrecordentry")  final String resourceKey)
	{
		final OrderReturnRecordEntryResource  resource  = resourceCtx.getResource(OrderReturnRecordEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderReturnRecordEntriesCollection(final Collection<OrderReturnRecordEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
