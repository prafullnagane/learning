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

import de.hybris.platform.core.dto.user.UserGroupsDTO;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.resource.user.UserGroupResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type UserGroup defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/usergroups")
public class UserGroupsResource extends AbstractCollectionResource <Collection<UserGroupModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserGroupsResource()
	{
		super("UserGroup");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllUserGroups()
	{
		return createGetResponse().build(UserGroupsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link UserGroupResource} for current root resource 
	 */
	@Path("{usergroup}")
	public AbstractYResource getUserGroupResource(@PathParam("usergroup")  final String resourceKey)
	{
		final UserGroupResource  resource  = resourceCtx.getResource(UserGroupResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<UserGroupModel> getUserGroupsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setUserGroupsCollection(final Collection<UserGroupModel> value)
	{
		super.setResourceValue(value);
	}
	
}
