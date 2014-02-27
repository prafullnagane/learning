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

import de.hybris.platform.promotions.dto.OrderThresholdPerfectPartnerPromotionDTO;
import de.hybris.platform.promotions.dto.OrderThresholdPerfectPartnerPromotionsDTO;
import de.hybris.platform.promotions.model.OrderThresholdPerfectPartnerPromotionModel;
import de.hybris.platform.promotions.resource.OrderThresholdPerfectPartnerPromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OrderThresholdPerfectPartnerPromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/orderthresholdperfectpartnerpromotions")
public class OrderThresholdPerfectPartnerPromotionsResource extends AbstractCollectionResource <Collection<OrderThresholdPerfectPartnerPromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdPerfectPartnerPromotionsResource()
	{
		super("OrderThresholdPerfectPartnerPromotion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOrderThresholdPerfectPartnerPromotions()
	{
		return createGetResponse().build(OrderThresholdPerfectPartnerPromotionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderThresholdPerfectPartnerPromotionResource} for current root resource 
	 */
	@Path("{orderthresholdperfectpartnerpromotion}")
	public AbstractYResource getOrderThresholdPerfectPartnerPromotionResource(@PathParam("orderthresholdperfectpartnerpromotion")  final String resourceKey)
	{
		final OrderThresholdPerfectPartnerPromotionResource  resource  = resourceCtx.getResource(OrderThresholdPerfectPartnerPromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OrderThresholdPerfectPartnerPromotionModel> getOrderThresholdPerfectPartnerPromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postOrderThresholdPerfectPartnerPromotion(final OrderThresholdPerfectPartnerPromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOrderThresholdPerfectPartnerPromotionsCollection(final Collection<OrderThresholdPerfectPartnerPromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
