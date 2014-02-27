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
package de.hybris.platform.voucher.resource;

import de.hybris.platform.voucher.dto.UserRestrictionDTO;
import de.hybris.platform.voucher.dto.UserRestrictionsDTO;
import de.hybris.platform.voucher.model.UserRestrictionModel;
import de.hybris.platform.voucher.resource.UserRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type UserRestriction defined at extension voucher Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/userrestrictions")
public class UserRestrictionsResource extends AbstractCollectionResource <Collection<UserRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserRestrictionsResource()
	{
		super("UserRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllUserRestrictions()
	{
		return createGetResponse().build(UserRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link UserRestrictionResource} for current root resource 
	 */
	@Path("{userrestriction}")
	public AbstractYResource getUserRestrictionResource(@PathParam("userrestriction")  final String resourceKey)
	{
		final UserRestrictionResource  resource  = resourceCtx.getResource(UserRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<UserRestrictionModel> getUserRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postUserRestriction(final UserRestrictionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setUserRestrictionsCollection(final Collection<UserRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
