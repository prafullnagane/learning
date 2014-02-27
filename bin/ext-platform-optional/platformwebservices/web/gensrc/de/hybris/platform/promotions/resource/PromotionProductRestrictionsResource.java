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

import de.hybris.platform.promotions.dto.PromotionProductRestrictionDTO;
import de.hybris.platform.promotions.dto.PromotionProductRestrictionsDTO;
import de.hybris.platform.promotions.model.PromotionProductRestrictionModel;
import de.hybris.platform.promotions.resource.PromotionProductRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PromotionProductRestriction defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/promotionproductrestrictions")
public class PromotionProductRestrictionsResource extends AbstractCollectionResource <Collection<PromotionProductRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionProductRestrictionsResource()
	{
		super("PromotionProductRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPromotionProductRestrictions()
	{
		return createGetResponse().build(PromotionProductRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionProductRestrictionResource} for current root resource 
	 */
	@Path("{promotionproductrestriction}")
	public AbstractYResource getPromotionProductRestrictionResource(@PathParam("promotionproductrestriction")  final String resourceKey)
	{
		final PromotionProductRestrictionResource  resource  = resourceCtx.getResource(PromotionProductRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PromotionProductRestrictionModel> getPromotionProductRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postPromotionProductRestriction(final PromotionProductRestrictionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPromotionProductRestrictionsCollection(final Collection<PromotionProductRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
