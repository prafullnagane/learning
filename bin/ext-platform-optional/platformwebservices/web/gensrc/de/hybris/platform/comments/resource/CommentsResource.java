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

import de.hybris.platform.comments.dto.CommentsDTO;
import de.hybris.platform.comments.model.CommentModel;
import de.hybris.platform.comments.resource.CommentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Comment defined at extension comments Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/comments")
public class CommentsResource extends AbstractCollectionResource <Collection<CommentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentsResource()
	{
		super("Comment");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllComments()
	{
		return createGetResponse().build(CommentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CommentResource} for current root resource 
	 */
	@Path("{comment}")
	public AbstractYResource getCommentResource(@PathParam("comment")  final String resourceKey)
	{
		final CommentResource  resource  = resourceCtx.getResource(CommentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CommentModel> getCommentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCommentsCollection(final Collection<CommentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
