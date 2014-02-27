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

import de.hybris.platform.promotions.dto.ProductPerfectPartnerBundlePromotionDTO;
import de.hybris.platform.promotions.dto.ProductPerfectPartnerBundlePromotionsDTO;
import de.hybris.platform.promotions.model.ProductPerfectPartnerBundlePromotionModel;
import de.hybris.platform.promotions.resource.ProductPerfectPartnerBundlePromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductPerfectPartnerBundlePromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productperfectpartnerbundlepromotions")
public class ProductPerfectPartnerBundlePromotionsResource extends AbstractCollectionResource <Collection<ProductPerfectPartnerBundlePromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPerfectPartnerBundlePromotionsResource()
	{
		super("ProductPerfectPartnerBundlePromotion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductPerfectPartnerBundlePromotions()
	{
		return createGetResponse().build(ProductPerfectPartnerBundlePromotionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductPerfectPartnerBundlePromotionResource} for current root resource 
	 */
	@Path("{productperfectpartnerbundlepromotion}")
	public AbstractYResource getProductPerfectPartnerBundlePromotionResource(@PathParam("productperfectpartnerbundlepromotion")  final String resourceKey)
	{
		final ProductPerfectPartnerBundlePromotionResource  resource  = resourceCtx.getResource(ProductPerfectPartnerBundlePromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductPerfectPartnerBundlePromotionModel> getProductPerfectPartnerBundlePromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postProductPerfectPartnerBundlePromotion(final ProductPerfectPartnerBundlePromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductPerfectPartnerBundlePromotionsCollection(final Collection<ProductPerfectPartnerBundlePromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
