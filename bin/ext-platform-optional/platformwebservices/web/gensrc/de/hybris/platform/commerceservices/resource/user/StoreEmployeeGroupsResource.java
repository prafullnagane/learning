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
package de.hybris.platform.commerceservices.resource.user;

import de.hybris.platform.commerceservices.dto.user.StoreEmployeeGroupsDTO;
import de.hybris.platform.commerceservices.model.user.StoreEmployeeGroupModel;
import de.hybris.platform.commerceservices.resource.user.StoreEmployeeGroupResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type StoreEmployeeGroup defined at extension commerceservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/storeemployeegroups")
public class StoreEmployeeGroupsResource extends AbstractCollectionResource <Collection<StoreEmployeeGroupModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreEmployeeGroupsResource()
	{
		super("StoreEmployeeGroup");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllStoreEmployeeGroups()
	{
		return createGetResponse().build(StoreEmployeeGroupsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link StoreEmployeeGroupResource} for current root resource 
	 */
	@Path("{storeemployeegroup}")
	public AbstractYResource getStoreEmployeeGroupResource(@PathParam("storeemployeegroup")  final String resourceKey)
	{
		final StoreEmployeeGroupResource  resource  = resourceCtx.getResource(StoreEmployeeGroupResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<StoreEmployeeGroupModel> getStoreEmployeeGroupsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setStoreEmployeeGroupsCollection(final Collection<StoreEmployeeGroupModel> value)
	{
		super.setResourceValue(value);
	}
	
}
