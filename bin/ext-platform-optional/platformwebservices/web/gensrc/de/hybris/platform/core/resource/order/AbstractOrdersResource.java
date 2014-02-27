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
package de.hybris.platform.core.resource.order;

import de.hybris.platform.core.dto.order.AbstractOrdersDTO;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.resource.order.AbstractOrderResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractOrder defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractorders")
public class AbstractOrdersResource extends AbstractCollectionResource <Collection<AbstractOrderModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractOrdersResource()
	{
		super("AbstractOrder");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractOrderResource} for current root resource 
	 */
	@Path("{abstractorder}")
	public AbstractYResource getAbstractOrderResource(@PathParam("abstractorder")  final String resourceKey)
	{
		final AbstractOrderResource  resource  = resourceCtx.getResource(AbstractOrderResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractOrderModel> getAbstractOrdersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractOrders()
	{
		return createGetResponse().build(AbstractOrdersDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractOrdersCollection(final Collection<AbstractOrderModel> value)
	{
		super.setResourceValue(value);
	}
	
}
