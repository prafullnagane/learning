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
package de.hybris.platform.commerceservices.resource.process;

import de.hybris.platform.commerceservices.dto.process.StoreFrontProcessesDTO;
import de.hybris.platform.commerceservices.model.process.StoreFrontProcessModel;
import de.hybris.platform.commerceservices.resource.process.StoreFrontProcessResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type StoreFrontProcess defined at extension commerceservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/storefrontprocesses")
public class StoreFrontProcessesResource extends AbstractCollectionResource <Collection<StoreFrontProcessModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreFrontProcessesResource()
	{
		super("StoreFrontProcess");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllStoreFrontProcesses()
	{
		return createGetResponse().build(StoreFrontProcessesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<StoreFrontProcessModel> getStoreFrontProcessesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link StoreFrontProcessResource} for current root resource 
	 */
	@Path("{storefrontprocess}")
	public AbstractYResource getStoreFrontProcessResource(@PathParam("storefrontprocess")  final String resourceKey)
	{
		final StoreFrontProcessResource  resource  = resourceCtx.getResource(StoreFrontProcessResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setStoreFrontProcessesCollection(final Collection<StoreFrontProcessModel> value)
	{
		super.setResourceValue(value);
	}
	
}
