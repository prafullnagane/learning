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
package de.hybris.platform.admincockpit.resource.cronjob;

import de.hybris.platform.admincockpit.dto.cronjob.RemoveOrphanedFilesJobDTO;
import de.hybris.platform.admincockpit.model.cronjob.RemoveOrphanedFilesJobModel;
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
 * Generated resource class for type RemoveOrphanedFilesJob first defined at extension admincockpit
 */
@SuppressWarnings("all")
public class RemoveOrphanedFilesJobResource extends AbstractYResource<RemoveOrphanedFilesJobModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveOrphanedFilesJobResource()
	{
		super("RemoveOrphanedFilesJob");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteRemoveOrphanedFilesJob()
	{
		return createDeleteResponse().build();
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
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getRemoveOrphanedFilesJob()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public RemoveOrphanedFilesJobModel getRemoveOrphanedFilesJobModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putRemoveOrphanedFilesJob(final RemoveOrphanedFilesJobDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link RemoveOrphanedFilesJobModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected RemoveOrphanedFilesJobModel readResource(final String resourceId) throws Exception
	{
		RemoveOrphanedFilesJobModel model = new RemoveOrphanedFilesJobModel();
		model.setCode(resourceId);
		return (RemoveOrphanedFilesJobModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(RemoveOrphanedFilesJobModel)}
	 */
	public void setRemoveOrphanedFilesJobModel(final RemoveOrphanedFilesJobModel value)
	{
		super.setResourceValue(value);
	}
	
}
