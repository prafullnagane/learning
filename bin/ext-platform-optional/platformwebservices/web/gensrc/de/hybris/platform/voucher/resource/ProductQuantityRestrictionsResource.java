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

import de.hybris.platform.voucher.dto.ProductQuantityRestrictionDTO;
import de.hybris.platform.voucher.dto.ProductQuantityRestrictionsDTO;
import de.hybris.platform.voucher.model.ProductQuantityRestrictionModel;
import de.hybris.platform.voucher.resource.ProductQuantityRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductQuantityRestriction defined at extension voucher Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productquantityrestrictions")
public class ProductQuantityRestrictionsResource extends AbstractCollectionResource <Collection<ProductQuantityRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductQuantityRestrictionsResource()
	{
		super("ProductQuantityRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductQuantityRestrictions()
	{
		return createGetResponse().build(ProductQuantityRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductQuantityRestrictionResource} for current root resource 
	 */
	@Path("{productquantityrestriction}")
	public AbstractYResource getProductQuantityRestrictionResource(@PathParam("productquantityrestriction")  final String resourceKey)
	{
		final ProductQuantityRestrictionResource  resource  = resourceCtx.getResource(ProductQuantityRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductQuantityRestrictionModel> getProductQuantityRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postProductQuantityRestriction(final ProductQuantityRestrictionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductQuantityRestrictionsCollection(final Collection<ProductQuantityRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
