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
package de.hybris.platform.storelocator.resource;

import de.hybris.platform.storelocator.dto.OpeningSchedulesDTO;
import de.hybris.platform.storelocator.model.OpeningScheduleModel;
import de.hybris.platform.storelocator.resource.OpeningScheduleResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type OpeningSchedule defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/openingschedules")
public class OpeningSchedulesResource extends AbstractCollectionResource <Collection<OpeningScheduleModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OpeningSchedulesResource()
	{
		super("OpeningSchedule");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllOpeningSchedules()
	{
		return createGetResponse().build(OpeningSchedulesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OpeningScheduleResource} for current root resource 
	 */
	@Path("{openingschedule}")
	public AbstractYResource getOpeningScheduleResource(@PathParam("openingschedule")  final String resourceKey)
	{
		final OpeningScheduleResource  resource  = resourceCtx.getResource(OpeningScheduleResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<OpeningScheduleModel> getOpeningSchedulesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setOpeningSchedulesCollection(final Collection<OpeningScheduleModel> value)
	{
		super.setResourceValue(value);
	}
	
}
