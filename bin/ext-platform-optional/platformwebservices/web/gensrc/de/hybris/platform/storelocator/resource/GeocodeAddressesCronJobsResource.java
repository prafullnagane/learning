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
package de.hybris.platform.storelocator.resource;

import de.hybris.platform.storelocator.dto.GeocodeAddressesCronJobsDTO;
import de.hybris.platform.storelocator.model.GeocodeAddressesCronJobModel;
import de.hybris.platform.storelocator.resource.GeocodeAddressesCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type GeocodeAddressesCronJob defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/geocodeaddressescronjobs")
public class GeocodeAddressesCronJobsResource extends AbstractCollectionResource <Collection<GeocodeAddressesCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GeocodeAddressesCronJobsResource()
	{
		super("GeocodeAddressesCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllGeocodeAddressesCronJobs()
	{
		return createGetResponse().build(GeocodeAddressesCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link GeocodeAddressesCronJobResource} for current root resource 
	 */
	@Path("{geocodeaddressescronjob}")
	public AbstractYResource getGeocodeAddressesCronJobResource(@PathParam("geocodeaddressescronjob")  final String resourceKey)
	{
		final GeocodeAddressesCronJobResource  resource  = resourceCtx.getResource(GeocodeAddressesCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<GeocodeAddressesCronJobModel> getGeocodeAddressesCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setGeocodeAddressesCronJobsCollection(final Collection<GeocodeAddressesCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}