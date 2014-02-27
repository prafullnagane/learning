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

import de.hybris.platform.catalog.dto.SyncItemJobDTO;
import de.hybris.platform.catalog.model.SyncItemJobModel;
import de.hybris.platform.catalog.resource.SyncItemCronJobResource;
import de.hybris.platform.catalog.resource.synchronization.CatalogVersionSyncCronJobResource;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.cronjob.resource.CompositeEntryResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type SyncItemJob first defined at extension catalog
 */
@SuppressWarnings("all")
public class SyncItemJobResource extends AbstractYResource<SyncItemJobModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SyncItemJobResource()
	{
		super("SyncItemJob");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteSyncItemJob()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogVersionSyncCronJobResource} for current root resource 
	 */
	@Path("/catalogversionsynccronjobs/{catalogversionsynccronjob}")
	public AbstractYResource getCatalogVersionSyncCronJobResource(@PathParam("catalogversionsynccronjob")  final String resourceKey)
	{
		final CatalogVersionSyncCronJobResource  resource  = resourceCtx.getResource(CatalogVersionSyncCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
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
	 *  Generated getter for sub resource of type {@link SyncItemCronJobResource} for current root resource 
	 */
	@Path("/syncitemcronjobs/{syncitemcronjob}")
	public AbstractYResource getSyncItemCronJobResource(@PathParam("syncitemcronjob")  final String resourceKey)
	{
		final SyncItemCronJobResource  resource  = resourceCtx.getResource(SyncItemCronJobResource.class);
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
	public Response getSyncItemJob()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public SyncItemJobModel getSyncItemJobModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putSyncItemJob(final SyncItemJobDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link SyncItemJobModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected SyncItemJobModel readResource(final String resourceId) throws Exception
	{
		SyncItemJobModel model = new SyncItemJobModel();
		model.setCode(resourceId);
		return (SyncItemJobModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(SyncItemJobModel)}
	 */
	public void setSyncItemJobModel(final SyncItemJobModel value)
	{
		super.setResourceValue(value);
	}
	
}
