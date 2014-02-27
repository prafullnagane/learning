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
package de.hybris.platform.task;

import de.hybris.platform.task.TaskDTO;
import de.hybris.platform.task.TaskModel;
import de.hybris.platform.task.TaskResource;
import de.hybris.platform.task.TasksDTO;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Task defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/tasks")
public class TasksResource extends AbstractCollectionResource <Collection<TaskModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TasksResource()
	{
		super("Task");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllTasks()
	{
		return createGetResponse().build(TasksDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link TaskResource} for current root resource 
	 */
	@Path("{task}")
	public AbstractYResource getTaskResource(@PathParam("task")  final String resourceKey)
	{
		final TaskResource  resource  = resourceCtx.getResource(TaskResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<TaskModel> getTasksCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postTask(final TaskDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setTasksCollection(final Collection<TaskModel> value)
	{
		super.setResourceValue(value);
	}
	
}
