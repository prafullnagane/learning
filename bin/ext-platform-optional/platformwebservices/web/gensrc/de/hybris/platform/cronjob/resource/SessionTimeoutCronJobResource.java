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
package de.hybris.platform.cronjob.resource;

import de.hybris.platform.catalog.resource.ItemSyncDescriptorResource;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.cronjob.dto.SessionTimeoutCronJobDTO;
import de.hybris.platform.cronjob.model.SessionTimeoutCronJobModel;
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
 * Generated resource class for type SessionTimeoutCronJob first defined at extension processing
 */
@SuppressWarnings("all")
public class SessionTimeoutCronJobResource extends AbstractYResource<SessionTimeoutCronJobModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SessionTimeoutCronJobResource()
	{
		super("SessionTimeoutCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteSessionTimeoutCronJob()
	{
		return createDeleteResponse().build();
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
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getSessionTimeoutCronJob()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public SessionTimeoutCronJobModel getSessionTimeoutCronJobModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putSessionTimeoutCronJob(final SessionTimeoutCronJobDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link SessionTimeoutCronJobModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected SessionTimeoutCronJobModel readResource(final String resourceId) throws Exception
	{
		SessionTimeoutCronJobModel model = new SessionTimeoutCronJobModel();
		model.setCode(resourceId);
		return (SessionTimeoutCronJobModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(SessionTimeoutCronJobModel)}
	 */
	public void setSessionTimeoutCronJobModel(final SessionTimeoutCronJobModel value)
	{
		super.setResourceValue(value);
	}
	
}
