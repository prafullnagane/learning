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
package de.hybris.platform.processengine.resource;

import de.hybris.platform.processengine.dto.ProcessTaskDTO;
import de.hybris.platform.processengine.dto.ProcessTasksDTO;
import de.hybris.platform.processengine.model.ProcessTaskModel;
import de.hybris.platform.processengine.resource.ProcessTaskResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ProcessTask defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/processtasks")
public class ProcessTasksResource extends AbstractCollectionResource <Collection<ProcessTaskModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProcessTasksResource()
	{
		super("ProcessTask");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllProcessTasks()
	{
		return createGetResponse().build(ProcessTasksDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProcessTaskResource} for current root resource 
	 */
	@Path("{processtask}")
	public AbstractYResource getProcessTaskResource(@PathParam("processtask")  final String resourceKey)
	{
		final ProcessTaskResource  resource  = resourceCtx.getResource(ProcessTaskResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ProcessTaskModel> getProcessTasksCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postProcessTask(final ProcessTaskDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setProcessTasksCollection(final Collection<ProcessTaskModel> value)
	{
		super.setResourceValue(value);
	}
	
}
