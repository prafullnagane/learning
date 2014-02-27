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

import de.hybris.platform.promotions.dto.ProductBundlePromotionDTO;
import de.hybris.platform.promotions.dto.ProductBundlePromotionsDTO;
import de.hybris.platform.promotions.model.ProductBundlePromotionModel;
import de.hybris.platform.promotions.resource.ProductBundlePromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductBundlePromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productbundlepromotions")
public class ProductBundlePromotionsResource extends AbstractCollectionResource <Collection<ProductBundlePromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductBundlePromotionsResource()
	{
		super("ProductBundlePromotion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductBundlePromotions()
	{
		return createGetResponse().build(ProductBundlePromotionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductBundlePromotionResource} for current root resource 
	 */
	@Path("{productbundlepromotion}")
	public AbstractYResource getProductBundlePromotionResource(@PathParam("productbundlepromotion")  final String resourceKey)
	{
		final ProductBundlePromotionResource  resource  = resourceCtx.getResource(ProductBundlePromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductBundlePromotionModel> getProductBundlePromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postProductBundlePromotion(final ProductBundlePromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductBundlePromotionsCollection(final Collection<ProductBundlePromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
