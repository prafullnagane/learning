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

import de.hybris.merchandise.core.dto.ApparelProductDTO;
import de.hybris.merchandise.core.model.ApparelProductModel;
import de.hybris.platform.catalog.resource.ProductCatalogVersionDifferenceResource;
import de.hybris.platform.catalog.resource.ProductFeatureResource;
import de.hybris.platform.catalog.resource.ProductReferenceResource;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.customerreview.resource.CustomerReviewResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type ApparelProduct first defined at extension merchandisecore
 */
@SuppressWarnings("all")
public class ApparelProductResource extends AbstractYResource<ApparelProductModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelProductResource()
	{
		super("ApparelProduct");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteApparelProduct()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getApparelProduct()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public ApparelProductModel getApparelProductModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CustomerReviewResource} for current root resource 
	 */
	@Path("/customerreviews/{customerreview}")
	public AbstractYResource getCustomerReviewResource(@PathParam("customerreview")  final String resourceKey)
	{
		final CustomerReviewResource  resource  = resourceCtx.getResource(CustomerReviewResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HMCHistoryEntryResource} for current root resource 
	 */
	@Path("/hmchistoryentries/{hmchistoryentry}")
	public AbstractYResource getHMCHistoryEntryResource(@PathParam("hmchistoryentry")  final String resourceKey)
	{
		final HMCHistoryEntryResource  resource  = resourceCtx.getResource(HMCHistoryEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LinkResource} for current root resource 
	 */
	@Path("/links/{link}")
	public AbstractYResource getLinkResource(@PathParam("link")  final String resourceKey)
	{
		final LinkResource  resource  = resourceCtx.getResource(LinkResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductCatalogVersionDifferenceResource} for current root resource 
	 */
	@Path("/productcatalogversiondifferences/{productcatalogversiondifference}")
	public AbstractYResource getProductCatalogVersionDifferenceResource(@PathParam("productcatalogversiondifference")  final String resourceKey)
	{
		final ProductCatalogVersionDifferenceResource  resource  = resourceCtx.getResource(ProductCatalogVersionDifferenceResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductFeatureResource} for current root resource 
	 */
	@Path("/productfeatures/{productfeature}")
	public AbstractYResource getProductFeatureResource(@PathParam("productfeature")  final String resourceKey)
	{
		final ProductFeatureResource  resource  = resourceCtx.getResource(ProductFeatureResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductReferenceResource} for current root resource 
	 */
	@Path("/productreferences/{productreference}")
	public AbstractYResource getProductReferenceResource(@PathParam("productreference")  final String resourceKey)
	{
		final ProductReferenceResource  resource  = resourceCtx.getResource(ProductReferenceResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putApparelProduct(final ApparelProductDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link ApparelProductModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected ApparelProductModel readResource(final String resourceId) throws Exception
	{
		ApparelProductModel model = new ApparelProductModel();
		model.setCode(resourceId);
		return (ApparelProductModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(ApparelProductModel)}
	 */
	public void setApparelProductModel(final ApparelProductModel value)
	{
		super.setResourceValue(value);
	}
	
}
