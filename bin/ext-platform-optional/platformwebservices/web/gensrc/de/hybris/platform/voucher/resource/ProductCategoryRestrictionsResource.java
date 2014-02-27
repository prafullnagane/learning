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
package de.hybris.platform.voucher.resource;

import de.hybris.platform.voucher.dto.ProductCategoryRestrictionDTO;
import de.hybris.platform.voucher.dto.ProductCategoryRestrictionsDTO;
import de.hybris.platform.voucher.model.ProductCategoryRestrictionModel;
import de.hybris.platform.voucher.resource.ProductCategoryRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductCategoryRestriction defined at extension voucher Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productcategoryrestrictions")
public class ProductCategoryRestrictionsResource extends AbstractCollectionResource <Collection<ProductCategoryRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductCategoryRestrictionsResource()
	{
		super("ProductCategoryRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductCategoryRestrictions()
	{
		return createGetResponse().build(ProductCategoryRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductCategoryRestrictionResource} for current root resource 
	 */
	@Path("{productcategoryrestriction}")
	public AbstractYResource getProductCategoryRestrictionResource(@PathParam("productcategoryrestriction")  final String resourceKey)
	{
		final ProductCategoryRestrictionResource  resource  = resourceCtx.getResource(ProductCategoryRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductCategoryRestrictionModel> getProductCategoryRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postProductCategoryRestriction(final ProductCategoryRestrictionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductCategoryRestrictionsCollection(final Collection<ProductCategoryRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
