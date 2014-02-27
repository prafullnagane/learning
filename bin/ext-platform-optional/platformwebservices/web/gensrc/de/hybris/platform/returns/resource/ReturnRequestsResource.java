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
package de.hybris.platform.returns.resource;

import de.hybris.platform.returns.dto.ReturnRequestsDTO;
import de.hybris.platform.returns.model.ReturnRequestModel;
import de.hybris.platform.returns.resource.ReturnRequestResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ReturnRequest defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/returnrequests")
public class ReturnRequestsResource extends AbstractCollectionResource <Collection<ReturnRequestModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnRequestsResource()
	{
		super("ReturnRequest");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllReturnRequests()
	{
		return createGetResponse().build(ReturnRequestsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ReturnRequestResource} for current root resource 
	 */
	@Path("{returnrequest}")
	public AbstractYResource getReturnRequestResource(@PathParam("returnrequest")  final String resourceKey)
	{
		final ReturnRequestResource  resource  = resourceCtx.getResource(ReturnRequestResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ReturnRequestModel> getReturnRequestsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setReturnRequestsCollection(final Collection<ReturnRequestModel> value)
	{
		super.setResourceValue(value);
	}
	
}
