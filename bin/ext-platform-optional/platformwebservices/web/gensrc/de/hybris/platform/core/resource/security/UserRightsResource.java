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
package de.hybris.platform.core.resource.security;

import de.hybris.platform.core.dto.security.UserRightsDTO;
import de.hybris.platform.core.model.security.UserRightModel;
import de.hybris.platform.core.resource.security.UserRightResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type UserRight defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/userrights")
public class UserRightsResource extends AbstractCollectionResource <Collection<UserRightModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserRightsResource()
	{
		super("UserRight");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllUserRights()
	{
		return createGetResponse().build(UserRightsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link UserRightResource} for current root resource 
	 */
	@Path("{userright}")
	public AbstractYResource getUserRightResource(@PathParam("userright")  final String resourceKey)
	{
		final UserRightResource  resource  = resourceCtx.getResource(UserRightResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<UserRightModel> getUserRightsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setUserRightsCollection(final Collection<UserRightModel> value)
	{
		super.setResourceValue(value);
	}
	
}
