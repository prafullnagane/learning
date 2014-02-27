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

import de.hybris.platform.voucher.dto.RestrictionDTO;
import de.hybris.platform.voucher.dto.RestrictionsDTO;
import de.hybris.platform.voucher.model.RestrictionModel;
import de.hybris.platform.voucher.resource.RestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Restriction defined at extension voucher Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/restrictions")
public class RestrictionsResource extends AbstractCollectionResource <Collection<RestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RestrictionsResource()
	{
		super("Restriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllRestrictions()
	{
		return createGetResponse().build(RestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link RestrictionResource} for current root resource 
	 */
	@Path("{restriction}")
	public AbstractYResource getRestrictionResource(@PathParam("restriction")  final String resourceKey)
	{
		final RestrictionResource  resource  = resourceCtx.getResource(RestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<RestrictionModel> getRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postRestriction(final RestrictionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setRestrictionsCollection(final Collection<RestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
