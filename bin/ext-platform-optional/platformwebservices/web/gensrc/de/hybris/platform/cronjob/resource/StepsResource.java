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

import de.hybris.platform.cronjob.dto.StepsDTO;
import de.hybris.platform.cronjob.model.StepModel;
import de.hybris.platform.cronjob.resource.StepResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Step defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/steps")
public class StepsResource extends AbstractCollectionResource <Collection<StepModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StepsResource()
	{
		super("Step");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSteps()
	{
		return createGetResponse().build(StepsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link StepResource} for current root resource 
	 */
	@Path("{step}")
	public AbstractYResource getStepResource(@PathParam("step")  final String resourceKey)
	{
		final StepResource  resource  = resourceCtx.getResource(StepResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<StepModel> getStepsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setStepsCollection(final Collection<StepModel> value)
	{
		super.setResourceValue(value);
	}
	
}
