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
package de.hybris.platform.lucenesearch.resource;

import de.hybris.platform.lucenesearch.dto.UpdateIndexJobsDTO;
import de.hybris.platform.lucenesearch.model.UpdateIndexJobModel;
import de.hybris.platform.lucenesearch.resource.UpdateIndexJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type UpdateIndexJob defined at extension lucenesearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/updateindexjobs")
public class UpdateIndexJobsResource extends AbstractCollectionResource <Collection<UpdateIndexJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UpdateIndexJobsResource()
	{
		super("UpdateIndexJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllUpdateIndexJobs()
	{
		return createGetResponse().build(UpdateIndexJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link UpdateIndexJobResource} for current root resource 
	 */
	@Path("{updateindexjob}")
	public AbstractYResource getUpdateIndexJobResource(@PathParam("updateindexjob")  final String resourceKey)
	{
		final UpdateIndexJobResource  resource  = resourceCtx.getResource(UpdateIndexJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<UpdateIndexJobModel> getUpdateIndexJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setUpdateIndexJobsCollection(final Collection<UpdateIndexJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
