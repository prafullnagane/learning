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
package de.hybris.platform.cockpit.resource;

import de.hybris.platform.cockpit.dto.CockpitUIComponentAccessRightDTO;
import de.hybris.platform.cockpit.dto.CockpitUIComponentAccessRightsDTO;
import de.hybris.platform.cockpit.model.CockpitUIComponentAccessRightModel;
import de.hybris.platform.cockpit.resource.CockpitUIComponentAccessRightResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CockpitUIComponentAccessRight defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cockpituicomponentaccessrights")
public class CockpitUIComponentAccessRightsResource extends AbstractCollectionResource <Collection<CockpitUIComponentAccessRightModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIComponentAccessRightsResource()
	{
		super("CockpitUIComponentAccessRight");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCockpitUIComponentAccessRights()
	{
		return createGetResponse().build(CockpitUIComponentAccessRightsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CockpitUIComponentAccessRightResource} for current root resource 
	 */
	@Path("{cockpituicomponentaccessright}")
	public AbstractYResource getCockpitUIComponentAccessRightResource(@PathParam("cockpituicomponentaccessright")  final String resourceKey)
	{
		final CockpitUIComponentAccessRightResource  resource  = resourceCtx.getResource(CockpitUIComponentAccessRightResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CockpitUIComponentAccessRightModel> getCockpitUIComponentAccessRightsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCockpitUIComponentAccessRight(final CockpitUIComponentAccessRightDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCockpitUIComponentAccessRightsCollection(final Collection<CockpitUIComponentAccessRightModel> value)
	{
		super.setResourceValue(value);
	}
	
}
