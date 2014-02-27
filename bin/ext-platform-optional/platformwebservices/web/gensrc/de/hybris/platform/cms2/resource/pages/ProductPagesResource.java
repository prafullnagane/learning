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
package de.hybris.platform.cms2.resource.pages;

import de.hybris.platform.cms2.dto.pages.ProductPagesDTO;
import de.hybris.platform.cms2.model.pages.ProductPageModel;
import de.hybris.platform.cms2.resource.pages.ProductPageResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductPage defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productpages")
public class ProductPagesResource extends AbstractCollectionResource <Collection<ProductPageModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPagesResource()
	{
		super("ProductPage");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductPages()
	{
		return createGetResponse().build(ProductPagesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductPageResource} for current root resource 
	 */
	@Path("{productpage}")
	public AbstractYResource getProductPageResource(@PathParam("productpage")  final String resourceKey)
	{
		final ProductPageResource  resource  = resourceCtx.getResource(ProductPageResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductPageModel> getProductPagesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductPagesCollection(final Collection<ProductPageModel> value)
	{
		super.setResourceValue(value);
	}
	
}
