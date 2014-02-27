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

import de.hybris.platform.catalog.dto.CompareCatalogVersionsCronJobDTO;
import de.hybris.platform.catalog.model.CompareCatalogVersionsCronJobModel;
import de.hybris.platform.catalog.resource.CatalogVersionDifferenceResource;
import de.hybris.platform.catalog.resource.CategoryCatalogVersionDifferenceResource;
import de.hybris.platform.catalog.resource.ItemSyncDescriptorResource;
import de.hybris.platform.catalog.resource.ProductCatalogVersionDifferenceResource;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.cronjob.resource.ChangeDescriptorResource;
import de.hybris.platform.cronjob.resource.CompositeEntryResource;
import de.hybris.platform.cronjob.resource.JobLogResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type CompareCatalogVersionsCronJob first defined at extension catalog
 */
@SuppressWarnings("all")
public class CompareCatalogVersionsCronJobResource extends AbstractYResource<CompareCatalogVersionsCronJobModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompareCatalogVersionsCronJobResource()
	{
		super("CompareCatalogVersionsCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteCompareCatalogVersionsCronJob()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogVersionDifferenceResource} for current root resource 
	 */
	@Path("/catalogversiondifferences/{catalogversiondifference}")
	public AbstractYResource getCatalogVersionDifferenceResource(@PathParam("catalogversiondifference")  final String resourceKey)
	{
		final CatalogVersionDifferenceResource  resource  = resourceCtx.getResource(CatalogVersionDifferenceResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CategoryCatalogVersionDifferenceResource} for current root resource 
	 */
	@Path("/categorycatalogversiondifferences/{categorycatalogversiondifference}")
	public AbstractYResource getCategoryCatalogVersionDifferenceResource(@PathParam("categorycatalogversiondifference")  final String resourceKey)
	{
		final CategoryCatalogVersionDifferenceResource  resource  = resourceCtx.getResource(CategoryCatalogVersionDifferenceResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ChangeDescriptorResource} for current root resource 
	 */
	@Path("/changedescriptors/{changedescriptor}")
	public AbstractYResource getChangeDescriptorResource(@PathParam("changedescriptor")  final String resourceKey)
	{
		final ChangeDescriptorResource  resource  = resourceCtx.getResource(ChangeDescriptorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getCompareCatalogVersionsCronJob()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public CompareCatalogVersionsCronJobModel getCompareCatalogVersionsCronJobModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CompositeEntryResource} for current root resource 
	 */
	@Path("/compositeentries/{compositeentry}")
	public AbstractYResource getCompositeEntryResource(@PathParam("compositeentry")  final String resourceKey)
	{
		final CompositeEntryResource  resource  = resourceCtx.getResource(CompositeEntryResource.class);
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
	 *  Generated getter for sub resource of type {@link ItemSyncDescriptorResource} for current root resource 
	 */
	@Path("/itemsyncdescriptors/{itemsyncdescriptor}")
	public AbstractYResource getItemSyncDescriptorResource(@PathParam("itemsyncdescriptor")  final String resourceKey)
	{
		final ItemSyncDescriptorResource  resource  = resourceCtx.getResource(ItemSyncDescriptorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link JobLogResource} for current root resource 
	 */
	@Path("/joblogs/{joblog}")
	public AbstractYResource getJobLogResource(@PathParam("joblog")  final String resourceKey)
	{
		final JobLogResource  resource  = resourceCtx.getResource(JobLogResource.class);
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
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putCompareCatalogVersionsCronJob(final CompareCatalogVersionsCronJobDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link CompareCatalogVersionsCronJobModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected CompareCatalogVersionsCronJobModel readResource(final String resourceId) throws Exception
	{
		CompareCatalogVersionsCronJobModel model = new CompareCatalogVersionsCronJobModel();
		model.setCode(resourceId);
		return (CompareCatalogVersionsCronJobModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(CompareCatalogVersionsCronJobModel)}
	 */
	public void setCompareCatalogVersionsCronJobModel(final CompareCatalogVersionsCronJobModel value)
	{
		super.setResourceValue(value);
	}
	
}
