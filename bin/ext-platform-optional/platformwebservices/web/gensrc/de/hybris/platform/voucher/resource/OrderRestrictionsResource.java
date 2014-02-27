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
package de.hybris.platform.voucher.resource;

import de.hybris.platform.voucher.dto.OrderRestrictionDTO;
import de.hybris.platform.voucher.dto.OrderRestrictionsDTO;
import de.hybris.platform.voucher.model.OrderRestrictionModel;
import de.hybris.platform.voucher.resource.OrderRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderRestriction defined at extension voucher Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderrestrictions")
public class OrderRestrictionsResource extends AbstractCollectionResource <Collection<OrderRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderRestrictionsResource()
	{
		super("OrderRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderRestrictions()
	{
		return createGetResponse().build(OrderRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderRestrictionResource} for current root resource 
	 */
	@Path("{orderrestriction}")
	public AbstractYResource getOrderRestrictionResource(@PathParam("orderrestriction")  final String resourceKey)
	{
		final OrderRestrictionResource  resource  = resourceCtx.getResource(OrderRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderRestrictionModel> getOrderRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postOrderRestriction(final OrderRestrictionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderRestrictionsCollection(final Collection<OrderRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
