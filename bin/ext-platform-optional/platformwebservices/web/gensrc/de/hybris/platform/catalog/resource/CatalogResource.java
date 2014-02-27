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

import de.hybris.platform.catalog.dto.CatalogDTO;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.resource.CatalogVersionResource;
import de.hybris.platform.catalog.resource.RemoveCatalogVersionCronJobResource;
import de.hybris.platform.catalog.resource.classification.ClassificationSystemVersionResource;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type Catalog first defined at extension catalog
 */
@SuppressWarnings("all")
public class CatalogResource extends AbstractYResource<CatalogModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogResource()
	{
		super("Catalog");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteCatalog()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getCatalog()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public CatalogModel getCatalogModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogVersionResource} for current root resource 
	 */
	@Path("/catalogversions/{catalogversion}")
	public AbstractYResource getCatalogVersionResource(@PathParam("catalogversion")  final String resourceKey)
	{
		final CatalogVersionResource  resource  = resourceCtx.getResource(CatalogVersionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ClassificationSystemVersionResource} for current root resource 
	 */
	@Path("/classificationsystemversions/{classificationsystemversion}")
	public AbstractYResource getClassificationSystemVersionResource(@PathParam("classificationsystemversion")  final String resourceKey)
	{
		final ClassificationSystemVersionResource  resource  = resourceCtx.getResource(ClassificationSystemVersionResource.class);
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
	 *  Generated getter for sub resource of type {@link RemoveCatalogVersionCronJobResource} for current root resource 
	 */
	@Path("/removecatalogversioncronjobs/{removecatalogversioncronjob}")
	public AbstractYResource getRemoveCatalogVersionCronJobResource(@PathParam("removecatalogversioncronjob")  final String resourceKey)
	{
		final RemoveCatalogVersionCronJobResource  resource  = resourceCtx.getResource(RemoveCatalogVersionCronJobResource.class);
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
	public Response putCatalog(final CatalogDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link CatalogModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected CatalogModel readResource(final String resourceId) throws Exception
	{
		CatalogModel model = new CatalogModel();
		model.setId(resourceId);
		return (CatalogModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(CatalogModel)}
	 */
	public void setCatalogModel(final CatalogModel value)
	{
		super.setResourceValue(value);
	}
	
}
