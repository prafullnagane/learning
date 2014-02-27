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
package de.hybris.platform.comments.resource;

import de.hybris.platform.comments.dto.CommentDTO;
import de.hybris.platform.comments.model.CommentModel;
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
 * Generated resource class for type Comment first defined at extension comments
 */
@SuppressWarnings("all")
public class CommentResource extends AbstractYResource<CommentModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentResource()
	{
		super("Comment");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteComment()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getComment()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public CommentModel getCommentModel()
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
	public Response putComment(final CommentDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link CommentModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected CommentModel readResource(final String resourceId) throws Exception
	{
		CommentModel model = new CommentModel();
		model.setCode(resourceId);
		return (CommentModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(CommentModel)}
	 */
	public void setCommentModel(final CommentModel value)
	{
		super.setResourceValue(value);
	}
	
}