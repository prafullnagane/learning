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
package de.hybris.platform.cms2lib.resource.components;

import de.hybris.platform.cms2lib.dto.components.ProductDetailComponentsDTO;
import de.hybris.platform.cms2lib.model.components.ProductDetailComponentModel;
import de.hybris.platform.cms2lib.resource.components.ProductDetailComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductDetailComponent defined at extension cms2lib Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productdetailcomponents")
public class ProductDetailComponentsResource extends AbstractCollectionResource <Collection<ProductDetailComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductDetailComponentsResource()
	{
		super("ProductDetailComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductDetailComponents()
	{
		return createGetResponse().build(ProductDetailComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductDetailComponentResource} for current root resource 
	 */
	@Path("{productdetailcomponent}")
	public AbstractYResource getProductDetailComponentResource(@PathParam("productdetailcomponent")  final String resourceKey)
	{
		final ProductDetailComponentResource  resource  = resourceCtx.getResource(ProductDetailComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductDetailComponentModel> getProductDetailComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductDetailComponentsCollection(final Collection<ProductDetailComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}