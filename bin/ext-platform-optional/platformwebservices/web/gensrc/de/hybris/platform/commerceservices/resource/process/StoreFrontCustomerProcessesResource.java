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

import de.hybris.platform.commerceservices.dto.process.StoreFrontCustomerProcessesDTO;
import de.hybris.platform.commerceservices.model.process.StoreFrontCustomerProcessModel;
import de.hybris.platform.commerceservices.resource.process.StoreFrontCustomerProcessResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type StoreFrontCustomerProcess defined at extension commerceservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/storefrontcustomerprocesses")
public class StoreFrontCustomerProcessesResource extends AbstractCollectionResource <Collection<StoreFrontCustomerProcessModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreFrontCustomerProcessesResource()
	{
		super("StoreFrontCustomerProcess");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllStoreFrontCustomerProcesses()
	{
		return createGetResponse().build(StoreFrontCustomerProcessesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<StoreFrontCustomerProcessModel> getStoreFrontCustomerProcessesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link StoreFrontCustomerProcessResource} for current root resource 
	 */
	@Path("{storefrontcustomerprocess}")
	public AbstractYResource getStoreFrontCustomerProcessResource(@PathParam("storefrontcustomerprocess")  final String resourceKey)
	{
		final StoreFrontCustomerProcessResource  resource  = resourceCtx.getResource(StoreFrontCustomerProcessResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setStoreFrontCustomerProcessesCollection(final Collection<StoreFrontCustomerProcessModel> value)
	{
		super.setResourceValue(value);
	}
	
}
