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
package de.hybris.platform.ordersplitting.resource;

import de.hybris.platform.ordersplitting.dto.ConsignmentProcessesDTO;
import de.hybris.platform.ordersplitting.model.ConsignmentProcessModel;
import de.hybris.platform.ordersplitting.resource.ConsignmentProcessResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ConsignmentProcess defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/consignmentprocesses")
public class ConsignmentProcessesResource extends AbstractCollectionResource <Collection<ConsignmentProcessModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConsignmentProcessesResource()
	{
		super("ConsignmentProcess");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllConsignmentProcesses()
	{
		return createGetResponse().build(ConsignmentProcessesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ConsignmentProcessModel> getConsignmentProcessesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ConsignmentProcessResource} for current root resource 
	 */
	@Path("{consignmentprocess}")
	public AbstractYResource getConsignmentProcessResource(@PathParam("consignmentprocess")  final String resourceKey)
	{
		final ConsignmentProcessResource  resource  = resourceCtx.getResource(ConsignmentProcessResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setConsignmentProcessesCollection(final Collection<ConsignmentProcessModel> value)
	{
		super.setResourceValue(value);
	}
	
}
