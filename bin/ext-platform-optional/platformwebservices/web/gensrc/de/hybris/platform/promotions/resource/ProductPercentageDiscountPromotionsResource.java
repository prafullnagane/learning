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

import de.hybris.platform.promotions.dto.ProductPercentageDiscountPromotionDTO;
import de.hybris.platform.promotions.dto.ProductPercentageDiscountPromotionsDTO;
import de.hybris.platform.promotions.model.ProductPercentageDiscountPromotionModel;
import de.hybris.platform.promotions.resource.ProductPercentageDiscountPromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductPercentageDiscountPromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productpercentagediscountpromotions")
public class ProductPercentageDiscountPromotionsResource extends AbstractCollectionResource <Collection<ProductPercentageDiscountPromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPercentageDiscountPromotionsResource()
	{
		super("ProductPercentageDiscountPromotion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductPercentageDiscountPromotions()
	{
		return createGetResponse().build(ProductPercentageDiscountPromotionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductPercentageDiscountPromotionResource} for current root resource 
	 */
	@Path("{productpercentagediscountpromotion}")
	public AbstractYResource getProductPercentageDiscountPromotionResource(@PathParam("productpercentagediscountpromotion")  final String resourceKey)
	{
		final ProductPercentageDiscountPromotionResource  resource  = resourceCtx.getResource(ProductPercentageDiscountPromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductPercentageDiscountPromotionModel> getProductPercentageDiscountPromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postProductPercentageDiscountPromotion(final ProductPercentageDiscountPromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductPercentageDiscountPromotionsCollection(final Collection<ProductPercentageDiscountPromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
