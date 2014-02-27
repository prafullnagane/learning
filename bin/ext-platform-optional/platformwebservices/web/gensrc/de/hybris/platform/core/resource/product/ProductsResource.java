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
package de.hybris.platform.core.resource.product;

import de.hybris.platform.core.dto.product.ProductsDTO;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.resource.product.ProductResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Product defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/products")
public class ProductsResource extends AbstractCollectionResource <Collection<ProductModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductsResource()
	{
		super("Product");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProducts()
	{
		return createGetResponse().build(ProductsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductResource} for current root resource 
	 */
	@Path("{product}")
	public AbstractYResource getProductResource(@PathParam("product")  final String resourceKey)
	{
		final ProductResource  resource  = resourceCtx.getResource(ProductResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductModel> getProductsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductsCollection(final Collection<ProductModel> value)
	{
		super.setResourceValue(value);
	}
	
}
