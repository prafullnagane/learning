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
package de.hybris.platform.acceleratorcms.resource.components;

import de.hybris.platform.acceleratorcms.dto.components.ProductFeatureComponentsDTO;
import de.hybris.platform.acceleratorcms.model.components.ProductFeatureComponentModel;
import de.hybris.platform.acceleratorcms.resource.components.ProductFeatureComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductFeatureComponent defined at extension acceleratorcms Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productfeaturecomponents")
public class ProductFeatureComponentsResource extends AbstractCollectionResource <Collection<ProductFeatureComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductFeatureComponentsResource()
	{
		super("ProductFeatureComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductFeatureComponents()
	{
		return createGetResponse().build(ProductFeatureComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductFeatureComponentResource} for current root resource 
	 */
	@Path("{productfeaturecomponent}")
	public AbstractYResource getProductFeatureComponentResource(@PathParam("productfeaturecomponent")  final String resourceKey)
	{
		final ProductFeatureComponentResource  resource  = resourceCtx.getResource(ProductFeatureComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductFeatureComponentModel> getProductFeatureComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductFeatureComponentsCollection(final Collection<ProductFeatureComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
