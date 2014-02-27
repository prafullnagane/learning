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
package de.hybris.platform.mcc.resource;

import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.mcc.dto.StaticLinkDTO;
import de.hybris.platform.mcc.model.StaticLinkModel;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type StaticLink first defined at extension mcc
 */
@SuppressWarnings("all")
public class StaticLinkResource extends AbstractYResource<StaticLinkModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StaticLinkResource()
	{
		super("StaticLink");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteStaticLink()
	{
		return createDeleteResponse().build();
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
	public Response getStaticLink()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public StaticLinkModel getStaticLinkModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putStaticLink(final StaticLinkDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link StaticLinkModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected StaticLinkModel readResource(final String resourceId) throws Exception
	{
		StaticLinkModel model = new StaticLinkModel();
		model.setCode(resourceId);
		return (StaticLinkModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(StaticLinkModel)}
	 */
	public void setStaticLinkModel(final StaticLinkModel value)
	{
		super.setResourceValue(value);
	}
	
}
