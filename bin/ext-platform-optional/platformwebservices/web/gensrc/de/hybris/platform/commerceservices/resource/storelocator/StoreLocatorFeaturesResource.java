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
package de.hybris.platform.commerceservices.resource.storelocator;

import de.hybris.platform.commerceservices.dto.storelocator.StoreLocatorFeaturesDTO;
import de.hybris.platform.commerceservices.model.storelocator.StoreLocatorFeatureModel;
import de.hybris.platform.commerceservices.resource.storelocator.StoreLocatorFeatureResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type StoreLocatorFeature defined at extension commerceservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/storelocatorfeatures")
public class StoreLocatorFeaturesResource extends AbstractCollectionResource <Collection<StoreLocatorFeatureModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreLocatorFeaturesResource()
	{
		super("StoreLocatorFeature");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllStoreLocatorFeatures()
	{
		return createGetResponse().build(StoreLocatorFeaturesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link StoreLocatorFeatureResource} for current root resource 
	 */
	@Path("{storelocatorfeature}")
	public AbstractYResource getStoreLocatorFeatureResource(@PathParam("storelocatorfeature")  final String resourceKey)
	{
		final StoreLocatorFeatureResource  resource  = resourceCtx.getResource(StoreLocatorFeatureResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<StoreLocatorFeatureModel> getStoreLocatorFeaturesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setStoreLocatorFeaturesCollection(final Collection<StoreLocatorFeatureModel> value)
	{
		super.setResourceValue(value);
	}
	
}
