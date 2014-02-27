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

import de.hybris.platform.promotions.dto.ProductBOGOFPromotionDTO;
import de.hybris.platform.promotions.dto.ProductBOGOFPromotionsDTO;
import de.hybris.platform.promotions.model.ProductBOGOFPromotionModel;
import de.hybris.platform.promotions.resource.ProductBOGOFPromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductBOGOFPromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productbogofpromotions")
public class ProductBOGOFPromotionsResource extends AbstractCollectionResource <Collection<ProductBOGOFPromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductBOGOFPromotionsResource()
	{
		super("ProductBOGOFPromotion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductBOGOFPromotions()
	{
		return createGetResponse().build(ProductBOGOFPromotionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductBOGOFPromotionResource} for current root resource 
	 */
	@Path("{productbogofpromotion}")
	public AbstractYResource getProductBOGOFPromotionResource(@PathParam("productbogofpromotion")  final String resourceKey)
	{
		final ProductBOGOFPromotionResource  resource  = resourceCtx.getResource(ProductBOGOFPromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductBOGOFPromotionModel> getProductBOGOFPromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postProductBOGOFPromotion(final ProductBOGOFPromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductBOGOFPromotionsCollection(final Collection<ProductBOGOFPromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
