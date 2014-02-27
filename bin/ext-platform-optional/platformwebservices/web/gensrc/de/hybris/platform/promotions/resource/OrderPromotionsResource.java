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
package de.hybris.platform.promotions.resource;

import de.hybris.platform.promotions.dto.OrderPromotionDTO;
import de.hybris.platform.promotions.dto.OrderPromotionsDTO;
import de.hybris.platform.promotions.model.OrderPromotionModel;
import de.hybris.platform.promotions.resource.OrderPromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderPromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderpromotions")
public class OrderPromotionsResource extends AbstractCollectionResource <Collection<OrderPromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderPromotionsResource()
	{
		super("OrderPromotion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderPromotions()
	{
		return createGetResponse().build(OrderPromotionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderPromotionResource} for current root resource 
	 */
	@Path("{orderpromotion}")
	public AbstractYResource getOrderPromotionResource(@PathParam("orderpromotion")  final String resourceKey)
	{
		final OrderPromotionResource  resource  = resourceCtx.getResource(OrderPromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderPromotionModel> getOrderPromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postOrderPromotion(final OrderPromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderPromotionsCollection(final Collection<OrderPromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
