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

import de.hybris.platform.storelocator.dto.WeekdayOpeningDaiesDTO;
import de.hybris.platform.storelocator.dto.WeekdayOpeningDayDTO;
import de.hybris.platform.storelocator.model.WeekdayOpeningDayModel;
import de.hybris.platform.storelocator.resource.WeekdayOpeningDayResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type WeekdayOpeningDay defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/weekdayopeningdaies")
public class WeekdayOpeningDaiesResource extends AbstractCollectionResource <Collection<WeekdayOpeningDayModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WeekdayOpeningDaiesResource()
	{
		super("WeekdayOpeningDay");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllWeekdayOpeningDaies()
	{
		return createGetResponse().build(WeekdayOpeningDaiesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<WeekdayOpeningDayModel> getWeekdayOpeningDaiesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link WeekdayOpeningDayResource} for current root resource 
	 */
	@Path("{weekdayopeningday}")
	public AbstractYResource getWeekdayOpeningDayResource(@PathParam("weekdayopeningday")  final String resourceKey)
	{
		final WeekdayOpeningDayResource  resource  = resourceCtx.getResource(WeekdayOpeningDayResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postWeekdayOpeningDay(final WeekdayOpeningDayDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setWeekdayOpeningDaiesCollection(final Collection<WeekdayOpeningDayModel> value)
	{
		super.setResourceValue(value);
	}
	
}
