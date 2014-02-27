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

import de.hybris.platform.comments.dto.CommentAttachmentDTO;
import de.hybris.platform.comments.dto.CommentAttachmentsDTO;
import de.hybris.platform.comments.model.CommentAttachmentModel;
import de.hybris.platform.comments.resource.CommentAttachmentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CommentAttachment defined at extension comments Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/commentattachments")
public class CommentAttachmentsResource extends AbstractCollectionResource <Collection<CommentAttachmentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentAttachmentsResource()
	{
		super("CommentAttachment");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCommentAttachments()
	{
		return createGetResponse().build(CommentAttachmentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CommentAttachmentResource} for current root resource 
	 */
	@Path("{commentattachment}")
	public AbstractYResource getCommentAttachmentResource(@PathParam("commentattachment")  final String resourceKey)
	{
		final CommentAttachmentResource  resource  = resourceCtx.getResource(CommentAttachmentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CommentAttachmentModel> getCommentAttachmentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCommentAttachment(final CommentAttachmentDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCommentAttachmentsCollection(final Collection<CommentAttachmentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
