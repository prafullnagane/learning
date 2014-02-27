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

import de.hybris.platform.cms2lib.dto.components.ProductListComponentsDTO;
import de.hybris.platform.cms2lib.model.components.ProductListComponentModel;
import de.hybris.platform.cms2lib.resource.components.ProductListComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductListComponent defined at extension cms2lib Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productlistcomponents")
public class ProductListComponentsResource extends AbstractCollectionResource <Collection<ProductListComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductListComponentsResource()
	{
		super("ProductListComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductListComponents()
	{
		return createGetResponse().build(ProductListComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductListComponentResource} for current root resource 
	 */
	@Path("{productlistcomponent}")
	public AbstractYResource getProductListComponentResource(@PathParam("productlistcomponent")  final String resourceKey)
	{
		final ProductListComponentResource  resource  = resourceCtx.getResource(ProductListComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductListComponentModel> getProductListComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductListComponentsCollection(final Collection<ProductListComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
