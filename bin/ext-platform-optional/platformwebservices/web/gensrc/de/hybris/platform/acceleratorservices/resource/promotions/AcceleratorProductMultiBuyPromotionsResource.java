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
package de.hybris.platform.acceleratorservices.resource.promotions;

import de.hybris.platform.acceleratorservices.dto.promotions.AcceleratorProductMultiBuyPromotionDTO;
import de.hybris.platform.acceleratorservices.dto.promotions.AcceleratorProductMultiBuyPromotionsDTO;
import de.hybris.platform.acceleratorservices.model.promotions.AcceleratorProductMultiBuyPromotionModel;
import de.hybris.platform.acceleratorservices.resource.promotions.AcceleratorProductMultiBuyPromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AcceleratorProductMultiBuyPromotion defined at extension acceleratorservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/acceleratorproductmultibuypromotions")
public class AcceleratorProductMultiBuyPromotionsResource extends AbstractCollectionResource <Collection<AcceleratorProductMultiBuyPromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AcceleratorProductMultiBuyPromotionsResource()
	{
		super("AcceleratorProductMultiBuyPromotion");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AcceleratorProductMultiBuyPromotionResource} for current root resource 
	 */
	@Path("{acceleratorproductmultibuypromotion}")
	public AbstractYResource getAcceleratorProductMultiBuyPromotionResource(@PathParam("acceleratorproductmultibuypromotion")  final String resourceKey)
	{
		final AcceleratorProductMultiBuyPromotionResource  resource  = resourceCtx.getResource(AcceleratorProductMultiBuyPromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AcceleratorProductMultiBuyPromotionModel> getAcceleratorProductMultiBuyPromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAcceleratorProductMultiBuyPromotions()
	{
		return createGetResponse().build(AcceleratorProductMultiBuyPromotionsDTO.class);
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postAcceleratorProductMultiBuyPromotion(final AcceleratorProductMultiBuyPromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAcceleratorProductMultiBuyPromotionsCollection(final Collection<AcceleratorProductMultiBuyPromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
