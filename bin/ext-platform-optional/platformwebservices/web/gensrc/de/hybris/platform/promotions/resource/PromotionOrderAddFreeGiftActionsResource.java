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

import de.hybris.platform.promotions.dto.PromotionOrderAddFreeGiftActionDTO;
import de.hybris.platform.promotions.dto.PromotionOrderAddFreeGiftActionsDTO;
import de.hybris.platform.promotions.model.PromotionOrderAddFreeGiftActionModel;
import de.hybris.platform.promotions.resource.PromotionOrderAddFreeGiftActionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PromotionOrderAddFreeGiftAction defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/promotionorderaddfreegiftactions")
public class PromotionOrderAddFreeGiftActionsResource extends AbstractCollectionResource <Collection<PromotionOrderAddFreeGiftActionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderAddFreeGiftActionsResource()
	{
		super("PromotionOrderAddFreeGiftAction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPromotionOrderAddFreeGiftActions()
	{
		return createGetResponse().build(PromotionOrderAddFreeGiftActionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionOrderAddFreeGiftActionResource} for current root resource 
	 */
	@Path("{promotionorderaddfreegiftaction}")
	public AbstractYResource getPromotionOrderAddFreeGiftActionResource(@PathParam("promotionorderaddfreegiftaction")  final String resourceKey)
	{
		final PromotionOrderAddFreeGiftActionResource  resource  = resourceCtx.getResource(PromotionOrderAddFreeGiftActionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PromotionOrderAddFreeGiftActionModel> getPromotionOrderAddFreeGiftActionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postPromotionOrderAddFreeGiftAction(final PromotionOrderAddFreeGiftActionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPromotionOrderAddFreeGiftActionsCollection(final Collection<PromotionOrderAddFreeGiftActionModel> value)
	{
		super.setResourceValue(value);
	}
	
}