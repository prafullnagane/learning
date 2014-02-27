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
package de.hybris.platform.store;

import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.BaseStoreResource;
import de.hybris.platform.store.BaseStoresDTO;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BaseStore defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/basestores")
public class BaseStoresResource extends AbstractCollectionResource <Collection<BaseStoreModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BaseStoresResource()
	{
		super("BaseStore");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBaseStores()
	{
		return createGetResponse().build(BaseStoresDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BaseStoreResource} for current root resource 
	 */
	@Path("{basestore}")
	public AbstractYResource getBaseStoreResource(@PathParam("basestore")  final String resourceKey)
	{
		final BaseStoreResource  resource  = resourceCtx.getResource(BaseStoreResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BaseStoreModel> getBaseStoresCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBaseStoresCollection(final Collection<BaseStoreModel> value)
	{
		super.setResourceValue(value);
	}
	
}
