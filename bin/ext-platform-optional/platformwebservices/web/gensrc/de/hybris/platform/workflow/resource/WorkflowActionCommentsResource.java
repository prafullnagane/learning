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
package de.hybris.platform.workflow.resource;

import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import de.hybris.platform.workflow.dto.WorkflowActionCommentDTO;
import de.hybris.platform.workflow.dto.WorkflowActionCommentsDTO;
import de.hybris.platform.workflow.model.WorkflowActionCommentModel;
import de.hybris.platform.workflow.resource.WorkflowActionCommentResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type WorkflowActionComment defined at extension workflow Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/workflowactioncomments")
public class WorkflowActionCommentsResource extends AbstractCollectionResource <Collection<WorkflowActionCommentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowActionCommentsResource()
	{
		super("WorkflowActionComment");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllWorkflowActionComments()
	{
		return createGetResponse().build(WorkflowActionCommentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link WorkflowActionCommentResource} for current root resource 
	 */
	@Path("{workflowactioncomment}")
	public AbstractYResource getWorkflowActionCommentResource(@PathParam("workflowactioncomment")  final String resourceKey)
	{
		final WorkflowActionCommentResource  resource  = resourceCtx.getResource(WorkflowActionCommentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<WorkflowActionCommentModel> getWorkflowActionCommentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postWorkflowActionComment(final WorkflowActionCommentDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setWorkflowActionCommentsCollection(final Collection<WorkflowActionCommentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
