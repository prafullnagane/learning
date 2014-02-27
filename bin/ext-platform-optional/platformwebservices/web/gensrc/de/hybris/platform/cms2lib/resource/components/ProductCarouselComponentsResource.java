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

import de.hybris.platform.cms2lib.dto.components.ProductCarouselComponentsDTO;
import de.hybris.platform.cms2lib.model.components.ProductCarouselComponentModel;
import de.hybris.platform.cms2lib.resource.components.ProductCarouselComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductCarouselComponent defined at extension cms2lib Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productcarouselcomponents")
public class ProductCarouselComponentsResource extends AbstractCollectionResource <Collection<ProductCarouselComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductCarouselComponentsResource()
	{
		super("ProductCarouselComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductCarouselComponents()
	{
		return createGetResponse().build(ProductCarouselComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductCarouselComponentResource} for current root resource 
	 */
	@Path("{productcarouselcomponent}")
	public AbstractYResource getProductCarouselComponentResource(@PathParam("productcarouselcomponent")  final String resourceKey)
	{
		final ProductCarouselComponentResource  resource  = resourceCtx.getResource(ProductCarouselComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductCarouselComponentModel> getProductCarouselComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductCarouselComponentsCollection(final Collection<ProductCarouselComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
