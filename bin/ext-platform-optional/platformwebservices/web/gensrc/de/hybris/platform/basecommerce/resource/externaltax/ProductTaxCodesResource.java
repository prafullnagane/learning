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
package de.hybris.platform.basecommerce.resource.externaltax;

import de.hybris.platform.basecommerce.dto.externaltax.ProductTaxCodesDTO;
import de.hybris.platform.basecommerce.model.externaltax.ProductTaxCodeModel;
import de.hybris.platform.basecommerce.resource.externaltax.ProductTaxCodeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProductTaxCode defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/producttaxcodes")
public class ProductTaxCodesResource extends AbstractCollectionResource <Collection<ProductTaxCodeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductTaxCodesResource()
	{
		super("ProductTaxCode");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProductTaxCodes()
	{
		return createGetResponse().build(ProductTaxCodesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductTaxCodeResource} for current root resource 
	 */
	@Path("{producttaxcode}")
	public AbstractYResource getProductTaxCodeResource(@PathParam("producttaxcode")  final String resourceKey)
	{
		final ProductTaxCodeResource  resource  = resourceCtx.getResource(ProductTaxCodeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProductTaxCodeModel> getProductTaxCodesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProductTaxCodesCollection(final Collection<ProductTaxCodeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
