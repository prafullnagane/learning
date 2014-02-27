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

import de.hybris.platform.promotions.dto.OrderThresholdDiscountPromotionDTO;
import de.hybris.platform.promotions.dto.OrderThresholdDiscountPromotionsDTO;
import de.hybris.platform.promotions.model.OrderThresholdDiscountPromotionModel;
import de.hybris.platform.promotions.resource.OrderThresholdDiscountPromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderThresholdDiscountPromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderthresholddiscountpromotions")
public class OrderThresholdDiscountPromotionsResource extends AbstractCollectionResource <Collection<OrderThresholdDiscountPromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdDiscountPromotionsResource()
	{
		super("OrderThresholdDiscountPromotion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderThresholdDiscountPromotions()
	{
		return createGetResponse().build(OrderThresholdDiscountPromotionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderThresholdDiscountPromotionResource} for current root resource 
	 */
	@Path("{orderthresholddiscountpromotion}")
	public AbstractYResource getOrderThresholdDiscountPromotionResource(@PathParam("orderthresholddiscountpromotion")  final String resourceKey)
	{
		final OrderThresholdDiscountPromotionResource  resource  = resourceCtx.getResource(OrderThresholdDiscountPromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderThresholdDiscountPromotionModel> getOrderThresholdDiscountPromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postOrderThresholdDiscountPromotion(final OrderThresholdDiscountPromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderThresholdDiscountPromotionsCollection(final Collection<OrderThresholdDiscountPromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
