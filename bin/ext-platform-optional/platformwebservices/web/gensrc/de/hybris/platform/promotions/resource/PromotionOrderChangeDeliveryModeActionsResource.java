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

import de.hybris.platform.promotions.dto.PromotionOrderChangeDeliveryModeActionDTO;
import de.hybris.platform.promotions.dto.PromotionOrderChangeDeliveryModeActionsDTO;
import de.hybris.platform.promotions.model.PromotionOrderChangeDeliveryModeActionModel;
import de.hybris.platform.promotions.resource.PromotionOrderChangeDeliveryModeActionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PromotionOrderChangeDeliveryModeAction defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/promotionorderchangedeliverymodeactions")
public class PromotionOrderChangeDeliveryModeActionsResource extends AbstractCollectionResource <Collection<PromotionOrderChangeDeliveryModeActionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderChangeDeliveryModeActionsResource()
	{
		super("PromotionOrderChangeDeliveryModeAction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPromotionOrderChangeDeliveryModeActions()
	{
		return createGetResponse().build(PromotionOrderChangeDeliveryModeActionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionOrderChangeDeliveryModeActionResource} for current root resource 
	 */
	@Path("{promotionorderchangedeliverymodeaction}")
	public AbstractYResource getPromotionOrderChangeDeliveryModeActionResource(@PathParam("promotionorderchangedeliverymodeaction")  final String resourceKey)
	{
		final PromotionOrderChangeDeliveryModeActionResource  resource  = resourceCtx.getResource(PromotionOrderChangeDeliveryModeActionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PromotionOrderChangeDeliveryModeActionModel> getPromotionOrderChangeDeliveryModeActionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postPromotionOrderChangeDeliveryModeAction(final PromotionOrderChangeDeliveryModeActionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPromotionOrderChangeDeliveryModeActionsCollection(final Collection<PromotionOrderChangeDeliveryModeActionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
