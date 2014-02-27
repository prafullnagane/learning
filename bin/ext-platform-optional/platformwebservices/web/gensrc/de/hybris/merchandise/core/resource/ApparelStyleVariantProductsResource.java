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

import de.hybris.merchandise.core.dto.ApparelStyleVariantProductsDTO;
import de.hybris.merchandise.core.model.ApparelStyleVariantProductModel;
import de.hybris.merchandise.core.resource.ApparelStyleVariantProductResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ApparelStyleVariantProduct defined at extension merchandisecore Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/apparelstylevariantproducts")
public class ApparelStyleVariantProductsResource extends AbstractCollectionResource <Collection<ApparelStyleVariantProductModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelStyleVariantProductsResource()
	{
		super("ApparelStyleVariantProduct");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllApparelStyleVariantProducts()
	{
		return createGetResponse().build(ApparelStyleVariantProductsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ApparelStyleVariantProductResource} for current root resource 
	 */
	@Path("{apparelstylevariantproduct}")
	public AbstractYResource getApparelStyleVariantProductResource(@PathParam("apparelstylevariantproduct")  final String resourceKey)
	{
		final ApparelStyleVariantProductResource  resource  = resourceCtx.getResource(ApparelStyleVariantProductResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ApparelStyleVariantProductModel> getApparelStyleVariantProductsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setApparelStyleVariantProductsCollection(final Collection<ApparelStyleVariantProductModel> value)
	{
		super.setResourceValue(value);
	}
	
}
