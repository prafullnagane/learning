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
package de.hybris.platform.variants.resource;

import de.hybris.platform.variants.dto.VariantProductsDTO;
import de.hybris.platform.variants.model.VariantProductModel;
import de.hybris.platform.variants.resource.VariantProductResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type VariantProduct defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/variantproducts")
public class VariantProductsResource extends AbstractCollectionResource <Collection<VariantProductModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VariantProductsResource()
	{
		super("VariantProduct");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllVariantProducts()
	{
		return createGetResponse().build(VariantProductsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link VariantProductResource} for current root resource 
	 */
	@Path("{variantproduct}")
	public AbstractYResource getVariantProductResource(@PathParam("variantproduct")  final String resourceKey)
	{
		final VariantProductResource  resource  = resourceCtx.getResource(VariantProductResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<VariantProductModel> getVariantProductsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setVariantProductsCollection(final Collection<VariantProductModel> value)
	{
		super.setResourceValue(value);
	}
	
}
