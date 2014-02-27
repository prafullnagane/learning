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

import de.hybris.platform.promotions.dto.PromotionOrderAdjustTotalActionDTO;
import de.hybris.platform.promotions.dto.PromotionOrderAdjustTotalActionsDTO;
import de.hybris.platform.promotions.model.PromotionOrderAdjustTotalActionModel;
import de.hybris.platform.promotions.resource.PromotionOrderAdjustTotalActionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PromotionOrderAdjustTotalAction defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/promotionorderadjusttotalactions")
public class PromotionOrderAdjustTotalActionsResource extends AbstractCollectionResource <Collection<PromotionOrderAdjustTotalActionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderAdjustTotalActionsResource()
	{
		super("PromotionOrderAdjustTotalAction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPromotionOrderAdjustTotalActions()
	{
		return createGetResponse().build(PromotionOrderAdjustTotalActionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionOrderAdjustTotalActionResource} for current root resource 
	 */
	@Path("{promotionorderadjusttotalaction}")
	public AbstractYResource getPromotionOrderAdjustTotalActionResource(@PathParam("promotionorderadjusttotalaction")  final String resourceKey)
	{
		final PromotionOrderAdjustTotalActionResource  resource  = resourceCtx.getResource(PromotionOrderAdjustTotalActionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PromotionOrderAdjustTotalActionModel> getPromotionOrderAdjustTotalActionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postPromotionOrderAdjustTotalAction(final PromotionOrderAdjustTotalActionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPromotionOrderAdjustTotalActionsCollection(final Collection<PromotionOrderAdjustTotalActionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
