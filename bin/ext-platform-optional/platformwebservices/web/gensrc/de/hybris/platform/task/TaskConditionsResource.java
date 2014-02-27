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

import de.hybris.platform.task.TaskConditionDTO;
import de.hybris.platform.task.TaskConditionModel;
import de.hybris.platform.task.TaskConditionResource;
import de.hybris.platform.task.TaskConditionsDTO;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type TaskCondition defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/taskconditions")
public class TaskConditionsResource extends AbstractCollectionResource <Collection<TaskConditionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaskConditionsResource()
	{
		super("TaskCondition");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllTaskConditions()
	{
		return createGetResponse().build(TaskConditionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link TaskConditionResource} for current root resource 
	 */
	@Path("{taskcondition}")
	public AbstractYResource getTaskConditionResource(@PathParam("taskcondition")  final String resourceKey)
	{
		final TaskConditionResource  resource  = resourceCtx.getResource(TaskConditionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<TaskConditionModel> getTaskConditionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postTaskCondition(final TaskConditionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setTaskConditionsCollection(final Collection<TaskConditionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
