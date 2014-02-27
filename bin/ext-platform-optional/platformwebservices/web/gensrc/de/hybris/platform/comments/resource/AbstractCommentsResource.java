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

import de.hybris.platform.comments.dto.AbstractCommentDTO;
import de.hybris.platform.comments.dto.AbstractCommentsDTO;
import de.hybris.platform.comments.model.AbstractCommentModel;
import de.hybris.platform.comments.resource.AbstractCommentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractComment defined at extension comments Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractcomments")
public class AbstractCommentsResource extends AbstractCollectionResource <Collection<AbstractCommentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractCommentsResource()
	{
		super("AbstractComment");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractCommentResource} for current root resource 
	 */
	@Path("{abstractcomment}")
	public AbstractYResource getAbstractCommentResource(@PathParam("abstractcomment")  final String resourceKey)
	{
		final AbstractCommentResource  resource  = resourceCtx.getResource(AbstractCommentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractCommentModel> getAbstractCommentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractComments()
	{
		return createGetResponse().build(AbstractCommentsDTO.class);
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postAbstractComment(final AbstractCommentDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractCommentsCollection(final Collection<AbstractCommentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
