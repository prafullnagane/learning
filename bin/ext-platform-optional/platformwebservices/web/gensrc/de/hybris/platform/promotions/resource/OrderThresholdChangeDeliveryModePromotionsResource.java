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

import de.hybris.platform.promotions.dto.OrderThresholdChangeDeliveryModePromotionDTO;
import de.hybris.platform.promotions.dto.OrderThresholdChangeDeliveryModePromotionsDTO;
import de.hybris.platform.promotions.model.OrderThresholdChangeDeliveryModePromotionModel;
import de.hybris.platform.promotions.resource.OrderThresholdChangeDeliveryModePromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderThresholdChangeDeliveryModePromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderthresholdchangedeliverymodepromotions")
public class OrderThresholdChangeDeliveryModePromotionsResource extends AbstractCollectionResource <Collection<OrderThresholdChangeDeliveryModePromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdChangeDeliveryModePromotionsResource()
	{
		super("OrderThresholdChangeDeliveryModePromotion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderThresholdChangeDeliveryModePromotions()
	{
		return createGetResponse().build(OrderThresholdChangeDeliveryModePromotionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderThresholdChangeDeliveryModePromotionResource} for current root resource 
	 */
	@Path("{orderthresholdchangedeliverymodepromotion}")
	public AbstractYResource getOrderThresholdChangeDeliveryModePromotionResource(@PathParam("orderthresholdchangedeliverymodepromotion")  final String resourceKey)
	{
		final OrderThresholdChangeDeliveryModePromotionResource  resource  = resourceCtx.getResource(OrderThresholdChangeDeliveryModePromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderThresholdChangeDeliveryModePromotionModel> getOrderThresholdChangeDeliveryModePromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postOrderThresholdChangeDeliveryModePromotion(final OrderThresholdChangeDeliveryModePromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderThresholdChangeDeliveryModePromotionsCollection(final Collection<OrderThresholdChangeDeliveryModePromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
