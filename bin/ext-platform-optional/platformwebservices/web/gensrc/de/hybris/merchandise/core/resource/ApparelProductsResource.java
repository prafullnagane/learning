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

import de.hybris.merchandise.core.dto.ApparelProductsDTO;
import de.hybris.merchandise.core.model.ApparelProductModel;
import de.hybris.merchandise.core.resource.ApparelProductResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ApparelProduct defined at extension merchandisecore Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/apparelproducts")
public class ApparelProductsResource extends AbstractCollectionResource <Collection<ApparelProductModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelProductsResource()
	{
		super("ApparelProduct");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllApparelProducts()
	{
		return createGetResponse().build(ApparelProductsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ApparelProductResource} for current root resource 
	 */
	@Path("{apparelproduct}")
	public AbstractYResource getApparelProductResource(@PathParam("apparelproduct")  final String resourceKey)
	{
		final ApparelProductResource  resource  = resourceCtx.getResource(ApparelProductResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ApparelProductModel> getApparelProductsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setApparelProductsCollection(final Collection<ApparelProductModel> value)
	{
		super.setResourceValue(value);
	}
	
}
