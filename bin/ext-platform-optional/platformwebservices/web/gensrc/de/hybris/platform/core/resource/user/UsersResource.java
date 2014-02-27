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
package de.hybris.platform.core.resource.user;

import de.hybris.platform.core.dto.user.UsersDTO;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.core.resource.user.UserResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type User defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/users")
public class UsersResource extends AbstractCollectionResource <Collection<UserModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UsersResource()
	{
		super("User");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllUsers()
	{
		return createGetResponse().build(UsersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link UserResource} for current root resource 
	 */
	@Path("{user}")
	public AbstractYResource getUserResource(@PathParam("user")  final String resourceKey)
	{
		final UserResource  resource  = resourceCtx.getResource(UserResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<UserModel> getUsersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setUsersCollection(final Collection<UserModel> value)
	{
		super.setResourceValue(value);
	}
	
}
