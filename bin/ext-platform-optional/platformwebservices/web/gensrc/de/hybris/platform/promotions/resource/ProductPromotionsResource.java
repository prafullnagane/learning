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

import de.hybris.platform.promotions.dto.ProductPromotionDTO;
import de.hybris.platform.promotions.dto.ProductPromotionsDTO;
import de.hybris.platform.promotions.model.ProductPromotionModel;
import de.hybris.platform.promotions.resource.ProductPromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductPromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productpromotions")
public class ProductPromotionsResource extends AbstractCollectionResource <Collection<ProductPromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPromotionsResource()
	{
		super("ProductPromotion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductPromotions()
	{
		return createGetResponse().build(ProductPromotionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductPromotionResource} for current root resource 
	 */
	@Path("{productpromotion}")
	public AbstractYResource getProductPromotionResource(@PathParam("productpromotion")  final String resourceKey)
	{
		final ProductPromotionResource  resource  = resourceCtx.getResource(ProductPromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductPromotionModel> getProductPromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postProductPromotion(final ProductPromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductPromotionsCollection(final Collection<ProductPromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
