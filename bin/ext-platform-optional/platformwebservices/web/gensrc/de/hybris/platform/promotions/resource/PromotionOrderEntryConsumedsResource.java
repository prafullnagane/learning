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

import de.hybris.platform.promotions.dto.PromotionOrderEntryConsumedDTO;
import de.hybris.platform.promotions.dto.PromotionOrderEntryConsumedsDTO;
import de.hybris.platform.promotions.model.PromotionOrderEntryConsumedModel;
import de.hybris.platform.promotions.resource.PromotionOrderEntryConsumedResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PromotionOrderEntryConsumed defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/promotionorderentryconsumeds")
public class PromotionOrderEntryConsumedsResource extends AbstractCollectionResource <Collection<PromotionOrderEntryConsumedModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderEntryConsumedsResource()
	{
		super("PromotionOrderEntryConsumed");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPromotionOrderEntryConsumeds()
	{
		return createGetResponse().build(PromotionOrderEntryConsumedsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionOrderEntryConsumedResource} for current root resource 
	 */
	@Path("{promotionorderentryconsumed}")
	public AbstractYResource getPromotionOrderEntryConsumedResource(@PathParam("promotionorderentryconsumed")  final String resourceKey)
	{
		final PromotionOrderEntryConsumedResource  resource  = resourceCtx.getResource(PromotionOrderEntryConsumedResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PromotionOrderEntryConsumedModel> getPromotionOrderEntryConsumedsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postPromotionOrderEntryConsumed(final PromotionOrderEntryConsumedDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPromotionOrderEntryConsumedsCollection(final Collection<PromotionOrderEntryConsumedModel> value)
	{
		super.setResourceValue(value);
	}
	
}
