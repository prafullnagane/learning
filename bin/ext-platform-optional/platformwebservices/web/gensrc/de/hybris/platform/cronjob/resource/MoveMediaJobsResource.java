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
package de.hybris.platform.cronjob.resource;

import de.hybris.platform.cronjob.dto.MoveMediaJobsDTO;
import de.hybris.platform.cronjob.model.MoveMediaJobModel;
import de.hybris.platform.cronjob.resource.MoveMediaJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type MoveMediaJob defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/movemediajobs")
public class MoveMediaJobsResource extends AbstractCollectionResource <Collection<MoveMediaJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MoveMediaJobsResource()
	{
		super("MoveMediaJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllMoveMediaJobs()
	{
		return createGetResponse().build(MoveMediaJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MoveMediaJobResource} for current root resource 
	 */
	@Path("{movemediajob}")
	public AbstractYResource getMoveMediaJobResource(@PathParam("movemediajob")  final String resourceKey)
	{
		final MoveMediaJobResource  resource  = resourceCtx.getResource(MoveMediaJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<MoveMediaJobModel> getMoveMediaJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setMoveMediaJobsCollection(final Collection<MoveMediaJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
