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
package de.hybris.platform.catalog.resource.classification;

import de.hybris.platform.catalog.dto.classification.ClassificationSystemDTO;
import de.hybris.platform.catalog.model.classification.ClassificationSystemModel;
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
 * Generated resource class for type ClassificationSystem first defined at extension catalog
 */
@SuppressWarnings("all")
public class ClassificationSystemResource extends AbstractYResource<ClassificationSystemModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationSystemResource()
	{
		super("ClassificationSystem");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteClassificationSystem()
	{
		return createDeleteResponse().build();
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
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getClassificationSystem()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public ClassificationSystemModel getClassificationSystemModel()
	{
		return super.getResourceValue();
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
	public Response putClassificationSystem(final ClassificationSystemDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link ClassificationSystemModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected ClassificationSystemModel readResource(final String resourceId) throws Exception
	{
		ClassificationSystemModel model = new ClassificationSystemModel();
		model.setId(resourceId);
		return (ClassificationSystemModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(ClassificationSystemModel)}
	 */
	public void setClassificationSystemModel(final ClassificationSystemModel value)
	{
		super.setResourceValue(value);
	}
	
}
