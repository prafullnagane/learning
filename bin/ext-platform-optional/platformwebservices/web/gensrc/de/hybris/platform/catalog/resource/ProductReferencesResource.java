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
package de.hybris.platform.catalog.resource;

import de.hybris.platform.catalog.dto.ProductReferenceDTO;
import de.hybris.platform.catalog.dto.ProductReferencesDTO;
import de.hybris.platform.catalog.model.ProductReferenceModel;
import de.hybris.platform.catalog.resource.ProductReferenceResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductReference defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/productreferences")
public class ProductReferencesResource extends AbstractCollectionResource <Collection<ProductReferenceModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductReferencesResource()
	{
		super("ProductReference");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductReferences()
	{
		return createGetResponse().build(ProductReferencesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductReferenceResource} for current root resource 
	 */
	@Path("{productreference}")
	public AbstractYResource getProductReferenceResource(@PathParam("productreference")  final String resourceKey)
	{
		final ProductReferenceResource  resource  = resourceCtx.getResource(ProductReferenceResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductReferenceModel> getProductReferencesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postProductReference(final ProductReferenceDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductReferencesCollection(final Collection<ProductReferenceModel> value)
	{
		super.setResourceValue(value);
	}
	
}
