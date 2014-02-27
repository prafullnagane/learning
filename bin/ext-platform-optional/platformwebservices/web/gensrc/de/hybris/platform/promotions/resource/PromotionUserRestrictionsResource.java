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

import de.hybris.platform.promotions.dto.PromotionUserRestrictionDTO;
import de.hybris.platform.promotions.dto.PromotionUserRestrictionsDTO;
import de.hybris.platform.promotions.model.PromotionUserRestrictionModel;
import de.hybris.platform.promotions.resource.PromotionUserRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PromotionUserRestriction defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/promotionuserrestrictions")
public class PromotionUserRestrictionsResource extends AbstractCollectionResource <Collection<PromotionUserRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionUserRestrictionsResource()
	{
		super("PromotionUserRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPromotionUserRestrictions()
	{
		return createGetResponse().build(PromotionUserRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionUserRestrictionResource} for current root resource 
	 */
	@Path("{promotionuserrestriction}")
	public AbstractYResource getPromotionUserRestrictionResource(@PathParam("promotionuserrestriction")  final String resourceKey)
	{
		final PromotionUserRestrictionResource  resource  = resourceCtx.getResource(PromotionUserRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PromotionUserRestrictionModel> getPromotionUserRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postPromotionUserRestriction(final PromotionUserRestrictionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPromotionUserRestrictionsCollection(final Collection<PromotionUserRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
