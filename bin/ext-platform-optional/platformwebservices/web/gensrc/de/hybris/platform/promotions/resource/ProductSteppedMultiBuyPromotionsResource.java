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

import de.hybris.platform.promotions.dto.ProductSteppedMultiBuyPromotionDTO;
import de.hybris.platform.promotions.dto.ProductSteppedMultiBuyPromotionsDTO;
import de.hybris.platform.promotions.model.ProductSteppedMultiBuyPromotionModel;
import de.hybris.platform.promotions.resource.ProductSteppedMultiBuyPromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductSteppedMultiBuyPromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productsteppedmultibuypromotions")
public class ProductSteppedMultiBuyPromotionsResource extends AbstractCollectionResource <Collection<ProductSteppedMultiBuyPromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductSteppedMultiBuyPromotionsResource()
	{
		super("ProductSteppedMultiBuyPromotion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductSteppedMultiBuyPromotions()
	{
		return createGetResponse().build(ProductSteppedMultiBuyPromotionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductSteppedMultiBuyPromotionResource} for current root resource 
	 */
	@Path("{productsteppedmultibuypromotion}")
	public AbstractYResource getProductSteppedMultiBuyPromotionResource(@PathParam("productsteppedmultibuypromotion")  final String resourceKey)
	{
		final ProductSteppedMultiBuyPromotionResource  resource  = resourceCtx.getResource(ProductSteppedMultiBuyPromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductSteppedMultiBuyPromotionModel> getProductSteppedMultiBuyPromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postProductSteppedMultiBuyPromotion(final ProductSteppedMultiBuyPromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductSteppedMultiBuyPromotionsCollection(final Collection<ProductSteppedMultiBuyPromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
