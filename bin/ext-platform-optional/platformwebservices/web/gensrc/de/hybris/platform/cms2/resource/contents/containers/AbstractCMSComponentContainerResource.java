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
package de.hybris.platform.cms2.resource.contents.containers;

import de.hybris.platform.cms2.dto.contents.containers.AbstractCMSComponentContainerDTO;
import de.hybris.platform.cms2.model.contents.containers.AbstractCMSComponentContainerModel;
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
 * Generated resource class for type AbstractCMSComponentContainer first defined at extension cms2
 */
@SuppressWarnings("all")
public class AbstractCMSComponentContainerResource extends AbstractYResource<AbstractCMSComponentContainerModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractCMSComponentContainerResource()
	{
		super("AbstractCMSComponentContainer");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteAbstractCMSComponentContainer()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAbstractCMSComponentContainer()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public AbstractCMSComponentContainerModel getAbstractCMSComponentContainerModel()
	{
		return super.getResourceValue();
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
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putAbstractCMSComponentContainer(final AbstractCMSComponentContainerDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link AbstractCMSComponentContainerModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected AbstractCMSComponentContainerModel readResource(final String resourceId) throws Exception
	{
		AbstractCMSComponentContainerModel model = new AbstractCMSComponentContainerModel();
		model.setUid(resourceId);
		return (AbstractCMSComponentContainerModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(AbstractCMSComponentContainerModel)}
	 */
	public void setAbstractCMSComponentContainerModel(final AbstractCMSComponentContainerModel value)
	{
		super.setResourceValue(value);
	}
	
}
