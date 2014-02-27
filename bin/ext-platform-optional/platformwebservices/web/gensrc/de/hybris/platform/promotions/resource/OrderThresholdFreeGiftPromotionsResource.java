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

import de.hybris.platform.promotions.dto.OrderThresholdFreeGiftPromotionDTO;
import de.hybris.platform.promotions.dto.OrderThresholdFreeGiftPromotionsDTO;
import de.hybris.platform.promotions.model.OrderThresholdFreeGiftPromotionModel;
import de.hybris.platform.promotions.resource.OrderThresholdFreeGiftPromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderThresholdFreeGiftPromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderthresholdfreegiftpromotions")
public class OrderThresholdFreeGiftPromotionsResource extends AbstractCollectionResource <Collection<OrderThresholdFreeGiftPromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdFreeGiftPromotionsResource()
	{
		super("OrderThresholdFreeGiftPromotion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderThresholdFreeGiftPromotions()
	{
		return createGetResponse().build(OrderThresholdFreeGiftPromotionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderThresholdFreeGiftPromotionResource} for current root resource 
	 */
	@Path("{orderthresholdfreegiftpromotion}")
	public AbstractYResource getOrderThresholdFreeGiftPromotionResource(@PathParam("orderthresholdfreegiftpromotion")  final String resourceKey)
	{
		final OrderThresholdFreeGiftPromotionResource  resource  = resourceCtx.getResource(OrderThresholdFreeGiftPromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderThresholdFreeGiftPromotionModel> getOrderThresholdFreeGiftPromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postOrderThresholdFreeGiftPromotion(final OrderThresholdFreeGiftPromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderThresholdFreeGiftPromotionsCollection(final Collection<OrderThresholdFreeGiftPromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
