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
package de.hybris.platform.hmc.resource;

import de.hybris.platform.hmc.dto.UserProfileDTO;
import de.hybris.platform.hmc.dto.UserProfilesDTO;
import de.hybris.platform.hmc.model.UserProfileModel;
import de.hybris.platform.hmc.resource.UserProfileResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type UserProfile defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/userprofiles")
public class UserProfilesResource extends AbstractCollectionResource <Collection<UserProfileModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserProfilesResource()
	{
		super("UserProfile");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllUserProfiles()
	{
		return createGetResponse().build(UserProfilesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link UserProfileResource} for current root resource 
	 */
	@Path("{userprofile}")
	public AbstractYResource getUserProfileResource(@PathParam("userprofile")  final String resourceKey)
	{
		final UserProfileResource  resource  = resourceCtx.getResource(UserProfileResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<UserProfileModel> getUserProfilesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postUserProfile(final UserProfileDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setUserProfilesCollection(final Collection<UserProfileModel> value)
	{
		super.setResourceValue(value);
	}
	
}
