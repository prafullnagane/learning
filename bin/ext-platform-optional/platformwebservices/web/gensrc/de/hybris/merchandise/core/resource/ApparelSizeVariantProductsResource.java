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
package de.hybris.merchandise.core.resource;

import de.hybris.merchandise.core.dto.ApparelSizeVariantProductsDTO;
import de.hybris.merchandise.core.model.ApparelSizeVariantProductModel;
import de.hybris.merchandise.core.resource.ApparelSizeVariantProductResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ApparelSizeVariantProduct defined at extension merchandisecore Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/apparelsizevariantproducts")
public class ApparelSizeVariantProductsResource extends AbstractCollectionResource <Collection<ApparelSizeVariantProductModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelSizeVariantProductsResource()
	{
		super("ApparelSizeVariantProduct");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllApparelSizeVariantProducts()
	{
		return createGetResponse().build(ApparelSizeVariantProductsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ApparelSizeVariantProductResource} for current root resource 
	 */
	@Path("{apparelsizevariantproduct}")
	public AbstractYResource getApparelSizeVariantProductResource(@PathParam("apparelsizevariantproduct")  final String resourceKey)
	{
		final ApparelSizeVariantProductResource  resource  = resourceCtx.getResource(ApparelSizeVariantProductResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ApparelSizeVariantProductModel> getApparelSizeVariantProductsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setApparelSizeVariantProductsCollection(final Collection<ApparelSizeVariantProductModel> value)
	{
		super.setResourceValue(value);
	}
	
}
