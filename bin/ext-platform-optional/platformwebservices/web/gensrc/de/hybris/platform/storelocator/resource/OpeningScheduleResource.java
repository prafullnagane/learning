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

import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.storelocator.dto.OpeningScheduleDTO;
import de.hybris.platform.storelocator.model.OpeningScheduleModel;
import de.hybris.platform.storelocator.resource.OpeningDayResource;
import de.hybris.platform.storelocator.resource.SpecialOpeningDayResource;
import de.hybris.platform.storelocator.resource.WeekdayOpeningDayResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type OpeningSchedule first defined at extension basecommerce
 */
@SuppressWarnings("all")
public class OpeningScheduleResource extends AbstractYResource<OpeningScheduleModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OpeningScheduleResource()
	{
		super("OpeningSchedule");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteOpeningSchedule()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HMCHistoryEntryResource} for current root resource 
	 */
	@Path("/hmchistoryentries/{hmchistoryentry}")
	public AbstractYResource getHMCHistoryEntryResource(@PathParam("hmchistoryentry")  final String resourceKey)
	{
		final HMCHistoryEntryResource  resource  = resourceCtx.getResource(HMCHistoryEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LinkResource} for current root resource 
	 */
	@Path("/links/{link}")
	public AbstractYResource getLinkResource(@PathParam("link")  final String resourceKey)
	{
		final LinkResource  resource  = resourceCtx.getResource(LinkResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OpeningDayResource} for current root resource 
	 */
	@Path("/openingdaies/{openingday}")
	public AbstractYResource getOpeningDayResource(@PathParam("openingday")  final String resourceKey)
	{
		final OpeningDayResource  resource  = resourceCtx.getResource(OpeningDayResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getOpeningSchedule()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public OpeningScheduleModel getOpeningScheduleModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SpecialOpeningDayResource} for current root resource 
	 */
	@Path("/specialopeningdaies/{specialopeningday}")
	public AbstractYResource getSpecialOpeningDayResource(@PathParam("specialopeningday")  final String resourceKey)
	{
		final SpecialOpeningDayResource  resource  = resourceCtx.getResource(SpecialOpeningDayResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link WeekdayOpeningDayResource} for current root resource 
	 */
	@Path("/weekdayopeningdaies/{weekdayopeningday}")
	public AbstractYResource getWeekdayOpeningDayResource(@PathParam("weekdayopeningday")  final String resourceKey)
	{
		final WeekdayOpeningDayResource  resource  = resourceCtx.getResource(WeekdayOpeningDayResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putOpeningSchedule(final OpeningScheduleDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link OpeningScheduleModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected OpeningScheduleModel readResource(final String resourceId) throws Exception
	{
		OpeningScheduleModel model = new OpeningScheduleModel();
		model.setCode(resourceId);
		return (OpeningScheduleModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(OpeningScheduleModel)}
	 */
	public void setOpeningScheduleModel(final OpeningScheduleModel value)
	{
		super.setResourceValue(value);
	}
	
}
